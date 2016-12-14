package javaexam;

import java.util.Arrays;
public class sort3 {
    
    //完成 main 方法
    public static void main(String[] args) {
        int[]scores={89,-23,64,91,119,52,73};
        sort3 hello=new sort3();
        hello.findFirst3(scores);
        
        
        
    }
    
    //定义方法完成成绩排序并输出前三名的功能
    
    public void  findFirst3(int[] scores){
    	int count=0;
        Arrays.sort(scores);
        System.out.println("考试成绩的前三名为:");
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