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
public class BinarySearchTree {
	
	/* Properties of binary search tree-
	 * 
	 * A)The data stored at each node has a distinguished key which is unique 
	 * in the tree and belongs to a total order. 
	 * That is, for any two non-equal keys, x,y either x < y or y < x.
	 * 
	 * B)The key of any node is greater than all keys occurring in its left 
	 * subtree and less than all keys occurring in its right subtree
	 * 
	 */

	@SuppressWarnings("unchecked")
	public static ArrayList<ArrayList<Integer>> binarySearchTree(ArrayList<Integer> input) {

		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (input.size() == 1) {
			result.add(input);
			return result;
		} else {
			for (int i = 0; i < input.size(); i++) {

				Integer parentNode = input.get(i);
				ArrayList<Integer> leftNodeList = new ArrayList<Integer>();
				ArrayList<Integer> rightNodeList = new ArrayList<Integer>();
				ArrayList<Integer> tempList = new ArrayList<Integer>();
				tempList = (ArrayList<Integer>) input.clone();
				tempList.remove(i);
				for (int j = 0; j < tempList.size(); j++) {
					if (tempList.get(j) < parentNode) {
						leftNodeList.add(tempList.get(j));
					} else if (tempList.get(j) > parentNode) {
						rightNodeList.add(tempList.get(j));
					}
				}
				// no of trees from left node or combinations
				// no of subtrees from right node or combinations
				ArrayList<ArrayList<Integer>> leftNodeListofList = new ArrayList<ArrayList<Integer>>();
				ArrayList<ArrayList<Integer>> rightNodeListofList = new ArrayList<ArrayList<Integer>>();
				leftNodeListofList = binarySearchTree(leftNodeList);
				rightNodeListofList = binarySearchTree(rightNodeList);

				if (leftNodeListofList.size() > rightNodeListofList.size()) {
					for (int l = 0; l < leftNodeListofList.size(); l++) {
						ArrayList<Integer> finalListToAdd = new ArrayList<Integer>();
						finalListToAdd.add(parentNode);
						finalListToAdd.addAll(leftNodeListofList.get(l));

						if (rightNodeListofList.size() != 0) {
							for (int m = 0; m < rightNodeListofList.size(); m++) {
								ArrayList<Integer> finalListToAdd2 = new ArrayList<Integer>();
								finalListToAdd2.addAll(finalListToAdd);
								finalListToAdd2.addAll(rightNodeListofList.get(m));
								// finally add to the final list
								result.add(finalListToAdd2);
							}
						} else {
							ArrayList<Integer> finalListToAdd2 = new ArrayList<Integer>();
							finalListToAdd2.addAll(finalListToAdd);
							// finally add to the final list
							result.add(finalListToAdd2);
						}

					}
				} else {
					for (int a = 0; a < rightNodeListofList.size(); a++) {
						ArrayList<Integer> finalListToAdd = new ArrayList<Integer>();
						finalListToAdd.add(parentNode);
						finalListToAdd.addAll(rightNodeListofList.get(a));

						if (leftNodeListofList.size() != 0) {
							for (int b = 0; b < leftNodeListofList.size(); b++) {
								ArrayList<Integer> finalListToAdd2 = new ArrayList<Integer>();
								finalListToAdd2.addAll(finalListToAdd);
								finalListToAdd2.addAll(leftNodeListofList.get(b));
								result.add(finalListToAdd2);

							}
						} else {
							ArrayList<Integer> finalListToAdd2 = new ArrayList<Integer>();
							finalListToAdd2.addAll(finalListToAdd);
							result.add(finalListToAdd2);
						}

					}
				}

			}
		}
		return result;

	}
	public static void main(String[] args) {
		
		/*
		 * ArrayList<Integer> input = new ArrayList<Integer>(); 
		 * input.add(1);
		 * input.add(2); 
		 * input.add(3); 
		 * input.add(4); 
		 * input.add(5); 
		 * input.add(6);
		 * System.out.println(binarySearchTree(input).toString());
		 * System.out.println(binarySearchTree(input).size());
		 */
	}
}
