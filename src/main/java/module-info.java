module pack.areatreangle {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens pack.areatreangle to javafx.fxml;
    exports pack.areatreangle;
}