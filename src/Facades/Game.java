public class Game {
    private InputSystem inputSystem = new InputSystem();
    private GameObjects gameObjects = new GameObjects();
    private GameConsole gameConsole = new GameConsole();

    public void update(){
        inputSystem.getInput();
        gameObjects.update(inputSystem);
        gameConsole.draw(gameObjects);
    }
}
