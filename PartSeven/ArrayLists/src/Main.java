import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        ArrayList<Integer> arrayList = new ArrayList<>();
		
		for(int i = 1; i <= 11; i++) {
			arrayList.add(i);
		}
		
		for (Integer num : arrayList) {
			System.out.println(num);
		}
		
		arrayList.set(10, 0);
		
		for (Integer num : arrayList) {
			System.out.println(num);
		}
		
        arrayList.remove(10);
		
		for (Integer num : arrayList) {
			System.out.println(num);
		}
	}

}
