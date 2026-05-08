package task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DeliveryTask> tasks = List.of(
                new StandardDelivery(100, 5, 2),
                new ExpressDelivery(100, 5, 2),
                new HeavyCargoDelivery(100, 5, 20)
        );

        Dispatcher dispatcher = new Dispatcher();

        dispatcher.printDailyReport(tasks);
    }
}
