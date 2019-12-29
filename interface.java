package chapter6;

public interface OutPut {
	// public static final int MAX_LINE =50;这句与下相同，
	// interface中默认成员变量为 public static final
	int MAX_CACHE_LINE = 50;

	// interface中的方法只能是public修饰的抽象方法
	void out();

	void getDate(String msg);

	// interface中定义的默认方法需要用default修饰
	default void print(String... msgs) {
		for (String msg : msgs) {
			System.out.println(msg);
		}
	}

	default void test() {
		System.out.println("默认的test（）方法");
	}

	// interface中定义的类方法需要用static修饰
	static String staticTes() {
		return "interface中的类方法";
	}
	// java8不支持私有方法。

}



package chapter6;

public interface Product {
   int getProductTime();
}




package chapter6;

public class Printer implements OutPut, Product {
	private String[] printDate = new String[MAX_CACHE_LINE];
	private int dateNum = 0;

	@Override
	public int getProductTime() {

		return 45;
	}

	@Override
	public void out() {
		// 只要还有作业就继续打印
		while (dateNum > 0) {
			System.out.println("打印机打印" + printDate[0]);
			// 吧作业队列整体前移一位，并将剩下的作业数减一
			System.arraycopy(printDate, 1, printDate, 0, --dateNum);
		}
	}

	@Override
	public void getDate(String msg) {
		if (dateNum >= MAX_CACHE_LINE) {
			System.out.println("输出队列已满，添加失败");
		} else {
			// 把打印机数据添加到队列里，已经保存的数据的数量加1
			printDate[dateNum++] = msg;
		}
	}

	public static void main(String[] args) {
		OutPut o = new Printer();
		o.getDate("沧海一声笑");
		o.getDate("新海诚");
		o.out();
		o.getDate("your name");
		o.getDate("天气之子");
		o.out();
		// 调用OutPut中的默认方法
		o.print("大姐", "马天宇", "宫崎骏");
		o.test();
		// 创建一个Printer对象，当成Product使用
		Product p = new Printer();
		System.out.println(p.getProductTime());
		// 所用的接口类型的引用都可以直接赋给Object类型的变量
		Object obj = p;
	}
}

