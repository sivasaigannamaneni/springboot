package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.PlayerModel;
import com.example.demo.repository.PlayerRepository;

@Controller
public class PlayerController {
	
	@Autowired
	PlayerRepository playerrepository;
	
	@RequestMapping("/")
	public String home()
	{
		return "index.jsp";
	}

	
	@RequestMapping("/addPlayer")
	public String addPlayer(PlayerModel playerModel) {
		playerrepository.save(playerModel);
		return "index.jsp";
	}
}
