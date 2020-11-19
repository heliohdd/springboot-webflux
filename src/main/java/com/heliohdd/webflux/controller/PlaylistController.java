package com.heliohdd.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.heliohdd.webflux.document.Playlist;
import com.heliohdd.webflux.services.PlaylistService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

//@RestController
public class PlaylistController {

	@Autowired
	PlaylistService playlistService;

	@GetMapping(value = "/playlist")
	public Flux<Playlist> getPlaylist() {
		return playlistService.findAll();
	}

	@GetMapping(value = "/playlist/{id}")
	public Mono<Playlist> getPlaylistId(@PathVariable String id) {
		return playlistService.findById(id);
	}

	@PostMapping(value = "/playlist")
	public Mono<Playlist> save(@RequestBody Playlist playlist) {
		return playlistService.save(playlist);
	}

}