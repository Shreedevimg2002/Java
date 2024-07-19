class Battery{

	String	name;
	int	id;
	double	weight;


	/*public void	charge(){
			
	System.out.println("battery is used to charge devices");		
			
	}*/
	public boolean createDetails(String name,int id,double weight){
		boolean isDetailsCreated=false;
		if(name!=null && id>0 && weight>0){
			//instance variables = parameter variables
			this.name=name;
			this.id=id;
			this.weight=weight;
			isDetailsCreated=true;
		}
		return isDetailsCreated;
	}
	public void displayDetails(){
		
		System.out.println("The bramd name is:"+this.name);
	    System.out.println("The id is:" +this.id);
		System.out.println("The price is:" +this.weight);
		  
		
	}
		

}