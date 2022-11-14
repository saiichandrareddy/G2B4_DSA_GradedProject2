package theSkyScraper.CodeLogic;

import java.util.Scanner;

public class SkyScraperisBuilt {     
		Scanner sc = new Scanner(System.in); 
		public void SkyScraper() {
		System.out.println("enter the total no of floors in the building :");  
		int FloorCount = sc.nextInt();         
		int x[] = new int[FloorCount+1];         
		for(int i=1;i<FloorCount+1;i++){             
			System.out.println("enter the floor size given on day :"+i);             
			int FloorSize=sc.nextInt();
			x[FloorSize]=i;        
			}         
		int K=FloorCount;         
		boolean flag;    
		System.out.println("The order of construction is as follows ");         
		for(int i=1;i<=FloorCount;i++){             
			flag=false;             
			System.out.println("Day: "+i);             
			while(K>=1 && x[K]<=i){                 
				flag=true;                 
				System.out.print(K +" ");                 
				K--;             }             
			if(flag==true){                 
				System.out.println();            
				}         
			}
		} 
}
	
