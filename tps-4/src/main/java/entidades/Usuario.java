package entidades;

import java.time.LocalDate;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario  extends PanacheEntity{

   
   
    public String nome;
    public String email;
    public String senha;
    public LocalDate dataNascimento;
    public String genero;
    public Boolean preferenciaNotificacao;

}