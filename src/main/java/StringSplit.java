public class StringSplit {
    public static void main(String[] args) {
        /*
            abc => ab, c_
            abcdef => ab, cd, ef
         */
        String s = "abcde";

        char[] chars = s.toCharArray();

        String[] split;

        if (s.length() % 2 == 0) {
            split = new String[s.length() / 2];
        } else {
            split = new String[s.length() / 2 + 1];
        }


        int counter = 0;

        for (int i = 0; i < chars.length; i += 2) {
            try {
                String string = "" + chars[i] + chars[i + 1];
                counter++;
                split[counter - 1] = string;
            } catch (IndexOutOfBoundsException e) {
                chars[chars.length - 1] = '_';
            }
        }

        for (String string : split) {
            System.out.println(string);
        }
    }
}
