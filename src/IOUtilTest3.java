import java.io.File;
import java.io.IOException;

public class IOUtilTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			IOUtil.copy(new File("D:\\�ı������ĵ�\\ceshi.txt"), new File("D:\\�ı������ĵ�\\demo.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
