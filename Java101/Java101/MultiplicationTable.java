

public class MultiplicationTable {


	public static String generateMultTable(int numberRows, int numbCols) {

		String tableString = "";

		for (int row = 1; row <= numberRows; row++ ) {
			for (int col = 1; col <= numbCols; col++ ) {
				tableString+= (row * col) + " |" ;
			}//end innner for

			tableString+= "\n";

		}//end outerfor

		return tableString;
	}



	
	public static void main(String[] args) {
		String table = generateMultTable(10, 10);
		System.out.println(table);

	}


} 
