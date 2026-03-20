package com.trainconsist;

import java.util.*;
import java.util.stream.*;

//Train class for storing list of bogies attached to the train

public class Train {

	// Inner class GoodsBogie
	public static class GoodsBogie{
		private String type;
		private String cargo;
		
		public GoodsBogie(String type, String cargo) {
			this.type = type;
			this.cargo = cargo;
		}
		
		public String getType() {
			return type;
		}
		
		public String getCargo() {
			return cargo;
		}
		
		public String toString() {
			return type+" -> "+cargo;
		}
	}
	
	private List<GoodsBogie> goodsBogie;
	
	public Train() {
		this.goodsBogie = new ArrayList<>();
	}
	
	public void addGoodsBogie(String type, String cargo) {
		goodsBogie.add(new GoodsBogie(type,cargo));
	}
	
	public List<GoodsBogie> getGoodsBogie(){
		return goodsBogie;
	}
	
	// in boolean algebra if A then B can be written as Not A or B
	// it is checking: either type is not cylindrical and if it is cylindrical, it is not carrying petroleum
	public boolean isSafetyCompliant() {
		return goodsBogie.stream().allMatch(b-> !b.getType().equalsIgnoreCase("Cylindrical") || b.getCargo().equalsIgnoreCase("Petroleum")); 
	}
	
}