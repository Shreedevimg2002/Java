class Speaker{

      static int currentVolume ;
      static int minVolume ;
	  static int maxVolume=5 ;
    public static void onOrOff(){
     
        System.out.println("The onOrOff started");
		 //true is not equal to false
		 if(isConnected==false){
			 isConnected=true;
	    System.out.println("the speaker is turned on");
		 }else if(isConnected==true){
			 isConnected=false;
		System.out.println("the speaker is turned off");

		 }
 
		System.out.println("The onOrOff ended");
     
	 return ;
   }
   
    public static void increaseVolume(){
	   System.out.println("increaseVolume started");
	   
	if(isConnected==true){
	   if(currentVolumed<maxVolume){
		   currentVolume=currentVolume+1;
		System.out.println("The current volume is " +currentvolume);
	   }else{
		   System.out.println("Max volume is reached");   
	   }
	}else{
		System.out.println("On the speaker");
		   
	   }
	   System.out.println("increasevolume ended");
      return ;
   }
   
   
   


}