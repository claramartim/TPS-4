package entidades;

import java.time.LocalDate;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class RegistroDiario  extends PanacheEntity{
   
  
    public LocalDate data;
    public String humor;
    public String emocoes; 
    public String sintomas; 
    public String doencas;

    @ManyToOne
    public Usuario usuario;

}