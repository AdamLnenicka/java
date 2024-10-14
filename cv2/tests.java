import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BackpackTest {

    @Test
    void testPutItem() {
        Backpack backpack = new Backpack(100, 150);
        assertTrue(backpack.putItem(new Item(50, 75)));
        assertFalse(backpack.putItem(new Item(51, 76)));
        assertTrue(backpack.putItem(new Item(50, 75)));
    }
}

class RectangleTest {

    @Test
    void testRectangleCreation() {
        Rectangle rect = new Rectangle(3, 5);
        assertEquals(15, rect.getArea());
        assertEquals(16, rect.getPerimeter());

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(-1, 5);
        });

        assertTrue(exception.getMessage().contains("positive numbers"));
    }

    @Test
    void testInstanceCount() {
        assertEquals(1, Rectangle.getInstanceCount()); // Assuming one instance created in a previous test
    }
}
