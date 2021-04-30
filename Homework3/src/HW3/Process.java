package HW3;

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
		 
		return this.Priority;
	}
	
	@Override
	public String getType() {
		
		return null;
	}
	
}
