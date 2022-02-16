public class AutoUI {
    public static void main(String[] args) {
        Auto auto1 = new Auto();//erstellen eines neuen Auto-Objekts#1
        auto1.setTyp("VW");
        auto1.setLeistungPS(85);
        auto1.setHubraum(3000);
        auto1.setLaenge(3);
        auto1.setMaxGesch(190);
        auto1.setMaxUmdrehung(3000);
        auto1.setNullAufHundert(5);

        Auto auto2 = new Auto("Toyota Supra");//Auto-Objekt#2
        auto2.setNullAufHundert(2);
        auto2.setLeistungPS(1500);
        auto2.setMaxUmdrehung(5000);
        auto2.setHubraum(35000);
        auto2.setLaenge(3);
        auto2.setMaxGesch(450);

        ausgebenAuto(auto2);//Hier kann ich entscheiden welches objekt ich ausgegeben möchte
    }
    static void ausgebenAuto(Auto auto){
            System.out.println(" Auto Typ: " + auto.getTyp() +  "\n Maximale Geschwindigkeit : " + auto.getMaxGesch() + "\n Hubraum : " +  auto.getHubraum() + "\n Maximale Umdrehung " + auto.getMaxUmdrehung() + "\n Leistung " + auto.getLeistungPS() + "\n Beschleunigung von Null auf Hundert :" + auto.getNullAufHundert() +"\n Auto Länge : " + auto.getLaenge());
        }//System.out.Println
}
