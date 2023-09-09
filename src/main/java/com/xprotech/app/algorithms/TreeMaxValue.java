package com.xprotech.app.algorithms;

/**
 *
 * @author jedionmelbin
 */
public class TreeMaxValue {

    public void program() {
        int[] scores = {60, 50, 95, 80, 70};

        int maxVal = maxValue(scores);
        System.out.println("MAX VALUE :" + maxVal);
    }

    private int maxValue(int[] array) {
        //Maximum initializing value 
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        int maxValue = array[array.length - 1];
        return maxValue;
    }
}
