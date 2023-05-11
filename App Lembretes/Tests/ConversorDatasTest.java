package Tests;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import Utils.ConversorDatas;

public class ConversorDatasTest {
    @Test
    void testLocalDateParaStringPadraoBrasil() {

        LocalDate dataBruta = LocalDate.of(2050, 10, 5);

        String dataConvertida = ConversorDatas.localDateParaStringPadraoBrasil(dataBruta);

        assertEquals("05/10/2050", dataConvertida);

    }

    @Test
    void testStringParaDataPadraoJava() {

        LocalDate dataExemplo = LocalDate.of(2050, 10, 5);

        String dataString = "05/10/2050";

        LocalDate dataPadraoLocalDate = ConversorDatas.stringParaDataPadraoJava(dataString);

        assertEquals(dataExemplo, dataPadraoLocalDate);

    }
}
