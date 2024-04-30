import java.util.ArrayList;
import java.util.List;

// Class that represents an order
class HotDogOrder {
    private List<HotDog> _hotDogs;

    /**
     * Designer for an order
     */
    public HotDogOrder() {
        this._hotDogs = new ArrayList<>();
    }

    /**
     *
     * @return list of hotDogs
     */
    public List<HotDog> get_hotDogs() {
        return _hotDogs;
    }

    /**
     * @param hotDog  HotDogg Object to add
     */
    public void addHotDog(HotDog hotDog) {
        _hotDogs.add(hotDog);
    }

    /**
     * @return Total order price
     */
    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (HotDog hotDog : _hotDogs) {
            totalPrice += hotDog.calculatePrice();
        }
        return totalPrice;
    }

    /**
     * @return amount of orders
     */
    public int getNumberOfOrders() {
        return _hotDogs.size();
    }

    /**
     * @return average price of entire order
     */
    public double calculateAveragePrice() {
        if (_hotDogs.isEmpty()) {
            return 0.0;
        }
        return calculateTotalPrice() / _hotDogs.size();
    }

    /**
     *
     * @param order Current order
     * @return number of fully filled HotDogs
     */
    public static int CalculateFullHotDogs(HotDogOrder order)
    {
        int counter = 0;
        for (HotDog hotDog : order.get_hotDogs())
            if (HunterDog.isFull(hotDog) || MasterDog.isFull(hotDog) || Berlinka.isFull(hotDog))
            {
                counter++;
            }
        return counter;
    }
}
