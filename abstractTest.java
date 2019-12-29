package chapter6;
//   抽象类的构造器和初始化块只有当创建子类实例时才被调用
public abstract class Shape {
	{
		System.out.println("开始执行Shape的初始化块");
	}
	private String color;
	public abstract double calPerimeter();
	public abstract String getType();
	public Shape(){}
	public Shape(String color){
		System.out.println("开始执行Shape的构造器");
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}


package chapter6;

public class Triangle extends Shape{
	private double a;
	private double b;
  private double c;
  
	public Triangle(String color,double a, double b, double c) {
	super(color);
	this.setSides(a,b,c);
}

	private void setSides(double a, double b, double c) {
         if(a>=c+b||b>=a+c||c>=a+b)	{
        	 System.out.println("三角形两边之和必须大于第三边");
        	 return;
         }
         this.a=a;
         this.b=b;
         this.c=c;
	}

	@Override
	public double calPerimeter() {
		// TODO Auto-generated method stub
		return a+b+c;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "三角形";
	}

}

package chapter6;

public class Circle extends Shape{
    private double radius;
    
	public Circle(String color,double radius) {
		super(color);
		this.radius = radius;
	}
    
	public void setRadius(double radius) {
		this.radius = radius;
	}
    
	@Override
	public double calPerimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return getColor()+"圆形";
	}
    public static void main(String[] args) {
    	Shape s1 = new Triangle("黑色",3,4,5);
		   Shape s2 = new Circle("red",6);
		   System.out.println(s1.calPerimeter());
		   System.out.println(s1.getType());
		   System.out.println(s1.set);
		   System.out.println(s2.calPerimeter());
		   System.out.println(s2.getType());
		   
		   
	}
}
