import java.util.ArrayList;
import java.util.List;

public class Koszyk {
    List<Produkt> listaProduktow;

    public Koszyk(){
        listaProduktow = new ArrayList<>();
    }

    public void dodajProdukt(Produkt produkt){
        listaProduktow.add(produkt);
    }
    public void usunProdukt(Produkt produkt){
        try {
            listaProduktow.remove(produkt);
        }catch (Exception e){
            System.out.println("Błąd usuwania produktu!");
        }
    }
    public int obliczKoszyk(){
        int sumaKoszyku = 0;
        for (int i = 0; i < listaProduktow.size(); i++) {
            sumaKoszyku += listaProduktow.get(i).getCena();
        }
        return sumaKoszyku;
        //
    }
}
