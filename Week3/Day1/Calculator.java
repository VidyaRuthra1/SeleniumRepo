package Week3.Day1;

public class Calculator {

	
	public void add(int x,int y) {
		System.out.println(x+y);
		}
			
			public void add(float x,float y) {
				System.out.println(x+y);
				}
	public static void main(String args[]) {
	
		Calculator c=new Calculator();
		c.add(1, 20);
		c.add(12.3f, 23.4f);
				
				
} //main
}