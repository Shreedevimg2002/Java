class BatteryRunner {

	public static void main(String[] runner){
	
	    Battery details=new Battery();
		 boolean detailsCreated=details.createDetails("AA Alkaline Battery",1,23.00);
		 System.out.println("the  details are created:"+detailsCreated);
		 details.displayDetails();
		 
	    Battery details2=new Battery();
		  detailsCreated=details2.createDetails(" Alkaline Battery",2,53.00);
		 System.out.println("the  details are created:"+detailsCreated);
		 details2.displayDetails();
		 
		 Battery details3=new Battery();
		  detailsCreated=details3.createDetails("9V Alkaline Battery",3,33.00);
		 System.out.println("the  details are created:"+detailsCreated);
		 details3.displayDetails();
		 
		 Battery details4=new Battery();
		  detailsCreated=details4.createDetails("Lithium coin cell Battery",4,45.00);
		 System.out.println("the  details are created:"+detailsCreated);
		 details4.displayDetails();
		 
		 Battery details5=new Battery();
		  detailsCreated=details5.createDetails("AA Alkaline Battery",5,50.00);
		 System.out.println("the  details are created:"+detailsCreated);
		 details5.displayDetails();
		 
		 Battery details6=new Battery();
		  detailsCreated=details6.createDetails("AA Alkaline Battery",6,80.00);
		 System.out.println("the  details are created:"+detailsCreated);
		 details6.displayDetails();
		 
		 Battery details7=new Battery();
		  detailsCreated=details7.createDetails("C Alkaline Battery",7,23.00);
		 System.out.println("the  details are created:"+detailsCreated);
		 details7.displayDetails();
		 
		 Battery details8=new Battery();
		  detailsCreated=details8.createDetails("AA Alkaline Battery",8,23.00);
		 System.out.println("the  details are created:"+detailsCreated);
		 details8.displayDetails();
		 
		 Battery details9=new Battery();
		  detailsCreated=details9.createDetails("9V Alkaline Battery",9,83.00);
		 System.out.println("the  details are created:"+detailsCreated);
		 details9.displayDetails();
		 
		 Battery details10=new Battery();
		  detailsCreated=details10.createDetails(" Alkaline Battery",10,33.00);
		 System.out.println("the  details are created:"+detailsCreated);
		 details10.displayDetails();
		 
		 Battery details11=new Battery();
		  detailsCreated=details11.createDetails("AA Alkaline Battery",11,23.00);
		 System.out.println("the  details are created:"+detailsCreated);
		 details11.displayDetails();
		 
		 Battery details12=new Battery();
		  detailsCreated=details12.createDetails("AA NiMH Rechargeable Battery",12,53.00);
		 System.out.println("the  details are created:"+detailsCreated);
		 details12.displayDetails();
		 
		 Battery details13=new Battery();
		  detailsCreated=details13.createDetails("AA Alkaline Battery",13,23.00);
		 System.out.println("the  details are created:"+detailsCreated);
		 details13.displayDetails();
		 
		 Battery details14=new Battery();
		  detailsCreated=details14.createDetails("9V Alkaline Battery",14,73.00);
		 System.out.println("the  details are created:"+detailsCreated);
		 details14.displayDetails();
		 
		 Battery details15=new Battery();
		  detailsCreated=details15.createDetails("AA NiMH Rechargeable Battery",15,63.00);
		 System.out.println("the  details are created:"+detailsCreated);
		 details15.displayDetails();
	
	
		/*Battery ref = new Battery();
		ref.name ="AA Alkaline Battery";
		ref.id = 1;
		ref.weight=23.00;
		System.out.println("The Name of battery: "+ref.name);
		System.out.println("The id of battery: "+ref.id);
		System.out.println("The weight of battery: "+ref.weight);
		
		Battery ref1 = new Battery();
		ref1.name ="AAA Alkaline Battery";
		ref1.id = 2;
		ref1.weight=11.00;
		System.out.println("The Name of battery: "+ref1.name);
		System.out.println("The id of battery: "+ref1.id);
		System.out.println("The weight of battery: "+ref1.weight);
		
		Battery ref2 = new Battery();
		ref2.name ="9V Alkaline Battery";
		ref2.id = 3;
		ref2.weight=45.00;
		System.out.println("The Name of battery: "+ref2.name);
		System.out.println("The id of battery: "+ref2.id);
		System.out.println("The weight of battery: "+ref2.weight);
		
		Battery ref3 = new Battery();
		ref3.name ="AA Alkaline Battery";
		ref3.id = 4;
		ref3.weight=23.00;
		System.out.println("The Name of battery: "+ref3.name);
		System.out.println("The id of battery: "+ref3.id);
		System.out.println("The weight of battery: "+ref3.weight);
		
		Battery ref4 = new Battery();
		ref4.name ="CR2032 Lithium Coin Cell";
		ref4.id = 5;
		ref4.weight=3.00;
		System.out.println("The Name of battery: "+ref4.name);
		System.out.println("The id of battery: "+ref4.id);
		System.out.println("The weight of battery: "+ref4.weight);
		
		Battery ref5 = new Battery();
		ref5.name ="D Alkaline Battery";
		ref5.id = 6;
		ref5.weight=140.00;
		System.out.println("The Name of battery: "+ref5.name);
		System.out.println("The id of battery: "+ref5.id);
		System.out.println("The weight of battery: "+ref5.weight);
		
		Battery ref6 = new Battery();
		ref6.name ="C Alkaline Battery";
		ref6.id = 7;
		ref6.weight=68.00;
		System.out.println("The Name of battery: "+ref6.name);
		System.out.println("The id of battery: "+ref6.id);
		System.out.println("The weight of battery: "+ref6.weight);
		
		Battery ref7 = new Battery();
		ref7.name ="18650 Lithium-ion Battery";
		ref7.id = 8;
		ref7.weight=23.00;
		System.out.println("The Name of battery: "+ref7.name);
		System.out.println("The id of battery: "+ref7.id);
		System.out.println("The weight of battery: "+ref7.weight);
		
		Battery ref8 = new Battery();
		ref8.name ="CR123A Lithium Battery";
		ref8.id = 9;
		ref8.weight=17.00;
		System.out.println("The Name of battery: "+ref8.name);
		System.out.println("The id of battery: "+ref8.id);
		System.out.println("The weight of battery: "+ref8.weight);
		
		Battery ref9 = new Battery();
		ref9.name =" LR44 Alkaline Button cell";
		ref9.id = 10;
		ref9.weight=2.00;
		System.out.println("The Name of battery: "+ref9.name);
		System.out.println("The id of battery: "+ref9.id);
		System.out.println("The weight of battery: "+ref9.weight);
		
		Battery ref10 = new Battery();
		ref10.name ="AA NiMH Rechargeable Battery";
		ref10.id = 11;
		ref10.weight=26.00;
		System.out.println("The Name of battery: "+ref10.name);
		System.out.println("The id of battery: "+ref10.id);
		System.out.println("The weight of battery: "+ref10.weight);
		
		Battery ref11 = new Battery();
		ref11.name ="AA NiMH Rechargeable Battery";
		ref11.id = 12;
		ref11.weight=14.00;
		System.out.println("The Name of battery: "+ref11.name);
		System.out.println("The id of battery: "+ref11.id);
		System.out.println("The weight of battery: "+ref11.weight);
		
		Battery ref12 = new Battery();
		ref12.name ="Lead-acid Car Battery";
		ref12.id = 13;
		ref12.weight=15000.00;
		System.out.println("The Name of battery: "+ref12.name);
		System.out.println("The id of battery: "+ref12.id);
		System.out.println("The weight of battery: "+ref12.weight);
		
		Battery ref13 = new Battery();
		ref13.name ="21700 Lithium-ion Battery";
		ref13.id = 14;
		ref13.weight=70.00;
		System.out.println("The Name of battery: "+ref13.name);
		System.out.println("The id of battery: "+ref13.id);
		System.out.println("The weight of battery: "+ref13.weight);
		
		Battery ref14 = new Battery();
		ref14.name ="CR2 Lithium Battery";
		ref14.id = 15;
		ref14.weight=11.00;
		System.out.println("The Name of battery: "+ref14.name);
		System.out.println("The id of battery: "+ref14.id);
		System.out.println("The weight of battery: "+ref14.weight);*/
		
	
	}



}