package ba.unsa.etf.rs.tut4;


import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@ExtendWith(ApplicationExtension.class)
    class ControllerTest {

        @Start
        public void start(Stage stage) throws Exception{
            Parent Root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            stage.setTitle("TUT 4");
            stage.setScene(new Scene(Root));
            stage.show();
        }
        @Test
        public void Sadrziliformasvepotrebno(FxRobot robot)
        {
            robot.lookup("#formaartikla").queryButton();
            robot.lookup("#unos").queryTextInputControl();
            robot.lookup("#ispis").queryTextInputControl();
        }
        @Test
        public void Ispravnostdugmeta(FxRobot robot)
        {
            robot.clickOn("#artikli");
            robot.clickOn("#unos");
            robot.write("Hljeb,2,3.0");
            robot.clickOn("#formaartikla");
            TextArea kopija = (TextArea)robot.lookup("#ispis").query();
            assertEquals("Hljeb,2,3.0"+"\n",
                    kopija.getText());
        }
        @Test
        public void sadrziliformasvepotrebno2(FxRobot robot) {
            robot.lookup("#choice");
            robot.lookup("#dodajracun");
            robot.lookup("#racunarea");
            robot.lookup("#spiner");
        }
        @Test
        public void minvrijednostspinera(FxRobot robot)
        {
            robot.clickOn("#racun");
            robot.clickOn("#spiner").clickOn(".decrement-arrow-button");
            assertEquals(1,1);
        }
        @Test
        public void ispravnostchoicaboxa(FxRobot robot)
        {
            robot.clickOn("#artikli");
            robot.clickOn("#unos");
            robot.write("Hljeb001,2,3");
            robot.clickOn("#formaartikla");
            robot.clickOn("#racun");
            assertNotNull("#choice");

        }
        @Test
    public void racundugmeprovjera(FxRobot robot)
        {
            robot.clickOn("#dodajracun");
            TextArea kopija = (TextArea)robot.lookup("#racunarea").query();
            assertEquals("",kopija.getText());
        }
    @Test
    public void racundugmeprovjera2(FxRobot robot)
    {
        robot.clickOn("#artikli");
        robot.clickOn("#unos");
        robot.write("Hljeb001,2,3");
        robot.clickOn("#formaartikla");
        robot.clickOn("#racun");
        robot.clickOn("#dodajracun");
        TextArea kopija = (TextArea)robot.lookup("#racunarea").query();
        assertEquals("Hljeb001",kopija.getText());
    }

}
