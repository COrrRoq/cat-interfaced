package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CatTest {
	@Test
	public void testInitialState() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		assertEquals(cat.howHungry(), 50);
	}
public class wolfTest {
	@Test
	public void wolfDance() {
		Wolf wolf = new Wolf();
		assertTrue(wolf.dance() == true);
	}


}
public class pandaTest {
	@Test
	public void pandaDance() {
		Panda panda = new Panda();
		assertTrue(panda.dance() != true);
	}
}
}
	
