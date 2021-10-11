package check;

import constants.Constants;

public class Main {

	private static String firstName = "Haga";
	private static String lastName = "Fumiya";

	public static void main(String[] args) {

		System.out.println("printNameメソッド → " + printName(firstName, lastName));

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();

		RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robotpet.introduce();
	}

	private static String printName(String firstName, String lastName) {
		return firstName + lastName;
	}
}
