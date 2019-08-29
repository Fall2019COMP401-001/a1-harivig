package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int numStoreItems = scan.nextInt();
		String [] storeItemNames = new String [numStoreItems];
		double [] storeItemPrices = new double [numStoreItems];
		
		int numCustThatBoughtItems [] = new int [numStoreItems];
		int totalNumOfAnItemBought [] = new int [numStoreItems];
				
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
						numCustThatBoughtItems[b]++;
						totalNumOfAnItemBought[b]+=numItemBought; //fix
					} 
				}
			}
		}
		
		for (int x = 0; x<numStoreItems;x++) //to print out the info
		{
			if (numCustThatBoughtItems[x]==0)
			{
				System.out.println("No customers bought "+storeItemNames[x]);
			}
			
			else
			{
				System.out.println(numCustThatBoughtItems[x]+" customers bought "+totalNumOfAnItemBought[x]+" "+storeItemNames[x]);
			}
		}
		
	}
}
