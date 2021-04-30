package hW3;

public class Computation{
	
	private int id;
	
	private IProcess process;
	
	private int occupation;
    
	public Computation(IProcess process) {
		
		this.process = process;
		this.id = setId();
		this.occupation = set_occupation();
		
		
	}
	private int setId() {
		
		return 0;
	}
	private int set_occupation() {
		return 0;
	}
	
	public int getId() {
		
		return this.id;
	}
	
	public int get_occupation() {
		
		return this.occupation;
	}
	
	
}
