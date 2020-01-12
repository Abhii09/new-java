package collections;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Iterator {
	public static void main(String[] args) {
		
		List<Integer> al=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			al.add(i);
			System.out.println(al);
		}
		
		Iterator itr=(Iterator)al.iterator();
		while(itr.hasNext()) {
			int x=(int)itr.next();
			System.out.println(x);
		}
		
	}
//some problem is occor so i will find out twomaro.
	
}
