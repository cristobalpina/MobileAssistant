import java.util.LinkedList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Assistant extends Application {
	private boolean busy;
	private LinkedList<Call> missedCalls;
	private LinkedList<News> missedNews;
	
	public Assistant() {
		this.busy = false;
		this.missedCalls = new LinkedList<Call>();
		this.missedNews = new LinkedList<News>();
	}
	
	public void getCall(){
		System.out.println("get Call");
	}

	public void getNews(){
		System.out.println("get News");
	}
	
	public boolean getBusy() {
		return this.busy;
	}
	
	public void setBusy(boolean value){
		this.busy = value;
		System.out.println("setting busy to " + value);
	}
	
	public void displayNotifications() {
		System.out.println("Yo have " + missedCalls.size() + "missed calls");
		System.out.println("Yo have " + missedNews.size() + "missed news");
	}
	
	public void clearPendingCalls() {
		missedCalls.clear();
	}
	
	public void clearPendingNews() {
		missedNews.clear();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public HBox addFooter() {
		HBox footer = new HBox();
        footer.setPadding(new Insets(25, 12, 25, 12));
        footer.setSpacing(10);
        footer.setStyle("-fx-background-color: #dcdcdc;" + 
        "-fx-border-color: #000000;" + "-fx-border-width: 2;");
        
     
        return footer;
	}
	
	@Override
    public void start(Stage primaryStage) {
		Assistant assistant = new Assistant();
        
		primaryStage.setTitle("Mobile Assistant");
        
        BorderPane border = new BorderPane();
        HBox footer = addFooter();
        
        Button toggleBtn = new Button("Toggle");
        toggleBtn.setPrefSize(100, 20);
        toggleBtn.setOnAction(new EventHandler<ActionEvent>() {
        	@Override public void handle(ActionEvent e) {
        		boolean currentState = assistant.getBusy();
        		assistant.setBusy(!currentState);
        	}
        });
        
        Circle circle = new Circle(10, 10, 10);
        
        circle.setFill(assistant.getBusy() ? javafx.scene.paint.Color.RED : javafx.scene.paint.Color.GREEN);
        
        footer.getChildren().addAll(toggleBtn, circle);
        footer.setAlignment(Pos.CENTER_RIGHT);
        
        border.setBottom(footer);
        
        primaryStage.setScene(new Scene(border, 600, 400));
        primaryStage.show();
    }
	
	
}
