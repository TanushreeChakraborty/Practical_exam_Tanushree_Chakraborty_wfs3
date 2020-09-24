package com.comparison;

import java.util.Comparator;

import com.products.Apparel;

public class CompareApparel implements Comparator<Apparel> {
	
	public int compare(Apparel f1, Apparel f2) {
		if(f1.getQuantity()<f2.getQuantity()) return -1;
		if(f1.getQuantity()>f2.getQuantity()) return 1;
		return 0;
	}

}
