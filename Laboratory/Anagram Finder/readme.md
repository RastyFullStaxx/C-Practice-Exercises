CASE PROBLEM: Anagram Queries using Hashing

 In this assignment, you will implement a program that prints out all anagrams of a specified string. Two strings are anagrams of one another if you can obtain another by rearranging the letters of one of the strings. For example, the string "toxic" is an anagram of "ioxct". For this assignment, we are only interested in those anagrams of a given string that appear in the dictionary. The dictionary you should use is the file “words.txt.”

Algorithm and Implementation

Since we will perform multiple anagram queries, our first step is to load all (25,000) words in the dictionary into an appropriate data structure. A primary requirement is that one must be able to efficiently search this data structure to look for anagrams of a given word. A clever trick we will use to facilitate this is first to sort the letters of every word we insert into our data structure (you may use any sort you wish) to produce a key for each word. For example, the key for the string "toxic" is "ciotx", similarly, the key for both "star" and "rats" is "arst". (Expert Scrabble players will recognize this procedure as computing the alphagram of a set of letters). We will then use a hash table to store pairs of strings, where the pair consists of the original word and its key.  

When performing insertions into the hash table, we will compute the hash of the key of the word to compute the correct bucket (location in the hash table). This approach guarantees that all words anagrams of one another are stored in the same bucket of the hash table. Similarly, when searching for anagrams, we will first compute the key of the word we are searching for, then hash the key, then search that bucket for anagram matches. You should feel free to use the methods described in the text and in class for appropriate hash functions for hashing strings (but please cite any source you use).  Also, ensure your function is efficient and does not hash completely unrelated sets of anagrams to the same bucket *if possible*.  If it does, handle the collisions as you see fit (linked processing).  Also note that if you must probe for a given set of anagrams in time greater than or equal to O(log2n), you must revise your hash function.  You will be graded heavily on the performance of the efficiency of your function.

Details

The hash table code you provide only needs the minimum functionality needed to solve this assignment. You may fix a size for your hash table for efficient searching.  I recommend that the final hash table you submit contains at least 25,000 buckets. (For debugging your code, I suggest you work with a much smaller practice dictionary, perhaps 10 words, and a much smaller hash table, perhaps 8-10 buckets (depending on whether or not there are any anagrams in the dictionary).  Make sure your table size is prime to help reduce collisions.  Remember, it is ok to sacrifice space for speed -- that is what hashing is all about.  That said, your table should not be bigger than 200,000.

You may disregard any words in the dictionary which contain any punctuation characters.  Also, you should convert any uppercase characters to lowercase (thus, you only represent words that contain all lowercase characters).

Input Specification

Your program should read anagram queries from a file that has been specified as a command line argument. Each query in the file will be on its line and consist of a string. 

Output Specification

The output file (which will also be specified on the command line following the input file) should contain the original string, then the number of matching anagrams, followed by those anagrams. Your output file should match this format exactly, except that the matching anagrams your output may be ordered differently. 

Do not count a word as an anagram of itself.

 

Sample Input (example_input.txt)

qiewuro
ssrab
oflg
equiye

 

Sample Output (example_output.txt)

qiewuro 0
ssrab 1 brass
oflg 2 flog golf
equiye 0
