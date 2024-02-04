/**
 *  Programming Task 5 : CASE PROBLEM: Anagram Queries using Hashing
 *  Members:
 *          Aguinaldo, Jose Mari        Mahayag, David Geisler
 *          Espartero, Rasty            Pablo, Jhanice
 *          Facunla, Marian             Quintana, Marc Lorenz
 */





import java.io.*;       // IO library





/**
 * This class implements a program to find anagrams of words using hashing
 */
public class ProgrammingTaskFive {

    // CONSTANTS
    private static final int MAX_WORD_LENGTH = 28;      // Maximum length for a word
    private static final int MAX_ANAGRAMS = 52;         // Maximum number of anagrams for a word
    private static final int PRIME_MULTIPLIER = 11;     // The prime number used for the hash function
    private static final int TABLE_SIZE = 35729;        // Size of the hash table




    /**
     * Represents a node in the hash table.
     */
    static class Node {
        String word;
        Node next;

        Node(String word) {
            this.word = word;
            this.next = null;
        }
    }




    // Hash Table
    static Node[] hashTable = new Node[TABLE_SIZE];




    /**
     * Computes the hash value of a word.
     * 
     * @param word The word to hash.
     * @return The hash value.
     */
    static int computeHash(String word) {
        char[] alphagram = word.toCharArray();
        int len = alphagram.length;
        long hash = 0;
        long primeMultiplier = PRIME_MULTIPLIER;
        long tableSize = TABLE_SIZE;

        mergeSort(alphagram, 0, len - 1); // Sorts the string alphabetically to get the alphagram of the word

        for (int i = 0; i < len; i++) {
            hash = (hash + (alphagram[i] - 'a' + 1) * primeMultiplier) % tableSize;
            primeMultiplier = (primeMultiplier * PRIME_MULTIPLIER) % tableSize;
        }

        return (int) hash;
    }




