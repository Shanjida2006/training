package training.com.sk.day6;

public class PrintNumEx {

	public static void main(String[] args) {
		EvenNumThread t1= new EvenNumThread();
		t1.start();
		
		OddNumThread t2= new OddNumThread();
		t2.start();
		
		Thread thread=Thread.currentThread();
		System.out.println(thread.getName());
		System.out.println(thread.getId());
		System.out.println(thread.getPriority());
		System.out.println(thread.getState());
		

	}

}
class EvenNumThread extends Thread{
	public void run() {
		Thread thread=Thread.currentThread();
		System.out.println(thread.getName());
		System.out.println(thread.getId());
		System.out.println(thread.getPriority());
		System.out.println(thread.getState());
		
		for(int i=0;i<10;i=i+2) {
			System.out.println(i);
		}
	}
}
class OddNumThread extends Thread{
	public void run() {
		for(int i=1;i<10;i=i+2) {
			System.out.println(i);
		}
	}
}

