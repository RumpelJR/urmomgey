import java.util.Scanner;
//Michael März //
public class aufgabe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner eingabe = new Scanner(System.in);
        String input = new String();
        String termine[] = new String[24];
        int zeit = 0;
        boolean quit = false;
        String befehl;

        do {
            System.out.println("Befehl eingeben:");
            befehl = sc.next();

            switch (befehl) {
                case "q":                                                         // Close Programm
                    quit = true;

                    break;
                case "n":                                                         // Edit
                    System.out.println(" Uhrzeit = ");
                    zeit = sc.nextInt();
                    System.out.println(" Geben sie ihren Termin ein : ");
                    input = eingabe.nextLine();
                    termine[zeit] = input;                                        //eingespeichert
                    break;
                case "a":                                                         // Inspect
                    for (int i = 0; i < termine.length; i++) {
                        if (termine[i] == null){
                            termine[i]= "-";
                        }
                        System.out.println(i + " Uhr: " + termine[i]);
                    }
                    break;
                default:
                    System.out.println("Ung�ltiger Befehl");
            } // end of switch

        }
        while (!quit) ;
    }
}