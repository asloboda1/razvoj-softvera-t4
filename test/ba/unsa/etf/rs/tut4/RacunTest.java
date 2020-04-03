package ba.unsa.etf.rs.tut4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RacunTest {

    @Test
    void test1() {
        Racun r = new Racun();
        r.dodajStavku(new Artikal("HLB", "Hljeb", 1.5), 2);
        r.dodajStavku(new Artikal("JAJ", "Jaje", 5), 5);
        assertEquals(28, r.ukupanIznos());
    }

    @Test
    void testPrazno() {
        Racun r = new Racun();
        assertEquals(0, r.ukupanIznos());
    }
    @Test
    void setKolicina() {
        ArrayList<Artikal> artiklilista = new ArrayList<>();
        Artikal artikal = new Artikal("Sifra","Naziv" ,10);
        artiklilista.add(artikal);
        Racun.StavkaRacuna stavka = new Racun.StavkaRacuna(artiklilista, 10);
        assertEquals(10, stavka.getKolicina());
    }

    @Test
    void getArtikli() {
        ArrayList<Artikal> artikli_lista = new ArrayList<>();
        Artikal artikal = new Artikal("Sifra","Naziv" ,10);
        artikli_lista.add(artikal);
        Racun.StavkaRacuna stavka = new Racun.StavkaRacuna(artikli_lista, 10);
        assertEquals(artikli_lista, stavka.getArtikli());
    }

    @Test
    void StavkaRacuna() {
        ArrayList<Artikal> artikli_lista = new ArrayList<>();
        Artikal artikal = new Artikal("Sifra","Naziv" ,10);
        artikli_lista.add(artikal);
        Racun.StavkaRacuna stavka = new Racun.StavkaRacuna();
        assertEquals(null, stavka.getArtikli());
    }

}