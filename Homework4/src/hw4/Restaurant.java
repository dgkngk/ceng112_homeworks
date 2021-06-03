package hw4;

public class Restaurant implements Comparable<Restaurant> {
	
	private String name;
	private double rating;
	private String cuisine;
	private int deliveryTime;
	
	public Restaurant(String rname, double rrating, String rcuisine, int rdelivery) 
	{
		name = rname;
		rating = rrating;
		cuisine = rcuisine;
		deliveryTime = rdelivery;
	}
	//not sure what the following three is doing different from set methods
	public void updateCuisine(String category) {
		
	}
	
	public void updateRating(double score) {
		
	}
	
	public void updateDeliveryTime(int deliveryTime) {
		
	}
	
	//get-sets
	
	@Override
	public int compareTo(Restaurant o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
