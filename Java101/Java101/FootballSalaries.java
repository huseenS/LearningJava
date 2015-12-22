

import java.util.Scanner;

public class FootballSalaries {

	public static final int TEAM_SIZE = 53;
	public static final long MAX_SALARY = 30000000;

	public static void generateSalaries(long[] teamSalaries) {

		for (int i =0; i < teamSalaries.length; i++) {
			teamSalaries[i] = (long)(Math.random() * MAX_SALARY);
		}
	}


	public static void printSalaires(long[] teamSalaries) {

		for (int i =0; i < teamSalaries.length; i++) {
			System.out.println( "player " + i + " made " + teamSalaries[i]);
		}
	}

	public static Long getMaxSalary(long[] teamSalaries) {
		long currentMax = 0;
		for (int i=0; i < teamSalaries.length; i++ ) {
			if(teamSalaries[i] > currentMax) {
				currentMax = teamSalaries[i];
			}
		}
		return currentMax;
	}

	public static Long getPlayerWithMaxSalary(long[] teamSalaries) {
		long currentMax = 0;
		long currentPlayerMax=0;
		for (int i=0; i < teamSalaries.length; i++ ) {
			if(teamSalaries[i] > currentMax) {
				currentMax = teamSalaries[i];
				currentPlayerMax = i;
			}
		}
		return currentPlayerMax;
	}



	public static void main(String[] args) {
		
		long[] salaries = new long[TEAM_SIZE];

		generateSalaries(salaries);
		printSalaires(salaries);
		long biggestSalary = getMaxSalary(salaries);
		long biggestPlayer = getPlayerWithMaxSalary(salaries);
		System.out.println("biggest salary was " + biggestSalary);
		System.out.println("player # " + biggestPlayer + " had the largest salary");
	}

}
