// WAP to create thread by extending thread class.

class Ass12 extends Thread{
	public void run(){
		System.out.println("This is child Thread using thread class.");
	}

	public static void main(String arg[]){
		Ass12 obj = new Ass12();
		obj.start();
		System.out.println("This is Main Thread.");
	}
}