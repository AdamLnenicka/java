public class Rectangle{
	private int a;
	private int b;
	private static int instanceCount = 0;
	
	public Rectangle(){
		a = 3;
		b = 5;
		instanceCount++;
	}
	
	public Rectangle(int side){
		a = side;
		b = side;
		instanceCount++;
	}
	
	public Rectangle(int a_param, int b_param){
		if(a_param > 0 && b_param > 0){
			a = a_param;
			b = b_param;
			instanceCount++;
		}
		else{
			throw new IllegalArgumentException("Both sides must be positive numbers.");
		}
	}
	
	public int getArea(){
		return a * b;
	}
	
	public int getPerimeter(){
		return 2 * (a + b);
	}
	
	public static int getInstanceCount(){
		return instanceCount;
	}
}