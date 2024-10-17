module org.hugo.ejercicioc {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.hugo.ejercicioc to javafx.fxml;
    exports org.hugo.ejercicioc;
}