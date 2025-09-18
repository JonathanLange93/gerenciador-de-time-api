package br.com.jonathan.gerenciador_de_time;


import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JogadorVIP extends Jogador{

    private double multiplicadorDePontos;




    @Override
    public void aumentarPontuacao(int pontosGanhos){
        double pontosCalculados = pontosGanhos * this.multiplicadorDePontos;

        super.setPontuacao(super.getPontuacao() + (int)pontosCalculados);

    }

}
