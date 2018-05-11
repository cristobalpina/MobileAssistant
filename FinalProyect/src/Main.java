import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.util.Scanner;


public class Main extends Application {
	private Assistant assistant;
	public Main() {
		this.assistant = new Assistant();
	}
	
	public static void main(String[] args) {
		// Main phone = new Main();
		launch(args);

	}
	public HBox addFooter() {
		HBox footer = new HBox();
        footer.setPadding(new Insets(25, 12, 25, 12));
        footer.setSpacing(10);
        footer.setStyle("-fx-background-color: #dcdcdc;" + 
        "-fx-border-color: #000000;" + "-fx-border-width: 2;");
        
        Button buttonCurrent = new Button("Toggle");
        buttonCurrent.setPrefSize(100, 20);
        Circle circle = new Circle(10, 10, 10);
        circle.setFill(javafx.scene.paint.Color.RED);
        footer.getChildren().addAll(buttonCurrent, circle);
        footer.setAlignment(Pos.CENTER_RIGHT);
        return footer;
	}
	@Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Mobile Assistant");
        
        BorderPane border = new BorderPane();
       
        border.setBottom(addFooter());
        
        primaryStage.setScene(new Scene(border, 600, 400));
        primaryStage.show();
    }
}
