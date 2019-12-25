package chapter6;

public class SingletonTest {
   public static void main(String[] args) {
	   Singleton s1 =Singleton.getInstance();
	 Singleton s2 =Singleton.getInstance();
//	 输出true，因为s1和s2是同一个对象
	 System.out.println(s1==s2);
}
}
