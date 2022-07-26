package training.com.sk.day6;

public class Problem_1 {

	public static void main(String[] args) {

		NumThread t1 = new NumThread();
		t1.start();
	}
}
class NumThread extends Thread {
	public void run() {

		for (int i = 1; i <= 50; i++) {
			System.out.print(i + " ");
		}
	}
}
