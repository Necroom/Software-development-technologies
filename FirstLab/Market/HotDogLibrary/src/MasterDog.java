import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MasterDog extends HotDog{
    private static List<HotDogComponent> _componentList = new ArrayList<>(Arrays.asList(
            HotDogComponent.Bread,
            HotDogComponent.Sausage,
            HotDogComponent.Bacon,
            HotDogComponent.Beef,
            HotDogComponent.Carrot,
            HotDogComponent.Ketchup
    ));
    public MasterDog()
    {

    }

    /**
     * @param hotDog
     * @return
     */
    public static boolean isFull(HotDog hotDog)
    {
        return Objects.equals(hotDog.getComponents(), _componentList);
    }
}

