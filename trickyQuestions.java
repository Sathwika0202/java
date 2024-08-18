/*write a code to print the foll input and output acc.
  input: a5b10                            input : c6b3h2 
  output: aaaaabbbbbbbbbb                 output: ccccccbbbhh      */


public class ExpandString {
    public static void main(String[] args) {
        String input1 = "a5b10";
        String input2 = "c6b3h2";

        System.out.println(expand(input1)); // Output: aaaaabbbbbbbbbb
        System.out.println(expand(input2)); // Output: ccccccbbbhh
    }

    public static String expand(String input) {
        StringBuilder output = new StringBuilder();
        int i = 0;

        while (i < input.length()) {
            char currentChar = input.charAt(i);
            i++;
            int count = 0;

            // Handling multi-digit numbers
            while (i < input.length() && Character.isDigit(input.charAt(i))) {
                count = count * 10 + (input.charAt(i) - '0');
                i++;
            }

            // Append the character 'count' number of times
            for (int j = 0; j < count; j++) {
                output.append(currentChar);
            }
        }

        return output.toString();
    }
}


/* ```````````````````````````````````````````````````````````````````````````````````````````````
````````````````````````````````````````````````````````````````````````````````````````````````*/



