package com.dio.live.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/*
       Anotações da dependência LOMBOK
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor // Cria um construtor sem argumentos
@EqualsAndHashCode // Cria um método hashcode e equals para comparação entre objetos
@Builder // Realizar testes no código
@Entity
@Audited
public class JornadaTrabalho {
    @Id
    @GeneratedValue
    private  long id;
    private String descricao;
}
