import java.util.LinkedList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
	private LinkedList<Activity> activities;

	public Assistant() {
		this.busy = false;
		this.missedCalls = new LinkedList<Call>();
		this.missedNews = new LinkedList<News>();
		this.activities = new LinkedList<Activity>();
	}

	public void getCall() {
		if (this.busy) {
			System.out.println("Call added to missed calls");
			missedCalls.add(new Call());
			return;
		}
		System.out.println(new Call().getFrom() + " esta llamando.");
	}

	public void getNews() {
		if (this.busy) {
			System.out.println("News added to missed news");
			missedNews.add(new News());
			return;
		}
		System.out.println("News incoming");
	}

	public boolean getBusy() {
		return this.busy;
	}

	public void removeActivity() {
		this.activities.remove(0);
	}

	public void setBusy(boolean value) {
		if (this.busy) {
			this.clearPendingCalls();
			this.clearPendingNews();
		}
		this.busy = value;

	}

	public LinkedList<Activity> getActivities() {
		return this.activities;
	}

	public void addActivity(String name) {
		Activity activity = new Activity(name);
		this.activities.add(activity);
	}

	public LinkedList<Text> getNotifications() {
		LinkedList<Text> notifications = new LinkedList<Text>();
		System.out.println(this.missedCalls.size());
		for (int i = 0; i < this.missedCalls.size(); i++) {
			String from = this.missedCalls.get(i).getFrom();
			notifications.add(new Text("Missed call from: " + from));
		}
		for (int i = 0; i < this.missedNews.size(); i++) {
			String title = this.missedNews.get(i).getTitle();
			notifications.add(new Text("Missed News: " + title));
		}
		notifications.add(new Text("Next Activity: " + this.activities.pop().getName()));
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
		footer.setStyle("-fx-background-color: #dcdcdc;" + "-fx-border-color: #000000;" + "-fx-border-width: 2;");
		return footer;
	}

	public VBox addBody() {
		VBox body = new VBox();
		body.setPadding(new Insets(25, 12, 25, 12));
		body.setSpacing(10);
		body.setStyle("-fx-background-color: #dcdcdc;" + "-fx-border-color: #000000;" + "-fx-border-width: 2;");
		return body;
	}

	@Override
	public void start(Stage primaryStage) {
		Assistant assistant = new Assistant();

		primaryStage.setTitle("Mobile Assistant");

		BorderPane border = new BorderPane();
		HBox footer = addFooter();
		VBox body = addBody();
		VBox leftBar = addBody();
		Label label1 = new Label("Activity:");
		TextField textField = new TextField();
		Circle circle = new Circle(10, 10, 10);
		circle.setFill(javafx.scene.paint.Color.GREEN);
		HBox input = new HBox();
		input.getChildren().addAll(label1, textField);
		input.setSpacing(10);
		Button toggleBtn = new Button("Not Busy");
		toggleBtn.setPrefSize(100, 20);
		Button addActivityBtn = new Button("Add Activity");
		Button removeActivityBtn = new Button("Remove Activity");

		toggleBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				boolean currentState = assistant.getBusy();
				if (assistant.getBusy()) {
					toggleBtn.setText("Not Busy");
					circle.setFill(javafx.scene.paint.Color.GREEN);
					LinkedList<Text> notifications = assistant.getNotifications();
					System.out.println(notifications);
					body.getChildren().clear();
					body.getChildren().addAll(notifications);
					leftBar.getChildren().clear();
					for (Activity activity : assistant.getActivities()) {
						leftBar.getChildren().add(0, new Text(activity.getName()));
					}
					
					leftBar.getChildren().addAll(input, addActivityBtn, removeActivityBtn);
				} else {
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
			@Override
			public void handle(ActionEvent e) {
				if (assistant.getBusy()) {
					assistant.getCall();
				} else {
					body.getChildren().clear();
					body.getChildren().addAll(new Text(new Call().getRandomFrom() + " is calling."));
				}
			}
		});
		Button newsBtn = new Button("Get News");
		newsBtn.setPrefSize(100, 20);
		newsBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				if (assistant.getBusy()) {
					assistant.getNews();
				} else {
					body.getChildren().clear();
					body.getChildren().addAll(new Text(new News().getRandomTitle()));
				}

			}
		});

		footer.getChildren().addAll(newsBtn, callBtn, toggleBtn, circle);
		footer.setAlignment(Pos.CENTER_RIGHT);

	
		
		addActivityBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				String text = textField.getText();
				if (text.length() > 0) {
					assistant.addActivity(text);
					textField.clear();
					leftBar.getChildren().add(0, new Text(text));
				}

			}
		});

		removeActivityBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				assistant.removeActivity();
				leftBar.getChildren().clear();
				for (Activity activity : assistant.getActivities()) {
					leftBar.getChildren().add(0, new Text(activity.getName()));
				}
				leftBar.getChildren().addAll(input, addActivityBtn, removeActivityBtn);
			}
		});

		leftBar.getChildren().addAll(input, addActivityBtn, removeActivityBtn);
		leftBar.setAlignment(Pos.TOP_CENTER);
		border.setBottom(footer);
		border.setCenter(body);
		border.setLeft(leftBar);
		primaryStage.setScene(new Scene(border, 600, 400));
		primaryStage.show();
	}

}
