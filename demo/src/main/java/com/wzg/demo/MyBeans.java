package com.wzg.demo;

/**
 * @DESCRIPTION: new Class
 * @AUTHOR wangzengguang
 * @DATE 2021/3/1 10:56 上午
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
		return "com.wzg.demo.MyBeans{" +
				"name='" + name + '\'' +
				'}';
	}
}
