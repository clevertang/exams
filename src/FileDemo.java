import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("D:\\�ı������ĵ�\\a");
		//System.out.println(file.exists());
		if(!file.exists()){
			file.mkdirs();//ֱ�Ӵ���Ŀ¼
		}
		else{
			file.delete();//ɾ��
		}
		System.out.println(file.isDirectory());//�Ƿ���һ��Ŀ¼
		System.out.println(file.isFile());//�Ƿ���һ���ļ�
		//������ʱҲ����false
		File file2=new File("D:\\�ı������ĵ�\\ceshi.txt");
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
		System.out.println(file);//file.toString������
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file2.getName());
	}

}
