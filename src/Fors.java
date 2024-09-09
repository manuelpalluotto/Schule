public class Fors {
    public static void main(String[] args) {
        for (int count = 1; count <= 5; count++) {
            System.out.println(count);
        }

        int sum = 0;
        int counter = 0;
        String string = "Hallo, Welt!";
        while (counter < 10) {
            counter++;
            System.out.println(string);
        }


        String bla = "Abfahrt";
        for (int counts = 0; counts < bla.length(); counts++) {
            char c = bla.charAt(counts);
            System.out.println(c);
        }


        //  for (int count = 0; count < 5; count++) {
        //         | startzahl     |bedingung     |änderung startzahl
        //  System.out.println("count");
        //  }
    }
}
