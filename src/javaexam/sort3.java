package javaexam;

import java.util.Arrays;
public class sort3 {
    
    //��� main ����
    public static void main(String[] args) {
        int[]scores={89,-23,64,91,119,52,73};
        sort3 hello=new sort3();
        hello.findFirst3(scores);
        
        
        
    }
    
    //���巽����ɳɼ��������ǰ�����Ĺ���
    
    public void  findFirst3(int[] scores){
    	int count=0;
        Arrays.sort(scores);
        System.out.println("���Գɼ���ǰ����Ϊ:");
        for(int i=scores.length-1;i>=0;i--){
            
            if(0<= scores[i]&&scores[i]<=100){
            	if (count<3){           		
            	
                count++;
                System.out.println(scores[i]);
                
            }
        }
    }
    
    }
    
    
    
    
    
    
}