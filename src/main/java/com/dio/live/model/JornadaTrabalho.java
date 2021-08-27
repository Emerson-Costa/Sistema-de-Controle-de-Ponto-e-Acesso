package com.dio.live.model;

import lombok.*;


/*
       Anotações da dependência LOMBOK
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor // Cria um construtor sem argumentos
@EqualsAndHashCode // Cria um método hashcode e equals para comparação entre objetos
@Builder // Realizar testes no código
public class JornadaTrabalho {
    private  long id;
    private String descricao;
}
