package chapter6;
//这是一个单例类，只能创建一个对象.
public class Singleton {
     private static Singleton instance;
//     隐藏构造器
     private Singleton(){}
//    提供一个静态方法，用于返回Singleton实例
//     加入自定义控制保证只能有一个Singleton对象
     public static Singleton getInstance(){
    	 if(instance==null){
//    		 创建一个SIngleton对象并将其缓存起来
    		 instance=new Singleton() ;
    	 }
    	 return instance;
     }
	
}
