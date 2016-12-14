package javaexam;

import java.util.Arrays;

public class yichang {
    
    public static void main(String[] args) {
        
		// 定义一个整型数组，保存成绩信息
		int[] scores = { 89, 72, 64, 58, 93 };
        
		// 对Arrays类对数组进行排序
		
        Arrays.sort(scores);
		// 使用foreach遍历输出数组中的元素
		for (int score:scores                ) {
			System.out.println(score);
		}
	}
}