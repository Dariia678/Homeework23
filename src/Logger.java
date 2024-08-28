public class Logger {
    // Єдиний екземпляр класу, який буде створений
    private static Logger instance;

    // Приватний конструктор, щоб заборонити створення нових екземплярів ззовні
    private Logger() {
        // Ініціалізація, якщо потрібно
    }

    // Статичний метод для отримання єдиного екземпляру класу
    public static Logger getInstance() {
        if (instance == null) {
            // Якщо екземпляр ще не створено, створюємо його
            instance = new Logger();
        }
        return instance;
    }

    // Метод для запису повідомлень логування
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
