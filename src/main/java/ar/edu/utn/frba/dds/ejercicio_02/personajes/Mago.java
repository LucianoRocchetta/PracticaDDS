package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity @DiscriminatorValue("mago")
public class Mago extends Personaje{

  @Column(name = "nivel_magia", nullable = false)
  private Integer nivelDeMagia;

  @Column(name = "tieneAlas", nullable = false)
  private Boolean tieneAlas;

  public void atacar(Personaje personaje) {
 //TODO
  }


}
