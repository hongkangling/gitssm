package ssm;

import java.util.HashMap;

public class Test implements Runnable {

	private  int i=0;
	
		
	public static void main(String[] args) {
		
		Test test = new Test();
		Thread thread = new Thread( test);
		Thread thread1 = new Thread(test);
		thread.start();
		thread1.start();
		
		
		String string = new String("124");
	}
	
	public   void add(){
		print();
		for (int j = 0; j < 5; j++) {
			i++;
		}
	System.out.println("hh "+i);
	}
	
	public   void print(){
		System.out.println(i);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int j = 0; j < 5; j++) {
			i++;
		}
		System.out.println(i);
	}
}
