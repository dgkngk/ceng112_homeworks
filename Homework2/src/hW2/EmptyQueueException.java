package hW2;
 
// this class is used by dequeue and getFront methods in FactoryLine class

public class EmptyQueueException extends Exception {
	

		public EmptyQueueException() {
			super("EmptyQueueException");
		}
		public EmptyQueueException(String message) {
			super(message);
		}

	


}
