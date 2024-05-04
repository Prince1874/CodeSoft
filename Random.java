package code_soft.java.random_game;
import java.lang.Math;
import java.util.Scanner;

class Random{
    
    static String BrightRed = "\u001b[31;1m";
    static String BrightWhite = "\u001b[37;1m";
    static String BrightMagenta = "\u001b[35;1m";
    static String Reset = "\u001b[0m";

     public static void Clear(){
         System.out.print("\033c");
    }
    


    public  void Template(){

            System.out.println(BrightMagenta + "\n\n\t\t---------------WELCOME TO RANDOM GAME---------------" + Reset);
            System.out.println(BrightRed + "\n\n\nRules of the Game:" + Reset);
            System.out.println(BrightWhite + "\t1.Guess a Number in range 1 To 100.");
            System.out.println("\t2.You have 3 life to guess correct answer.");
            System.out.println("\t3.Each right guess Award's you with a point\n\n" + Reset);
            Random r = new Random();
            r.Menu();
    }

   public void Menu(){
       
       Scanner sc = new Scanner(System.in);
       System.out.print("\n\n1.Start Game\n2.Check Curruent Points\n3.Exit");
       System.out.print("\n\nChoose an Option: ");
       int choice = sc.nextInt();

       switch(choice){

         case 1: 
            GenerateRandom();
            break;
         case 2:
            Score();
            break;
         case 3:
            System.exit(0);
            break;
         default: 
            System.out.println("Invalid Choice..?");
            break;         
       }


    }

	public void GenerateRandom()
	{
		int max = 100;
		int min = 1;
		int range = max - min + 1;
		int rand = (int)(Math.random() * range) + min;

        Scanner sc = new Scanner(System.in);
         int count=1;
         int guess=0;
         while(count<=3){
                System.out.print("\n\nEnter Your Guess: ");
                guess = sc.nextInt();
            
                if(rand == guess){
        
                    System.out.println("Right Guess..!!"); 
                    System.out.println("Your Guess: " + guess);    
                    System.out.println("Random Number: " + rand); 
                    break;                   

                }
                else{

                    
                    if(guess<rand){
                        int low=rand-guess;
                        if(low<5){
                            System.out .println("Too Low..!");
                        }
                        else{
                            System.out .println("So close..!");
                        }
                    }else if(guess>rand){
                        int high=guess-rand;
                        if(high>5){
                            System.out .println("Too High..!");
                        }else{
                            System.out .println("So  Close.!");
                        }
                    }
                    count++;
                }

        
         }
         Clear(); 
         System.out.println("Random Number: " + rand);   
         System.out.println("\n\n");
         Template();
         Menu();   

	
	}

    public void Score(){
            System.out.println("New Change");
    }
}
