package com.main;

import com.controller.*;
import com.trainconsist.*;

public class Main {

	public static void main(String[] args) {
		
		Train train = new Train();
		MainController mainController = new MainController();
		
		mainController.Initialize(train);
		
	}
}
