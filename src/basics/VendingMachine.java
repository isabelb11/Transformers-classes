package basics;

public final class VendingMachine {
	Product[][] items;
	String machineID;

	// constructors

	public VendingMachine() {
		this.machineID = "";
		this.items = new Product[3][3];

		for (int row = 0; row < items.length; row++) {
			for (int col = 0; col < items[row].length; col++) {
				items[row][col] = new Product();
			}
		}
	}
	
	public VendingMachine(String machineID, int rowCount, int colCount) {
		this.machineID = machineID;
		this.items = new Product[rowCount][colCount];

		for (int row = 0; row < items.length; row++) {
			for (int col = 0; col < items[row].length; col++) {
				items[row][col] = new Product();
			}
		}
	}

	// method purchase() is going to take int row, int col
	// this method should check to see if the item is available
	// if so, drop the item, reduce the quantity
	// return a boolean, if item is sold, return true, false otherwise
	public boolean purchase(int row, int col) {
		if (items[row][col].quantity > 0) {
			// we have availablity
			items[row][col].quantity--;
			System.out.println("Item " + items[row][col] + " dropped!");
			return true;
	
		} else {
			// we do not have items in stock
			System.out.println("Item " + items[row][col] + " is out of stcok!");
			return false;
		}
	}

	// add item method - should take a new product, row and col and add the product
	// to that address
	// should return a boolean true if added successfully
	public boolean addItem(Product item, int row, int col) {
		if (items[row][col].quantity > 0) {
			// there is an item already in that spot
			System.out.println("Spot taken - there is an item in this location");
			return false;
		} else {
			items[row][col] = item;
			System.out.println("Item " + item + " successfully added to the location " + row + ", " + col);
			return true;
		}

	}
	
	public String toString() {
		String temp = "MachineID: " + machineID + "\n";
		for (int row = 0; row < items.length; row++) {
			temp += row + "\t|\t";
			for (int col = 0; col < items[row].length; col++) {
				temp += items[row][col] + "\t|\t";
			}
			temp += "\n";
		}
		temp += "------------------------------------------------\n";

		return temp;
		
	}
}

