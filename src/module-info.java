module teste {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	requires java.sql;
	
	opens application to javafx.graphics, javafx.fxml;
	opens gui to javafx.fxml, javafx.controls;
	opens gui.util to javafx.fxml, javafx.controls, javafx.base;
	opens model.entities to javafx.fxml, javafx.controls, javafx.base;
	opens model.services to javafx.fxml, javafx.controls, javafx.base;
}
