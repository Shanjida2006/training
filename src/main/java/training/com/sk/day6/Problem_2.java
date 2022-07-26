package training.com.sk.day6;

public class Problem_2 {

	public static void main(String[] args) {
			NumThread1 ob1= new NumThread1();
			Thread t1=new Thread(ob1);
			t1.start();
			
			NumThread2 ob2= new NumThread2();
			Thread t2=new Thread(ob2);
			t2.start();
	}
}
class NumThread1 implements Runnable{
	public void run() {	
		for(int i=0;i<=50;i=i+2) {
			System.out.println(i);
		}
	}
}
class NumThread2 implements Runnable{
	public void run() {
		for(int i=1;i<=50;i=i+2) {
			System.out.println(i);
		}
	}
}