package ReverseClasses;

public class ReverseWords {
    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        return reversed.toString().trim();
    }

    public static void main(String[] args) {
        String input = "Reverse me if you can";
        String reversed = reverseWords(input);

        System.out.println(reversed);
    }
}
