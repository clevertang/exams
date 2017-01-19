import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DosDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		String file="D:\\文本测试文档\\ceshi.txt";
		DataOutputStream dos=new DataOutputStream(new FileOutputStream(file));
		dos.writeInt(10);
		dos.writeInt(11);
		dos.writeDouble(10.5);
		dos.writeUTF("中国");
		dos.close();
		IOUtil.printHex(file);
		DataInputStream dis=new DataInputStream(new FileInputStream(file));
		int a=dis.readInt();
		System.out.println(a);
//		int f=dis.readInt();
//		System.out.println(f);
		Double b=dis.readDouble();
		System.out.println(b);
		String s=dis.readUTF();
		System.out.println(s);
		dis.close();
	}

}
