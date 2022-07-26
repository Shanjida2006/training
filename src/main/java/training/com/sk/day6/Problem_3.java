package training.com.sk.day6;

public class Problem_3 {

	public static void main(String[] args) {
		Number obj = new Number();
		NumThread11 t1=new NumThread11(obj);  
		NumThread22 t2=new NumThread22(obj);  
		t1.start();  
		t2.start();  
	}
}
class Number{  
	public synchronized void printNum(int n){ 
	   for(int i=1;i<=5;i++){  
		     System.out.println(n*i);  
		     try{  
		      Thread.sleep(200);  
		     }catch(Exception e){
		    	 System.out.println(e);
		    }  
	    }  
	 }  
}  
class NumThread11 extends Thread{  
	Number t;  
	NumThread11(Number t){  
		this.t=t;  
	}  
	public void run(){  
		t.printNum(5);  
	}  
}  
class NumThread22 extends Thread{  
	Number t;  
	NumThread22(Number t){  
		this.t=t;  
	}  
	public void run(){  
		t.printNum(100);  
	}
}