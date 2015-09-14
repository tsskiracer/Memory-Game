import java.util.*;
public class MemoryGame
	{
		static String showCards[][]=new String[4][4];
		static String hidCards[][] = new String[4][4];
		public static void main(String[] args)
			{	
				userBoard();
				createAnswer();
				fillBoard();
				display();		
				
				
			}
		public static void display()
		{
			System.out.println("         1           2           3           4     ");
			System.out.println("    _______________________________________________");
			System.out.println("   |           |           |           |           |");	
			System.out.println("   |           |           |           |           |");	
			System.out.println(" A |   "+showCards[0][0]+"    |   "+showCards[0][1]+"    |   "+showCards[0][2]+"    |   "+showCards[0][3]+"    |");	
			System.out.println("   |           |           |           |           |");	
			System.out.println("   |___________|___________|___________|___________|");
			System.out.println("   |           |           |           |           |");	
			System.out.println("   |           |           |           |           |");	
			System.out.println(" B |   "+showCards[1][0]+"    |   "+showCards[3][1]+"    |   "+showCards[1][2]+"    |   "+showCards[1][3]+"    |");	
			System.out.println("   |           |           |           |           |");	
			System.out.println("   |___________|___________|___________|___________|");
			System.out.println("   |           |           |           |           |");	
			System.out.println("   |           |           |           |           |");	
			System.out.println(" C |   "+showCards[2][0]+"    |   "+showCards[2][1]+"    |   "+showCards[2][2]+"    |   "+showCards[2][3]+"    |");	
			System.out.println("   |           |           |           |           |");	
			System.out.println("   |___________|___________|___________|___________|");
			System.out.println("   |           |           |           |           |");	
			System.out.println("   |           |           |           |           |");	
			System.out.println(" D |   "+showCards[3][0]+"    |   "+showCards[3][1]+"    |   "+showCards[3][2]+"    |   "+showCards[3][3]+"    |");	
			System.out.println("   |           |           |           |           |");	
			System.out.println("   |___________|___________|___________|___________|");
		}
				
				
				
				
		public static void createAnswer()
			{
			ArrayList<String> words = new ArrayList<String>();
				words.add("Bike");
				words.add("Tens");
				words.add("Tank");
				words.add("Cars");
				words.add("shed");
				words.add("lead");
				words.add("Aero");
				words.add("Goat");
				words.add("Bike");
				words.add("Tens");
				words.add("Goat");
				words.add("lead");
				words.add("shed");
				words.add("Aero");
				words.add("Tank");
				words.add("Cars");
				Collections.shuffle(words);
			}
			
		public static void fillBoard()
		{
			for(int row=0; row<showCards.length; row++)
				{
					for (int col = 0; col<showCards[0].length; col++)
						{
							
							showCards[row][col]="    ";
							
							
							
						}
				}
			
		}
		public static void userBoard()
			{
				int firstRowChoice = 0;
				Scanner userInput = new Scanner (System.in);
				String choice = userInput.nextLine();
				for(int row=0; row<showCards.length; row++)
					{
						for (int col = 0; col<showCards[0].length; col++)
							{
								switch (choice.substring(0,1))
									{
										case "A": 
										case "a":
												{
													firstRowChoice = 0;
													break;
												}
										case "B": 
										case "b":
												{
													firstRowChoice = 1;
													break;
												}
												
										case "C": 
										case "c":
												{
													firstRowChoice = 2;
													break;
												}
										case "D": 
										case "d":
												{
													firstRowChoice = 3;
													break;
												}
							
									}
							
								
								
							}
					}
				
			}
		
	}
