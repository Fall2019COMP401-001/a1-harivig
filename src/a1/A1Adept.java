package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int numStoreItems = scan.nextInt();
		String [] storeItemNames = new String [numStoreItems]; //array for menu items
		double [] storeItemPrices = new double [numStoreItems];
				
		for (int x = 0; x<numStoreItems;x++) //loop used to store info about menu
		{
			storeItemNames[x] = scan.next();
			storeItemPrices[x] = scan.nextDouble();
		}
		
		int numCust = scan.nextInt();
		String [] custNames = new String [numCust];
		double [] custTotals = new double [numCust];
		
		for (int y=0; y<numCust; y++) //loop to input names
		{
			custNames[y] = scan.next() + " " + scan.next();
			
			int numItemsSpent = scan.nextInt();
			
			for (int a=0;a<numItemsSpent;a++) //loop to see what the customer bought
			{
				int numItemBought = scan.nextInt();
				String itemBought = scan.next();
				
				for (int b=0; b<numStoreItems;b++)
				{
					if (itemBought.equals(storeItemNames[b])) //if statement finds out what item customer bought; if string matches, then the corresponding price is used to add to the cost
					{
						custTotals[y] += numItemBought*storeItemPrices[b];
					}
				}
			}
		}

		double biggest = custTotals[0]; //variables used to find biggest and smallest numbers
		double smallest = custTotals[0];
		int biggestIndex = 0;
		int smallestIndex = 0;
		
		for (int test=0; test<numCust;test++)
		{
			if (custTotals[test]>biggest) //used to see what is biggest, and finding the index
			{
				biggest = custTotals[test];
				biggestIndex = test;
			}
			
			if (custTotals[test]<smallest) //used to see what is smallest, and finding the index
			{
				smallest = custTotals[test];
				smallestIndex = test;		
			}
		}
		
		double totalTotalCost = 0;
		
		for (int calc=0; calc<numCust; calc++)
		{
			totalTotalCost += custTotals[calc];
		}
		
		double average = totalTotalCost/numCust; //calculates average
		
		System.out.println("Biggest: "+ custNames[biggestIndex]+" ("+(String.format("%.2f",biggest))+")");
		System.out.println("Smallest: "+ custNames[smallestIndex]+" ("+(String.format("%.2f",smallest))+")");
		System.out.println("Average: "+(String.format("%.2f",average)));
	}
}
