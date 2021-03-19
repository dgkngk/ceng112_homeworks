package hW1;
//equals method eksik eklenmeli-eklendi

public class Item {
	
	private String item_name;
	private String compartment_item;
	private int item_weight;
	
	
	public String getName() {
		return item_name;
	}
	public void setName(String item_name) {
		this.item_name = item_name;
	}
	public String getCompartment() {
		return compartment_item;
	}
	public void setCompartment(String compartment_item) {
		this.compartment_item = compartment_item;
	}
	public int getWeight() {
		return item_weight;
	}
	public void setWeight(int item_weight) {
		this.item_weight = item_weight;
	}
	
	public Item(String item_name, String compartment_item, int item_weight) {
		setName(item_name);
		setCompartment(compartment_item);
		setWeight(item_weight);
	}
	
	public String toString() {
		return(item_name+ "  " + compartment_item + "  " + item_weight); 
	}
	
    public boolean equals(Item comparable) {//string comparison for names, is there a need to compare weights or compartments?
    	
    	boolean eq = false;
    	String aString = (String) comparable.getName();  
        int n = item_name.length();  
        if (n == aString.length()) {  
            char v1[] = item_name.toCharArray();  
            char v2[] = aString.toCharArray();  
            int i = 0;  
            while (n-- != 0) {  
                if (v1[i] != v2[i]) {
                        eq = false;
                        return eq;
                }
                i++;  
            }
            eq = true;
        }
        return eq;  
    }  
}


