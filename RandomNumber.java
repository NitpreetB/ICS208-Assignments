import java.util.*;
public class randomnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> num = new ArrayList();
		int total []= new int [4];
		
		randomnum (num);
		
	}

	public static void randomnum (ArrayList num )
	{
		
		int rannun=0;
		int counter=0;
		do

		{
			counter++;
			rannun= (int) (Math.random()*(49+1))+1;
			System.out.print( rannun+ " ");
			num.add(rannun);
			
			
			
}while (rannun!= 7 && rannun!=27);

		//System.out.println(counter);


		}
	public static void highest (ArrayList num )

		{
			int highest =0, number ; 
			number=	num.size();
