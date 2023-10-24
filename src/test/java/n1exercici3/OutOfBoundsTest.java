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
        nameList.add("Maria");
        nameList.add("Pedro");


        try {
            outOfBounds.getElementAtIndex(nameList, 10);
        } catch (IndexOutOfBoundsException e) {

            return;
        }
        throw new AssertionError("No se ha lanzado IndexOutOfBoundsException");
    }

}