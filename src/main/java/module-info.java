module xyz.orthocube.animedb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens xyz.orthocube.animedb.view to javafx.fxml;
    exports xyz.orthocube.animedb;
}