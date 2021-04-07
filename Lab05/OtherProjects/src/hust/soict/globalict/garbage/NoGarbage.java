package hust.soict.globalict.garbage;

import java.io.File;
import java.util.Scanner;

public class NoGarbage {
	public static void main(String []args) throws Exception {
		long start =System.currentTimeMillis();
		StringBuffer s=new StringBuffer("");
		File file=new File("D:\\GarbageTest.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine()) {
			s.append(sc.nextLine());
		}
		s.toString();
		System.out.println(System.currentTimeMillis()-start);
		sc.close();
	}
}
