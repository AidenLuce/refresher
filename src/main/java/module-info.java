module com.example.java_review {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_review to javafx.fxml;
    exports com.example.java_review;
}