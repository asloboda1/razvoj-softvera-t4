package ba.unsa.etf.rs.tut4;

import java.util.ArrayList;

public class Racun {
        static class  dodajStavku
        {
            private Artikal artikal;
            private Integer kolicina;

            public dodajStavku(Artikal artikal, Integer kolicina)
            {
                this.artikal=artikal;
                this.kolicina=kolicina;

            }

            public Artikal getArtikal() {
                return artikal;
            }
            public void setArtikal(Artikal artikal) {
                this.artikal = artikal;
            }

            public Integer getKolicina() {
                return kolicina;
            }

            public void setKolicina(Integer kolicina) {
                this.kolicina = kolicina;
            }
        }
        private ArrayList<dodajStavku> stavkeracuna;

        public void ukupanIznos()
        {
            stavkeracuna= new ArrayList<>();



        }

}
