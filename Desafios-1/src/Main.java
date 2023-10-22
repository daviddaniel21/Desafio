public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Mensagem de teste 1");
        
        Logger anotherLogger = Logger.getInstance();
        anotherLogger.log("Mensagem de teste 2");
        
        System.out.println("Arquivo de log: " + logger.getLogFile()); // Deve imprimir "Arquivo de log: application.log"
    }
}
