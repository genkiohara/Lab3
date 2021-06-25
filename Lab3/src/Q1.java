import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);

		ArrayList<Integer> randomNumList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			int randomNum = (rand.nextInt((50 - 1) + 1)) + 1;
			randomNumList.add(randomNum);
		}

		System.out.println(randomNumList);

		while (true) {
			System.out.println("Please enter an integer between 1 to 50");
			Integer x = input.nextInt();

			if (randomNumList.contains(x)) {
				System.out.println(x + " is in the ArrayList");
				input.close();
				break;
			} else {
				System.out.println(x + " is NOT in the ArrayList");
			}
		}
	}
}
