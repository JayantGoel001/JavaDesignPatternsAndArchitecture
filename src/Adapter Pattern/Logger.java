public class Logger {
    public LogWriter logWriter;

    public Logger(LogWriter logWriter){
        this.logWriter = logWriter;
    }
    public void write(String text){
        System.out.println(text);
    }
}
