public class ConsoleLogWriter implements LogWriter{
    private final ConsoleWriter consoleWriter = new ConsoleWriter();
    @Override
    public void out(String text) {
        consoleWriter.writeConsole(text);
    }
}
