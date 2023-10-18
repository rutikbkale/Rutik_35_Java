// WAP to create thread by implementing runnable interface.

class Ass13 implements Runnable{
	public void run(){
		System.out.println("This is child Thread using Runnable interface.");
	}

	public static void main(String arg[]){
		Runnable obj = new Ass13();
		Thread t = new Thread(obj);
		t.start();
		System.out.println("This is Main Thread.");
	}
}