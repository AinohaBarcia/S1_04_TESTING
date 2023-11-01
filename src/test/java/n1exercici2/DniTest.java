package n1exercici2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

class DniTest {
    @ParameterizedTest
    @CsvSource ({"38149292,C","57897856,W","28349878,D","78430987,K",
            "98786723,K","12324563,J","12324564,Z","93345677,Q","32234562,Q","98899787,V"})

    public void testCalculoLletraDNI(int numeroDni, char lletraEsperada) {
        char lletraCalculada = Dni.calcularLetra(numeroDni);
        assertEquals(lletraEsperada, lletraCalculada, "Lletra incorrecta per al DNI: " + numeroDni);

    }

}