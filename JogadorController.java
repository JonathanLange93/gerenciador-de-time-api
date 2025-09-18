package br.com.jonathan.gerenciador_de_time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class JogadorController {

    @Autowired
    private JogadorRepository jogadorRepository;

    @GetMapping ("/ola")
    public String dizerOla(){
        return "Olá, Mundo! Primeiro endpoint Spring está no ar!";

    }

    @GetMapping ("/time")
    public List<Jogador> getTime(){
        return jogadorRepository.findAll();

    }
    @PostMapping ("/time")
    public Jogador adicionarJogador (@RequestBody Jogador novoJogador){
        jogadorRepository.save(novoJogador);
        System.out.println("Novo jogador adiconado: " + novoJogador.getNome());
        return novoJogador;
    }

    @DeleteMapping ("/time/{id}")
    public String deleteJogador(@PathVariable Long id){
        if (jogadorRepository.existsById(id)){

            jogadorRepository.deleteById(id);
            return "Jogador com ID " + id + "foi removido!";
        } else {
            return "ERRO: Jogador com ID " + id + "não encontrado!";
        }
    }

    @PutMapping ("/time/{id}")
    public Jogador updateJogador(@PathVariable Long id, @RequestBody Jogador dadosAtualizados){
        Optional<Jogador> jogadorOptional = jogadorRepository.findById(id);

        if (jogadorOptional.isPresent()){
            Jogador jogadorParaAtualizar = jogadorOptional.get();

            jogadorParaAtualizar.setNome(dadosAtualizados.getNome());
            jogadorParaAtualizar.setIdade(dadosAtualizados.getIdade());
            jogadorParaAtualizar.setPontuacao(dadosAtualizados.getPontuacao());

            return jogadorRepository.save(jogadorParaAtualizar);

        } else {

            return null;

        }

    }

}
