module ru.iegs.p2_41.p2_41 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens ru.iegs.p2_41.p2_41 to javafx.fxml;
    exports ru.iegs.p2_41.p2_41;
}