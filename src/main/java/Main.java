import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.print("Введите размер списка: ");
        int listSize = scanner.nextInt();

        System.out.print("Введите верхнюю границу для значений:");
        int maxValue = scanner.nextInt();

        logger.log("Создаём и наполняем список");

        Random random = new Random();
        List<Integer> sourceList = new ArrayList<>();

        for (int i = 0; i < listSize; i++) {
            sourceList.add(random.nextInt(maxValue));
        }

        showList("Вот случайный список: ", sourceList);

        logger.log("Просим пользователя ввести входные данные для фильтрации");

        System.out.print("Введите порог для фильтра: ");
        int treshold = scanner.nextInt();

        Filter filter = new Filter(treshold);

        List<Integer> filteredList = filter.filterOut(sourceList);

        logger.log("Выводим результат на экран");

        showList("Отфильтрованный список: ", filteredList);

        logger.log("Завершаем программу");
    }

    public static void showList(String msg, List<Integer> list) {
        System.out.print(msg);
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
