package HW3;

import java.util.*;


public class Computation{
	
	private int id;
	
	private IProcess process;
	
	private int occupation;
	
	private int priority;
    
	public Computation(IProcess process, int id) {
		
		this.process = process;
		this.id = id;
		this.occupation = set_occupation();
		
		
	}
	
	private int set_occupation() {
		
		Random random = new Random();
		occupation = (random.nextInt(10)+1);
		
		return occupation;
	}
	
	public int getId() {
		
		return this.id;
	}
	
	public int get_occupation() {
		
		return this.occupation;
	}
	
	public int getPriority() {
		
		priority = process.getPriority();

        return this.priority;
	}
	
	
	
	
}
