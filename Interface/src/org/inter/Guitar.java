package org.inter;

public class Guitar implements Playable {

	@Override
	public void play() {
		System.out.println("playing guitar");
		
	}
  
  
	
	public static void main(String[] args) {
		Guitar g = new Guitar();
		g.play();
		// g.brand();
	}

}
