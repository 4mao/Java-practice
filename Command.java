package chapter6;

public interface Command {
  void process(int[] target);
}


package chapter6;

public class ProcessArray {
   public void process(int[] target,Command cmd){
	   cmd.process(target);
   }
}


package chapter6;

public class PrintCommand implements Command {

	@Override
	public void process(int[] target) {
      for (int tmp:target){
    	  System.out.println("迭代输出的目标数组的元素： "+tmp);
      }
	}

}



package chapter6;

public class AddCommand implements Command {

	@Override
	public void process(int[] target) {
       int sum =0;
       for(int tmp:target){
    	   sum+=tmp;
       }
       System.out.println("数组的元素的和为 "+sum);
	}

}


package chapter6;

public class CommandTest {
   public static void main(String[] args) {
	ProcessArray pa =new ProcessArray();
	int[] target ={2,-4,5,6};
	pa.process(target, new PrintCommand());
	System.out.println("--------------");
	pa.process(target, new AddCommand());
}
}
