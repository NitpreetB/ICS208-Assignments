package criterionb;     

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Scanner;
public class criterionb {	                           
	private static void introduction(){

//Nitpreet
		
		System.out.println("Please select one of the following options by typing the corresponding numeric value.");
		System.out.println("1. Display the whole chart.");
		System.out.println("2. Gaming mice with an excellent sensor.");
		System.out.println("3. Gaming mice built for large sized hands.");
		System.out.println("4. Gaming mice that are cheaper than 90 dollars");
		System.out.println("5. Gaming mice optimized for specifically FPS games.");
		System.out.println("6. Edit the text file.");
		System.out.println("7. Quit.");
	}
	private static void wholechart(String []names,String []size,String []sWeight,String []sensor,String []games,String []sCurrentprice,String []sRank) {
		Scanner input= new Scanner(System.in);
		String sContinuer;
		int continuer;
		System.out.format("\n%27s\t%4s\t%15s\t%15s\t%10s\t%15s\t%8s","Mouse","Size","Weight in grams","Sensor Rating","Game Type","Current Price","Ranking");
	 	for (int i=0;i<20;i++){ 		
			System.out.format("\n%27s\t%4s\t%15s\t%15s\t%10s\t%15s\t%8s",names[i],size[i],sWeight[i],sensor[i],games[i],sCurrentprice[i],sRank[i]);
	 	}
	}

