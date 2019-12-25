package chapter6;

import java.util.Arrays;

public class FinalReferenceTest {
   public static void main(String[] args) {
	final int[] arr1 ={1,2,3,5};
	System.out.println(Arrays.toString(arr1));
//	对数组进行排序
	Arrays.sort(arr1);
	System.out.println(Arrays.toString(arr1));
//	final修饰的数组元素赋值是可以的
//	但是对数组重新赋值就是非法的
//	arr1=null;是非法的
	arr1[3]=5;
    System.out.println(Arrays.toString(arr1));
     final Person person = new Person(23);
//     可以用对象调用方法来改变age实例变量
     person.setAge(45);
//     但是对final修饰的对象重新赋值就是非法的
//     person =null;是非法的
   }
}


package chapter6;

public class Person {
   private int age;
   public Person(){}
   public Person (int age){
	   this.age=age;
   }
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
   
}
