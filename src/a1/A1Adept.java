package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int numStoreItems = scan.nextInt();
		String [] storeItemNames = new String [numStoreItems];
		double [] storeItemPrices = new double [numStoreItems];
				
		for (int x = 0; x<numStoreItems;x++)
		{
			storeItemNames[x] = scan.next();
			storeItemPrices[x] = scan.nextDouble();
		}
		
		int numCust = scan.nextInt();
		String [] custNames = new String [numCust];
		double [] custTotals = new double [numCust];
		
		for (int y=0; y<numCust; y++)
		{
			custNames[y] = scan.next() + " " + scan.next();
			
			int numItemsSpent = scan.nextInt();
			
			for (int a=0;a<numItemsSpent;a++)
			{
				int numItemBought = scan.nextInt();
				String itemBought = scan.next();
				
				for (int b=0; b<numStoreItems;b++)
				{
					if (itemBought.equals(storeItemNames[b]))
					{
						custTotals[y] += numItemBought*storeItemPrices[b];
					}
				}
			}
		}

		double biggest = custTotals[0];
		double smallest = custTotals[0];
		int biggestIndex = 0;
		int smallestIndex = 0;
		
		for (int test=0; test<numCust;test++)
		{
			if (custTotals[test]>biggest)
			{
				biggest = custTotals[test];
				biggestIndex = test;
			}
			
			if (custTotals[test]<smallest)
			{
				smallest = custTotals[test];
				smallestIndex = test;		
			}
		}
		
		double totalTotalCost =0;
		
		for (int calc=0; calc<numCust; calc++)
		{
			totalTotalCost += custTotals[calc];
		}
		
		double average = totalTotalCost/numCust;
		
		System.out.println("Biggest: "+ custNames[biggestIndex]+" ("+(String.format("%.2f",biggest))+")");
		System.out.println("Smallest: "+ custNames[smallestIndex]+" ("+(String.format("%.2f",smallest))+")");
		System.out.println("Average: "+(String.format("%.2f",average)));
	}
}
