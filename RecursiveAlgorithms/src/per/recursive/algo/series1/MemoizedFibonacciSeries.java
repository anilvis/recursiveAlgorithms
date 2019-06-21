package per.recursive.algo.series1;

import java.util.HashMap;
import java.util.Map;

import per.recursive.aglo.utility.Copyright;

@Copyright("2019 by Anil Kumar Vishwakarma")
/*
 * All rights reserved. No part of this publication may be reproduced,
 * distributed, or transmitted in any form or by any means, including 
 * photocopying, recording, or other electronic or mechanical methods, 
 * without the prior written permission of the publisher, except in the 
 * case of brief quotations embodied in critical reviews and certain other 
 * non commercial uses permitted by copyright law. For permission requests, 
 * write to the publisher, addressed “Attention: Permissions Coordinator,” 
 * at the address below.
 * 
 * Email - anil.21193@gmail.com
 * 
 */
public class MemoizedFibonacciSeries {

	static Map<Integer, Integer> storemap = new HashMap<>();

	public static int fibonacci(int input) {
		
		int returnVal = 0;
		if (input == 0)
			return 0;
		if (input == 1)

			return 1;
		// check if the value exists in the map for a function
		if (storemap.containsKey(new Integer(input)))
		{
			return storemap.get(input);
		}
		else {
			returnVal = fibonacci(input - 1) + fibonacci(input - 2);
			storemap.put(input, returnVal);
		}
		return returnVal;
	}
	public static void main(String[] args) {
		//System.out.println(fibonacci(4));
	}
}
