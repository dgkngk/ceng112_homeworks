package hW2;

public class Table  implements IProduct{
	
	private boolean stored;
	private boolean sold;
	private boolean man;
	
	public boolean isManufactured(FactoryLine<IProduct> factoryLine , IProduct product) {
		this.man = factoryLine.getBack().getClass() == product.getClass();
		return this.man;
	}
	public boolean isStored(WareHouse<IProduct> warehouse,IProduct product){
		this.stored =warehouse.peek().getClass() == product.getClass();
		return this.stored;
	}
	public boolean isSold(FactoryLine<IProduct> soldThings, IProduct product){
		this.sold = soldThings.getBack().getClass() == product.getClass();
		return sold;
	}
	
	public String getName() {
		 
		return ("Table");
		
	}


}
