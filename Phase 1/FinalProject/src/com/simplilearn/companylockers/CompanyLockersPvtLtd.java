package com.simplilearn.companylockers;

public class CompanyLockersPvtLtd {

	public static void main(String[] args) {
		OperationsWithFile.createMainFolderIfNotPresent("main");
		
		Options.printWelcomeScreen("Company Lockers Private Limited", "Ashwin Mathankar");
		
		ControlOptions.handleWelcomeScreenInput();


	}

}
