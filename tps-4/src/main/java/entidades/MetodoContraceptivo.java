package entidades;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class MetodoContraceptivo  extends PanacheEntity{
  
 
    public String nome;
    public String tipo;
    public Double eficacia;
    public String descricao;

    @ManyToOne
    public Usuario usuario;

}