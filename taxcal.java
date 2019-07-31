import java.util.Scanner;
class taxcal {
	public static void main(String args[])
	{
		double sal,tax=0,newsal;
	System.out.println("enter salary");
	Scanner sc=new Scanner(System.in);
	sal=sc.nextInt();
	if(sal<=250000){
		System.out.println("no text");
	    System.out.println("new salary"+sal); }
    else{
    	if(sal>250000&sal<=500000)
    		{ tax=0.05d*sal;
    	    newsal=sal-tax;
    		System.out.println("tax"+tax);
    		System.out.println("now salary"+newsal);
    }
    else{
    	if(sal>500000&sal<=1000000){
    		tax=(sal-500000)*0.2+12500;
    		newsal=sal-tax;
    		System.out.println("tax"+tax);
    		System.out.println("now salary"+newsal);
    	}
      else{
         tax=112500+(sal-1000000)*0.3;
         newsal=sal-tax;
         System.out.println("tax"+tax);
         System.out.println("new salary"+newsal);

      }

    }

}

	}
}