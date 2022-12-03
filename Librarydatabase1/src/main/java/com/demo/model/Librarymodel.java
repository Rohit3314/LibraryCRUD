package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Librarymodel 
{
	@Id
	private int id;
	private String name;
	private double price;
	
	public Librarymodel() {
		super();
			}

	public Librarymodel(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Librarymodel [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
      
}
