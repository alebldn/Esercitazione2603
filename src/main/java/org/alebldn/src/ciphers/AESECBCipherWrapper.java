package org.alebldn.src.ciphers;

import org.alebldn.src.prngs.SecureRandomWrapper;

public class AESECBCipherWrapper extends CipherWrapper {

    // This class extends the CipherWrapper class to implement methods that are specific for AES in ECB mode.
    // Methods are now public and can be called outside the class.

    /*
     * Initializes the superclass with correct algorithms.
     * Total suggested lines: 1.
     */
    public AESECBCipherWrapper(SecureRandomWrapper srw) throws Exception {



    }

    /*
     * Calls the right superclass method to encrypt a plaintext.
     * Total suggested lines: 1/2.
     */
    public byte[] encrypt(String plaintext) throws Exception {



    }

    /*
     * Calls the right superclass method to decrypt a plaintext using AES in ECB mode.
     * Total suggested lines: 1/2.
     */
    public String decrypt(byte[] ciphertext) throws Exception {



    }
}
