package entidades;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InformacaoSaude  extends PanacheEntity{
  

    public String titulo;
    public String conteudo;
    public String categoria;
    public String tags;

}