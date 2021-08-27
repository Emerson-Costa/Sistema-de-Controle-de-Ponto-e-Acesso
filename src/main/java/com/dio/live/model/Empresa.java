package com.dio.live.model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Empresa {
    private long id;
    private String descricao;
    private String cnpj;
    private String endereco;
    private String cidade;
    private String estado;
    private String telefone;
}
