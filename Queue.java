import java.io.*;
interface QueueOperation{
	void enqueue(int data);
	int dequeue();
	void display();
}
class Operation implements QueueOperation{
	DataInputStream in = new DataInputStream(System.in);
	int size, rear, front, queue[];
	public Operation() throws IOException{
		System.out.print("Enter the queue size: ");
		size = Integer.parseInt(in.readLine());
		front = -1;
		rear = -1;
		queue = new int[size];
	}
	public void enqueue(int data){
		if(front == -1){
			front++;
		}
		if(rear >= size-2)
			System.out.println("Queue is Full...");
		else{
			rear++;
			queue[rear] = data;
		}
	}
	public int dequeue(){
		if(front == -1 || front > rear){
			return -1846;
		}
		else{
			int ret = queue[front];
			front++;
			return ret;
		}
	}
	public void display(){
		int i;
		if(front > rear || front == -1)
			System.out.println("Queue is empty...");
		else{
			for(i=front; i<=rear; i++)
				System.out.print(queue[i]+" ");
			System.out.println("");
		}
	}
}
class Queue{
	public static void main(String args[]) throws IOException{
		DataInputStream input = new DataInputStream(System.in);
		Operation q = new Operation();
		int ch, data;
		do{
			System.out.println("1. Enqueue.");
			System.out.println("2. Dequeue.");
			System.out.println("3. Traverse.");
			System.out.print("Enter your choice: ");
			ch = Integer.parseInt(input.readLine());
			switch(ch){
				case 1: System.out.print("Enter the data: ");
						data = Integer.parseInt(input.readLine());
						q.enqueue(data);
						break;
				case 2: int n = q.dequeue();
						if(n == -1846)
							System.out.println("Queue is empty...");
						else
							System.out.println(n+" Removed");
						break;
				case 3: q.display();
						break;
				default: System.exit(0);
			}
			System.out.println("1-->continue.\n2-->Exit.");
			ch = Integer.parseInt(input.readLine());
		}while(ch == 1);
	}
}