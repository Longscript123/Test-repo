package threads;
import java.util.*;


//New task IS-A Thread
class NewTask extends Thread{
	//We override the existing run method in the Thread class
	@Override
	public void run() {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Number of documents for second task?");
		//int doc1 = sc.nextInt();
		
		System.out.println("Task 2 started");

		for(int d=0; d <= 30; d++) {
			System.out.println("Task 2 Document no:"+ d);
		}
		
		System.out.println("Task 2 Finished");

		//sc.close();
	}
	
}


public class application {

	public static void main(String[] args) {
		//This is the main thread
		
		
		//Scanner sc = new Scanner(System.in);
		
		//System.out.println("Number of documents for first task?");
		//int doc = sc.nextInt();
		
		System.out.println("Task 1 Started ");
		
		
		//Task 1 - This is the main thread
		for(int i=0; i<= 30; i++) {
			System.out.println("Task 1 Document no:" + i);
			
		}
		
		//Task 2 - This is the child thread
		NewTask print = new NewTask();
				
		print.start();
		
		
		System.out.println("Task 1 finished ");
		
		
		
		//sc.close();
		
	}

}
