package task1;

abstract class DeliveryTask {
    private int basePrice;
    private int distance;
    private int weight;
    public DeliveryTask(int basePrice, int distance, int weight){
        this.basePrice = basePrice;
        this.distance = distance;
        this.weight = weight;
    }
    public int getBasePrice(){
        return this.basePrice;
    }
    public int getDistance(){
        return this.distance;
    }
    public int getWeight(){
        return this.weight;
    }
    public abstract int calculateTotalCost();
}
