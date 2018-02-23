package com.ns.s4;

public class Main {

	public static void main(String[] args) {
		Magician m = new Magician();
		m.attack();
		Warrior w = new Warrior();
		w.attack();
		Archer a = new Archer();
		a.attack();
		Npc n = new Npc();
		n.talk();

	}

}
