package com.comparison;

import java.util.Comparator;

import com.products.FoodItems;

public class CompareFood implements Comparator<FoodItems> {
	
	
	public int compare(FoodItems f1, FoodItems f2) {
		if(f1.getQuantity()<f2.getQuantity()) return -1;
		if(f1.getQuantity()>f2.getQuantity()) return 1;
		return 0;
	}

}
