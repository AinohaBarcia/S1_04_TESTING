package n1exercici3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class OutOfBoundsTest {
    @Test
    void isExceptionOutOfBoundsRunCorrect() {

        var outOfBounds = new OutOfBounds();

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Carla");
        nameList.add("Eyren");
        nameList.add("Emma");
        nameList.add("Alana");

        assertThrows(IndexOutOfBoundsException.class, () -> {
            outOfBounds.getElementAtIndex(nameList, 10);
        });
    }
}
