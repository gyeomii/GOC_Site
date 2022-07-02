package kr.co.goc.anumal.animalController;

import kr.co.goc.anumal.animalService.AnimalServiceImpl;

public class AniamlController {
	private AnimalServiceImpl animalSer;
	
	public AniamlController() {
		animalSer = AnimalServiceImpl.getInstance();
	}
}

