package com.trainconsist;

import java.util.*;
import java.util.stream.*;

//Train class for storing list of bogies attached to the train

public class Train {

	// Inner class GoodsBogie
	public static class GoodsBogie{
		private String shape;
		private String cargo;
		
		public GoodsBogie(String shape){
			this.shape = shape;
		}
		
		public String getShape() {
			return shape;
		} 
		
		public String getCargo() {
			return cargo; 
		}
		
		public void assignCargo(String cargo) {
			try {
				// rectangle bogie != petroleum
				if(this.shape.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
					throw new CargoSafetyException("Unsafe Cargo assignment");
				}
				this.cargo = cargo;
				System.out.println("Cargo assigned -> "+cargo);
				
			}
			catch (CargoSafetyException e){
				System.out.println("Error : "+e.getMessage());
			}
			finally {
				System.out.println("Cargo validation cpmpleted for "+this.shape+" bogie");
			}
		}
	}
	
	private List<GoodsBogie> bogies; // list of object of Bogies
	
	public Train() {
		this.bogies = new ArrayList<>();
	}
	
	public void addBogie(String shape, String cargo){ // add objects to the list
		bogies.add(new GoodsBogie(shape));  
	}
	
	public List<GoodsBogie> getBogie(){  
		return bogies;
	}
}