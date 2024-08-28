public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Перше повідомлення");

        Logger logger2 = Logger.getInstance();
        logger2.log("Друге повідомлення");

        // Перевірка, чи обидва екземпляри однакові
        if (logger1 == logger2) {
            System.out.println("logger1 і logger2 - це один і той же екземпляр");
        } else {
            System.out.println("logger1 і logger2 - це різні екземпляри");
        }

        // Виклик з іншого методу або класу
        logFromDifferentMethod();
    }

    public static void logFromDifferentMethod() {
        Logger logger = Logger.getInstance();
        logger.log("Повідомлення з іншого методу");
    }
}
