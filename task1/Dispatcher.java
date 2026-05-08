package task1;

import java.util.List;

public class Dispatcher {
    public void printDailyReport(List<DeliveryTask> tasks){
        for (DeliveryTask task : tasks){
            System.out.println(task.calculateTotalCost());
        }
    }
}
