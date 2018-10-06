package store.steam.searchTeam.model;
//Classe mãe , meio q ela define oque todo personagem pode fazer no geral
public class Avatars {

	private int SCREEN_WIDTH=123;
	private int SCREEN_HEIGHT=234;
	
	private int positionX;
	private int positionY;
	
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
		if(this.positionX<SCREEN_WIDTH) {
			this.positionX++;
		}
	}

}



