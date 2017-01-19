
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutDemo {
	public static void main(String[] args) throws IOException{
		//如果该文件不存在,则创建,如果存在删除后再创建
		FileOutputStream out=new FileOutputStream("D:\\文本测试文档\\demo.txt");
		out.write('a');//写入了a的低八位
		int a=10;//写入一个整型需要写四次,每次一个字节
		out.write(a>>>24);
		out.write(a>>>16);
		out.write(a>>>8);
		out.write(a);
		byte[] gbk="中国".getBytes("gbk");
		out.write(gbk);
		//out.close();
		IOUtil.printHex("D:\\文本测试文档\\demo.txt");
	}
}
