package gui;

import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Hotel;

public class AdminWindow extends Stage {

    AdminWindow () {
        this.setResizable(false);
        this.setTitle("Admin - KAS");

        BorderPane pane = new BorderPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        this.setScene(scene);
    }

    // --------------------------------------------------------------

    private void initContent (BorderPane pane) {
        TabPane tabPane = new TabPane();
        this.initTabPane(tabPane);
        pane.setCenter(tabPane);
    }

    private void initTabPane (TabPane tabPane) {
        tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);

        Tab tabDeltagere = new Tab("Deltagere");
        tabPane.getTabs().add(tabDeltagere);

        gui.DeltagerPane deltagerPane = new gui.DeltagerPane();
        tabDeltagere.setContent(deltagerPane);

        Tab tabHotel = new Tab("Hoteller");
        tabPane.getTabs().add(tabHotel);

        gui.HotelPane hotelPane = new gui.HotelPane();
        tabHotel.setContent(hotelPane);

        Tab tabKonferencer = new Tab("Konferencer");
        tabPane.getTabs().add(tabKonferencer);

        gui.KonferencePane konferencePane = new gui.KonferencePane();
        tabKonferencer.setContent(konferencePane);

        Tab tabUdflugter = new Tab("Udflugter");
        tabPane.getTabs().add(tabUdflugter);

        gui.UdflugterPane udflugterPane = new gui.UdflugterPane();
        tabUdflugter.setContent(udflugterPane);

    }

}


