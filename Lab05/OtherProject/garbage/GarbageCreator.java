package hust.soict.globalict.garbage;
import java.io.File;
import java.util.*;
public class GarbageCreator {
	public static void main(String []args) throws Exception {
		long start =System.currentTimeMillis();
		String s="";
		File file=new File("D:\\GarbageTest.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine()) {
			s+=sc.nextLine();
		}
		System.out.println(System.currentTimeMillis()-start);
		sc.close();
	}
}
