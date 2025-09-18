package br.com.jonathan.gerenciador_de_time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.Scanner;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nome;
    private int idade;
    private int pontuacao;


    public void setIdade(int idade) {
        if (idade > 0){
            this.idade = idade;
        }
    }


    public void aumentarPontuacao(int pontosGanhos){
        pontuacao += pontosGanhos;
    }

}
