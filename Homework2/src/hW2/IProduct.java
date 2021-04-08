package hW2;

public interface IProduct {
	
	
	public boolean isManufactured(FactoryLine<IProduct> factoryLine , IProduct product);
	public boolean isStored(WareHouse<IProduct> warehouse,IProduct product);
	public boolean isSold(IStack<IProduct> warehouse);
	public String getName();

}
