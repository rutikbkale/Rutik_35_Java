package MCA;

public class Mathematics{
	float a,b,c,add;

	public void toAdd(float a, float b){
		this.a = a;
		this.b = b;
		add= a+b;
		System.out.println("Addition of 2 Numbers are : "+add);
	}

	public void toAdd(float a, float b,float c){
		this.a = a;
		this.b = b;
		this.c = c;
		add= a+b+c;
		System.out.println("Addition of 3 Numbers are : "+add);
	}
	
	
	protected void finalize(){
		a = 0.0f;
		b = 0.0f;
		c = 0.0f;
		}
}