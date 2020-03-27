package ba.unsa.etf.rs.tut4;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {

    public TextArea unos;
    public TextArea ispis;
    public ChoiceBox<String> choice;

    public void DodajArtikle(ActionEvent actionEvent) {
        ispis.setEditable(false);
        String upis = new String();
        String tekstarea = new String();
        tekstarea = unos.getText();
        String[] spisak = tekstarea.split("\n");
        List<String> SpisakArray = new ArrayList<String>();
        SpisakArray = Arrays.asList(spisak);
        for (String red : SpisakArray) {
            upis = upis + red + "\n";

            ispis.setText(upis);
        }

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

    }
}



