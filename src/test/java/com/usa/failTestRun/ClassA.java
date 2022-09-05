package com.usa.failTestRun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassA {

	@Test
	public static void getTest1() {
		Assert.assertTrue(true);
		System.out.println("getTest1");
	}
	@Test
	public static void getTest2() {
		Assert.assertTrue(true);
		System.out.println("getTest2");
	}
	@Test
	public static void getTest3() {
		Assert.assertTrue(true);
		System.out.println("getTest3");
	}
}
