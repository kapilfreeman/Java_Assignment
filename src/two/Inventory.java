package two;

public class Inventory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//hello checking
		Item obj1=new Item("Apple",1.2, 53);
		Item obj2=new Item("Candy",3.5,103);
		Item obj3=new Item("Milk", 2.2, 25);
		String header="Name"+"\t"+"Value"+"\t"+"Price"+"\t"+"Quantity";
		int lenheader=header.length();
		System.out.println(header);
		int count=0;
		while(count<lenheader)
		{		System.out.print("=");
		count+=1;
		}
		System.out.println("");
		System.out.println(obj1.getName()+"\t"+Math.round(obj1.getValue()*100)/100+"\t"+obj1.getPrice()+"\t"+obj1.getQuantity());
		System.out.println(obj2.getName()+"\t"+Math.round(obj2.getValue()*100)/100+"\t"+obj2.getPrice()+"\t"+obj2.getQuantity());
		System.out.println(obj3.getName()+"\t"+Math.round(obj3.getValue()*100)/100+"\t"+obj3.getPrice()+"\t"+obj3.getQuantity());

	}

}
