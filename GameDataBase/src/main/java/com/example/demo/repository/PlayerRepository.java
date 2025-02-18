package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.PlayerModel;

public interface PlayerRepository extends CrudRepository<PlayerModel,Integer>{

}
