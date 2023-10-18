// WAP for multithreading which shows use of join().

class Ass15 extends Thread{
	public void run(){
		for(int i=0;i<3;i++){
			try{
				Thread.sleep(500);
			}
			catch(Exception e){
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	
	public static void main(String arg[]){
		Ass15 obj1 = new Ass15();
		Ass15 obj2 = new Ass15();
		Ass15 obj3 = new Ass15();
		obj1.start();
		try{
			obj1.join();
		}
		catch(Exception e){
			System.out.println(e);
		}
		obj2.start();
		obj3.start();
		System.out.println("Main thread ended...");
	}
}

