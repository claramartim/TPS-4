package entidades;

import java.time.LocalDate;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class CicloMenstrual  extends PanacheEntity{
  
  
    public LocalDate dataInicio;
    public int duracaoCiclo;
    public int duracaoMenstruacao;

    @ManyToOne
    public Usuario usuario;


}