package entidades;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class RegistroDiarioTests {
    
    @Test
    @Transactional
    public void TesteSalvaRegistroDeDataHumorSintomasEmocoesEDoencasDoUsuarioEMostraInformacoes() {

        RegistroDiario registrodiario = new RegistroDiario();
        
        registrodiario.data = LocalDate.parse("2025-09-01");
        registrodiario.humor = "Cansada";
        registrodiario.emocoes = "tristeza";
        registrodiario.sintomas = "dor de cabeça";
        registrodiario.doencas = "nenhuma";

        registrodiario.persist();

        Assertions.assertEquals("Cansada", registrodiario.humor);

    }
}
