package JogoRPGDevs.src;


public class MaquinaSanguinaria extends Inimigo {
	public MaquinaSanguinaria() {
		super.setVidaP(45);
		super.setLevel(1);
		super.setValorExp(6);
		super.setValorDano(8);
		super.setNome("Maquina Sanguinaria");
		super.setNomeAtaque("Ataque lacerador");
		super.setValorDanoDebilitante(1);
		super.setTipoDanoDeblitante("Sangramento");
	}
}
