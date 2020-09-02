public class AdapterPattern {
    public static void main(String[] args) {
        ConsoleLogWriter consoleWriter = new ConsoleLogWriter();
        Logger logger = new Logger(consoleWriter);
        logger.write("Hello");
    }
}
