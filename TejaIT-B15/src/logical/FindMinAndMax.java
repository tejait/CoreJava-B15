package logical;

import java.util.Arrays;
import java.util.List;

public class FindMinAndMax {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,13,6,4,16,19);
		int min=list.stream().mapToInt(x->x).min().getAsInt();
		int max=list.stream().mapToInt(x->x).max().getAsInt();
		System.out.println("Max "+max+"   Min "+min);
		
		System.out.println("Max "+list.stream().mapToInt(x->x).max().getAsInt());
		System.out.println("Min "+list.stream().mapToInt(x->x).min().getAsInt());
	System.out.println("added................");
	}
}
