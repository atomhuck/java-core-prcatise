package task1;

public class HeavyCargoDelivery extends DeliveryTask{
    public HeavyCargoDelivery (int basePrice, int distance, int weight){
        super(basePrice, distance, weight);
    }

    @Override
    public int calculateTotalCost() {
        if (getWeight() > 15){
            int overWeight = getWeight() - 15;
            return (getBasePrice() + (getDistance() * 10)) + overWeight * 5;
        }
        return getBasePrice() + (getDistance() * 10);
    }
}
