package Day12.Ex02_Comparable;

public class Student implements Comparable<Student>{
	
	String name; 		// 이름
	int age;			// 나이
	
	// 생성자
	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		// String의 compareTo() 메소드로 문자열 크기 비교
		return 0;
	}
	

}
