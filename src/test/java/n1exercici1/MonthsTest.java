package n1exercici1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class MonthsTest {
    @Test

    void findOutSizeMonths(){
        var listMonths = new Months();
        assertEquals(12, listMonths.addMonths().size());
    }
    @Test

    void notListEmpty(){
        var listMonths = new Months();
        assertNotNull(listMonths);
    }
    @Test
        //Vamos a comprobar que en al posicion 8 està agosto
    void positionEightisOk(){
        var listMonths = new Months();
        assertEquals("August", listMonths.addMonths().get(7));
    }
}