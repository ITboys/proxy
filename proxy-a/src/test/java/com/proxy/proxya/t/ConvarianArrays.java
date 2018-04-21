package com.proxy.proxya.t;

import java.util.ArrayList;
import java.util.List;

public class ConvarianArrays {
	
	public static void main(String args[]) {
		Fruit[] fruits = new Apple[10];
		fruits[0] = new Apple();
		fruits[1] = new Jonathan();
		
		fruits[0] = new Fruit();
		
		fruits[0] = new Orange();
		
//		List<Fruit> flist = new ArrayList<Apple>();
//		List<? extends Fruit> flist = new ArrayList<Apple>();
//		flist.add(new Apple());
//		flist.add(new Fruit());
//		flist.add(new Orange());
//		flist.add(null);
	}

}
