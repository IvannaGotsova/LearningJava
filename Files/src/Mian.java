import java.io.File;

public class Mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fileName = new File("filename.txt");
		System.out.println(fileName.getAbsolutePath());
		System.out.println(fileName.getName());
		System.out.println(fileName.canRead());
		System.out.println(fileName.canWrite());
		System.out.println(fileName.length());
		
		fileName.delete();
	}

}
