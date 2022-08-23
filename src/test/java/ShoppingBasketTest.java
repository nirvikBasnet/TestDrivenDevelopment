import ShoppingBasket.ShoppingBasket;
import ShoppingBasket.Item;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingBasketTest {

    //builder method
    private ShoppingBasket buildShoppingBasket(Item... items) {
        return new ShoppingBasket(Arrays.asList(items));
    }

    @Test
    public void totalOfEmptyBasket(){
        ShoppingBasket basket = buildShoppingBasket();
        assertEquals(0.0,basket.getTotal(),0.0);
    }

    @Test
    public void totalOfSingleItem(){
        ShoppingBasket basket = buildShoppingBasket(new Item(100.0, 1));
        assertEquals(100.0,basket.getTotal(),0.0);
    }

    @Test
    public void totalOfTwoItems(){
        ShoppingBasket basket = buildShoppingBasket(new Item(100.0,2),new Item(200.0,1));
        assertEquals(400.0,basket.getTotal(),0.0);
    }

    @Test
    public void totalOfItemWithQuantityTwo(){
        ShoppingBasket basket = buildShoppingBasket(new Item(100.0,2));
        assertEquals(2,basket.getTotalItem(),0.0);
    }


}
