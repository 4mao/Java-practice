package chapter6;

public class CacheImmutale {
	private static int MAX_SIZE = 10;
	private static CacheImmutale[] cache = new CacheImmutale[MAX_SIZE];
	private static int pos = 0;
	private final String name;

	private CacheImmutale(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
//  将新建的对象缓存在数组里，之后在创建对象时会先遍历，如果数组中有对象存在，则不会在重新创建对象
	public static CacheImmutale valueOf(String name) {
		for (int i = 0; i < MAX_SIZE; i++) {
			if (cache[i] != null && cache[i].getName().equals(name)) {
				return cache[i];
			}
		}
		if (pos == MAX_SIZE) {
			// 将缓存的第一个值覆盖
			cache[0] = new CacheImmutale(name);
			pos = 1;
		} else {
			cache[pos++] = new CacheImmutale(name);
		}
		return cache[pos - 1];
	}
//  重写equals方法
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj != null && obj.getClass() == CacheImmutale.class) {
			CacheImmutale ci = (CacheImmutale) obj;
			return name.equals(ci.getName());
		}
		return false;
	}

	// 重写hashCode方法
	public int hashCode() {
		return name.hashCode();
	}
}



package chapter6;

public class CacheImmutaleTest {
   public static void main(String[] args) {
	   CacheImmutale c1 =  CacheImmutale.valueOf("yankai");
       CacheImmutale c2 =  CacheImmutale.valueOf("yankai");
	   System.out.println( c1.equals(c2));
	   System.out.println(c1==c2);
}
}

