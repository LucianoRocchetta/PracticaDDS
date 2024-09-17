package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import ar.edu.utn.frba.dds.ejercicio_02.elementos.ElementoDefensor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "personajes")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Personaje {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id;

  @Getter
  @ManyToMany
  @JoinTable(
          name = "personaje_elemento",
          joinColumns = @JoinColumn(name = "personaje_id",
                  referencedColumnName = "id"),
          inverseJoinColumns = @JoinColumn(name = "categoria_id", referencedColumnName = "id")
  )
  private List<ElementoDefensor> elementos;

  @Getter @Setter
  @Column(name = "estamina", nullable = false)
  private Integer estamina;

  @Getter @Setter
  @Column(name  = "puntos_de_vida", nullable = false)
  private Integer puntosDeVida;

  public Personaje(){
    this.elementos = new ArrayList<>();
  }

  public void atacar(Personaje personaje) {
  //todo
  }

  public void agregarElemento(ElementoDefensor elemento){
    this.elementos.add(elemento);
  }


}