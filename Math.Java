import java.util.Scanner;
public class Ex16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variaibles
		int bridge, person,num1 ,num2 ,num3 ,num4, count = 0,total = 0;
		double dnum1, dnum2, dnum3, dnum4,avg;
		Scanner kb = new Scanner(System.in);
		
		//Asking
		System.out.println("How big is the bridge");
		bridge = kb.nextInt();
		System.out.println("Where is the person");
		person = kb.nextInt();
		
		//Loop
		for (int x = 0;x <50;x++)
		{
			total = total + count;
		do
		{
			dnum1 = (Math.random()*1)+0.25;
			dnum2 = (Math.random()*1)+0.25;
			dnum3 = (Math.random()*1)+0.25;
			dnum4 = (Math.random()*1)+0.25;
			num1 = (int)Math.round(dnum1 * 10)/ 10;
			num2 = (int)Math.round(dnum2 * 10)/ 10;
			num3 = (int)Math.round(dnum3 * 10)/ 10;
			num4 = (int)Math.round(dnum4 * 10)/ 10;
			if (num1 + num2 + num3 + num4 == 0)
			{
				person = person + 0;
				count++;
			}
			else if (num1 + num2 + num3 + num4 == 1)
			{
				person = person -1;
				count++;
			}
			else if (num1 + num2 + num3 + num4 == 2)
			{
				person = person -2;
				count++;
			}
			else if (num1 + num2 + num3 + num4 == 3)
			{
				person = person + 1;
				count++;
			}
			else if (num1 + num2 + num3 + num4 == 4)
			{
				person = person - 2;
				count++;
			}
			else
			{
				person = person + 0;
			}
		}while (person>=0 && person<=bridge);
		}
		avg = total /50;
		System.out.println("After 50 tries it took "+total+" moves and for an average of "+avg);
	}

}
