package chapter6;

public class Address {
   private final String detail;
   private final String postCode;
//   仅提供构造器去初始化成员变量
   public Address(){
	   this.detail="";
	   this.postCode= "";
   }
public Address(String detail, String postCode) {
	this.detail = detail;
	this.postCode = postCode;
}
//  只提供get方法，所以只能得到初始化过得成员变量，而不能对起修改。
public String getDetail() {
	return detail;
}
public String getPostCode() {
	return postCode;
}
//     重写equal方法
   public boolean equals(Object obj){
	if(this==obj)
	{return true; }
	if(obj!=null&&obj.getClass()==Address.class)
	{
		Address ad=(Address)obj;
		if(this.getDetail().equals(ad.getDetail())&&this.getPostCode().equals(ad.getPostCode())){
		System.out.println("true");
			return true;
		}
	}
	   return false;
	   
   }
   public int hashCode(){
	   System.out.println(detail.hashCode()+" "+postCode.hashCode()*31);
	   return detail.hashCode()+postCode.hashCode()*31 ;
   }
}


package chapter6;

public class TestAddress {
   public static void main(String[] args) {
	   Address address = new Address("外环西路100","230000");
   	   Address address1 = new Address("外环西路100","230000");
   	address.equals(address1);
   	address.hashCode();
    System.out.println(address.getDetail());
    System.out.println(address.getPostCode());
}
}
