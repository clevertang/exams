import java.io.UnsupportedEncodingException;

public class EncodeDemo  {
    public static void main(String[] args) throws Exception{
	String s="慕课ABC";
	byte[] byte1=s.getBytes();//转化成字节用的是项目默认的编码
	for(byte b:byte1){
		//把字节转换成了int以十六进制表示
		System.out.println(Integer.toHexString(b)+" ");
	}
	byte[] byte2=s.getBytes("gbk");//GBK编码中文占用两个字节,英文一个字节
	for(byte b:byte2){
		//把字节转换成了int以十六进制表示
		System.out.print(Integer.toHexString(b&0xff)+" ");
	}
	System.out.println();
	byte[] byte3=s.getBytes("UTF-8");//UTF-8编码中文占用三个字节,英文一个字节
	for(byte b:byte3){
		//把字节转换成了int以十六进制表示
		System.out.print(Integer.toHexString(b&0xff)+" ");
	}
	System.out.println();
	//java是双字节编码
	byte[] byte4=s.getBytes("UTF-16be");//UTF-16be编码中文占用2个字节,英文2个字节
	for(byte b:byte4){
		//把字节转换成了int以十六进制表示
		System.out.print(Integer.toHexString(b&0xff)+" ");
	}
	System.out.println();
	String str1=new String(byte4);
	System.out.println(str1);
	String str2=new String(byte4,"UTF-16be");
	System.out.println(str2);
}
}
