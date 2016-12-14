package javaexam;

public class dog extends Animal {
public dog(){
		System.out.println("子类的方法执行了");
		
	}
	int age=20;
	public void eat(){
		System.out.println("狗具有吃骨头的能力");
	}
	public void method(){
		System.out.println(super.age);
	}
	@Override
	public String toString() {
		return "dog [age=" + age + "]";
	}
}
