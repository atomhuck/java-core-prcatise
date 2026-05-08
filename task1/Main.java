package task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DeliveryTask> tasks = new ArrayList<>();
        tasks.add(new StandardDelivery(100, 5, 2));
        tasks.add(new ExpressDelivery(100, 5, 2));
        tasks.add(new HeavyCargoDelivery(100, 5, 20));

        Dispatcher dispatcher = new Dispatcher();

        dispatcher.printDailyReport(tasks);
    }
}
