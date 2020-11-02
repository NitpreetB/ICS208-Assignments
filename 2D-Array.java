import java.util.*;
public class Practice2D {
	/**
	 * Input sales for each person (in a 2D array)
	 * Calculate total sales for each sales person and average amount of sales
	 * Also calculate which day had the most sales
	 * Use methods
	 */
	private static void input(int sales[][], int rows, int columns)
	{
		//loop to fill in matrix
		Scanner input = new Scanner(System.in);
		for (int x=0; x<rows; x++)
		{
			System.out.println("Please enter the sales for employee number " + (x+1) + " (Monday through Friday)");
			for (int y=0; y<columns; y++)
			{
				sales[x][y]=input.nextInt();
			}
		}
		input.close();
	}
	private static void totalSalesperDay(int sales[][], int rows, int columns)
	{
		//loop to find total sales per day
		int totalSalesperDay[] = new int[columns];
		
		for (int a=0; a<columns; a++)
		{
			for (int b=0; b<rows; b++)
			{
				totalSalesperDay[a] += sales[b][a];
				System.out.println("The amount of sales on day " + (a+1) + " had" + totalSalesperDay + " sales");
			}
		}
	}
	private static void totalSalesperEmployee(int sales[][], int rows, int columns)
	{
		//loop to find total sales per employee
		int totalSalesperEmployee[] = new int[rows];
		for (int c=0; c<rows; c++)
		{
			for (int d=0; d<columns; d++)
			{
				totalSalesperEmployee[c] += sales[c][d];
				System.out.println("The amount of sales by employee number " + (c+1) + " was" + totalSalesperEmployee);
			}
		}	
	}
	private static void dayWithMostSales(int sales[][], int rows, int columns)
	{
		//calculate which day had most sales
				int highestValue = 0;
				int totalSalesperDay[] = new int[columns];
				for (int m=0; m<columns; m++)
				{
					highestValue = totalSalesperDay[0];
					if (highestValue < totalSalesperDay[m])
					{
						highestValue=totalSalesperDay[m];
					}
				}
				System.out.println("The day with the most sales had " + highestValue + " sales.");
	}
	private static void employeeWithMostSales(int sales[][], int rows, int columns)
	{
		//calculate which employee had most sales
		int totalSalesperEmployee[] = new int[rows];
				int highestValuee = 0;
				for (int m=0; m<rows; m++)
				{
					highestValuee = totalSalesperEmployee[0];
					if (highestValuee < totalSalesperEmployee[m])
					{
						highestValuee=totalSalesperEmployee[m];
					}
				}
				System.out.println("The employee with the most sales had " + highestValuee + " sales.");
	}
	
	public static void main(String[] args) {
		//declare variables
		int sales[][]=new int[3][5];
		int rows=3, columns=5;
		
		input(sales, rows, columns);
		totalSalesperDay(sales, rows, columns);
		totalSalesperEmployee(sales, rows, columns);
		dayWithMostSales(sales, rows, columns);
		employeeWithMostSales(sales, rows, columns);
	}
	
}
