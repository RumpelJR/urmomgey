public class Anzeige{
    private static int anzahlAnzeigen;

    private String Rubrik;
    private String Titel;
    private String Beschreibung;
    private double Preis;


    public Anzeige(String Rubrik, double Preis){
        this.Rubrik = Rubrik;
        this.Preis = Preis;
        anzahlAnzeigen = anzahlAnzeigen + 1;
    }
    public Anzeige(){ anzahlAnzeigen = anzahlAnzeigen + 1;}

    public static double klakulireKosten (double verkaufspreis){
        double kosten = verkaufspreis / 100*5+2.50;
        return kosten;
    }
    public static int getAnzahlAnzeigen(){
        return anzahlAnzeigen;
    }

    public String getRubrik(){return Rubrik;}

    public void setRubrik(String Rubrik){this.Rubrik = Rubrik;}

    public String getTitel(){
        return Titel;
    }

    public void setTitel(String Titel){this.Titel = Titel;}

    public String getBeschreibung(){return Beschreibung;}

    public void setBeschreibung(String Beschreibung){this.Beschreibung = Beschreibung;}

    public double getPreis(){return Preis;}

    public void setPreis(double Preis){this.Preis = Preis;}
}