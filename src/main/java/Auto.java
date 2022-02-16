public class Auto{

    // Anfang Attribute
    private String typ;
    private int maxGesch;
    private int nullAufHundert;
    private int leistungPS;
    private int hubraum;
    private double laenge;
    private int maxUmdrehung;
    private int geschwindigkeit;
    // Ende Attribute

    // Konstruktor
    public Auto(){

    }

    public Auto(String typ){
        this.typ = typ;

    }

    public Auto(String typ, int leistungPS){
        this.typ = typ;
        this.leistungPS = leistungPS;
    }

    // Anfang setter- getter- Methoden
    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getMaxGesch() {
        return maxGesch;
    }

    public void setMaxGesch(int maxGesch) {
        this.maxGesch = maxGesch;
    }

    public int getNullAufHundert() {
        return nullAufHundert;
    }

    public void setNullAufHundert(int nullAufHundert) {
        this.nullAufHundert = nullAufHundert;
    }

    public int getLeistungPS() {
        return leistungPS;
    }

    public void setLeistungPS(int leistungPS){
        this.leistungPS = leistungPS;
    }

    public int getHubraum() {
        return hubraum;
    }

    public void setHubraum(int hubraum){
        this.hubraum = hubraum;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public int getMaxUmdrehung() {
        return maxUmdrehung;
    }

    public void setMaxUmdrehung(int maxUmdrehung) {
        this.maxUmdrehung = maxUmdrehung;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    private void setGeschwindigkeit(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    // Anfang Methoden
    public boolean fahren(int gesch){
        if(gesch >= 0 && gesch <= 195){
            setGeschwindigkeit(gesch);
            return true;
        }
        return false;
    }
    // Ende Methoden
}