package hW3;


public class Main {

	public static void main(String[] args) throws EmptyQueueException {

		
		   LinkedList<Simulation> simulationList = new LinkedList<Simulation>();
            
		
			Simulation simulation1 = new Simulation(3);
			simulationList.add(simulation1);
			Simulation simulation2 = new Simulation(5);
			simulationList.add(simulation2);
			Simulation simulation3 = new Simulation(10);
			simulationList.add(simulation3);

			
			int computationNumber;
			int waitingTime, totalWaitingTime, highWaitingTime, normalWaitingTime, lowWaitingTime;
			int highNumber, normalNumber, lowNumber;
			
			int Priority;
			
			
			
			for(int i=1; i < simulationList.getLength() + 1 ; i++) {
				
				totalWaitingTime =0; highWaitingTime=0; normalWaitingTime=0; lowWaitingTime=0;
				highNumber=0; normalNumber=0; lowNumber=0;
				
				System.out.println("Simulation number:" + (i));
                PriorityQueue<Computation> computationQueue = simulationList.getEntry(i).simulation();
                
                computationNumber = simulationList.getEntry(i).processNumber;
                
                System.out.print("Computation queue:");
                
                for (int j=0; j < simulationList.getEntry(i).processNumber; j++) {
                	
                	  Computation computation= computationQueue.dequeue();
					
                	  System.out.print("<-- P"+computation.getId());
                	  Priority = computation.getPriority();
                	  waitingTime = computation.get_occupation();
                	  if (Priority == 1) {
              			System.out.print(", High");
              			highWaitingTime =+ waitingTime;
              			highNumber ++;
              		  }
              		  else if (Priority == 2) {
              			System.out.print(", Normal");
              			normalWaitingTime =+ waitingTime;
              			normalNumber++;
              		 }
              		 else{
              			System.out.print(", Low");
              			lowWaitingTime =+ waitingTime;
              			lowNumber++;
              		 }
                	 System.out.print(", " + waitingTime + "ns");
                	 totalWaitingTime =+ waitingTime;
                }
                
                System.out.println("\nTotal numbers of computation:" + computationNumber );
                System.out.println("\nTotal waiting time:" + totalWaitingTime);
                System.out.println("Average waiting time:" +(totalWaitingTime/computationNumber));
                System.out.println("\nTotal number of computations for High:" + highNumber);
                System.out.println("Total number of computations for Normal:" + normalNumber);
                System.out.println("Total number of computations for Low:" +  lowNumber);
                
                System.out.println("\nTotal waiting time for High:" + highWaitingTime);
                if(highNumber==0)
                	System.out.println("Average waiting time for High:"+ (highWaitingTime/1));
                else
                	System.out.println("Average waiting time for High:"+ (highWaitingTime/highNumber));
                
                System.out.println("\nTotal waiting time for Normal:" + normalWaitingTime);
                if(normalNumber==0)
                	System.out.println("Average waiting time for High:"+ (normalWaitingTime/1));
                else
                	System.out.println("Average waiting time for High:"+ (normalWaitingTime/normalNumber));
                
                System.out.println("\nTotal waiting time for Low:" + lowWaitingTime);
                if(lowNumber==0)
                	System.out.println("Average waiting time for High:"+ (lowWaitingTime/1));
                else
                	System.out.println("Average waiting time for High:"+ (lowWaitingTime/lowNumber));
                
			
			
			}
			
			
	}

}
