public class AdapterPattern {
    public static void main(String[] args) {
        //Composition
        ConsoleLogWriter consoleWriter = new ConsoleLogWriter();
        Logger logger = new Logger(consoleWriter);
        logger.write("Hello");

        //Inheritance
        ConsoleLogWriter consoleLogWriter2 = new ConsoleLogWriter();
        Logger logger2 = new Logger(consoleLogWriter2);
        logger2.write("Hello2");
    }
}
