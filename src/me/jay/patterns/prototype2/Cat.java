package me.jay.patterns.prototype2;

public class Cat implements Cloneable {

	private String name;

	private Age age;

	public Cat copy() throws CloneNotSupportedException {
		Cat cat = (Cat) this.clone();
		// 명시적인 깊은 복사
		cat.setAge(new Age(this.age.getYear(), this.age.getValue()));
		return cat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Age getAge() {
		return age;
	}

	public void setAge(Age age) {
		this.age = age;
	}
}
