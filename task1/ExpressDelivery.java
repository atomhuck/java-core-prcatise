package task1;

public class ExpressDelivery extends DeliveryTask{
    public ExpressDelivery(int basePrice, int distance, int weight){
        super(basePrice, distance, weight);
    }
    @Override
    public int calculateTotalCost() {
        return (getBasePrice() + (getDistance() * 10)) * 2;
    }
}
