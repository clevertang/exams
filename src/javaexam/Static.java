package javaexam;


public class Static {
    
    String name; // ��������name
	String sex; // ��������sex
	static int age;// ������̬����age
    
    // ���췽��
	public  Static      () { 
		System.out.println("ͨ�����췽����ʼ��name");
		name = "tom";
	}
    
    // ��ʼ����
	{ 
		System.out.println("ͨ����ʼ�����ʼ��sex");
		sex = "��";
	}
    
    // ��̬��ʼ����
	   static     { 
		System.out.println("ͨ����̬��ʼ�����ʼ��age");
		age = 20;
	}
    
	public void show() {
		System.out.println("������" + name + "���Ա�" + sex + "�����䣺" + age);
	}
    
	public static void main(String[] args) {
        
        // ��������
		Static hello = new Static();
		// ���ö����show����
        hello.show();
        System.out.println(hello.getName());
        
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		Static.age = age;
	}
}