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
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
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
		if(this.busy) {
			System.out.println("Call added to missed calls");
			missedCalls.add(new Call("Someone"));
			return;
		}
		System.out.println("Calling");
	}

	public void getNews(){
		if(this.busy) {
			System.out.println("News added to missed news");
			missedNews.add(new News("Something happend"));
			return;
		}
		System.out.println("News incoming");
	}
	
	public boolean getBusy() {
		return this.busy;
	}
	
	public void setBusy(boolean value){
		if(this.busy) {
			this.clearPendingCalls();
			this.clearPendingNews();
		}
		this.busy = value;
		
	}
	
	public LinkedList<Text> getNotifications() {
		LinkedList<Text> notifications = new LinkedList<Text>();
		System.out.println(this.missedCalls.size());
		for(int i = 0; i < this.missedCalls.size(); i++) {
			String from = this.missedCalls.get(i).getFrom();
			notifications.add(new Text("Missed call from: " + from));
		}
		System.out.println(notifications);
		return notifications;
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
	public VBox addBody() {
		VBox body = new VBox();
        body.setPadding(new Insets(25, 12, 25, 12));
        body.setSpacing(10);
        body.setStyle("-fx-background-color: #dcdcdc;" + 
        "-fx-border-color: #000000;" + "-fx-border-width: 2;");
        return body;
	}
	
	@Override
    public void start(Stage primaryStage) {
		Assistant assistant = new Assistant();
        
		primaryStage.setTitle("Mobile Assistant");
        
        BorderPane border = new BorderPane();
        HBox footer = addFooter();
        VBox body = addBody();
        Circle circle = new Circle(10, 10, 10);
        circle.setFill(javafx.scene.paint.Color.GREEN);
        
        Button toggleBtn = new Button("Not Busy");
        toggleBtn.setPrefSize(100, 20);
        toggleBtn.setOnAction(new EventHandler<ActionEvent>() {
        	@Override public void handle(ActionEvent e) {
        		boolean currentState = assistant.getBusy();
        		if(assistant.getBusy()) {	
        			toggleBtn.setText("Not Busy");
        			circle.setFill(javafx.scene.paint.Color.GREEN);
        			LinkedList<Text> notifications = assistant.getNotifications();
        			System.out.println(notifications);
        			body.getChildren().clear();
        			body.getChildren().addAll(notifications);
        		}
        		else {
        			toggleBtn.setText("Busy");
        			circle.setFill(javafx.scene.paint.Color.RED);
        			body.getChildren().clear();
        			
        		}
        		assistant.setBusy(!currentState);
        		
        	}
        });
        
        Button callBtn = new Button("Get Call");
        callBtn.setPrefSize(100, 20);
        callBtn.setOnAction(new EventHandler<ActionEvent>() {
        	@Override public void handle(ActionEvent e) { 		
        		assistant.getCall();
        	}
        });
        Button newsBtn = new Button("Get News");
        newsBtn.setPrefSize(100, 20);
        newsBtn.setOnAction(new EventHandler<ActionEvent>() {
        	@Override public void handle(ActionEvent e) { 		
        		assistant.getNews();
        	}
        });
        
        footer.getChildren().addAll(newsBtn, callBtn, toggleBtn, circle);
        footer.setAlignment(Pos.CENTER_RIGHT);
        
        border.setBottom(footer);
        border.setCenter(body);
        primaryStage.setScene(new Scene(border, 600, 400));
        primaryStage.show();
    }
	
	
}
