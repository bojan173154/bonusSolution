public class Solution {
    private final char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L'};

    public String getChars(int depth) {
       try {
           StringBuilder sb = new StringBuilder();
           int lastIndexOfNode = (int)(Math.pow(2, depth));

           for (int i = 0; i < lastIndexOfNode - 1; i++) {
               sb.append(alphabet[i]);
               sb.append(" ");
           }

           return formatString(sb.toString(), depth);
       } catch (ArrayIndexOutOfBoundsException e) {
           StringBuilder sb = new StringBuilder();
           for (char ch : alphabet) {
               sb.append(ch);
               sb.append(" ");
           }

           return formatString(sb.toString(), depth);
       }
    }

    public String formatString(String input, int depth) {
        StringBuilder sb = new StringBuilder();
        int pointer = 0;

        for (int i = 1; i <= depth; i++) {
            sb.append(i);
            sb.append(" : ");
            for (int j = 0; j < (int)Math.pow(2, i); j++) {
                try {
                    sb.append(input.charAt(pointer));
                    pointer++;
                } catch (Exception e) {
                    break;
                }
            }
            sb.append('\n');
        }

        return sb.toString();
    }
}