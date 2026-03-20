package com.trainconsist;

import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

//Train class for storing list of bogies attached to the train

public class Train {

	private static final String TRAIN_ID_PATTERN = "TRN-\\d{4}";
	private static final String CARGO_CODE_PATTERN = "PET-[A-Z]{2}";

	// validating Train Id format (TRN-XXXX) : X -> Integer
	public boolean validateTrainId(String trainId) {
		Pattern pattern = Pattern.compile(TRAIN_ID_PATTERN);
		Matcher matcher = pattern.matcher(trainId); 
		return matcher.matches();
	}

	// validating Cargo Code format (PET-AA) : X -> Alphabet UpperCase
	public boolean validateCargoCode(String cargoCode) {
		Pattern pattern = Pattern.compile(CARGO_CODE_PATTERN);
		Matcher matcher = pattern.matcher(cargoCode); 
		return matcher.matches();
	}

}