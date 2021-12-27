package com.waqar.queue;

public class Book {
	private int id;
	private int pages;
	private double price;
	private String name;
	@Override
	public String toString() {
		return "Book [id=" + id + ", pages=" + pages + ", price=" + price + ", name=" + name + "]";
	}
	protected Book(int id, int pages, double price, String name) {
		super();
		this.id = id;
		this.pages = pages;
		this.price = price;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Book()
	{
		
	}
	

}
