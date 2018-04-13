
public class News extends Notification {
	private String title;
 
	 public News(String title) {
		 super();
		 this.title = title;
	 }
	 
	 public String getTitle() {
		 return this.title;
	 }
	 
	 public void display() {
		 System.out.println("display News");
	 }
}
