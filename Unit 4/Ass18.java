//WAP for multithreading which shows interthread communication between various thread using synchronized method.

class DisplayInfo{
	synchronized void operations(int a, Thread t){
		System.out.println(t.getName());
		System.out.println("Square of "+a+" is : "+a*a);
		System.out.println("Cube of "+a+" is : "+a*a*a);
	}
}

class Thread1 extends Thread{
	DisplayInfo dInfo;
	public Thread1(DisplayInfo dInfo){
		this.dInfo = dInfo;
	}	

	public void run(){
		dInfo.operations(5,this);
	}
}

class Thread2 extends Thread{
	DisplayInfo dInfo;
	public Thread2(DisplayInfo dInfo){
		this.dInfo = dInfo;
	}	

	public void run(){
		dInfo.operations(10,this);
	}
}

class Ass18 {
	public static void main(String []arg){
		DisplayInfo dInfo = new DisplayInfo();
		Thread1 t1 = new Thread1(dInfo);
		Thread2 t2 = new Thread2(dInfo);
		
		t1.start();
		t2.start();
	}
}	