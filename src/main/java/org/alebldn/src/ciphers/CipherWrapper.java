package org.alebldn.src.ciphers;

import org.alebldn.src.Utils;
import org.alebldn.src.prngs.SecureRandomWrapper;

import javax.crypto.*;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

public class CipherWrapper {

    private static final int KEY_SIZE = 256;

    private final Cipher cipher;
    private final SecretKey sk;

    //
    // Protected methods can only be called by subclasses that extend this class.
    // Most of the encryption/decryption methods are quite similar to each other.
    //



    /*
     * Given a transformation (example: "AES/OFB/PKCS5Padding"), the function to be passed to the KeyGenerator object keyGenAlgo (example: "AES"),
     * and a SecureRandomWrapper object:
     * - Calls the computeSecretKey function to generate and initialize a symmetric key.
     * - Initializes the cipher variable with an instance retrieved using the correct transformation.
     * Total suggested lines: 2.
     */
    protected CipherWrapper(String transformation, String keyGenAlgo, SecureRandomWrapper srw) throws Exception {



    }

    /*
     * Given the keyGen algorithm, and a SecureRandom instance, computes a secret key using CipherWrapper.KEY_SIZE and returns it.
     * Total suggested lines: 3/4.
     */
    private static SecretKey computeSecretKey(String keyGenAlgo, SecureRandom sr) throws Exception {



    }

    /*
     * Encryption method for ECB that does not require additional parameters.
     * Encrypts a plaintext using the previously computed secret key.
     * Total suggested lines: 2/3.
     */
    protected byte[] encrypt(String plaintext) throws Exception {



    }

    /*
     * Encryption method for modes of operations that do require additional parameters.
     * Encrypts a plaintext using the previously computed secret key.
     * Total suggested lines: 2/3.
     */
    protected byte[] encrypt(String plaintext, AlgorithmParameterSpec spec) throws Exception {



    }

    /*
     * Encryption method for AEAD ciphers (respect the order of the following requests).
     * - Updates the inner buffer with additional data.
     * - Encrypts a plaintext using the previously computed secret key.
     * Hint: to convert a string into its constituting bytes use the Utils static class.
     * Total suggested lines: 2/3.
     */
    protected byte[] encrypt(String plaintext, String additionalData, AlgorithmParameterSpec spec) throws Exception {



    }

    /*
     * Decryption method for ECB that does not require additional parameters.
     * Decrypts a ciphertext using the previously computed secret key.
     * Total suggested lines: 3/4.
     */
    protected String decrypt(byte[] ciphertext) throws Exception {



    }

    /*
     * Decryption method for modes of operations that do require additional parameters.
     * Decrypts a ciphertext using the previously computed secret key.
     * Total suggested lines: 2/3.
     */
    protected String decrypt(byte[] ciphertext, AlgorithmParameterSpec spec) throws Exception {



    }

    /*
     * Decryption method for AEAD ciphers (respect the order of the following requests).
     * - Updates the inner buffer with additional data.
     * - Decrypts a ciphertext using the previously computed secret key.
     * Hint: to convert a byte array into a string use the Utils static class.
     * Total suggested lines: 4/5.
     */
    protected String decrypt(byte[] ciphertext, String additionalData, AlgorithmParameterSpec spec) throws Exception {



    }

}
