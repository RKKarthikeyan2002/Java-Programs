import java.util.*;

class Maximum{
	public <T extends Comparable <T>> T FindMax(T arr[]){
		T temp = arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i].compareTo(temp) > 0)
				temp = arr[i];
		}
		return temp;
	}
}
class Generic_Method{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		Integer i[] = {1,2,3,4,5};
		Character c[] = {'a','b'};
		String s[] = {"karthi", "hari"};
		Maximum m1 = new Maximum();
		System.out.println("Maximum value of Integer : "+m1.FindMax(i));
		System.out.println("Maximum value of Character : "+m1.FindMax(c));
		System.out.println("Maximum value of String : "+m1.FindMax(s));
	}
}