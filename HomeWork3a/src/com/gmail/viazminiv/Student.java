package com.gmail.viazminiv;

public class Student extends Human {

	private long zach;
	private String group;

	public Student(String name, int age, long zach, String group) {
		super(name, age);
		this.zach = zach;
		this.group = group;
	}

	public Student() {
		super();
	}

	public long getZach() {
		return zach;
	}

	public void setZach(long zach) {
		this.zach = zach;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "Student [ Name=" + getName()+ ", group=" + group  + ", age=" + getAge() + ", zach=" + zach + "]";
	}

}