    /**
     * Sorts a character array using merge sort.
     * 
     * @param arr   The character array to sort.
     * @param left  The left index.
     * @param right The right index.
     */
    static void mergeSort(char[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Sort the left and right substring
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right); // Merge the left and right substring after sorting
        }
    }




    /**
     * Merges two sorted subarrays.
     * 
     * @param arr   The character array to merge.
     * @param left  The left index.
     * @param mid   The middle index.
     * @param right The right index.
     */
    static void merge(char[] arr, int left, int mid, int right) {
        int i, l, r;
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        // Create temporary character arrays
        char[] leftArr = new char[leftSize];
        char[] rightArr = new char[rightSize];

        // Copy the characters to temporary arrays
        for (l = 0; l < leftSize; l++) {
            leftArr[l] = arr[left + l];
        }
        for (r = 0; r < rightSize; r++) {
            rightArr[r] = arr[mid + 1 + r];
        }

        // Merge the temp arrays back into arr[left...right]
        l = 0; // Initial index of left/first subarray
        r = 0; // Initial index of right/second subarray
        i = left; // Initial index of merged subarray
        while (l < leftSize && r < rightSize) {
            if (leftArr[l] <= rightArr[r]) {
                arr[i] = leftArr[l];
                l++;
            } else {
                arr[i] = rightArr[r];
                r++;
            }
            i++;
        }

        // Copy the remaining elements of left or right subarray
        while (l < leftSize) {
            arr[i] = leftArr[l];
            l++;
            i++;
        }
        while (r < rightSize) {
            arr[i] = rightArr[r];
            r++;
            i++;
        }
    }




    /**
     * Loads the dictionary into memory.
     * 
     * @param dictionaryFilePath The file path of the dictionary.
     * @throws IOException If an I/O error occurs.
     */
    static void loadDictionary(String dictionaryFilePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(dictionaryFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Disregard strings with non-alphabetic characters
                if (!line.matches("[a-zA-Z]+")) {
                    System.out.println("Excluded \"" + line + "\" from the dictionary.");
                    continue;
                }

                String word = line.toLowerCase(); // Convert the word to lowercase
                int hashValue = computeHash(word); // Compute the hash value

                // Create a new node to store the word
                Node newNode = new Node(word);
                if (hashTable[hashValue] == null) {
                    hashTable[hashValue] = newNode;
                } else {
                    newNode.next = hashTable[hashValue];
                    hashTable[hashValue] = newNode;
                }
            }
        }
    }




    /**
     * Searches for anagrams based on the input file and writes the results to the output file.
     * 
     * @param inputFilePath  The file path of the input file.
     * @param outputFilePath The file path of the output file.
     * @throws IOException If an I/O error occurs.
     */
    static void searchAnagrams(String inputFilePath, String outputFilePath) throws IOException {
        try (BufferedReader input = new BufferedReader(new FileReader(inputFilePath));
                FileWriter output = new FileWriter(outputFilePath)) {

            String word;
            while ((word = input.readLine()) != null) {
                int anagramCount = 0; // Tracks the number of anagrams found for each word
                StringBuilder[] anagrams = new StringBuilder[MAX_ANAGRAMS]; // Stores the found anagrams of the input word

                // Disregard strings with non-alphabetic characters
                if (!word.matches("[a-zA-Z]+")) {
                    output.write(word + " " + anagramCount + "\n");
                    continue;
                }

                String lowerWord = word.toLowerCase(); // Convert the word to lowercase
                char[] alphagram = lowerWord.toCharArray();
                mergeSort(alphagram, 0, alphagram.length - 1); // Get the alphagram of the word

                int hashValue = computeHash(new String(alphagram));
                Node cursor = hashTable[hashValue];

                while (cursor != null) {
                    String temp = cursor.word;
                    char[] tempArr = temp.toCharArray();
                    mergeSort(tempArr, 0, tempArr.length - 1); // Get the alphagram of the word in the hash table

                    // Write the word in the output file if the anagrams are equal and it's not the input word itself
                    if (new String(alphagram).equals(new String(tempArr)) && !lowerWord.equals(temp)) {
                        if (anagramCount < MAX_ANAGRAMS) {
                            if (anagrams[anagramCount] == null) {
                                anagrams[anagramCount] = new StringBuilder();
                            }
                            anagrams[anagramCount].append(temp).append(" ");
                            anagramCount++;
                        } else {
                            break;
                        }
                    }

                    cursor = cursor.next;
                }

                // Write the output in the file
                output.write(word + " " + anagramCount);
                for (int i = 0; i < anagramCount; i++) {
                    output.write(" " + anagrams[i]);
                }
                output.write("\n");
            }
        }
    }




    /**
     * Unloads the dictionary from memory.
     */
    static void unloadDictionary() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            hashTable[i] = null;
        }
    }




    /**
     * The main method.
     * 
     * @param args Command line arguments. Expected format: <dictionary_file> <input_file> <output_file>.
     */

    public static void main(String[] args) {
        // File paths for the dictionary, input, and output files
        String dictionaryFilePath = "C:\\Users\\MSI\\eclipse-workspace\\performanceTask\\words.txt";
        String inputFilePath = "C:\\Users\\MSI\\eclipse-workspace\\performanceTask\\input.txt";
        String outputFilePath = "C:\\Users\\MSI\\eclipse-workspace\\performanceTask\\output.txt";
    
        try {
            // Load the dictionary into memory
            loadDictionary(dictionaryFilePath);
            System.out.println("\n> Dictionary file loaded successfully.");
    
            // Find the anagrams of the words from the input file and write it in the output file
            searchAnagrams(inputFilePath, outputFilePath);
            System.out.println("> Searching completed.");
    
            // Display a disclaimer to inform the user of the program's limitation
            System.out.println("\nDISCLAIMER:");
            System.out.println("The program is limited to reading up to " + (MAX_WORD_LENGTH - 1) + " characters");
            System.out.println("from each word in the dictionary or the input file.\n");
            System.out.println("If there's nothing written in the output file,");
            System.out.println("make sure that any word from the dictionary or");
            System.out.println("the input file won't exceed " + (MAX_WORD_LENGTH - 1) + " characters.\n");
    
            // Unload the dictionary
            unloadDictionary();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            System.exit(1);
        }
    } // Main



} // Class
