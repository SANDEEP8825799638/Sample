//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Game game1=new Game() ;
        Game game2=new Game() ;

        game1.play();
        game2.play();
        System.out.println(game1==game2);

        }
    }
 class Game{

   public Game(){
         System.out.println("instance created");
     }
     public void play(){

    }

}