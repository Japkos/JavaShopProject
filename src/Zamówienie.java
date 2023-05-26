import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zamówienie {
    List<Produkt> listaProduktowWZamowieniu;
    String imie, nazwisko, data;

    public Zamówienie(String imie, String nazwisko, String data) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data = data;
        listaProduktowWZamowieniu = new ArrayList<>();
    }

    public void zamowProdukt(Produkt produkt){
        listaProduktowWZamowieniu.add(produkt);
    }
    public void listaZamowien(Produkt[] listaProduktow){
        listaProduktowWZamowieniu.addAll(Arrays.asList(listaProduktow));
    }

    public List<Produkt> getListaProduktowWZamowieniu() {
        return listaProduktowWZamowieniu;
    }

}
