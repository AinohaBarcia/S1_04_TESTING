package n1exercici2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class DniTest {
    @ParameterizedTest
    @ValueSource(ints = {43428656,38149292,57897856,28349878,78430987,98786723,12324563,12324563,93345677,32234562,98899787})

    public void isLetterDniCorrect(int numDni) {
        var dniList = new Dni();

        char calculatedLetter = dniList.calcularLetra(numDni);

        char expectedLetter = obtenerLetraEsperada(numDni);
        assertEquals(expectedLetter,calculatedLetter);
    }
    private char obtenerLetraEsperada(int numDni) {
        String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int numDNI= numDni;
        int resto =numDNI%23;

        return caracteres.charAt(resto);

    }

}