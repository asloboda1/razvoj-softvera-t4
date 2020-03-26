package ba.unsa.etf.rs.tut4;
import java.lang.reflect.Array;
import java.util.ArrayList;

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



    public Artikal(String abc, String proizvod, int i) {
        setSifra(abc);
        setNaziv(proizvod);
        setCijena(i);
    }

    public static void izbaciDuplikate(ArrayList<Artikal> lista) {
        for(int i=0; i<lista.size()-1; i++)
        {
            String x= new String();
            Array.get(lista,i);


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Artikal artikal = (Artikal) o;

        if (Double.compare(artikal.cijena, cijena) != 0) return false;
        if (sifra != null ? !sifra.equals(artikal.sifra) : artikal.sifra != null) return false;
        return naziv != null ? naziv.equals(artikal.naziv) : artikal.naziv == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = sifra != null ? sifra.hashCode() : 0;
        result = 31 * result + (naziv != null ? naziv.hashCode() : 0);
        temp = Double.doubleToLongBits(cijena);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
