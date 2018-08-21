package com.URLify;

import java.util.ArrayList;
import java.util.List;

public class URLify {
    URLify() {
        char[] url = "test string       ".toCharArray();
        convertToUrl(url, 11);
    }

    public char[] convertToUrl(char[] url, int length) {
        List<Integer> indicies = new ArrayList<Integer>();

        for (int i = 0; i < length; i++) {
            if (url[i] == ' ') {
                indicies.add(i);
            }
        }

        return shiftChars(url, indicies, length);

    }

    public char[] shiftChars(char[] url, List indicies, int length) {
        for (int i = 0; i < length; i++) {
            if (indicies.contains(i) && url.length >= length + 3) {
                for (int j = length + 2; j > length + 2; j++) {
                    url[]
                }
            }
        }
        return url;
    }
}
