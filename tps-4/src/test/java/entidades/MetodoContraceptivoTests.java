package entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class MetodoContraceptivoTests {
    
    @Test
    @Transactional
    public void TestSalvaIdNomeTipoEficaciaEDescricaoDoMetodoContraceptivoEMostraAsInformacoesEONomeDoUsuario() {

        MetodoContraceptivo metodocontraceptivo = new MetodoContraceptivo();

        metodocontraceptivo.nome = "Pílula anticoncepcional";
        metodocontraceptivo.tipo = "Oral";
        metodocontraceptivo.eficacia = 0.99 ;
        metodocontraceptivo.descricao = "Uso diário para prevenir a gravidez.";
        
        metodocontraceptivo.persist();

        Assertions.assertEquals("Pílula anticoncepcional", metodocontraceptivo.nome);

    }



}
