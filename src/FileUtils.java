import java.io.File;

public class FileUtils {
//�г�file���һЩ���ò����������,�����Ȳ���
	public  static void listDirectory(File dir)throws Exception{
		/**
		 * �г��ƶ�Ŀ¼��(������Ŀ¼)�������ļ�
		 */
		if(!dir.exists()){
			throw new IllegalArgumentException("Ŀ¼"+dir+"������");
		}
		if(!dir.isDirectory()){
			throw new IllegalArgumentException(dir+"����Ŀ¼");
			
		}
//		String[] filenames=dir.list();//�����ַ�������,ֱ��������,��������Ŀ¼������
//		for (String string : filenames) {
//			System.out.println(dir+"\\"+string);
//			
//		}
		File[] filenames=dir.listFiles();//���ص���Ŀ¼(�ļ����ĳ���
		if(filenames!=null&&filenames.length>0){
		for (File file : filenames) {
			if(file.isDirectory()){
				listDirectory(file);
			}
			else{
				System.out.println(file);
			}
			//System.out.println(file);
		}
		}
		
	}
}
