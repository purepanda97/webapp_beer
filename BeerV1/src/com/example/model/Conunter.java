package com.example.model;

public class Conunter {

	private static int count;
	public static synchronized int getCount() {
		count++;
		return count;
	}
}
