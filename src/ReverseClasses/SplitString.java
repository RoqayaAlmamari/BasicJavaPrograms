package ReverseClasses;

import java.util.*;

public class SplitString {
    public static String[] split(String input, char delimiter) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == delimiter) {
                words.add(word.toString());
                word.setLength(0);
            } else {
                word.append(c);
            }
        }

        words.add(word.toString());

        return words.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String input = "Reverse me if you can";
        char delimiter = ' ';
        String[] words = split(input, delimiter);

        System.out.println(Arrays.toString(words));
    }
}
