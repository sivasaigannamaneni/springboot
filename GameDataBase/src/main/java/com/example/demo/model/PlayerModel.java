package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class PlayerModel {
	@Id
	private int palyerId;
	@Column
	private String playerName;
	@Column
	private String game;
	public int getPalyerId() {
		return palyerId;
	}
	public void setPalyerId(int palyerId) {
		this.palyerId = palyerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
}
