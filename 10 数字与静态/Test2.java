import java.util.*;
public class Test2 {
	public static void main(String[] args) {
		ArrayList listOfNumbers = new ArrayList();
		listOfNumbers.add(new Integer(3));
		System.out.println(listOfNumbers.get(0).getClass());
	}
}
//javac Test2.java -Xlint:unchecked