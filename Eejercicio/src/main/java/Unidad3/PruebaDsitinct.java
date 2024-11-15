package Unidad3;
import java.util.Arrays;

public class PruebaDsitinct {
    public static void ejecuter() {

        int original[] = {1,1,2,2,3,4,9,9};

        System.out.println(Arrays.toString(original));

        int limpio[] = Arrays.stream(original).distinct().toArray();

        System.out.println(Arrays.toString(limpio));
    }
}
