public class AnzeigenverwaltungUI{
    public static void main(String args[]){
        System.out.println("++++++++++ Anzeigenverwaltung +++++++\n");

        Inserent i1 = new Inserent();
        Inserent i2 = new Inserent("Frank Siebert","06441/6789",67447,51550036);
        Anzeige a1 = new Anzeige();
        Anzeige a2 = new Anzeige("Auto", 35.95);

        i1.setName("Helga Hasselbusch");
        i1.setTelNr("0641/12345");
        i1.setBlz(51550036);
        i1.setKtoNr(4711);

        i2.setTelNr("06441/6789");
        i2.setBlz(51370028);
        i2.setKtoNr(67447);

        a1.setRubrik("Garten");
        a1.setTitel("Gut erhaltener Gartentisch");
        a1.setBeschreibung("Gartentisch, weiss, Plastik, sehr stabil, 160x110 cm");
        a1.setPreis(20);

        a2.setTitel("Radzierblenden BMW 17 Zoll");
        a2.setBeschreibung("4 Stueck Radzierblende fuer Auto BMW, Reifengruppe 17 Zoll");

        i1.setLinkAnzeige(a1);
        i2.setLinkAnzeige(a2);
        System.out.println(i1.getausgabe());
        System.out.println(i2.getausgabe());
        /*
        System.out.println("Im System sind " +Anzeige.getAnzahlAnzeigen() +" Anzeigen\nund "
                +Inserent.getAnzahlInserenten() +" Inserenten gespeichert\n");
        System.out.println("Besetzte Rubriken: " +a1.getRubrik() +" , " +a2.getRubrik());
        System.out.println("Summe Anzeigenwert: " +(a1.getPreis() + a2.getPreis()) + " EUR");
        System.out.println("Namen der Inserenten: " +i1.getName() +" , " +i2.getName());
        */
        //Anzeige a3 = i1.getLinkAnzeige();
        //System.out.println(i1.getLinkanzeige());
    }

}
