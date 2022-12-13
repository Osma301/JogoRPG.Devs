package JogoRPGDevs;

import java.util.Random;

public class Boss {
	String nome;
	private int vidaBoss;
	private int danoBoss;
	private int levelBoss;
	private int receberAtaque;
	private Random danor = new Random();
	
	
	
	
	public Boss() {
		super();
	}
	
	
	public Boss(String nome, int vidaBoss, int danoBoss, int levelBoss) {
		super();
		this.nome = nome;
		this.vidaBoss = vidaBoss;
		this.danoBoss = danoBoss;
		this.levelBoss = levelBoss;

	}
	
	
	public int getReceberAtaque() {
		return receberAtaque;
	}


	public void setReceberAtaque(int receberAtaque) {
		this.receberAtaque = receberAtaque;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVidaBoss() {
		return vidaBoss;
	}
	public void setVidaBoss(int vidaBoss) {
		this.vidaBoss = vidaBoss;
	}
	public int getDanoBoss() {
		return danoBoss;
	}
	public void setDanoBoss(int danoBoss) {
		this.danoBoss = danoBoss;
	}
	public int getLevelBoss() {
		return levelBoss;
	}
	public void setLevelBoss(int levelBoss) {
		this.levelBoss = levelBoss;
	}
	public Random getDanor() {
		return danor;
	}
	public void setDanor(Random danor) {
		this.danor = danor;
	}
	
}	
