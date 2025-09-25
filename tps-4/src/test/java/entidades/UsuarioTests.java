package entidades;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class UsuarioTests {
    
    @Test
    @Transactional
    public void TestSalvaNomeEmailSenhaDataNascimentoGeneroEPreferenciaNotificacaoDoUsuarioEmostraInformacoesSalvas() {

        Usuario usuario = new Usuario();

        usuario.nome = "Ana Silva";
        usuario.email ="ana.silva@gmail.com";
        usuario.senha = "senha_hash1";
        usuario.dataNascimento = LocalDate.parse("1995-05-10");
        usuario.genero = "Feminino";
        usuario.preferenciaNotificacao = true;

        usuario.persist();

        Assertions.assertEquals("Ana Silva", usuario.nome);
    }
}
