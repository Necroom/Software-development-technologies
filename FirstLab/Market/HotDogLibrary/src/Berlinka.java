import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
/**
 *
 */
public class Berlinka extends  HotDog{
    private static List<HotDogComponent> _componentList = new ArrayList<>(Arrays.asList(
            HotDogComponent.Tomato,
            HotDogComponent.Bread,
            HotDogComponent.Sausage,
            HotDogComponent.Ketchup
    ));
    public Berlinka()
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
