package neoflex.singelton;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void classLog(Object obj, String info) {
        String className = obj.getClass().getSimpleName();
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yy HH:mm:ss"));
        System.out.println("Log info: " + timestamp + " - " + className + " - " + info);
    }
}
