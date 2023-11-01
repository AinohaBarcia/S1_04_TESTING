package n1exercici1;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class MonthsTest {
    private static ArrayList<String> listMonths;

    @BeforeAll

    static void init() {

        var months = new Months();
        listMonths = months.addMonths();
    }
    @Test

    void findOutSizeMonths(){

        assertEquals(12, listMonths.size());

    }
    @Test

    void notListEmpty(){

        assertNotNull(listMonths);
    }
    @Test
        //Vamos a comprobar que en al posicion 8 està agosto
    void positionEightisOk(){

        assertEquals("August", listMonths.get(7));
    }
}