package com.detect_unique_chars;

public class DetectUniqueChars {

    public DetectUniqueChars() {
        run();
    }

    public void run() {
        String input = "qwertyuiopasdfghjklzxcvbnm";
        System.out.println(detect(input));
    }

    public Boolean detect(String input) {
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                if (i != j) {
                    if (input.charAt(i) == input.charAt(j)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
