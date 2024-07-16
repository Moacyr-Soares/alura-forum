package br.com.moacyr.alura_forum.controller;

import br.com.moacyr.alura_forum.topico.DadosGravarTopico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topico")
public class TopicController {

    @PostMapping
    public void gravarTopico (@RequestBody DadosGravarTopico dados){

        System.out.println(dados);
    }
}
