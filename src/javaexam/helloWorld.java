package javaexam;
public class helloWorld {
	public static void main(String[] args) {

		// ��������
		helloWorld hello = new helloWorld();

		// �����޲εķ���
		hello.print();

		// ���ô���һ���ַ��������ķ���
	    hello.print("clevertang");

		// ���ô���һ�����Ͳ����ķ���
	    hello.print(22);
	}

	public void print() {
		System.out.println("�޲ε�print����");
	}

	public void print(String name) {
		System.out.println("����һ���ַ���������print����������ֵΪ��" + name);
	}

	public void print(int age) {
		System.out.println("����һ�����Ͳ�����print����������ֵΪ��" + age);
	}
}
    
    

