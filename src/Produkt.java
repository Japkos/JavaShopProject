public class Produkt {
    private String nazwa, opis;
    private int cena;

    public Produkt(String nazwa, String opis, int cena){
        this.nazwa = nazwa;
        this.opis = opis;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public int getCena() {
        return cena;
    }
}
