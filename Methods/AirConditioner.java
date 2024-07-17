class AirConditioner{
   
  //static variable
    static boolean isConnected ;
	static int currentTemperature;
	static int minTemperature ;
	static int maxTemperature=6;

  
   public static void getDetails(){
	
	    System.out.println("getDetails started");
		   //local variable
		   String name="Samsung";
		   int price=3099;
	    System.out.println("The AC name is:" +name);
		System.out.println("The AC price is:" +price);
	    System.out.println("getDetails ended");

	}

    
	public static void onOrOff(){
     
        System.out.println("The onOrOff started");
		/* //true is not equal to false
		if(isConnected==false){
			 isConnected=true;
	    System.out.println("the ac is turned on");
		 }else if(isConnected==true){
			 isConnected=false;
		
		
		! 
		 }*/
		 		System.out.println("the ac is turned off");

 
		System.out.println("The onOrOff ended");
     
	 return ;
   }
                             //functionality/behaviour
    public static void increaseTempeature(){
	   System.out.println("increaseTempeature started");
	   
	if(isConnected==true){
	   //if(currentTemperature<maxTemperature){
		//   currentTemperature=currentTemperature+1;
		//System.out.println("The current temperature is " +currentTemperature);
		isConnected=(isConnected==false) ?true ;
	
	   }else{
		   System.out.println("Max Temperature is reached");   
	   }
	}else{
		System.out.println("On the AC");
		   
	   }
	   System.out.println("increaseTempeature ended");
      return ;
   }
   
   public static void decreaseTempeature(){
	   System.out.println("decreaseTempeature started");
	   
	if(isConnected==true){
	   if(currentTemperature<minTemperature){
		   currentTemperature=currentTemperature-1;
		System.out.println("The current temperature is " +currentTemperature);
	   }else{
		   System.out.println("Min Temperature is reached");   
	   }
	}else{
		System.out.println("On the AC");
		   
	   }
	   System.out.println("decreaseTempeature ended");
      return ;
   }
   
   



}  