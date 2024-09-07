public class Mathe {
    public static void main(String[] args) {


        String lieblingstier = "Hund";
        System.out.println(lieblingstier.length());

        String alterString = "  Mercedesistschonklasse  ";

        String neuerString = alterString.trim();
        System.out.println(alterString);

        String d = "\"\\\\test//\"";
        System.out.println(d);

        String langerSatz = "rot blau rot blau rot";
        System.out.println(langerSatz.replace("rot", "grün"));

        String leer = "bla" + "\n" + "bla" + "\n" + "bla";
        System.out.println(leer);

        String chara = "123456";
        System.out.println(chara.charAt(4));

        System.out.println("\t Dieser Text ist eingerückt.");

        //int xyz = (int) (Math.random() * 10);
        //fläche = Math.PI*radius*radius

        double r = 2.1;
        System.out.println(Math.PI * r * r);
    }
}


//zwei ganze zahlen vergleicht, größere ausgeben, Math methode--
//zwei ganze Zahlen vergleichen, kleinere ausgeben--
//quadratwurzel nicht negative zahl ausgeben--
//absoluter wert ganze zahl--
//random zahl-- String result = withSpaceString.trim();