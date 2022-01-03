public class CarWash {

	/**
	 * Find total of each type of car wash
	 * Highest type of car wash
	 * Input numbers between 5 and 50 
	 */
	public static void main(String[] args) {
		String name []= new String [3];
		int sales[][]= new int [3][4];
		int[] carwasht= new int [3];
		double [] stations=new double [4];
		int highest;
		
		
		setValues(name,sales);
		totalpercarwash(sales,carwasht);
		highest=highesttype( carwasht);
		totalperstation(sales,stations);
		outputcar(carwasht,name,highest,stations);
		
	}
	// 4th method to find the total per station 
	// to find the average 
	public static void totalperstation(int sales [][],double[] stations)
	{
		int total;
		for(int sta=0;sta<4;sta++)
		{
			total = 0;
			for(int wash=0;wash<3;wash++)
			{
				total=total+sales[wash][sta];
			}
			stations[sta]=total/4.0;
		}
	}
	// third method 
	// find witch kind of of carwashhas the higest sales 
	// input carwasht (car wash total) array
	
	public static int highesttype(int[] carwasht)
	{
// set highest and index to 0 (outside of method)
		int highest,index;
		highest=0;
		index=0;
		
		for(int wash=0;wash<3;wash++)
		{
// how to find the highest type 
			if (carwasht[wash]>highest)
			{
				highest = carwasht[wash];
				index=wash;
			}
		}
		return index;
	}
	
// Last method Printing 
// input everything 
	public static void outputcar(int[] carwasht, String []name, int high,double[] stations)
	{
		for(int wash=0;wash<3;wash++)
		{
			System.out.print(name[wash]);
			System.out.println(carwasht [wash]);
		}
		System.out.println("");
		System.out.println("The highest sales is from "+name[high]+". ");
		System.out.println("");
		int station;
		
		for(int sta=0;sta<4;sta++)
		{
			station=sta+1;
			System.out.println("Station" +station+" average    ");
			System.out.println(stations[sta]);
		}
	}
	
	// method number 2 to calculate the total per car wash 
	// input the double sales array, and the new carwasht array
	
	public static void totalpercarwash(int sales [][],int[] carwasht)
	{
		//create a new total int 
		int total;
		//create another double for loop 
		// set total to zero each time beacuse the total is diffrent for each part of the array
		
		for(int wash=0;wash<3;wash++)
		{
			total = 0;
			for(int sta=0;sta<4;sta++)
			{
				total=total+sales[wash][sta];
			}
			carwasht[wash]=total;
		}
	}
	
	// Method number 1 
	// method to set the values of the String Array 
	// inputting the string Array for the name of the car wash and the double array for the sales 
	
	public static void setValues(String [] name, int [][]sales)
	{
	//setting the values for the name array with the diffrent types of car wash 
		
		name[0]="Deluxe with Wax";
		name[1]="Simple Exterior";
		name[2]="Touchless Wash";
		
// a double that goes around three times for the wash type (for ex: 0="Deluxe with Wax")
// loop goes around 4 times for the station and sets each wash type and station number
//to a random from  5-50
		
		for(int wash=0;wash<3;wash++)
		{
			for(int sta=0;sta<4;sta++)
			{
				sales[wash][sta]= (int) (Math.random()*45+1)+5;
				
			}
			
			
		}
	}

}