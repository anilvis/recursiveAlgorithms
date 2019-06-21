package per.recursive.algo.series1;

import java.util.ArrayList;

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
public class Permutation {

	public static ArrayList<String> permuatation(String input) {
		
		/* 
		 * Permutation is an ordered combination
		 * The number of permutations of n objects taken r at a time
		 * is determined by the following formula: P(n,r)=n!(n−r)!
		 * 
		 *  
		 */

		ArrayList<String> returnList = new ArrayList<String>();

		if (input.length() == 1) {
			returnList.add(input);
			return returnList;
		} else {
			for (int i = 0; i < input.length(); i++) {
				
				ArrayList<String> tempList = new ArrayList<String>();
				String init = String.valueOf(input.charAt(i));
				StringBuilder sb = new StringBuilder(input);
				StringBuilder secondInput = sb.deleteCharAt(i);
				tempList = permuatation(secondInput.toString());
				
				for (int j = 0; j < tempList.size(); j++) {
					returnList.add(init + tempList.get(j));
				}

			}
			return returnList;
		}

	}
	public static void main(String[] args) {
		//System.out.println(permuatation("123"));
		//System.out.println(permuatation("123").size());
	}
}
