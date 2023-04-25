package Day04.Ex03_Car;

public class CarEx {
	
	public static void main(String[] args) {
		// 객체생성
		Car car = new Car();
		car.model = "제네시스";
		// car.speed = 200;   <-접근 불가능
		// private으로 지정한 변수는 외부 클래스에서 접근 불가능
		car.setSpeed(200);
		System.out.println("model : " + car.getModel());
		System.out.println("speed : " + car.getSpeed());
		
		car.setSpeed(-100);   	// <-마이너스값을 막아줌
		System.out.println("speed : " + car.getSpeed());
		
		car.setSpeed(500);  	// <- 300까지 막아줌
		System.out.println("speed : " + car.getSpeed());
		
		car.setSpeed(80);   
		System.out.println("speed : " + car.getSpeed());
		
	}
}
