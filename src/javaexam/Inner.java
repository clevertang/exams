package javaexam;

//�ⲿ��HelloWorld
public class Inner{
  
  //�ⲿ���˽������name
  private String name = "imooc";
  
  //�ⲿ��ĳ�Ա����
  int age = 20;
  
	//��Ա�ڲ���Inner
	public class Inner1 {
		String name = "��Ľ��";
      //�ڲ����еķ���
		public void show() { 
			System.out.println("�ⲿ���е�name��" + Inner1.this.name             );
			System.out.println("�ڲ����е�name��" + name                 );
			System.out.println("�ⲿ���е�age��" + age);
		}
	}
  
	//���Գ�Ա�ڲ���
	public static void main(String[] args) {
      
      //�����ⲿ��Ķ���
		Inner o = new Inner (); 
      
      //�����ڲ���Ķ���
		Inner1 inn =  o.new Inner1()            ;
      
      //�����ڲ�������show����
		inn.show();
	}
}