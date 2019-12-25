package chapter6;

public class OverrideEquals {
    public static void main(String[] args) {
		Person p1 = new Person("晏开","123456");
		Person p2 = new Person("老狗开","123456");
	    Person p3 = new Person("晏开","123");
//	   idStr相同 输出true
	    System.out.println(p1.equals(p2));
//	   idStr不相同 输出false
	    System.out.println(p1.equals(p3));
	    
    }
}
