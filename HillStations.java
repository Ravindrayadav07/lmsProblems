package com.lms;
 class Gulmarg extends HillStations {
	@Override
    public void location() {
        System.out.println("Gulmarg is located in Jammu and Kashmir.");
    }

    @Override
    public void famousFor() {
        System.out.println("Gulmarg is famous for its skiing and winter sports.");
    }

}
 class Manali extends HillStations {
	// @Override
	    public void location() {
	        System.out.println("Manali is located in Himachal Pradesh.");
	    }
	    
	//    @Override
	    public void famousFor() {
	        System.out.println("Manali is famous for its scenic beauty and adventure sports.");
	    }
	   
	    	
	    }


 class Mussoorie extends HillStations{
	@Override
    public void location() {
        System.out.println("Mussoorie is located in Uttarakhand.");
    }

    @Override
    public void famousFor() {
        System.out.println("Mussoorie is famous for its colonial heritage and natural beauty.");
    }
}

public class HillStations{
	 
	    public void location() {
	        System.out.println("Location of Hill Station");
	    }

	    
	    public void famousFor() {
	        System.out.println("Famous for Hill Station");
	    }
	    public static void main(String [] args) {
			 HillStations h1=new HillStations();
			 h1.location();
	         Manali m1=new Manali();
		    	
		    	m1.location();
		    	m1.famousFor();
		    	Mussoorie M1=new Mussoorie();
		    	M1.location();
		    	M1.famousFor();
		    	Gulmarg g1=new Gulmarg();
		    	g1.location();
		    	g1.famousFor();
		    	
		    	
		    }
		
	   
	}

