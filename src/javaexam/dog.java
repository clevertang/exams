package javaexam;

public class dog extends Animal {
public dog(){
		System.out.println("����ķ���ִ����");
		
	}
	int age=20;
	public void eat(){
		System.out.println("�����гԹ�ͷ������");
	}
	public void method(){
		System.out.println(super.age);
	}
	@Override
	public String toString() {
		return "dog [age=" + age + "]";
	}
}
