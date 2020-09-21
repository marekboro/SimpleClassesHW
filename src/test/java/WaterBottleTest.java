import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasVolumeOf100(){
        assertEquals(100,waterBottle.getVolume());
    }

    @Test
    public void hasVolumeOf90afterOneDrink(){
        waterBottle.drink();
        assertEquals(90,waterBottle.getVolume());
    }

    @Test
    public void hasVolumeOf0afterBottleExploded(){
        waterBottle.explode();
        assertEquals(0,waterBottle.getVolume());
    }

    @Test
    public void hasVolumeOf100AfterBeingExplodedAndRematerialised(){
    waterBottle.explode();
    waterBottle.rematerialise();
    assertEquals(100,waterBottle.getVolume());
    }

}
