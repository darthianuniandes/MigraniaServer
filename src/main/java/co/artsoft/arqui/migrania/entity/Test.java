package co.artsoft.arqui.migrania.entity;

import java.util.HashSet;
import java.util.Set;

public class Test {
	private int id;
private String name;
//private Food food;
private Set<Food> foods = new HashSet<Food>();



	public Set<Food> getFoods() {
	return foods;
}

public void setFoods(Set<Food> foods) {
	this.foods = foods;
}

	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
