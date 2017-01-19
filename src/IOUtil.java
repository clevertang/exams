import java.io.*;

public class IOUtil {
	/**
	 * 读取制定文件内容,按照十六进制输出到控制台
	 * @throws FileNotFoundException 
	 */
	public static void printHex(String FileName) throws IOException{
		FileInputStream in=new FileInputStream(FileName);
		//把文件作为字节流进行读操作
		int b;
		int i=1;
		while((b=in.read())!=-1){
			if(b<=0xf){
				System.out.print("0");//单位数前面补上0
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
//		 * 从in中批量读取字节,放入buf字节数组中
//		 * 从第0个开始放,放不超过buf.length个字节
//		 * 返回的是读的字节的个数
//		 */
//		int bytes=in.read(buf, 0, buf.length);//一次性读完,说明字节数组足够大
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
		while((bytes=in.read(buf,0,buf.length))!=-1){             //放不满时
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
			throw new IllegalArgumentException("文件不存在");
		}
		if(!scrFile.isFile()){
			throw new IllegalArgumentException("不是文件");
		}
		int b;
		FileInputStream in=new FileInputStream(scrFile);
		FileOutputStream out=new FileOutputStream(destFile);
		byte[] buf= new byte[20*1024];
		while(( b=in.read(buf, 0, buf.length))!=-1){
			out.write(buf, 0, b);
			out.flush();//清空缓冲区
		}
		in.close();
		out.close();
	}
}
