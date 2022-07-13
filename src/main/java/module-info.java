module com.arya.tugas2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.arya.tugas2 to javafx.fxml;
    exports com.arya.tugas2;
}