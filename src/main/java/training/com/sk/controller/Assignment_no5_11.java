package training.com.sk.controller;

public class Assignment_no5_11 {
public static void main(String[] args) {
		
		//Task5
		System.out.print("Display Even Numbers between 1 to 100:");
		for(int i=2; i<=100;i=i+2) 
		{
			System.out.print(" "+i);
		}
		//Task6
		System.out.println("\n\nDisplay Numbers between 1 to 5(5 times):");
		for(int i=1; i<=5;i++) 
		{
			System.out.print("\nNo. of times:" +i+"->");
			for(int j=1; j<=5;j++) 
			{
				System.out.print(" "+j);
			}
		}
		//Task7
		System.out.print("\n\nDisplay Numbers between 1 to 25 using while loop:");
		int i=1;
		while(i<=25) 
		{
			System.out.print(" "+i);
			i++;
		}
		
		//Task8
		System.out.print("\n\nDisplay Odd Numbers between 50 to 100 using do while:");
		i=50;
		do
		{
			if(i%2!=0)System.out.print(" "+i);
			i++;
		}while(i<=100);
		
		//Task9

		System.out.print("\n\nDisplay Prime Numbers between 1 to 100:");
		for (int num = 2; num <= 100; num++)
        {
            int isPrime= 0;
            for (int k=2; k <= num/2; k++)
            {
                if ( num % k == 0)
                {
                    isPrime = 1;
                    break;
                }
            }
 
            if ( isPrime == 0 )
                System.out.print(" "+num);
        }
		
		//Task10
		System.out.print("\n\nDisplay Odd Numbers between 1 to 100 using continue:");
		
		for(int m=1; m<=100;m++) 
		{
			if(m%2==0) continue;
			System.out.print(" "+m);
		}
		
		//Task11
		System.out.print("\n\nDisplay Numbers between 50 to 75 using break:");
		
		for(int m=50; m<=100;m++) 
		{
			if(m==76) break;
			System.out.print(" "+m);
		}

	
	}

}
