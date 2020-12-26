package storeinventory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StoreRegister {
	List<OrderItem> unsortedPriceList=new ArrayList<OrderItem>();
	public void loadInventory(File inventoryFile) {
		BufferedReader fileReader=null;
		
		final String DELIMITER=",";
		try {
			String line="";
			fileReader=new BufferedReader(new FileReader(inventoryFile));
			while((line=fileReader.readLine())!=null) {
				String[] tokens=line.split(DELIMITER);
				OrderItem orderItem=new OrderItem();
				for (int i=0;i<=tokens.length;i++) {
					orderItem.setItemName(tokens[0]);
					orderItem.setItemPrice(Double.valueOf(tokens[1]));
				}
				unsortedPriceList.add(orderItem);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			unsortedPriceList=null;
			System.out.println("problem reading file");
		}
		
		
	}
	public Receipt checkoutOrder(List<String> items) {
		ReceiptImplement receiptImpl=new ReceiptImplement();
		if(unsortedPriceList!=null) {
			List<OrderItem> sortedPriceList=new ArrayList<OrderItem>();
			List<String> finalOrderList=new ArrayList<String>();
			double totalPrice=0.0;
			loadInventory(new File("inventory.csv"));
			for(Iterator iterator=items.iterator();iterator.hasNext();) {
				String orderName=(String)iterator.next();
				for(Iterator unOrdIterator=unsortedPriceList.iterator();unOrdIterator.hasNext();) {
					OrderItem orderItem=(OrderItem) unOrdIterator.next();
					if(orderName.equalsIgnoreCase(orderItem.getItemName())) {
						sortedPriceList.add(orderItem);
					}
				}
			}
			Collections.sort(sortedPriceList,new PriceComprator());
			
			
		}
		
	}

}
