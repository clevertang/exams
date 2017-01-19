import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("D:\\文本测试文档\\a");
		//System.out.println(file.exists());
		if(!file.exists()){
			file.mkdirs();//直接创建目录
		}
		else{
			file.delete();//删除
		}
		System.out.println(file.isDirectory());//是否是一个目录
		System.out.println(file.isFile());//是否是一个文件
		//不存在时也返回false
		File file2=new File("D:\\文本测试文档\\ceshi.txt");
		if(!file2.exists()){
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			file2.delete();
		}
		System.out.println(file);//file.toString的内容
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file2.getName());
	}

}
