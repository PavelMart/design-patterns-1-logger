import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрацию");

        List<Integer> result = new ArrayList<>();

        for (int i : source) {
            if (i >= treshold) {
                logger.log(String.format("Элемент \"%d\" проходит", i));
                result.add(i);
                continue;
            }
            logger.log(String.format("Элемент \"%d\" не проходит", i));
        }

        logger.log(String.format("Прошло фильтр %d элемента из %d", result.size(), source.size()));

        return result;
    }
}
