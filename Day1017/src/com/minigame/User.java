package com.minigame;

public class User extends Score {
	public String name;
	public int coin;


	public User(){

	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "유저 [이름=" + name + ", 코인갯수=" + coin + "]";
	}



	public int getCoin() {
		return coin;
	}



	public void setCoin(int coin) {
		this.coin = coin;
	}



	void PrintUser(){
		System.out.println("이름: "+name+""+ "코인갯수 :"+ coin);
	}
}
