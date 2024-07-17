class Television1{
      
	  static boolean isConnected;
      static int currentVolume ;
      static int minVolume ;
	  static int maxVolume=5 ;
   
   public static void onOrOff(){
     
        System.out.println("The onOrOff started");
		 // false= false
		 if(isConnected==false){ //!isConnected
			 isConnected=true;
	    System.out.println("the tv is turned on");
		 }else if(isConnected==true){   //isConnected
			 isConnected=false;
		System.out.println("the tv is turned off");

		 }
 
		System.out.println("The onOrOff ended");
     
	 return ;
   }
   
    public static void increaseVolume(){
	   System.out.println("increaseVolume started");
	   
	if(isConnected==true){
	   if(currentVolume<maxVolume){
		   currentVolume=currentVolume+1;
		System.out.println("The current volume is " +currentVolume);
	   }else{
		   System.out.println("Max volume is reached");   
	   }
	}else{
		System.out.println("On the television");
		   
	   }
	   System.out.println("increasevolume ended");
      return ;
   }
   
    public static void decreaseVolume(){
		 System.out.println("the decreaseVolume is started");
		 if(isConnected==true){
		System.out.println("the television is connected");	 
			 if(currentVolume>minVolume){
				 currentVolume=currentVolume-1;
				 System.out.println("The currentVolume is" +currentVolume);
			 }else{
				 
				System.out.println("the minVolume is reached"); 
			 }
			 
		 }else{
			 
			 System.out.println("on the tv");
		 }
	   System.out.println("the decreaseVolume is ended ");
	   
	   return ;
   }

}