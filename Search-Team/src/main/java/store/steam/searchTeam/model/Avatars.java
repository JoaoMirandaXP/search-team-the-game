package store.steam.searchTeam.model;
//Classe mãe , meio q ela define oque todo personagem pode fazer no geral
public class Avatars {
	private int positionX;
	private int positionY;
	
	public void moveUP() {
		this.positionY++;
	}

	public void moveDown() {
		this.positionY--;
	}
	public void moveLeft() {
		this.positionX--;
	}
	public void moveRight() {
		this.positionX++;
	}

}



