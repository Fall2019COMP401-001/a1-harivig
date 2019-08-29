package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		
		int tnum = scan.nextInt();
		double totalCost = 0;
				
		String [] firstNames = new String [tnum];
		String [] lastNames = new String [tnum];
		double [] totalCostArray = new double [tnum];
		char [] firstInitials = new char [tnum];
		
		for (int x=0; x<tnum; x++)
		{
			
			firstNames[x] = scan.next();
			firstInitials[x] = firstNames[x].charAt(0);
			lastNames[x] = scan.next();
			
			int numItems = scan.nextInt();
			
			for (int y = 0; y<numItems; y++)
			{
				int quanItem = scan.nextInt();
				
				String nameItem = scan.next();
				
				double priceItem = scan.nextDouble();
				
				totalCost += quanItem*priceItem;
			}
		
			totalCostArray[x] = totalCost;
			totalCost = 0;
			
		} 
		
		for (int z=0; z<tnum;z++)
		{
			System.out.print(firstInitials[z]+". ");
			System.out.print(lastNames[z]+": ");
			System.out.println(String.format("%.2f",totalCostArray[z])); //used an online forum to figure out how to round to 2 decimal places
		}
		
	}
}
