class Ncr{

public static void main(String ncr[]){
	
	
     int n=7;
	 int r=3;
     int ncrValue=Factorial.toGetFact(n)/(Factorial.toGetFact(r)*(n-r));  	 //NCR= n!/r!*(n-r)!

	 //System.out.println("The ncr value is:"+ncrValue);
	 
	 System.out.println(ncrValue);
	 	 
}
}

