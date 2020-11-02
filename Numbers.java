import java.util.*;
import java.io.*;
public class Numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		//variables
		ArrayList <Integer> numbers = new ArrayList <Integer>(); 
		
		//methods
		inputArrayList(numbers);
		findEven(numbers); 
		findThreeDigit(numbers); 
		findSum(numbers); 
	}
	public static void findSum (ArrayList <Integer> numbers){
		int size;
		int total = 0; 
		size = numbers.size();
		
		for (int i = 0; i<size; i++)
		{
			total = numbers.get(i)+total; 
		}
		System.out.println("The total of all the numbers is "+total); 
	}
	public static void findThreeDigit (ArrayList <Integer> numbers){
		int size; 
		size = numbers.size(); 
		int counter = 0; 
		String [] num = new String [size]; 
		
		for (int i = 0; i<size; i++)
		{
			num[i] = Integer.toString(numbers.get(i)); 
			if (num[i].length()== 3)
			{
				counter = counter+1; 
			}
		}
		System.out.println("There are "+counter+" three digit numbers"); 
	}
	public static void findEven (ArrayList <Integer> numbers){
		int size; 
		int evenCount = 0; 
		size = numbers.size(); 
		
		for (int i = 0; i<size; i++)
		{
			if (numbers.get(i)%2 == 0)
			{
				evenCount = evenCount+1; 
			}
		}
		System.out.println("There are "+evenCount+" even numbers"); 
	}
	public static void inputArrayList (ArrayList <Integer> numbers) throws IOException{
		File data = new File ("numbers.txt");
		FileReader read = new FileReader(data); 
		BufferedReader br = new BufferedReader(read);
		String word; 
		int num; 
		try{
			br = new BufferedReader(read); 
			while((word = br.readLine())!=null)
			{
				num = Integer.parseInt(word); 
				numbers.add(num);
			}
			br.close(); 
			read.close();
		}catch (IOException find){
				System.out.println("Fix it ");
			}
	}

}
