import java.io.File;
import java.io.IOException;

public class IOUtilTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			IOUtil.copy(new File("D:\\文本测试文档\\ceshi.txt"), new File("D:\\文本测试文档\\demo.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
