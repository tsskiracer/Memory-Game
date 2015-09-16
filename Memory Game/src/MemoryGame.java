import java.util.*;
public class MemoryGame
	{
		static String showCards[][]=new String[4][4];
		static String hidCards[][] = new String[4][4];
		static ArrayList<String> words = new ArrayList<String>();
		static String hidArray[][]=new String[4][4];
		static int counter=0;
		static int secondRowChoice, secondColChoice, firstRowChoice, firstColChoice;
		
		
		public static void main(String[] args) throws InterruptedException
		
			{	
				fillBoard();
				createAnswer();	
				hidArray();
				display();
				userBoard();
				check(); 
				
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
		
		public static void hidArray()
		{
			
			int counter=0;
			for(int row=0; row<showCards.length; row++)
				{
					for (int col = 0; col<showCards[0].length; col++)
						{
							hidArray[row][col]=words.get(counter);
							counter++;
							
							
						}
				}
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
				Scanner userInput = new Scanner (System.in);
				System.out.println("Please input your chosen coordinates."); 
				String choice = userInput.nextLine();
				char rows=choice.charAt(0);	
				switch (rows)
				{
					case 'A': 
					case 'a':
													
						firstRowChoice = 0;
						break;
												
					case 'B': 
					case 'b':
												
						firstRowChoice = 1;
						break;
																				
					case 'C': 
					case 'c':
												
						firstRowChoice = 2;
						break;
												
					case 'D': 
					case 'd':
												
						firstRowChoice = 3;
						break;
									
			}
				firstColChoice = Integer.parseInt(choice.substring(1)) - 1;		
				showCards[firstRowChoice][firstColChoice]=hidArray[firstRowChoice][firstColChoice];
				display(); 
				
				Scanner userInputTwo = new Scanner (System.in);
				System.out.println("Please input your chosen coordinates."); 
				String choiceTwo = userInput.nextLine();
				char rowsTwo=choiceTwo.charAt(0);	
				switch (rowsTwo)
				{
					case 'A': 
					case 'a':
													
						secondRowChoice = 0;
						break;
												
					case 'B': 
					case 'b':
												
						secondRowChoice = 1;
						break;
																				
					case 'C': 
					case 'c':
												
						secondRowChoice = 2;
						break;
												
					case 'D': 
					case 'd':
												
						secondRowChoice = 3;
						break;
									
			}
				 secondColChoice = Integer.parseInt(choiceTwo.substring(1)) - 1;		
			
			showCards[secondRowChoice][secondColChoice]=hidArray[secondRowChoice][secondColChoice];
			display();	
			counter++;
		}
		public static void check() throws InterruptedException 
		{
			if(!showCards[firstRowChoice][firstColChoice].equals(showCards[secondRowChoice][secondColChoice]))
				{
					
					Thread.sleep(3000);
					showCards[firstRowChoice][firstColChoice]="    ";
					showCards[secondRowChoice][secondColChoice]="    ";
					display();
				}
			if(showCards==hidCards)
				{
					System.out.println("You have won! It took you "+ counter+ "tries.");
				}
		}
	}