package dev.tristanfazio.SpringBootDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerListSorter {
  public IntegerListSorter(){};

  public int[] sortIntegerList(int[] unsortedList) {
    mergeSort(unsortedList, unsortedList.length);

    return unsortedList;
  }

  private static void mergeSort(int[] unsortedArray, int arraySize) {
    if(arraySize<2) {return;}

    int middle = arraySize/2;
    int[] left = new int[middle];
    int[] right = new int[arraySize-middle];

    for (int i = 0; i < middle; i++) {
      left[i] = unsortedArray[i];
    }
    for (int i = middle; i < arraySize; i++){
      right[i-middle] = unsortedArray[i];
    }

    mergeSort(left, middle);
    mergeSort(right, arraySize-middle);

    merge(unsortedArray,left,right,middle,arraySize-middle);
  }

  private static void merge(int[] unsortedArray, int[] left, int[] right, int middle, int offest) {
    int i = 0, j = 0, k = 0;
    while (i < middle && j < offest) {
      if (left[i] <= right[j]) {
        unsortedArray[k++] = left[i++];
      }
      else {
        unsortedArray[k++] = right[j++];
      }
    }
    while (i < middle) {
      unsortedArray[k++] = left[i++];
    }
    while (j < offest) {
      unsortedArray[k++] = right[j++];
    }
  }
}
