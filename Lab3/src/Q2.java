import java.util.ArrayList;
import java.util.Random;

public class Q2 {
	public static void main(String[] args) {
		Random rand = new Random();
        ArrayList<Integer> randomNumList = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            int randomNum = (rand.nextInt((50 - 1) + 1)) + 1;
            randomNumList.add(randomNum);
        }

        ArrayList<Integer> copyList = new ArrayList<>();
        copyList.addAll(randomNumList);

        System.out.println("---- Before set ----");
        System.out.println(randomNumList);
        System.out.println(copyList);

        randomNumList.set(9, -5);

        System.out.println("---- After set -----");
        System.out.println(randomNumList);
        System.out.println(copyList);
		
				
	}
}