import java.util.ArrayList;
import java.util.List;

public class Sklep {
        private List<Produkt> produkty;

    public Sklep() {
        produkty = new ArrayList<>();
    }
    public void dodajProdukt(Produkt produkt){
        produkty.add(produkt);
    }
    public void wyswietlProdukty(){
        for (Produkt produkt : produkty){
            System.out.println(produkt.getNazwa() + ": " + produkt.getCena() + "zł");
        }
    }
    public Koszyk stworzKoszyk(){
        return new Koszyk();
    }
}
