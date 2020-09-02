public class Facades {
    public static void main(String[] args) {
        Game game = new Game();
        int i=0;
        while (i<10){
            game.update();
            i++;
        }
    }
}
