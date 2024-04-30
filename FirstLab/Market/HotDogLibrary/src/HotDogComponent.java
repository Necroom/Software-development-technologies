/**
 * Enum that represents types of HotDogComponents
 */
public enum HotDogComponent {
    Sausage(2.0),
    Bread (1.0),
    Ketchup( 0.5),
    Bacon(0.6),
    Carrot(0.4),
    Beef(1.0),
    Tomato(0.8);

    /**
     * represents price of the component
     */
    private final double price;

    /**
     * Designer for a component
     * @param price component price
     */
    HotDogComponent(double price) {
        this.price = price;
    }

    /**
     *
     * @return price of current component
     */
    public double getPrice() {
        return price;
    }
}