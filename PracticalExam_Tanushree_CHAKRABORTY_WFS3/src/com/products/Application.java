package com.products;

import java.util.Collection;
import java.util.Iterator;

import com.products.items.Items;

//import com.collectionframe.Invoice;

public class Application {
	
public static void printListfood(Collection<FoodItems> food) {
		
		Iterator<FoodItems> iterator=food.iterator();
		while (iterator.hasNext()) {
			FoodItems ap = iterator.next();
			System.out.println(ap);
		}
		
		public static void printListapp(Collection<Apparel> app) {
			
			Iterator<Apparel> iterator=app.iterator();
			while (iterator.hasNext()) {
				Apparel ap = iterator.next();
				System.out.println(ap);
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apparel apparel=new Apparel("123", "asdfg", 1234, 23, "dfgh");
		Apparel apparel1=new Apparel("124", "asdf", 1235, 26, "dfgh");
		Apparel apparel2=new Apparel("125", "adfg", 1236, 27, "dfgh");
		Apparel apparel3=new Apparel("126", "asfg", 1237, 24, "dfg");
		FoodItems food=new FoodItems("2345", "dfgh", 987, true);
		FoodItems food1=new FoodItems("2346", "dflgh", 9587, false);
		FoodItems food2=new FoodItems("2347", "dfg", 9874, true);
		FoodItems food3=new FoodItems("2348", "dgh", 9875, true);
		Items item=new Items();
		
		item.add(food);
		item.add(food1);
		item.add(food2);
		item.add(food3);
		
		item.add(apparel);
		item.add(apparel1);
		item.add(apparel2);
		item.add(apparel3);
		
		Collection<FoodItems> fooditems=item.findAllFood();
		item.sortedByFood(fooditems);
		printListfood(fooditems);
		
		Collection<Apparel> apparels=item.findAllApp();
		item.sortedByApp(apparels);
		printListapp(apparels);

	}

}
