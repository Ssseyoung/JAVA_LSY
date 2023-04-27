package Day08.Ex03_Interface;

public class RemoteControlEx {
	
	public static void main(String[] args) {
		// 인터페이스타입 객체명 = new Television();
		RemoteControl tvRc = new Television();
		tvRc.turnOn();
		tvRc.setVolume(5);
		tvRc.setVolume(100);
		tvRc.setMute(true);					// 음소거
		tvRc.turnOff();
		System.out.println();
		
		RemoteControl speakerRc = new Speaker();
		tvRc.turnOn();
		tvRc.setVolume(5);
		tvRc.setVolume(100);
		tvRc.setMute(false);				// 음소거 해제
		tvRc.turnOff();
		System.out.println();
		
		RemoteControl.changeBattery();		// 리모콘 배터리 교체
		
	}
}