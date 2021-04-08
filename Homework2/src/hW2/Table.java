package hW2;

public class Table  implements IProduct{
	
	public boolean isManufactured(FactoryLine<IProduct> factoryLine , IProduct product) {
		
		return (factoryLine.getBack().getClass()== product.getClass());
		
	}
	public boolean isStored(WareHouse<IProduct> warehouse,IProduct product){
		
		return (warehouse.peek().getClass() == product.getClass());
		
	}
	public boolean isSold(IStack<IProduct> warehouse){
		
		return !(warehouse.isEmpty());
		
	}
	
	public String getName() {
		 
		return ("Table");
		
	}


}
