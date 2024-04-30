import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class HunterDog extends HotDog{
    private static List<HotDogComponent> _componentList = new ArrayList<>(Arrays.asList(
       HotDogComponent.Sausage,
       HotDogComponent.Bread,
       HotDogComponent.Ketchup,
       HotDogComponent.Bacon
    ));

    public HunterDog(){}

    /**
     * @param hotDog
     * @return
     */
    public static boolean isFull(HotDog hotDog)
    {
        return Objects.equals(hotDog.getComponents(), _componentList);
    }
}
