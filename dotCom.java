package game;
import java.util.Scanner;

class dotCom {
	int[][] Grid = new int [7][7]; //Grid array not used at this point
	static int Go2[] = new int[3]; 
	static int Pets[] = new int[3];
	static int AskMe[] = new int[3];
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int hit=0;
		
		int guess = 0;
		// Set scanner for key Board and initialize
		
		String contYorN = "Y"; 
		
		int h = 1;           // Feedback counter
				
		while (contYorN.equalsIgnoreCase("y") && hit<9){ // contYorN only used for logic in while loop

			System.out.println("Enter Guess?");
			guess = input.nextInt();
								
			System.out.println("Your Guess Was: " + guess);
			System.out.println(h);
			
			
			h++;
									
			if(guess == 10 || guess == 20 || guess == 30   // B0, C0, D0 = Go2
			|| guess == 31 || guess == 32 || guess == 33   // D1, D2, D3 = Pets
			|| guess == 63 || guess == 64 || guess == 65) { // G3, G4, G5 = AskMe
						System.out.println("Hit!");

			} else {
						System.out.println("Miss!");										
				
			}

	// Input guesses from keyboard and give the user: a guess and 'status hit or miss'
	// Also, counts the # of attempts for feedback.

//-----------------------------------------------------------------Go2
			
			if(guess == 10)	{
			Go2[0] = 10;
			hit++;
			
			}			
			if(guess == 20){
			Go2[1] = 20;
			hit++;
						
			}	
			if(guess == 30){
			Go2[2] = 30;
			hit++;
			
			}
			
			if(Go2[0]==10 && Go2[1]==20 && Go2[2]==30){
			System.out.println("You sunk Go2.com!");	
		
			}
			
//--------------------------------------------------------------------Pets
			
			if(guess == 31){
			Pets[0] = 31;
			hit++;
		
			}		
			if(guess == 32){
			Pets[1] = 32;
			hit++;
		
		
			}
	
			if(guess == 33){
			Pets[2] = 33;
			hit++;
		}

			if(Pets[0]==31 && Pets[1]==32 && Pets[2]==33){
			System.out.println("You sunk Pets.com!");
			
		}
			
//-----------------------------------------------------------------AskMe	
					
			if(guess == 63){			
			AskMe[0] = 63;
			hit++;
	
		}			
			if(guess == 64){		
			AskMe[1] = 64;
			hit++;
			
	
		}

			if(guess == 65){
			AskMe[2] = 65;
			hit++;
		}
		
			if(AskMe[0]==63 && AskMe[1]==64 && AskMe[2]==65){
			System.out.println("You sunk AskMe.com!");
		
			}
		}
		

			if(Go2[0]==10 && Go2[1]==20 && Go2[2]==30 && Pets[0]==31 && Pets[1]==32 && Pets[2]==33 &&
				AskMe[0]==63 && AskMe[1]==64 && AskMe[2]==65){		
				{System.out.println("Game over all .com's killed!");
				System.out.println("User Rating: " + --h + " Guesses");
				
				}
			}
		}
	}	
	
	// Logic part is working somewhat, more work is needed, user rating counter is off by 2
		

