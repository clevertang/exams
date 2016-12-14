package javaexam;

public class Test {
	public static void StringReplace(String text){
		text=text+'c';
	}
	public static void bufferReplace(StringBuffer text){
		text=text.append("c");
	}
	public static void main(String args[]){
		String testString=new String("java");
		StringBuffer textBuffer=new StringBuffer("java");
		StringReplace(testString);
		System.out.println(testString);
		bufferReplace(textBuffer);
		System.out.println(textBuffer);
	}
	public void test2() {
		// TODO Auto-generated method stub
		
	}
}
