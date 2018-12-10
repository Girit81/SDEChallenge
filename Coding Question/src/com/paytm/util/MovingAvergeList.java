package com.paytm.util;

/**
 * The interface provides <tt>moveWithAvg</tt> method for adding numbers at the end of the list as well as
 * to calculate the average of last n numbers found in the list, and <tt>get</tt> method for retrieving a number 
 * at the specified index.
 */


public interface MovingAvergeList {
	
	/**
     * Appends the specified Number to the end of the list. Returns the average of last n numbers found in the list
     * Lists that support this operation should refuse to add null elements.
     *
     * @param e element to be appended to this list
     * @return the average of last n numbers found in the list
     */
	Integer moveWithAvg(Integer e);
	
	/**
     * Returns the Number at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    Integer get(int index);
    
}
