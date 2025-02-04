package com.example.api_votaciones_sync.controller;

import com.example.api_votaciones_sync.service.VotacionesData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class VotacionesController {
    private final VotacionesData votacionesData;

    public VotacionesController(VotacionesData votacionesData) {
        this.votacionesData = votacionesData;
    }

    @GetMapping("/voto/{name}")
    public ResponseEntity<String> createVote(@PathVariable String name){

        String resultado = name + ", votos: " + votacionesData.addVoto(name);
        return ResponseEntity.ok(resultado);
    }
    @GetMapping("/votos")
    public ResponseEntity<HashMap<String, Integer>> getVotes(){
        HashMap<String, Integer> resultado = votacionesData.getVotos();
        return ResponseEntity.ok(resultado);

    }


}
