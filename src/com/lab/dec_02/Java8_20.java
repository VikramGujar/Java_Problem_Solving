package com.lab.dec_02;

interface NIT20
{
	int myInterface(int a, int b);
}
public class Java8_20 {
	public static void main(String[] args) {
		NIT20 nit = (a, b) ->
		{
			int div = a/b;
			int addition = a+b;
			return addition;
		};
		// Will compile successfully
		// No output
	}
}