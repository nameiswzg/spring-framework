package com.wzg.demo;

/**
 * @DESCRIPTION: new Class
 * @AUTHOR wangzengguang
 * @DATE 2021/2/23 8:02 下午
 **/
public class MyBeans {
	private String name;
	public MyBeans(){}
	public MyBeans(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyBeans{" +
				"name='" + name + '\'' +
				'}';
	}
}
