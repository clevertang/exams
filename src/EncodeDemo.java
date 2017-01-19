import java.io.UnsupportedEncodingException;

public class EncodeDemo  {
    public static void main(String[] args) throws Exception{
	String s="Ľ��ABC";
	byte[] byte1=s.getBytes();//ת�����ֽ��õ�����ĿĬ�ϵı���
	for(byte b:byte1){
		//���ֽ�ת������int��ʮ�����Ʊ�ʾ
		System.out.println(Integer.toHexString(b)+" ");
	}
	byte[] byte2=s.getBytes("gbk");//GBK��������ռ�������ֽ�,Ӣ��һ���ֽ�
	for(byte b:byte2){
		//���ֽ�ת������int��ʮ�����Ʊ�ʾ
		System.out.print(Integer.toHexString(b&0xff)+" ");
	}
	System.out.println();
	byte[] byte3=s.getBytes("UTF-8");//UTF-8��������ռ�������ֽ�,Ӣ��һ���ֽ�
	for(byte b:byte3){
		//���ֽ�ת������int��ʮ�����Ʊ�ʾ
		System.out.print(Integer.toHexString(b&0xff)+" ");
	}
	System.out.println();
	//java��˫�ֽڱ���
	byte[] byte4=s.getBytes("UTF-16be");//UTF-16be��������ռ��2���ֽ�,Ӣ��2���ֽ�
	for(byte b:byte4){
		//���ֽ�ת������int��ʮ�����Ʊ�ʾ
		System.out.print(Integer.toHexString(b&0xff)+" ");
	}
	System.out.println();
	String str1=new String(byte4);
	System.out.println(str1);
	String str2=new String(byte4,"UTF-16be");
	System.out.println(str2);
}
}
