package com.dio.live.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Localidade {
    @Id
    private long id;
    // Notaçãoi da relação de: 1 X 1
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;
}
