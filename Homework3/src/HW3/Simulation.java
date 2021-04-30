package HW3;

public class Simulation {
	
	int processNumber;
	
	
	public Simulation(int processNumber) {
		 processNumber = this.processNumber;
	}
	
	
	public ComputationQueue<Computation> simulation() {
		
		ProcessList<Process> processList = new ProcessList<Process>();
		ComputationQueue<Computation> computationQueue = new ComputationQueue<Computation>();
		
		
		
		for(int i=0; i<processNumber; i++) {
			
			Process process = new Process();
			processList.add(process);
			
		}
		
		for(int j=0; j<processList.getLength(); j++) {
			
			Computation computation = new Computation(processList.getEntry(j));
			computationQueue.enqueue(computation);
			
		}
		
		return(computationQueue);
		}
	
}
		

