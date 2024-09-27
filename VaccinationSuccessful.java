package com.lms;

public class VaccinationSuccessful extends Vaccine{

	public VaccinationSuccessful(int age, String nationality) {
	        super(age, nationality);
    }
	@Override
	public void boosterDose() {
		// TODO Auto-generated method stub
		  if (isFirstDoseTaken&&isSecondDoseTaken) {
	            System.out.println("Booster dose taken successfully.");
	        } else {
	            System.out.println("Please complete the first and second doses before taking the booster dose.");
	        }
	}
	  public static void main(String[] args) {
	        // Example: Create a user with age and nationality
	        VaccinationSuccessful user = new VaccinationSuccessful(20, "Indian");
	        
	        
	        user.firstDose(); // Scenario 1
	        user.secondDose(); // Scenario 2
	        user.boosterDose(); // Scenario 3
	    }

}
