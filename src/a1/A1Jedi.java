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
				
		for (int x = 0; x<numStoreItems;x++) //creating the menu based on input
		{
			storeItemNames[x] = scan.next();
			storeItemPrices[x] = scan.nextDouble();
		}
		
		int numCust = scan.nextInt();
		String [] custNames = new String [numCust];
		boolean [] alreadyPurchased = new boolean [numStoreItems]; //used to check if a customer has already bought an item. got this idea from classmate on Piazza
		
		for (int y=0; y<numCust; y++)
		{
			custNames[y] = scan.next() + " " + scan.next(); //customer name input
			
			int numItemsSpent = scan.nextInt();
			
			for (int a=0;a<numItemsSpent;a++)
			{
				int numItemBought = scan.nextInt();
				String itemBought = scan.next();
				
				for (int b=0; b<numStoreItems;b++)
				{	
						if (itemBought.equals(storeItemNames[b])) //checks input with the menu
						{
							totalNumOfAnItemBought[b]+=numItemBought; //increments the array with the input
							
							if (!alreadyPurchased[b]) //only increase if the customer is not a repeat
							{
								numCustThatBoughtItems[b]++;
								alreadyPurchased[b] = true;
							}
						} 	
				}
			}
			
			for (int x=0;x<numStoreItems;x++) //reset the entire array as false when starting again with a new customer
			{
				alreadyPurchased[x]=false;
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
