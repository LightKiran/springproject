package testing;

import java.util.Arrays;
import java.util.List;

interface Test{
	 
	 void print();
 }
 
 
// class TestImpl implements Test{
//
//	@Override
//	public void print() {
//		System.out.println("from implemented class");
//	}
// }
 

public class LamdaTest {
	
	public static void main(String[] args) {
		
//		Test  t = new TestImpl();
//		t.print();
		
		Test t1 = ()-> { 
			System.out.println("from lamda !!");
		};
		t1.print();
		
		
		List<Integer> intlist = Arrays.asList(20,40,70,80,90);
		 intlist.forEach(i->{System.out.println(i); });
		 
//		 for(Integer i : intlist){
//			 System.out.println(i);
//		 }
		 
	}

}
