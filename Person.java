package chapter6;

public class Person {
    private String name;
    private String idStr;
    public Person(){}
	public Person(String name, String idStr) {
		super();
		this.name = name;
		this.idStr = idStr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdStr() {
		return idStr;
	}
	public void setIdStr(String idStr) {
		this.idStr = idStr;
	}
    public boolean equals(Object obj){
//    	如果是同一对象
		if(this==obj)
			return true;
//		只有当对象是Person对象时
		if(obj!=null&&obj.getClass()==Person.class){
			Person personObj=(Person)obj;
// 当两个对象的idStr相等即可满足equal
			if(this.getIdStr().equals(personObj.getIdStr())){
				return true;
			}
		}
    	return false;
    	
    }
}
