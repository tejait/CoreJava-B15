package logical;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumbers {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(12,13,1,4,1,5,11,12);
	list.stream().filter(x->x%2==0).forEach(System.out::println);
}
}
