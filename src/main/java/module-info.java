module org.example.texteditorapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.texteditorapp to javafx.fxml;
    exports org.example.texteditorapp;
}