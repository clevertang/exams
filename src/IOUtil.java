import java.io.*;

public class IOUtil {
	/**
	 * ��ȡ�ƶ��ļ�����,����ʮ���������������̨
	 * @throws FileNotFoundException 
	 */
	public static void printHex(String FileName) throws IOException{
		FileInputStream in=new FileInputStream(FileName);
		//���ļ���Ϊ�ֽ������ж�����
		int b;
		int i=1;
		while((b=in.read())!=-1){
			if(b<=0xf){
				System.out.print("0");//��λ��ǰ�油��0
			}
			System.out.print(Integer.toHexString(b)+"  ");
			if(i++%10==0){
				System.out.println();
			}
		}
		in.close();
	}
	public static void printHexByByteArray(String FileName) throws IOException{
		FileInputStream in=new FileInputStream(FileName);
		byte[] buf=new byte[20*1024]; 
//		/*
//		 * ��in��������ȡ�ֽ�,����buf�ֽ�������
//		 * �ӵ�0����ʼ��,�Ų�����buf.length���ֽ�
//		 * ���ص��Ƕ����ֽڵĸ���
//		 */
//		int bytes=in.read(buf, 0, buf.length);//һ���Զ���,˵���ֽ������㹻��
//		int j=1;
//		for(int i=0;i<bytes;i++){
////			if(buf[i]<=0xf){
////				System.out.print("0");
////			}
//			System.out.print(Integer.toHexString(buf[i]&0xff)+"  ");
//			if(j++%10==0){
//				System.out.println();
//			}
//		}
		int bytes=0;
		int j=1;
		while((bytes=in.read(buf,0,buf.length))!=-1){             //�Ų���ʱ
			for(int i=0;i<bytes;i++){
				System.out.print(Integer.toHexString(buf[i]&0xff)+"  ");
				if(j++%10==0){
					System.out.println();
				}
			}
		}
	}
	public static void copy(File scrFile,File destFile) throws IOException{
		if(!scrFile.exists()){
			throw new IllegalArgumentException("�ļ�������");
		}
		if(!scrFile.isFile()){
			throw new IllegalArgumentException("�����ļ�");
		}
		int b;
		FileInputStream in=new FileInputStream(scrFile);
		FileOutputStream out=new FileOutputStream(destFile);
		byte[] buf= new byte[20*1024];
		while(( b=in.read(buf, 0, buf.length))!=-1){
			out.write(buf, 0, b);
			out.flush();//��ջ�����
		}
		in.close();
		out.close();
	}
}
