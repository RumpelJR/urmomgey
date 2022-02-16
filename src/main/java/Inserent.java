public class Inserent {
    private static int anzahlInserenten;

    private String Name;
    private String TelNr;
    private int KtoNr;
    private int Blz;
    private Anzeige anzeige;
    private String ausgabe;

    public Inserent(String Name, String TelNr, int KtoNr, int Blz) {
        this.Name = Name;
        this.TelNr = TelNr;
        this.KtoNr = KtoNr;
        this.Blz = Blz;
        anzahlInserenten++;
    }

    public String getausgabe(){
        if (anzeige == null){
            return "anzeige ist nicht gesetzt";
        }
        ausgabe = " Der Inserent / die Inserentin " + this.Name +  " hat aktuell eine Anzeige in der Rubrik " + this.anzeige.getRubrik() + " aufgegeben. ";
        return ausgabe;
    }

    public Inserent() {
        anzahlInserenten++;
    }

    public void setLinkAnzeige(Anzeige anzeige) {this.anzeige = anzeige;}

    public Anzeige getLinkAnzeige() {return anzeige;}

    public String getTelNr() {
        return TelNr;
    }

    public void setTelNr(String TelNr) {
        this.TelNr = TelNr;
    }

    public int getKtoNr() {
        return KtoNr;
    }

    public void setKtoNr(int KtoNr) {
        this.KtoNr = KtoNr;
    }

    public int getBlz() {
        return Blz;
    }

    public void setBlz(int Blz) {
        this.Blz = Blz;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

}