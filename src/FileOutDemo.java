
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutDemo {
	public static void main(String[] args) throws IOException{
		//������ļ�������,�򴴽�,�������ɾ�����ٴ���
		FileOutputStream out=new FileOutputStream("D:\\�ı������ĵ�\\demo.txt");
		out.write('a');//д����a�ĵͰ�λ
		int a=10;//д��һ��������Ҫд�Ĵ�,ÿ��һ���ֽ�
		out.write(a>>>24);
		out.write(a>>>16);
		out.write(a>>>8);
		out.write(a);
		byte[] gbk="�й�".getBytes("gbk");
		out.write(gbk);
		//out.close();
		IOUtil.printHex("D:\\�ı������ĵ�\\demo.txt");
	}
}
