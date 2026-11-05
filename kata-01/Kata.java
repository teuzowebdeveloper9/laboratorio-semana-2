public class Kata {

    public static String solution(String str) {

        String new_string = "";

        for (int pointer = str.length() - 1; pointer >= 0; pointer--) {

            new_string += str.charAt(pointer);

        }

        return new_string;
    }

    public static void main(String[] args) {
        String[] inputs = args.length > 0 ? args : new String[] {"world", "word"};

        for (String input : inputs) {
            System.out.println("'" + input + "' => '" + solution(input) + "'");
        }
    }

}
