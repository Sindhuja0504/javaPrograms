package org.inter;

public class Music {
	public static void main(String[] args) {
		
		Playable ply = new Piano();
		ply.play();
		Playable ply1 = new Guitar();
		ply1.play();
		Playable.brand();
		int count = ply.price(28);
		System.out.println("return count:" + count);
		
	}

}
