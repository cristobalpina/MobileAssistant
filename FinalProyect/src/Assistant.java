import java.util.LinkedList;

public class Assistant extends Object {
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
	
}
