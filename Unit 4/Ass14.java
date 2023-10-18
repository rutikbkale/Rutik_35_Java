// WAP to create thread which will show the use of sleep() and currentThread().getName() .

class Ass14 extends Thread{
	public void run(){
		Ass14 obj = new Ass14();
		try{
			obj.sleep(1000);
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Child Thread...");
		System.out.println("Child Thread Name : "+obj.getName());
	}

	public static void main(String arg[]){
		Ass14 obj = new Ass14();
		obj.start();
		try{
			Thread.sleep(400);
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Main Thread...");
		System.out.println("Main Thread Name : "+Thread.currentThread().getName());
	}
}