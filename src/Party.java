public class Party {

    public static void main(String[] args) {

        int anzahlTeilnehmer = 50;

        String gäste = "Die Anzahl der Gäste ist ";

        System.out.println(gäste + anzahlTeilnehmer);

        //50


        anzahlTeilnehmer -= 5;

        System.out.println(gäste + anzahlTeilnehmer);

        //45

        anzahlTeilnehmer += 5;

        System.out.println(gäste + anzahlTeilnehmer);

        //55

        anzahlTeilnehmer -= 35;
        System.out.println(gäste + anzahlTeilnehmer);

        //20

        anzahlTeilnehmer -= 2;
        System.out.println(gäste + anzahlTeilnehmer);

        //-2

        anzahlTeilnehmer += 5;
        System.out.println(gäste + anzahlTeilnehmer);

        //+5

        int score = 10;
        String scores = "Die Mannschaft erreicht einen Punktestand von ";

        System.out.println(scores + score);

        //10

        score++;
        System.out.println(scores + score);

        //+1

        score--;
        System.out.println(scores + score);


    }
}