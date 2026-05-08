package task1;

import java.util.List;

public class Dispatcher {
    public void printDailyReport(List<DeliveryTask> tasks){
        int totalRevenue = 0;
        for (DeliveryTask task : tasks){
            totalRevenue += task.calculateTotalCost();
        }
        System.out.println(totalRevenue);
    }
}
