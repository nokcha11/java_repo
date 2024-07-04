package Hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelDAO {
	
	final int RoomCnt = 10; // final : 변하지 않는 상수

	List<Room> roomList;
	
	public HotelDAO() {
		roomList = new ArrayList<Room>(RoomCnt);
		
		for (int i = 0; i < RoomCnt; i++) {
			roomList.add(new Room(false));
		}
	}
	
	public void checkIn(int roomNum) {
		// 객실 체크인 - List에 속해 있는 Room 객체의 사용여부를 '사용중'으로 변경
		roomList.set(roomNum-1, new Room(true)); // List.set(index-1,객체); 인데스는 0부터 시작
	}
	
	public void checkOut(int roomNum) {
		// 객실 체크아웃 
		roomList.set(roomNum-1, new Room(false)); 
	}
	
	//room 사용 가능여부
	public boolean selectRoomChk(int roomNum) {
		boolean isFlag = false;
		
		isFlag = roomList.get(roomNum-1).isUsing();
		
		return isFlag;
	}
	
	// List<> 객체를 가져옴
	public List<Room> selectRoomList() {
		return roomList;
		
	}
	
}
