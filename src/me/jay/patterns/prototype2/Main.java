package me.jay.patterns.prototype2;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		// 얕은 복사
		Cat cat1 = new Cat();
		cat1.setName("cat1");
		cat1.setAge(new Age(2012, 3));

		Cat cat2 = cat1;
		cat2.setName("cat2");
		cat2.setAge(new Age(2013, 2));

		System.out.println(cat1.getName());
		System.out.println(cat1.getAge().getYear());
		System.out.println(cat2.getName());
		System.out.println(cat2.getAge().getYear());

		System.out.println("----------------------");

		// 깊은 복사
		Cat cat3 = new Cat();
		cat3.setName("cat3");
		cat3.setAge(new Age(2012, 3));

		Cat cat4 = cat3.copy();
		cat4.setName("cat4");
//		cat4.setAge(new Age(2013, 2)); // 방법1
		cat4.getAge().setYear(2013); // 방법2
		cat4.getAge().setValue(2);

		System.out.println(cat3.getName());
		System.out.println(cat3.getAge().getYear());
		System.out.println(cat4.getName());
		System.out.println(cat4.getAge().getYear());

		// 방법 1을 사용하면 이름, 연도 모두 깊은 복사가 이루어짐
		// 방법 2를 사용하니까 이름은 깊은 복사가 이루어졌지만 연도는 깊은 복사가 이루어 지지 않음.
		// 왜? java에서 제공하는 String, Interger 클래스는 깊은 복사를 자동으로 해주는 기능이 있다.
		// 그렇다면 Age와 같은 멤버변수는 어떻게 깊은 복사를 하는가? copy()에서 명시적으로 깊은 복사를 해버린다.
		// 그 결과 방법 2도 성공적으로 깊은 복사가 가능하다.
	}

}
