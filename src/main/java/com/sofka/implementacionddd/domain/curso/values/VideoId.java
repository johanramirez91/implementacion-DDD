package com.sofka.implementacionddd.domain.curso.values;

import co.com.sofka.domain.generic.Identity;

public class VideoId extends Identity {

    public VideoId(){

    }

    private VideoId(String id){
        super(id);
    }

    public static VideoId of(String id){
        return new VideoId(id);
    }
}
