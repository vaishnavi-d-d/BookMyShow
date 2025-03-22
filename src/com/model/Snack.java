package com.model;

public class Snack {
private int id;
private String name;
private String desc;
private int price;
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
public String getDesc() {
	return desc;
}
public void setDesc(String desc) {
	this.desc = desc;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Snack(int id, String name, String desc, int price) {
	super();
	this.id = id;
	this.name = name;
	this.desc = desc;
	this.price = price;
}
}
