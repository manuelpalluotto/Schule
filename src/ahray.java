import java.util.Arrays;

public class ahray {
    public static void main(String[] args) {
        int[] num = new int[11];
        for (int counter = 1; counter < num.length; counter++) {
            num[counter] = counter + 1;
        }

        for (int counter = 1; counter < num.length; counter++) {
            System.out.println(counter);
        }

        String[] zahlen = new String[]{"eins", "zwei", "drei", "vier", "fünf"};
        System.out.println(Arrays.toString(zahlen));

        int[] d = new int[6];
        for (int i = 1; i < d.length; i++) {
            d[i] = i * i;
        }
        for (int i = 1; i < d.length; i++) {
            System.out.println(d[i]);
        }

        String[] aufgabeVier = new String[]{"java", "ist", "toll",};
        System.out.println(aufgabeVier.length);
        System.out.println(Arrays.toString(aufgabeVier));

    }
}
