import java.util.ArrayList;
import java.util.List;

/**
 * Class that represents simple HotDog
 */
class HotDog {
    /**
     * List of components
     */
    private List<HotDogComponent> _components;

    /**
     * Simple designer of HotDog
     */
    public HotDog() {
        this._components = new ArrayList<>();
    }

    /**
     *
     * @return List of components
     */
    public List<HotDogComponent> getComponents() {
        return _components;
    }

    /**
     *
     * @param component New component you want to add
     */
    public void addComponent(HotDogComponent component) {
        _components.add(component);
    }

    /**
     * @return Total HotDog price, includes all the components
     */
    public double calculatePrice() {
        double totalPrice = 0.0;
        for (HotDogComponent component : _components) {
            totalPrice += component.getPrice();
        }
        return totalPrice;
    }
}
