package com.example.mavendemo;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestowanieDemo {
	
	@Test
	public void krzykaczCheck(){
		
		Krzykacz k = new Krzykacz();
		assertEquals("Hello World!", k.krzycz());
		
	}

}
