package JavaLearn;

public class compareToChallenge {

	public static void main(String[] args) {
		System.out.println(Compare("cat","dogsniffer"));
		System.out.println(Compare("bag", "hobo"));
		System.out.println(Compare("caught", "hot"));
		System.out.println(Compare("gag", "hobo"));
		System.out.println(Compare("dap", "twerk"));
	
		System.out.println(Compare("snag", "hobo"));
		System.out.println(Compare("hotdog", "catinthehat"));
		System.out.println(Compare("snarf", "pikachu"));
		System.out.println(Compare("queue", "Hurely"));
		System.out.println(Compare("top", "not"));

		System.out.println(Compare("her", "her"));
		System.out.println(Compare("him", "him"));
		
	}
	
	public static int Compare(String oneCompare, String twoCompare) {
		int x = oneCompare.compareTo(twoCompare);
		System.out.println("comparing " + oneCompare + " to  " + twoCompare + " produces: " );
		System.out.println("");
		return x;
		
	}

}
