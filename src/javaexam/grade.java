package javaexam;
import java.util.*;
/*author clevertang
 * 获取用户成绩
 * 累加到60分
 * 输出累加次数
 * 
 */
public class grade {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入初始成绩:");
		int score=input.nextInt();//成绩
		int count=0;
		if (score>=60){
			System.out.println("输入错误");
			
		}
		else while(score<60){
			
			score++;
			count++;
			
		}
		System.out.println(score);
		System.out.println("进行了"+count+"次累加");
		
		
		
		
		
	}
}
