public class Main {
    public static void main(String[] args) {
        Produkt p1 = new Produkt("Pomidor", "czerwony", 2);
        Produkt p2 = new Produkt("Czekolada", "Brązowa", 10);
        Produkt p3 = new Produkt("Figi", "kolorowe", 3);
        Koszyk koszyk = new Koszyk();

        koszyk.dodajProdukt(p1);
        koszyk.dodajProdukt(p2);
        koszyk.dodajProdukt(p3);


    }
}
