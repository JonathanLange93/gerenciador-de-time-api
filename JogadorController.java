package br.com.jonathan.gerenciador_de_time;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class JogadorController {

    private ArrayList<Jogador> time = new ArrayList<>();

    public JogadorController(){
        time.add(new Jogador("Ana", 25, 100));
        time.add(new JogadorVIP ("Carlos", 28, 200, 1.5));

    }

    @GetMapping ("/ola")
    public String dizerOla(){
        return "Olá, Mundo! Primeiro endpoint Spring está no ar!";

    }

    @GetMapping ("/time")
    public ArrayList<Jogador>getTime(){
        return time;

    }
    @PostMapping ("/time")
    public Jogador adicionarJogador (@RequestBody Jogador novoJogador){
        time.add(novoJogador);
        System.out.println("Novo jogador adiconado: " + novoJogador.getNome());
        return novoJogador;
    }

    @DeleteMapping ("/time/{indice}")
    public String deleteJogador(@PathVariable int indice){
        if (indice >= 0 && indice < time.size()){
            Jogador jogadorRemovido = time.remove(indice);

            return "O jogador " + jogadorRemovido.getNome() + " foi removido com sucesso!";
        } else {
            return "ERRO: Índice inválido, nenhum jogador encontrado nessa posição " + indice + ".";
        }
    }

    @PutMapping ("/time/{indice}")
    public Jogador updateJogador(@PathVariable int indice, @RequestBody Jogador dadosAtualizados){
        if (indice >= 0 && indice < time.size()) {
            Jogador jogadorParaAtualizar = time.get(indice);

            jogadorParaAtualizar.setNome(dadosAtualizados.getNome());
            jogadorParaAtualizar.setIdade(dadosAtualizados.getIdade());
            jogadorParaAtualizar.setPontuacao(dadosAtualizados.getPontuacao());

            return jogadorParaAtualizar;

        } else {

            return null;

        }

    }

}
