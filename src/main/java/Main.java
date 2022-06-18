import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();

        /* от 300 до 400 / квадрат *
        количество/
         */

        for (int i = 10; i <= 99; i++) ;
        int count = service.sqrtceil(300, 400);
        System.out.println("Квадратов в диапазоне: " + count);
    }
}

