package store.steam.searchTeam.model;

import store.steam.searchTeam.background.Background;

//Classe mãe , meio q ela define oque todo personagem pode fazer no geral
public class Avatars {
	
	private static int playerPosition=0;
	final int[] posicaoInicial1= {85,10};
	final int[]posicaoInicial2= {175,10};
	private int positionX;
	private int positionY;
	
// 	OBS:consertar essa parte do if e do else if
//	esse trecho faz com que o personagem inicie na posição certa
//	if(this.playerPosition == 1){
//		this.positionX = this.posicaoInicial1[0];
//		this.positionY = this.posicaoInicial1[1];
//	
//	}else if(this.playerPosition==2){
//		this.positionX = this.posicaoInicial2[0];
//		this.positionY = this.posicaoInicial2[1];
//		
//	}
	
//	trocando esse if meio bugado que eu coloquei pelo construtor da classe
	public Avatars() {
		super();
		this.playerPosition++;
		if(this.playerPosition == 1) {
			this.positionX = this.posicaoInicial1[0];
			this.positionY = this.posicaoInicial1[1];
		}else if(this.playerPosition == 2) {
			this.positionX = this.posicaoInicial2[0];
			this.positionY = this.posicaoInicial2[1];
			
		}else {
			throw new IndexOutOfBoundsException("Você está inserindo um numero de player inválido");
		}
		System.out.println("Personagem "+ this.playerPosition +" instanciado com sucesso");
	
	
	
	
	
	
	}
	
	
	public void moveUP() {
		/*
		 * fazer laço while para o personagem continuar subindo(animação) e depois cair
		 * e tambem fazer uns boolean loko p juntar com os ataques
		 */
		this.positionY++; 
	}

	public void moveDown() {
		/*
		 * modificar para a transição do personagem agachado  
	 	 * e colocar uma condição booleana aqui para combinar com os ataques
		 */
		this.positionY--;
	}
	
	public void moveLeft() {
		if(this.positionX>0) {
			this.positionX--;
		}
	}
	
	public void moveRight() {
		if(this.positionX<Background.SCREEN_WIDTH) {
			this.positionX++;
		}
	}

}



