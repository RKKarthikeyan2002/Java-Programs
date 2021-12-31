import java.util.*;
class Thread1 implements Runnable{
	public void run(){
		Random r = new Random();
		try{
			for(int i=0;i<5; i++){
				int rand = r.nextInt(100);
				System.out.println("Random Number "+(i+1)+": "+rand);
				if(rand % 2 == 0){
					Thread2 t2 = new Thread2(rand);
					new Thread(t2).start();
				}
				else{
					Thread3 t3 = new Thread3(rand);
					new Thread(t3).start();
				}
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			System.out.println("Exception occured: "+e.getMessage());
		}
	}
}
class Thread2 implements Runnable{
	int n;
	public Thread2(int num){
		n = num;
	}
	public void run(){
		System.out.println("New Thread "+ n +" is Even and Square of " + n + " is: " + n*n);
	}
}
class Thread3 implements Runnable{
	int n;
	public Thread3(int num){
		n = num;
	}
	public void run(){
		System.out.println("New Thread "+ n +" is Odd and Cube of " + n + " is: " + n*n*n);
	}
}

class Multithreading{
	public static void main(String args[]){
		Thread1 t1 = new Thread1();
		new Thread(t1).start();
	}
}