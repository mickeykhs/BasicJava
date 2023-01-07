package jungsuk;

public class Child extends Parent {
	String name;
	int age;
	int height;
	public void set_name(String param_n) {
		super.name = param_n + "¾ö¸¶";
		this.name = param_n;
	}
	public void set_age(int param_i) {
		super.set_age(param_i + 24);
		age = param_i;
	}
	@Override
	public String toString() {
		return "Child [parent name=" + super.name + ",parent age=" + super.age + ", height=" + height + "]";
	}
}
