import java.io.File;

public class FileUtils {
//列出file类的一些常用操作比如过滤,遍历等操作
	public  static void listDirectory(File dir)throws Exception{
		/**
		 * 列出制定目录下(包括子目录)的所有文件
		 */
		if(!dir.exists()){
			throw new IllegalArgumentException("目录"+dir+"不存在");
		}
		if(!dir.isDirectory()){
			throw new IllegalArgumentException(dir+"不是目录");
			
		}
//		String[] filenames=dir.list();//返回字符串数组,直接子名称,不包括子目录的内容
//		for (String string : filenames) {
//			System.out.println(dir+"\\"+string);
//			
//		}
		File[] filenames=dir.listFiles();//返回的子目录(文件）的抽象
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
