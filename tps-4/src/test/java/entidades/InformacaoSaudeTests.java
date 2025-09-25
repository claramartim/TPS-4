package entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class InformacaoSaudeTests {

@Test
@Transactional
public void TestSalvaTituloConteudoECategoriaEMostraAsInformacoesSalvas(){

    InformacaoSaude informacaosaude = new InformacaoSaude();

    informacaosaude.titulo = "como usar anticoncepcional";
    informacaosaude.conteudo = "dicas de como fazer o uso coretamente do anticoncepcional";
    informacaosaude.categoria = "anticoncepcional";

    informacaosaude.persist();

    Assertions.assertEquals("como usar anticoncepcional", informacaosaude.titulo);


}


}