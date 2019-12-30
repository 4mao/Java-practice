package chapter6;

public interface Product {
      public double getPrice();
      public String getName();
 }


package chapter6;

public class AnonymousTest {
      public void test(Product p){
    	  System.out.println("购买一份"+p.getName()+",花掉了"+p.getPrice());
    	  
      }
      public static void main(String[] args) {
		 AnonymousTest anonymousTest = new AnonymousTest();
//		创建一个匿名内部类继承接口 Product（匿名内部类必须实现一个接口或者继承一个类）
//		 格式如下
		 anonymousTest.test(new Product(){
			 public double getPrice(){
				 return 567.2;
			 }
			 public String getName(){
				 return "晏开啦啦啦";
			 }
		 });
      }
}


package chapter6;

public   abstract class Device {
   private String name;
   public  abstract double getPrice();
public Device() {
	super();
}
public Device(String name) {
	super();
	this.name = name;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
   
}



package chapter6;
//  用匿名内部类继承一个类时，会自动拥有父类相识的构造器
//（匿名内部类只有隐式的构造器）
public class AnonymousInner {
   public void test(Device d){
	   System.out.println("购买了一个"+d.getName()+",花掉了"+d.getPrice());
   }
   public static void main(String[] args) {
	AnonymousInner ai = new AnonymousInner();
//	调用有参数的构造器创建Device匿名实现类的对象
	ai.test(new Device("老鼠屎"){
		public double getPrice(){
			return 56.2;
		}
	});
//	调用无参数的构造器创建Device匿名实现类的对象
	Device device = new Device(){
		{
			System.out.println("匿名类的初始化块、、、");
		}
	  public double getPrice(){
		  return 25.4;
	  }
//	  重写父类的实例方法
	  public String getName(){
		  return "键盘侠";
	  }
   };
   ai.test(device);
}
}
