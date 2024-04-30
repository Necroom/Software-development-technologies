public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Creating hotDogs
        HunterDog hunterDog = new HunterDog();
        hunterDog.addComponent(HotDogComponent.Sausage);
        hunterDog.addComponent(HotDogComponent.Bread);
        hunterDog.addComponent(HotDogComponent.Ketchup);
        hunterDog.addComponent(HotDogComponent.Bacon);

        MasterDog masterDog = new MasterDog();
        masterDog.addComponent(HotDogComponent.Sausage);
        masterDog.addComponent(HotDogComponent.Bread);

        Berlinka berlinka = new Berlinka();
        berlinka.addComponent(HotDogComponent.Sausage);
        berlinka.addComponent(HotDogComponent.Bread);
        berlinka.addComponent(HotDogComponent.Ketchup);
        berlinka.addComponent(HotDogComponent.Sausage);

        // Creating an order and adding HotDogs
        HotDogOrder order = new HotDogOrder();
        order.addHotDog(hunterDog);
        order.addHotDog(masterDog);
        order.addHotDog(berlinka);

        // Conclusion results
        System.out.println("Total price of the order: $" + order.calculateTotalPrice());
        System.out.println("Number of orders: " + order.getNumberOfOrders());
        System.out.println("Average price of orders: $" + order.calculateAveragePrice());
        System.out.println("Number of Full HotDogs: " + HotDogOrder.CalculateFullHotDogs(order));
    }


}
