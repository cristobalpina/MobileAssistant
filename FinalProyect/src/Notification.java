import java.util.Date;

public abstract class Notification extends Object {
 private Date createdAt;
 
	 public Notification() {
		 this.createdAt = new Date();
	 }
	 
	 public Date getCreatedAt() {
		 return this.createdAt;
	 }
	 
	 abstract void display();
}
