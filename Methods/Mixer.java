class Mixer{

 static int currentSpeed ;
      static int minSpeed ;
	  static int maxSpeed=5 ;
    public static void onOrOff(){
     
        System.out.println("The onOrOff started");
		 //true is not equal to false
		 if(isConnected==false){
			 isConnected=true;
	    System.out.println("the mixer is turned on");
		 }else if(isConnected==true){
			 isConnected=false;
		System.out.println("the mixer is turned off");

		 }
 
		System.out.println("The onOrOff ended");
     
	 return ;
   }
   
    public static void increaseSpeed(){
	   System.out.println("increaseSpeed started");
	   
	if(isConnected==true){
	   if(currentSpeed<maxSpeed){
		   currentSpeed=currentSpeed+1;
		System.out.println("The current temperature is " +currentSpeed);
	   }else{
		   System.out.println("Max Speed is reached");   
	   }
	}else{
		System.out.println("On the AC");
		   
	   }
	   System.out.println("increaseSpeed ended");
      return ;
   }
   
}