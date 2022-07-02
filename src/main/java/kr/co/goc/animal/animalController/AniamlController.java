package kr.co.goc.animal.animalController;

import kr.co.goc.animal.animalService.AnimalServiceImpl;

public class AniamlController {
	private AnimalServiceImpl animalSer;
	
	public AniamlController() {
		animalSer = AnimalServiceImpl.getInstance();
	}
}

