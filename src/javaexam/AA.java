package javaexam;

public class AA {
	public AA(){
		System.out.print("AA");
	}
	
}
 class BB extends AA{
	public BB(){
		System.out.print("BB");
	}

	public static void main(String args[]){
	BB b= new BB();
}
 }