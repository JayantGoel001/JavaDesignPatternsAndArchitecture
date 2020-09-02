public class ConsoleLogWriter implements LogWriter{
    private ConsoleWriter consoleWriter = new ConsoleWriter();
    @Override
    public void out(String text) {
        consoleWriter.writeConsole(text);
    }
}
