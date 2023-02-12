package Java_23_5;

public class Trigger1 {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		//Amazon
		Job jb1=new Job();
		jb1.setName("Amazon");
		jb1.start();
		
		//Flipkart
		Job jb2=new Job();
		jb2.setName("FlipKart");
		jb2.start();
	}
}
