public class Main {
    public static void main(String[] args) {
        Produkt p1 = new Produkt("Pomidor", "czerwony", 2);
        Produkt p2 = new Produkt("Czekolada", "Brązowa", 10);
        Produkt p3 = new Produkt("Figi", "kolorowe", 3);
        Koszyk koszyk = new Koszyk();
        Zamówienie z1 = new Zamówienie("Jan", "Kowalski", "23.04.2023");
        Zamówienie z2 = new Zamówienie("Andrzej", "Góra", "03.09.2022");
        Zamówienie z3 = new Zamówienie("Zbigniew", "Pospolity", "11.01.2020");
        Sklep s1 = new Sklep();
        s1.dodajProdukt(p1);
        s1.dodajProdukt(p2);
        s1.dodajProdukt(p3);
        s1.stworzKoszyk();


    }
}
