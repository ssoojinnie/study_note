package thisEx;

class Person{
	String name;
	int age;
	
	public Person() {
		this("�̸�����", 1);
	}
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		System.out.println(p1.name);
	}

}
