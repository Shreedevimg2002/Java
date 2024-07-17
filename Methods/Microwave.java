class Microwave{

public static void onOrOff(){
     
        System.out.println("The onOrOff started");
		 //true is not equal to false
		 if(isConnected==false){
			 isConnected=true;
	    System.out.println("the microwave is turned on");
		 }else if(isConnected==true){
			 isConnected=false;
		System.out.println("the microwave is turned off");

		 }
 
		System.out.println("The onOrOff ended");
     
	 return ;
   }
   
    public static void increaseTempeature(){
	   System.out.println("increaseTempeature started");
	   
	if(isConnected==true){
	   if(currentTemperature<maxTemperature){
		   currentTemperature=currentTemperature+1;
		System.out.println("The current temperature is " +currentTemperature);
	   }else{
		   System.out.println("Max Temperature is reached");   
	   }
	}else{
		System.out.println("turn on the microwave");
		   
	   }
	   System.out.println("increaseTempeature ended");
      return ;
   }
   
   
   

}  
	
     



