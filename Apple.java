// 疯狂Java中的第六章内容
package chapter6;

public class Apple {
      private String color;
      private double weigth;
      public Apple(){}
	public Apple(String color, double weigth) {
		super();
		this.color = color;
		this.weigth = weigth;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeigth() {
		return weigth;
	}
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	@Override
//	toString并不需要传入什么参数，只需要将自我描述return出即可
	public String toString(){
		return "一个苹果的颜色是："+color+" 总量是："+weigth;
	}
}
