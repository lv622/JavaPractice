package JavaPractice;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;

		for (int num = 2; num < 10; num++) {
			System.out.println("** " + num + "단 **");

			for (int loop = 1; loop < 10; loop++) {
				result = num * loop;
				System.out.println(num + " x " + loop + " = " + result);
			}
		}
	}

}
