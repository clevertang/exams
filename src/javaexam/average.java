package javaexam;
/*version1.0
 * author=clevertang
 * 2016/12/3
 * ���������༶������ͬѧ�ɼ�
 * ����ÿ���༶ƽ����
 * 
 */
import java.util.*;
public class average {
	public static void main(String[] args) {
		int classnum=3;
		int studentnum=4;
		double sum=0;
		double aver=0;
		Scanner input= new Scanner(System.in);//�����������
		for(int i=1;i<=3;i++){//���ѭ�����ư༶����										
			System.out.println("�������"+i+"���༶�ĳɼ�");
			aver=0;
			for(int j=1;j<=4;j++){//�ڲ�ѭ������ѧ������
				System.out.println("�������"+j+"��ͬѧ�ĳɼ�");
				int score=input.nextInt();
				sum+=score;		
				}
			aver=sum/studentnum;
			System.out.println("��"+i+"���༶��ƽ���ɼ�Ϊ"+aver);
			
		}
		
				
	}

}
