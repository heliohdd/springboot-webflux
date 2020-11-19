package com.heliohdd.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.heliohdd.webflux.document.Playlist;

public interface PlaylistRespository extends ReactiveMongoRepository<Playlist, String> {

}