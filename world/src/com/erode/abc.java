package com.erode;

public class abc {

	private String name;
	private String name1;
	private String name2;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) {
		this.name2 = name2;
	}
	@Override
	public String toString() {
		return "abc [name=" + name + ", name1=" + name1 + ", name2=" + name2 + "]";
	}
	
	public String ay() {
		return "dfgdfg"+name +name1 + name2;
		//return "abc [name=" + name + ", name1=" + name1 + ", name2=" + name2 + "]";
	}
	
	
}
