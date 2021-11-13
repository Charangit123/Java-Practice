package basicprograms;

import java.util.Scanner;

public class MonkeyProblem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Climb steps: ");
		int Nclimb = sc.nextInt();

		System.out.println("Enter Fall steps: ");
		int Nfall = sc.nextInt();

		System.out.println("Enter Destionation steps: ");
		int Ndestination = sc.nextInt();

		int x = numberOfSteps(Nclimb, Nfall, Ndestination);
		System.out.println("Number steps monkey takes to reach: " + x);

	}

	public static int numberOfSteps(int climb, int fall, int destination) {
		int nsteps = 0;
		if (destination >= climb) {
			if ((climb != fall) && (climb > fall)) {
				int diff = climb - fall;
				nsteps = destination / diff;
				return nsteps + 1;
			} else {
				int x = 0;
				return x;
			}
		} else {
			return 0;
		}
	}

}
