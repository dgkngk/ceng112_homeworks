package HW3;

import java.util.*;

public class Process implements IProcess{
	
	//computation içine girer

	private int Priority;
	

	public Process() {
		
		this.Priority = setPriority();
		
	}
	
	private int setPriority() {
		
		
		return 0;
		
	}

	
	@Override
	public int getPriority() {
		
		Random random = new Random();
		Priority = (random.nextInt(3) + 1);
		
		 return this.Priority;
		
	}
	
	
	@Override
	public String getType() {
		
		return null;
	}
	
}
