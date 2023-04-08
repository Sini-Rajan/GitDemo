// Java Program to Count Even Numbers in an Array using For Loop
import java.util.ArrayList;
import java.util.Scanner;

public class CountEven {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int Size, i, evenCount = 0;
		sc = new Scanner(System.in);
	 
		System.out.print(" Please enter the size of array : ");
		Size = sc.nextInt();	
		ArrayList<Integer> a = new ArrayList<Integer>(Size);

		
		System.out.print(" Enter the vales in arraylist : ");
		for (i = 0; i < Size; i++)
		{
			a.add(sc.nextInt());  
		}

		
		//System.out.print("\n List of Even Numbers in this Array are :"); 
		for(i = 0; i < Size; i++)
		{
			if(a.get(i) % 2 == 0)
			{
				//System.out.print(a.get(i) +" ");
				evenCount++;
			}
		}
		System.out.println("\n Total Number of Even Numbers in this Array = " + evenCount);
	}
}