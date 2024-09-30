package com.lms;


class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);
    }
}

class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {
        super(message);
    }
}

class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);
    }
}


class TaxCalculator {

    public double calculateTax(String empName, boolean isIndian, double empSal) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {


    	if (empName == null || empName.trim().isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty");
        }

       
    	
        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
        }

       
        
        double taxAmount = 0;
        if (empSal > 100000) {
            taxAmount = empSal * 8 / 100;
        } else if (empSal >= 50000 && empSal <= 100000) {
            taxAmount = empSal * 6 / 100;
        } else if (empSal >= 30000 && empSal < 50000) {
            taxAmount = empSal * 5 / 100;
        } else if (empSal >= 10000 && empSal < 30000) {
            taxAmount = empSal * 4 / 100;
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax");
        }

        return taxAmount;
    }
}

public class CalculatorSimulator {
	
	    public static void main(String[] args) {
	        TaxCalculator taxCalculator = new TaxCalculator();

	        // Test Case 1
	        try {
	            System.out.println("Test Case 1:");
	            double tax = taxCalculator.calculateTax("Ron", false, 34000);
	            System.out.println("Tax amount is " + tax);
	        } catch (CountryNotValidException e) {
	            System.out.println("The employee should be an Indian citizen for calculating tax.");
	            e.printStackTrace();
	        } catch (EmployeeNameInvalidException e) {
	            System.out.println("The employee name cannot be empty.");
	            e.printStackTrace();
	        } catch (TaxNotEligibleException e) {
	            System.out.println("The employee does not need to pay tax.");
	            e.printStackTrace();
	        }

	        // Test Case 2
	        try {
	            System.out.println("\nTest Case 2:");
	            double tax = taxCalculator.calculateTax("Tim", true, 1000);
	            System.out.println("Tax amount is " + tax);
	        } catch (CountryNotValidException e) {
	            System.out.println("The employee should be an Indian citizen for calculating tax.");
	            e.printStackTrace();
	        } catch (EmployeeNameInvalidException e) {
	            System.out.println("The employee name cannot be empty.");
	            e.printStackTrace();
	        } catch (TaxNotEligibleException e) {
	            System.out.println("The employee does not need to pay tax.");
	            e.printStackTrace();
	        }

	        // Test Case 3
	        try {
	            System.out.println("\nTest Case 3:");
	            double tax = taxCalculator.calculateTax("Jack", true, 55000);
	            System.out.println("Tax amount is " + tax);
	        } catch (CountryNotValidException e) {
	            System.out.println("The employee should be an Indian citizen for calculating tax.");
	            e.printStackTrace();
	        } catch (EmployeeNameInvalidException e) {
	            System.out.println("The employee name cannot be empty.");
	            e.printStackTrace();
	        } catch (TaxNotEligibleException e) {
	            System.out.println("The employee does not need to pay tax.");
	            e.printStackTrace();
	        }

	        // Test Case 4
	        try {
	            System.out.println("\nTest Case 4:");
	            double tax = taxCalculator.calculateTax("", true, 30000);
	            System.out.println("Tax amount is " + tax);
	        } catch (CountryNotValidException e) {
	            System.out.println("The employee should be an Indian citizen for calculating tax.");
	            e.printStackTrace();
	        } catch (EmployeeNameInvalidException e) {
	            System.out.println("The employee name cannot be empty.");
	            e.printStackTrace();
	        } catch (TaxNotEligibleException e) {
	            System.out.println("The employee does not need to pay tax.");
	            e.printStackTrace();
	        }
	    }
}