	private static void nicesensor(String []names,String []sensor) {
		Scanner input= new Scanner(System.in);
		String excellentsensor="Excellent", sContinuer;
		int continuer;
		System.out.format("\n%27s\t%15s","Mouse","Sensor Rating");
		
	 	for (int i=0;i<20;i++){ 
	 		if (sensor[i].equals(excellentsensor)){
	 			System.out.format("\n%27s\t%15s",names[i],sensor[i]);
	 		}
			
	 	}
	 	
}	
	private static void largesize(String []names,String []size) {
		Scanner input= new Scanner(System.in);
		String largesize="L", sContinuer;
		int continuer;
		System.out.format("\n%27s\t%4s","Mouse","Size");
		
	 	for (int i=0;i<20;i++){ 
	 		if (size[i].equals(largesize)){
	 			System.out.format("\n%27s\t%4s",names[i],size[i]);
	 		}
			
	 	}
	 	
	}

private static void pricecheck(String []names, String []sCurrentprice, int []currentprice) {
	System.out.format("\n%27s\t%15s","Mouse","Current Price");
	
 	for (int i=0;i<20;i++){ 
 		if (currentprice[i]<90){
 			System.out.format("\n%27s\t%15s",names[i],sCurrentprice[i]);
 		}
		
 	}
}
	private static void gametype(String []names, String []games) {
		System.out.format("\n%27s\t%10s","Mouse","Game Type");
 		for (int i=0;i<20;i++){ 
	 		if (games[i].equals("FPS")){
	 			System.out.format("\n%27s\t%10s",names[i],games[i]);
	 		}
			
	 	}
	}
	public static void editfile(String filepath,String []names,String []size,String []sWeight,String []sensor,String []games,String []sCurrentprice,String []sRank,int []currentprice) {
		
		Scanner input = new Scanner (System.in);
		String sMousechange, sNewprice, oldprice;
		int mousechange;
		System.out.println("Which mouse price would you like to edit?");
 		System.out.print("\n(1.) Logitech G Pro Wireless (2.) Finalmouse Ninja Air58 (3.) Zowie S Series (4.) Logitech G403 (5.) Zowie FK Series \n(6.) Logitech G305 (7.) SteelSeries Rival 600 (8.) Zowie EC-B Series (9.) SteelSeries Rival 310 10. DM1 FPS \n(11.) Razer Mamba Wireless/Elite (12.) Razer DeathAdder Elite (13.) Cougar Revenger S (14.) Ninox Venator(Black) (15.) Zowie ZA Series \n(16.) SteelSeries Sensei 310 (17.) Logitech Pro G102/G203 (18.) Roccat Kone Pure Owl-Eye (19.) Nixeus Revel (20.) CoolerMaster MM530 \n[Please enter the numeric value that correspond with the mouse that needs a price change]:");
 		sMousechange=input.nextLine();
 		mousechange=Integer.parseInt(sMousechange);
 		mousechange-=1;
 		System.out.println();
 		System.out.println("The current price of "+names[mousechange]+" is $"+currentprice[mousechange]+". Please enter the new price of the mouse to change the current price: ");
 		sNewprice=input.nextLine();
 		oldprice=sCurrentprice[mousechange];
 		sCurrentprice[mousechange]=sNewprice;
 	
          	try{
          		
          		FileWriter out=new FileWriter(filepath);
                 	BufferedWriter writeFile = new BufferedWriter(out);
                 	for (int i=0;i<20;i++){ 
            				
            					writeFile.write(names[i]+";"+size[i]+";"+sWeight[i]+";"+sensor[i]+";"+games[i]+";"+sCurrentprice[i]+";"+sRank[i]);
           	                 	writeFile.newLine();
     
                 	}
                 	
                 	writeFile.close();
                 	out.close();
                 	
                 	System.out.println("The price of the "+names[mousechange]+" has been updated to the file. Thanks for keeping us updated!");
          	}catch (IOException e){
                 	System.out.println("Problem writing to file.");
                 	System.err.println("IOException: " + e.getMessage());
          	}  	
		
		
	
}
		
public static void main(String[] args) {
		String phrase;  
		String filepath = "bruh.txt";
		String []names=new String[20];
		String []sRank=new String[20];
		int []rank=new int[20];
		String []sensor=new String[20];
		String []size=new String[20];
		String []sWeight=new String[20];
		int []weight=new int[20];
		String []sCurrentprice=new String[20];
		int []currentprice=new int[20];
		String []games=new String[20];
		String sUser;
		String sContinuer;
		int continuer;
		String sEditfile;
		int editfile;
		int user;

		System.out.println("Welcome to the World of Gaming Mice! Assuming that you are with the curiousity of which mouse \nis best for you, we have collected the top 20 overall best rated mouses that you can choose from.");
		
		try {
			FileReader in = new FileReader("bruh.txt"); 
			BufferedReader readFile = new BufferedReader(in);
			Scanner input=new Scanner(System.in);
			for (int i=0;i<20;i++){ 	
				phrase= readFile.readLine();
				StringTokenizer s=new StringTokenizer(phrase,";");  
				String values[] =phrase.split(";");
    		 
    			 	names[i]=s.nextToken();
    			 	size[i]=s.nextToken();
    			 	sWeight[i]=s.nextToken();
    			 	weight[i]=Integer.parseInt(sWeight[i]);
    			 	sensor[i]=s.nextToken();
    			 	games[i]=s.nextToken();
    			 	sCurrentprice[i]=s.nextToken();
    			 	currentprice[i]=Integer.parseInt(sCurrentprice[i]);
    			 	sRank[i]=s.nextToken();
    			 	rank[i]=Integer.parseInt(sRank[i]);
    				
    			 	
			}
			readFile.close();
			in.close();	
			do { 
			introduction();
			sUser=input.nextLine();
			user=Integer.parseInt(sUser);
			if (user==1){ 
			wholechart(names,size,sWeight,sensor,games,sCurrentprice,sRank);
			System.out.print("\n Would you like to continue the program?(Press any key to continue, press 7 to quit):");
		 	sContinuer=input.nextLine();
		 	continuer=Integer.parseInt(sContinuer);
		 	if (continuer==7){
		 		break;
		 	}
		 	else {
		 		
		 		}
		 	}
			
			else if (user==2){ 
				nicesensor(names,sensor);
				System.out.print("\n Would you like to continue the program?(Press any key to continue, press 7 to quit):");
			 	sContinuer=input.nextLine();
			 	continuer=Integer.parseInt(sContinuer);
			 	if (continuer==7){
			 		break;
			 	}
			 	else {
			 		
			 		}
			 	}
			
	else if (user==3){ 
				largesize(names,size);
				System.out.print("\n Would you like to continue the program?(Press any key to continue, press 7 to quit):");
			 	sContinuer=input.nextLine();
			 	continuer=Integer.parseInt(sContinuer);
			 	if (continuer==7){
			 		break;
			 	}
			 	else {
			 		
			 		}
			 	}
	
				
	else if (user==4){ 
		pricecheck(names,sCurrentprice,currentprice);
			 	System.out.print("\n Would you like to continue the program?(Press any key to continue, press 7 to quit):");
			 	sContinuer=input.nextLine();
			 	continuer=Integer.parseInt(sContinuer);
			 	if (continuer==7){
			 		break;
			 	}
			 	else {
			 		
			 	}
	}

			 	else if (user==5) {
			 		gametype(names,games);
			 		System.out.print("\n Would you like to continue the program?(Press any key to continue, press 7 to quit):");
				 	sContinuer=input.nextLine();
				 	continuer=Integer.parseInt(sContinuer);
				 	if (continuer==7){
				 		break;
				 	}
				 	else {
				 		
				 	}
			 	}
			 	
		
	else if (user==6){ 
		System.out.println("Select what you would like to edit by corresponding with the numeric value:");
		System.out.println("1. Update the current prices for any mouse");
		System.out.println("2. Go back");
		System.out.println("3. Quit");
		sEditfile=input.nextLine();
		editfile=Integer.parseInt(sEditfile);
		
		
		if (editfile==1) {
			
			
			
			editfile(filepath,names,size,sWeight,sensor,games,sCurrentprice,sRank,currentprice);
		}
		
		else if (editfile==2){
			
		}
		else {
			break;
		}
		
			 	System.out.print("\nWould you like to continue the program?(Enter any key to continue, enter 7 to quit):");
			 	sContinuer=input.nextLine();
			 	continuer=Integer.parseInt(sContinuer);
			 	if (continuer==7){
			 		break;
			 		
			 	}
			 	else {
			 		
			 	}
	}
		
	
    			 	}while (user!=7);
    			System.out.println("Thanks for stopping by! We hope you were able to find a gaming mouse that is ideal for you. Come back anytime! :)");
			
		}catch (IOException e) {
			System.out.println("Problem reading file.");
    			System.err.println("IOException: " + e.getMessage());
		} 
	}

}
