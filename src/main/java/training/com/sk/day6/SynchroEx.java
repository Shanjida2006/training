package training.com.sk.day6;
import lombok.Getter;
import lombok.Setter;

public class SynchroEx {

	public static void main(String[] args) {
		ThreadEx1 t1= new ThreadEx1();
		Thread thread1=new Thread(t1);
		thread1.start();
		
		Thread thread2=new Thread(t1);
		thread2.start();
		
		/*
		 * ThreadEx2 t2= new ThreadEx2(); Thread thread2=new Thread(t2);
		 * thread2.start();
		 */

	}
}
class ThreadEx2 implements Runnable{
	BankService bs=new BankService();
	//@override
	public void run() {
		bs.withDraw(560);
	}
}
class ThreadEx1 implements Runnable{
	BankService bs=new BankService();
	//@override
	public void run() {
		bs.withDraw(550);
	}
}
class BankService{
	Bank b=new Bank();
	public synchronized void withDraw(int amount) {
		int bal=b.getBal();
		int remainBal=bal-amount;
		System.out.println("Balanced deducted..."+amount);
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		b.setBal(remainBal);
		System.out.println("Remaining Balance: "+b.getBal());
		
	}
}
@Setter
@Getter
class Bank{
	private long acNum;
	private int bal=1000;
}
