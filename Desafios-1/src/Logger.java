public class Logger {
    private static Logger instance;
    private String logFile;

    private Logger() {
        // Evite a criação de instâncias diretamente.
        logFile = "application.log";
    }

    public static Logger getInstancia() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    public void log(String message) {
        
        System.out.println("Login: " + message);
    }

    public String getLogFile() {
        return logFile;
    }
}
