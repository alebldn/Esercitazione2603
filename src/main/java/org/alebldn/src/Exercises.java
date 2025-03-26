package org.alebldn.src;


import org.alebldn.src.ciphers.AESECBCipherWrapper;
import org.alebldn.src.ciphers.AESGCMCipherWrapper;
import org.alebldn.src.ciphers.ChaCha20CipherWrapper;
import org.alebldn.src.digests.MessageDigestWrapper;
import org.alebldn.src.prngs.SecureRandomWrapper;

import javax.crypto.AEADBadTagException;

public class Exercises {


    /*
     * Using the MessageDigestWrapper class, find the byte whose digest's hex representation is "3ebe1b59762a1c8020c1efe3747dd07f0e30617ed60b4e6a5bee16b6ea421dd0".
     * The digest's representation has been computed using the "SHA-256" algorithm. Bytes in java are not unsigned.
     */
    public static byte firstExercise() {

        byte firstResult;


        return firstResult;
    }


    /*
     * Create a PRNG using the SHA1PRNG algorithm by leveraging the SecureRandomWrapper class and set the result of the first exercise as the seed of the PRNG.
     * Find after how many iterations the PRNG outputs the integer 1791056477. First call to the SecureRandomWrapper method counts as iteration 1, not 0.
     */
    public static int secondExercise(byte firstResult) {

        int secondResult;



        return secondResult;
    }


    /*
     * A plaintext has been encrypted 3 times using the CipherWrapper classes previously done.
     * - The first time was encrypted using AES-GCM with additional data.
     * - The second time was encrypted using ChaCha20.
     * - The third time was encrypted using ECB.
     *
     * Ciphertext = E_ECB(E_ChaCha(E_GCM(plaintext))).
     *
     * ⚠️ Each CipherWrapper class requires a different SecureRandomWrapper instance. Each of them uses "SHA1PRNG", but THE SEEDS DIFFER ⚠️
     * - AES-GCM's SecureRandomWrapper is initialized with (firstResult + secondResult).
     * - ChaCha20's SecureRandomWrapper is initialized with (secondResult).
     * - AES-ECB's SecureRandomWrapper is initialized with (firstResult).
     *
     * ⚠️ When using PRNGs, to be able to match the results in the test, enforcing order is extremely important ⚠️
     * 0- Create the SecureRandomWrapper instance.
     * 1- Change the seed to be the correct one.
     * 2- [ Fill the IV, if present ]
     * 3- [ Generate the counter variable, if present ]
     * 4- Finally, pass the SecureRandomWrapper instance to the CipherWrapper class.
     *
     * The additional data is an integer number, bigger than 0, smaller than 100. You have to find out what that number is.
     * Hint: you will need to handle "AEADBadTagException".
     *
     * Finally, return the plaintext.
     *
     */
    public static String thirdExercise(byte firstResult, int secondResult) {
        String ciphertext = "d7c6d3f1dc4c38b42f364c8568ece51649edb1e169f18565ad3c616f10d5c0f82ff2d539e9901ff01e6f10180070ce205263a8065adad975499164e7aa745f46a6abda6c22d436da64106bf98d9a314f71907cb2b7dcaa2ac101b1f2cbd999633176de82d4cfce9fb10df6680d68b25079b4e38ae8135b485985382963c418619893cf3e781cddbe45b864e6de6b3b84390d8d0526b31c4cdf6adb08267133d2cdc4a3ec5bfbdeb8c31e486263e94ff0b9da5fbd57dbbfbf8954354751f96c366eaacf0043301ec7d791ea98ce2995547e891e7856177f6c0ae35c6fe8e1be5186f16a3732bb24902882915e292cb09a";
        String plaintext = "";


        return plaintext;
    }


}