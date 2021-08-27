package com.dio.live.model;

import lombok.*;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Localidade {
    private long id;
    // Notaçãoi da relação de: 1 X 1
    @OneToMany
    private NivelAcesso nivelAcesso;
    private String descricao;
}
