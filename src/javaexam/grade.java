package javaexam;
import java.util.*;
/*author clevertang
 * ��ȡ�û��ɼ�
 * �ۼӵ�60��
 * ����ۼӴ���
 * 
 */
public class grade {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("�������ʼ�ɼ�:");
		int score=input.nextInt();//�ɼ�
		int count=0;
		if (score>=60){
			System.out.println("�������");
			
		}
		else while(score<60){
			
			score++;
			count++;
			
		}
		System.out.println(score);
		System.out.println("������"+count+"���ۼ�");
		
		
		
		
		
	}
}
