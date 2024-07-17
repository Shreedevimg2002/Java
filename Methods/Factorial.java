class Factorial{


        //purpose
                                       //factnum=0 ,it is a parameter
        public static int toGetFact(int FactNum){
		    
			//System.out.println("Fact method is started");
			    int fact=1;
            
		    for(int num=1; num<=FactNum; num++){
			    
				fact= num*fact;
				//System.out.println("The factorial Value "+" is"  +fact);              
	
			}
			
			//System.out.println("The factorial Value "+" is"  +fact);

			//System.out.println("Fact method is ended");
			
		return fact;
		
		}


}
