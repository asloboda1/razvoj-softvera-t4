package ba.unsa.etf.rs.tut4;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;

import javax.swing.*;
import java.beans.PropertyEditor;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {

    public TextArea unos;
    public TextArea ispis;


    public void DodajArtikle(ActionEvent actionEvent) {
        String ulazni = unos.getText();
        String[] red = ulazni.split("\n");
        ArrayList<Artikal> artikli = new ArrayList<>();
        for (int i=0; i<red.length; i++){
            String[] razvojeno = red[i].split (",");

            if (razvojeno.length == 3) {
                Artikal artikal = new Artikal(razvojeno[0],razvojeno[1],Double.parseDouble(razvojeno[2]));
                artikli.add(artikal);


            }
            else {
                throw new IllegalArgumentException("Niste unijeli 3 elementa");
            }
        }
        Artikal.izbaciDuplikate(artikli);
        String red3= new String();
        red3="";
        for (Artikal artikal: artikli){

             red3 = red3 + artikal.toString() + "\n";
        }
        ispis.setText(red3);

        ArrayList<String> sifreartikala = new ArrayList<>();

        String dostupniartikli = new String();
        dostupniartikli = ispis.getText();
        String sifra = new String();
        String[] spisak2 = dostupniartikli.split("\n");
        String red2 = new String();
        for (int i = 0; i < spisak2.length; i++) {

            red2 = spisak2[i];
            for (int j = 0; j < red2.length(); j++) {

                if (red2.charAt(j) != ',')
                {
                    sifra = sifra + red2.charAt(j);
                }
                else{
                    sifreartikala.add(new String(sifra));
                    sifra="";
                    break;
                }
            }
        }
        ObservableList<String> observableList = FXCollections.observableList(sifreartikala);
        choice.setItems(observableList);
        choice.getSelectionModel().selectFirst();


    }

    public ChoiceBox<String> choice;
    public Spinner spiner;
    public TextArea racunarea;
    public void dodajracun(ActionEvent actionEvent )
    {
       // int cijena=0;
         String sifra = choice.getValue();
         racunarea.setText(sifra);
         //RADI
        //System.out.println("Šifra: "+ sifra+"!");
       // int kolicina33=(int) spiner.getValue();
        //System.out.println("Radi"+ kolicina33 +"!");
        //String upisnistring= new String();
       /* int iznos=ukupanIznos()
        upisnistring+=sifra+"   "+kolicina33+;
        dodajracun.setText(upisinistring);
        */
    }






}



