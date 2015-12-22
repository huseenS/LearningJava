package pokemon101;

import java.io.File;



public class FileCount {


	public static int fileCount(File currenFile) {
		//BASE CASE
		if (currenFile.isFile()) {
			return 1;
		}
		else {
			int sum = 0;
			File[] children = currenFile.listFiles();
				for (File f: children ) {
					sum+= fileCount(f);
				}
				return sum;
		}
		//RecursiveCase
	}


	public static void main(String[] args) {
			File startingfile =	new File("test"); 
			int filecounter = fileCount(startingfile);
		System.out.println("number of files " + filecounter);
	}
}