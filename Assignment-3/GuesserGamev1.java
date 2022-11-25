import java.util.Scanner;

class Guesser{

    int guessNum;

    int guessNum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser Please guess a number : ");
        guessNum  = scan.nextInt();
        while(!(guessNum < 50 && guessNum > 0 )){
        System.out.println("Invalid Input Please choose number between 1 and 50.");
        guessNum = scan.nextInt();
        }
        return guessNum;
    }

}
class Player{
    int guessNum;

    int guessNum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Player Please guess a number : ");
        guessNum = scan.nextInt();
        while(!(guessNum < 50 && guessNum > 0 )){
            System.out.println("Invalid Input Please choose number between 1 and 50.");
            guessNum = scan.nextInt();
        }
        return guessNum;
    }

}
class Umpire{

    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    int player1Point=0,player2Point=0,player3Point=0;

    void collectNumFromGuesser(){
        Guesser g=new Guesser();
         numFromGuesser = g.guessNum();
        
    }
    void collectNumFromPlayers(){
        Player p1 = new Player();  
        numFromPlayer1 = p1.guessNum();

        Player p2 = new Player();
         numFromPlayer2 = p2.guessNum();
        

        Player p3 = new Player();
         numFromPlayer3 = p3.guessNum();

    }
    void compare(){

        if(numFromGuesser == numFromPlayer1){
            if(numFromGuesser == numFromPlayer2  & numFromGuesser == numFromPlayer3){
                System.out.println("All Players Won the game !!");
            }else if(numFromGuesser == numFromPlayer2){
                System.out.println("Player 1 and Payer 2 Won");
            }
            else if(numFromGuesser == numFromPlayer3){
                System.out.println("Player 1 and 3 Won");
            }
            else{
                System.out.println("Player 1 Won");
            }
        }else if(numFromGuesser == numFromPlayer2){
            if(numFromGuesser == numFromPlayer3){
                System.out.println("Player 2 and 3 Won");
            }else{
                System.out.println("Player 2 Won");
            }
        }else if(numFromGuesser == numFromPlayer3){
            System.out.println("Player 3 Won");
        }else{
            System.out.println("Game lost Try again !!");
        }
    }

    void result(){
    if(numFromPlayer1== numFromGuesser){
        if((numFromPlayer2== numFromGuesser)&&(numFromPlayer3== numFromGuesser)){
            System.out.println("Player 1 Score is : " + (player1Point =+ ++player1Point));
            System.out.println("Player 2 Score is : " + (player2Point =+ ++player2Point));
            System.out.println("Player 3 Score is : " + (player3Point =+ ++player3Point));
        }else if((numFromPlayer1== numFromGuesser) && (numFromPlayer2== numFromGuesser)){
            System.out.println("Player 1 Score is : " + (player1Point =+ ++player1Point));
            System.out.println("Player 2 Score is : " + (player2Point =+ ++player2Point));
            System.out.println("Player 3 Score is : " +  player3Point);
        }else if((numFromPlayer1== numFromGuesser) && (numFromPlayer3== numFromGuesser)){
            System.out.println("Player 1 Score is : " + (player1Point =+ ++player1Point));
            System.out.println("Player 2 Score is : " +  player2Point);
            System.out.println("Player 3 Score is : " + (player3Point =+ ++player3Point));
        }
        else{
            System.out.println("Player 1 Score is : " + (player1Point =+ ++player1Point));
            System.out.println("Player 2 Score is : " +  player2Point);
            System.out.println("Player 3 Score is : " +  player3Point);
        }
    } else if(numFromPlayer2 == numFromGuesser){
        if(numFromPlayer3 == numFromGuesser){
            System.out.println("Player 1 Score is : " +  player1Point);
            System.out.println("Player 2 Score is : " + (player2Point =+ ++player2Point));
            System.out.println("Player 3 Score is : " + (player3Point =+ ++player3Point));
        }else{
            System.out.println("Player 1 Score is : " +  player1Point);
            System.out.println("Player 2 Score is : " + (player2Point =+ ++player2Point));
            System.out.println("Player 3 Score is : " +  player3Point);
        }
    }else if(numFromPlayer3 == numFromGuesser){
            System.out.println("Player 1 Score is : " +  player1Point);
            System.out.println("Player 2 Score is : " +  player2Point);
            System.out.println("Player 3 Score is : " + (player3Point =+ ++player3Point));

    }else{
            System.out.println("Player 1 Score is : " +  player1Point);
            System.out.println("Player 2 Score is : " +  player2Point);
            System.out.println("Player 3 Score is : " +  player3Point);

    }
    }

}


public class GuesserGamev1 {
    public static void main(String[] args) {
        Umpire u = new Umpire();
        System.out.println("****** Starting Round 1 ******");
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
        System.out.println("****** Result of Round 1 ******");
        u.result();

        System.out.println("****** Starting Round 2 ******");
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
        System.out.println("****** Result of Round 2 ******");
        u.result();

        System.out.println();
        System.out.println("And The Winner Is !!!!!!!!!!");
        if((u.player1Point > u.player2Point) || (u.player1Point > u.player3Point)){

            if(u.player1Point == u.player2Point)
            System.out.println("Player 1 And Player 2 Won the game");
            else if(u.player1Point == u.player3Point)
            System.out.println("Player 1 And Player 3 Won the game");
            else
            System.out.println("Player 1 Won the Game !!");
            
        }else if((u.player2Point > u.player1Point) || (u.player2Point > u.player3Point)){

            if(u.player2Point == u.player1Point)
            System.out.println("Player 1 And Player 2 Won the game");
            else if(u.player2Point == u.player3Point)
            System.out.println("Player 1 And Player 3 Won the game");
            else
            System.out.println("Player 2 Won the Game !!");
            
        }else if((u.player3Point > u.player1Point) || (u.player3Point > u.player2Point)){

            if(u.player3Point == u.player1Point)
            System.out.println("Player 1 And Player 3 Won the game");
            else if(u.player3Point == u.player2Point)
            System.out.println("Player 1 And Player 2 Won the game");
            else
            System.out.println("Player 3 Won the Game !!");

        }else{
            System.out.println("Congratulation All Player won the game");
        }
    }
}
