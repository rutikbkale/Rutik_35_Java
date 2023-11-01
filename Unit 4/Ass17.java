//WAP for multithreading which shows interthread communication between various thread using synchronized block.

//import java.util.Scanner;
class ThreadEx extends Thread{
	public void run(){
		synchronized(this){
			if(this.getName().equals("Thread-0"))
				this.setName("firstThread");
			else if(this.getName().equals("Thread-1"))
				this.setName("secondThread");
			else
				this.setName("lastThread");			
		}
	} 
}

class Ass17 {
	public static void main(String []arg)throws InterruptedException{
		ThreadEx thread1 = new ThreadEx();
		ThreadEx thread2 = new ThreadEx();
		ThreadEx thread3 = new ThreadEx();
	
		thread1.start();
		synchronized(thread1){
			thread1.wait();
			thread1.sleep(3000);
		}
		thread2.start();
		thread3.start();
		System.out.println("Thread Name : "+thread1.getName());
		System.out.println("Thread Name : "+thread2.getName());
		System.out.println("Thread Name : "+thread3.getName());	
	}
}