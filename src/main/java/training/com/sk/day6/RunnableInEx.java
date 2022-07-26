package training.com.sk.day6;

public class RunnableInEx {

	public static void main(String[] args) {
		EvenNumThread2 t1= new EvenNumThread2();
		Thread thread1=new Thread(t1);
		thread1.start();
		
		Thread22 t2= new Thread22();
		Thread thread2=new Thread(t2);
		thread2.start();

	}

}
class EvenNumThread2 implements Runnable{
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
class Thread22 implements Runnable{
	public void run() {
		for(int i=1;i<10;i=i+2) {
			System.out.println(i);
		}
	}
}