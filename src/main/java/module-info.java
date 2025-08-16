module com.example.tpenset {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tpenset to javafx.fxml;
    opens com.example.tpenset.Controllers to javafx.fxml;
    exports com.example.tpenset;
    exports com.example.tpenset.Models;
    opens com.example.tpenset.Models to javafx.fxml;
}