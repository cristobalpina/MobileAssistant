
public class Call extends Notification{
	private String from;
	
	public Call(String from) {
		super();
		this.from = from;
	}
	
	public String getFrom() {
		return this.from;
	}
	
	public void display() {
		System.out.println("display Call");
	}
}
