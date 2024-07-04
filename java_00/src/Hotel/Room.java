package Hotel;

public class Room {

	private boolean isUsing; // 객실이 사용중인지 확인
	// true : 사용중
	// false : 사용가능(빈 객실)
	
	public Room() {
		
	}
	
	public Room(boolean isUsing) {
		this.isUsing = isUsing;
	}
	
	// getter setter
	public boolean isUsing() {
		return isUsing;
	}
	
	public void setUsing(boolean isUsing) {
		this.isUsing = isUsing;
	}
}
