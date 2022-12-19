

public class DestructorSanguinario extends Boss {
	
	public DestructorSanguinario() {
		this.setVidaBoss(70);
		this.setDanoBoss(15);
		this.setLevelBoss(4);
		this.setNome("Destructor Sanguinário");
		this.setXpBoss(20);
	}
	
	public void receberDano(int danoRecebido) {
		setVidaBoss(getVidaBoss() - danoRecebido);
	}
}
