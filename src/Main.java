public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("����� �����������");

        Logger logger2 = Logger.getInstance();
        logger2.log("����� �����������");

        // ��������, �� ������ ���������� �������
        if (logger1 == logger2) {
            System.out.println("logger1 � logger2 - �� ���� � ��� �� ���������");
        } else {
            System.out.println("logger1 � logger2 - �� ��� ����������");
        }

        // ������ � ������ ������ ��� �����
        logFromDifferentMethod();
    }

    public static void logFromDifferentMethod() {
        Logger logger = Logger.getInstance();
        logger.log("����������� � ������ ������");
    }
}
