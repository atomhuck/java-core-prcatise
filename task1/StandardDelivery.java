package task1;

public class StandardDelivery extends DeliveryTask{
    public StandardDelivery(int basePrice, int distance, int weight){
        super(basePrice, distance, weight);
    }
    @Override
    public int calculateTotalCost(){
        return getBasePrice() + (getDistance() * 10);
    }
}
