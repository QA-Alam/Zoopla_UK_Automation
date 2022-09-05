package com.usa.failTestRun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassB {

	@Test
	public static void getTest4() {
		Assert.assertTrue(true);
		System.out.println("getTest4");
	}
	@Test
	public static void getTest5() {
		Assert.assertTrue(true);
		System.out.println("getTest5");
	}
	@Test
	public  static void getTest6() {
		Assert.assertTrue(true);
		System.out.println("getTest6");
	}
}
