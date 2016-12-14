package javaexam;
/*version1.0
 * author=clevertang
 * 2016/12/3
 * 输入三个班级个四名同学成绩
 * 计算每个班级平均分
 * 
 */
import java.util.*;
public class average {
	public static void main(String[] args) {
		int classnum=3;
		int studentnum=4;
		double sum=0;
		double aver=0;
		Scanner input= new Scanner(System.in);//创建输入对象
		for(int i=1;i<=3;i++){//外层循环控制班级数量										
			System.out.println("请输入第"+i+"个班级的成绩");
			aver=0;
			for(int j=1;j<=4;j++){//内层循环控制学生数量
				System.out.println("请输入第"+j+"个同学的成绩");
				int score=input.nextInt();
				sum+=score;		
				}
			aver=sum/studentnum;
			System.out.println("第"+i+"个班级的平均成绩为"+aver);
			
		}
		
				
	}

}
