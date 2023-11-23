import javax.crypto.*;
import java.security.*;

public class AESEncryptionExample {
    public static void main(String[] args) throws Exception {
        String plainText = "Hello, AES!";
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey secretKey = keyGenerator.generateKey();

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        byte[] encryptedText = cipher.doFinal(plainText.getBytes());

        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decryptedText = cipher.doFinal(encryptedText);

        System.out.println("Original: " + plainText);
        System.out.println("Encrypted: " + new String(encryptedText));
        System.out.println("Decrypted: " + new String(decryptedText));
    }
}
