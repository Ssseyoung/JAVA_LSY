package Day04.Class;

// 상속
// - 키워드 : 자식클래스 extends 부모클래스 { }
public class Raichu extends Pikachu {

	// 생성자 자동 완성
	// alt + shift + S -> C
	public Raichu() {
		super(200, "슈퍼전기", 30);
	}

	public Raichu(int energy, String type) {
		super(energy, type, 30);
	}
	

	public Raichu(int energy, String type, int level) {
		super(energy, type, level);
	}

	// 메소드 오버라이딩 : 메소드 재정의
	// 오버라이딩 자동 완성 : alt + shift + S -> V
	@Override
	public String aAttack() {
		return "백만볼트";
	}

	@Override
	public String bAttack() {
		return "볼트체인지";
	}
	
	public String cAttack() {
		if( level >= 40 )
			return "아이언테일";
		else
			return "(사용불가)";
		
	}
	
	
}
