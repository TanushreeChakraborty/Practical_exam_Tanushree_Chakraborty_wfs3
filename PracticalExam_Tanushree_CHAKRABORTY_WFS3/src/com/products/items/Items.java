package com.products.items;

import java.util.*;


import com.comparison.CompareApparel;
import com.comparison.CompareFood;
import com.products.Apparel;
import com.products.Electronics;
import com.products.FoodItems;


public class Items implements  Comparator<Electronics> {
	
	private List<FoodItems> foodItems;
	private List<Apparel> apparels;
	private List<Electronics> electronics;
	
	public boolean add(FoodItems entity) {
		// TODO Auto-generated method stub
		return this.foodItems.add(entity);
	}
	public boolean add(Apparel entity) {
		// TODO Auto-generated method stub
		return this.apparels.add(entity);
	}
	
	public Collection<FoodItems> findAllFood() {
		// TODO Auto-generated method stub
		return this.foodItems;
	}
	
	public Collection<Apparel> findAllApp() {
		// TODO Auto-generated method stub
		return this.apparels;
	}
	
	//factory method
	private Object choice(int key) {
		
		switch (key) {
		case 1:
			return new CompareFood();
		case 2:
			return new CompareApparel();
		
		default:
			return null;
		}
	}
	
	public Collection<FoodItems> sortedByFood(List<FoodItems> foodItems) {
		
		Collections.sort(this.foodItems,choice(1));
		return foodItems;
		
	}
	
public Collection<Apparel> sortedByApp(List<Apparel> apparel) {
		
		Collections.sort(this.apparels,choice(2));
		return apparel;
		
	}

@Override
public int compare(Electronics o1, Electronics o2) {
	// TODO Auto-generated method stub
	return 0;
}
	
	
		
	
		
	}

