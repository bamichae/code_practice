package com.detect_permutation;

import java.util.HashMap;
import java.util.Map;

public class DetectPermutation {

    DetectPermutation() {
        run();
    }

    public void run() {
        String firstString = "abcdefghijkl";
        String secondString = "acbdegihljk";

        System.out.println(checkForPermutation(firstString, secondString));
    }

    public boolean checkForPermutation(String firstString, String secondString) {
        Map<Character, Integer> characterCounter = new HashMap<Character, Integer>();

        if (firstString.length() != secondString.length()) {
            return false;
        }

        //separate string into chars, put in hashmap
        for (int i = 0; i < firstString.length(); i++) {
            if (characterCounter.get(firstString.charAt(i)) == null)
                characterCounter.put(firstString.charAt(i), 0);

            int charCount = characterCounter.get(firstString.charAt(i));
            characterCounter.put(firstString.charAt(i), ++charCount);
        }

        //decrement char count for each char seen
        for (int i = 0; i < secondString.length(); i++) {
            if (characterCounter.get(secondString.charAt(i)) == null || characterCounter.get(secondString.charAt(i)) < 0) {
                return false;
            }
            int charCount = characterCounter.get(secondString.charAt(i));
            characterCounter.put(secondString.charAt(i), --charCount);
        }

        //if all chars are 0, the strings are permutations of each other
        for (char character : characterCounter.keySet()) {
            if (characterCounter.get(character) != 0) {
                return false;
            }
        }

        return true;

    }
}
