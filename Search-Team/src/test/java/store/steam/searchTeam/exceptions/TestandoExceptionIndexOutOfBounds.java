package store.steam.searchTeam.exceptions;

import store.steam.searchTeam.avatars.SearchAvatar;
import store.steam.searchTeam.model.Avatars;

public class TestandoExceptionIndexOutOfBounds {

	public static void main(String[] args) {

		
		SearchAvatar search = new SearchAvatar();
		Avatars search2 = new SearchAvatar();
//		é aqui onde deve crashar
		try {
		Avatars search3 = new SearchAvatar();
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Personagens demais no jogo/bug no construtor do Avatar");
		}
		
	}

}
