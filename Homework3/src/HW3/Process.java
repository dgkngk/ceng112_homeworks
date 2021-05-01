package hW3;

import java.util.*;

public class Process implements IProcess, Comparable<Process>{
	
	//computation içine girer

	private int Priority;
	

	public Process() {
		
		setPriority();
		
	}
	
	private void setPriority() {
		
		Random random = new Random();
		Priority = (random.nextInt(3) + 1);
		
	}

	
	@Override
	public int getPriority() {
		
		 return this.Priority;
		
	}
	
	
	@Override
	public String getType() {
		
		return null;
		
	}
	
	@Override
	public int compareTo(Process o) {
		if (o.getPriority() == Priority)
			return 0;
		
		else if (o.getPriority() > Priority) 
			return -1;
		
		else
			return 1;
		
	}	
}
