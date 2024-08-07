package DrivingLicence;

import java.util.Scanner;

class Verification extends Exception {

}

class Driving {
	int age;

	public void userInput() {
		System.out.println("Enter your age.");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
	}

	public void check() throws Exception {
		if (age > 17 && age < 65) {
			System.out.println("Your eligible to get licence.");

		} else if (age > 65) {
			System.out.println("You are  too old ,be calm.");
			Verification v = new Verification();
			throw v;
		} else {
			System.out.println("Your are too yeng try after age 18.");
			Verification v = new Verification();
			throw v;

		}
	}
}

class Rdo {
	public void rdo() {
		Driving d = new Driving();
		try {
			d.userInput();
			d.check();
		} catch (Exception e) {
			try {
				d.userInput();
				d.check();
			} catch (Exception f) {
				try {
					d.userInput();
					d.check();
				} catch (Exception g) {
					System.out.println("Sorry you are not eligible \nConnection terminated.");
				}
			}
		}

	}

}

public class DrivingLicence {

	public static void main(String[] args) {
		Rdo r = new Rdo();
		r.rdo();

	}

}
