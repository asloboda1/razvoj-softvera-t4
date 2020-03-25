package ba.unsa.etf.rs.tut4;

public class Artikal {
    private String sifra;
    private String naziv;
    private double cijena;


    public Artikal(String unos) {

        String[] atributi;
        String[]  red=unos.split("\n");
        for(int i=0; i<red.length; i++)
        {
            atributi = red[i].split(",");
            setSifra(atributi[0]);
            setNaziv(atributi[1]);
            setCijena(Double.parseDouble(atributi[2]));
        }
    }



    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        if(sifra.isEmpty()) throw new IllegalArgumentException("Šifra je prazna");
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        if(naziv.isEmpty()) throw new IllegalArgumentException("Naziv je prazan");
        this.naziv = naziv;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        if(cijena<0) throw new IllegalArgumentException("Cijena je negativna");
        this.cijena = cijena;
    }
}
