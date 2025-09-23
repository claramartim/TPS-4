package entidades;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class CicloMentrualTests {

    @Test 
    @Transactional 
    public void TestSalvaDataInicioDuracaoDoCicloEDuracaoDaMenstruacaoEBuscaAsInformacoesColocadas() {
        CicloMenstrual ciclomenstrual = new CicloMenstrual();

        ciclomenstrual.dataInicio = LocalDate.parse("2025-09-11");
        ciclomenstrual.duracaoCiclo = 21 ;
        ciclomenstrual.duracaoMenstruacao = 7 ;

        ciclomenstrual.persist(); 
        
        Assertions.assertEquals(ciclomenstrual.dataInicio, "2025-09-11");
    }


}