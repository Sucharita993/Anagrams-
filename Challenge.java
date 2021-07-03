import java.util.*;

public class Challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int count=0, count2=0;
	        System.out.println("Enter String-1: ");
	        String a = sc.next();
	        System.out.println("Enter String-2: ");
	        String b = sc.next();
	        char [] c = a.toCharArray();
	        char [] ch = b.toCharArray();
	        Set<Character> s1 = new TreeSet<>();
	        Set<Character> s2 = new TreeSet<>();
	        for (char character : c) {
				s1.add(character);
			}
	        for (char chare : ch) {
	        	s2.add(chare);
	        }
	        s1.retainAll(s2);
	        count = (c.length)-(s1.size());
	        count2 = (ch.length)-(s1.size());
	        System.out.println(count+count2);
	}
}
