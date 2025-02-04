package com.example.api_votaciones_sync.service;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class VotacionesData {

    private HashMap<String, Integer> votaciones = new HashMap<>();
    public synchronized int addVoto(String voto){
        if (votaciones.containsKey(voto)){
            votaciones.put(voto, votaciones.get(voto)+1);

        }else {
            votaciones.put(voto, 1);
        }
        return votaciones.get(voto);
    }
    public synchronized HashMap<String, Integer> getVotos(){

        return this.votaciones;
    }



}
