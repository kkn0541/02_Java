package test.run;

import test.service.HospitalService;

public class HospitalRun {
public static void main(String[] args) {
	
	HospitalService hsService = new HospitalService();
	
	
	hsService.displayMenu();
}
}