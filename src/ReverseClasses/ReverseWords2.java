package ReverseClasses;

public class ReverseWords2 {
    public class ReverseWords {
        public static void reverseWords(String input) {
            StringBuilder word = new StringBuilder();
            StringBuilder output = new StringBuilder();

            for (int i = input.length() - 1; i >= 0; i--) {
                char c = input.charAt(i);

                if (c == ' ') {
                    output.append(word.reverse()).append(' ');
                    word.setLength(0);
                } else {
                    word.append(c);
                }
            }

            output.append(word.reverse());

            System.out.println(output.toString());
        }

        public static void main(String[] args) {
            String input = "Reverse me if you can";
            reverseWords(input);
        }
    }
}
