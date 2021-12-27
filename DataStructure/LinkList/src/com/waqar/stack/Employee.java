package com.waqar.stack;

public class Employee {
	private int id;
	private String name;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	protected Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public boolean equals(Object id) {
		// TODO Auto-generated method stub
		return super.equals(id);
	}
	
}
