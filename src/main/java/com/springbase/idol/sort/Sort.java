package com.springbase.idol.sort;

/**
 * @author walterwu
 * @date 2018/03/01
 */
public class Sort {

  private static int[] arr = {16, 7, 3, 20, 17, 8};


  public static void main(String[] args) {
//    insertSort(arr);
//    shellSort(arr);
//    bubbleSort(arr);
//    quickSort(arr, 0, arr.length - 1);
//    heapSort(arr);
    selectionSort(arr);
    for (int num : arr) {
      System.out.println("sort result:" + num);
    }
  }

  /**
   * 直接插入排序(插入类排序)
   */
  private static void insertSort(int[] arr) {
    int i, j, key;
    for (i = 1; i < arr.length; i++) {
      key = arr[i];
      for (j = i - 1; j >= 0 && arr[j] > key; j--) {
        arr[j + 1] = arr[j];
      }
      arr[j + 1] = key;
    }
  }

  /**
   * 希尔排序（插入类排序）
   * 直接排序的改进型
   */
  private static void shellSort(int[] arr) {
    int i, j, key;
    for (int increment = arr.length / 2; increment > 0; increment /= 2) {
      for (i = increment; i < arr.length; i++) {
        key = arr[i];
        for (j = i - increment; j >= 0 && arr[j] > key; j -= increment) {
          arr[j + increment] = arr[j];
        }
        arr[j + increment] = key;
      }
    }
  }

  /**
   * 冒泡排序（交换类排序）
   */
  private static void bubbleSort(int[] arr) {
    int i, j;
    for (i = 0; i < arr.length; i++) {
      for (j = arr.length - 1; j > i; j--) {
        if (arr[j] < arr[j - 1]) {
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
        }
      }
    }
//    for (i = 0; i < arr.length-1; i++) {
//      for (j = 0; j < arr.length-1 - i; j++) {
//        if (arr[j] > arr[j + 1]) {
//          int temp = arr[j];
//          arr[j] = arr[j + 1];
//          arr[j + 1] = temp;
//        }
//      }
//    }
  }

  /**
   * 快速排序（交换类排序）
   */
  private static int partition(int[] arr, int l, int r) {
    int temp = arr[l];
    while (l < r) {
      while (arr[r] >= temp && l < r) {
        r--;
      }
      arr[l] = arr[r];
      while (arr[l] <= temp && l < r) {
        l++;
      }
      arr[r] = arr[l];
    }
    arr[l] = temp;
    return l;
  }

  private static void quickSort(int[] arr, int l, int r) {
    if (l >= r) {
      return;
    }
    int index = partition(arr, l, r);
    quickSort(arr, l, index - 1);
    quickSort(arr, index + 1, r);
  }


  /**
   * 调整堆顺序
   *
   * @param arr 调整数组
   * @param i 当前调整的节点
   * @param heapSize 数组长度-1
   */
  private static void adjustHeap(int[] arr, int i, int heapSize) {
    int lChild = 2 * i + 1;
    int rChild = 2 * i + 2;
    int largestNode = i;

    if (lChild <= heapSize) {
      if (arr[lChild] > arr[i]) {
        largestNode = lChild;
      } else {
        largestNode = i;
      }
    }
    if (rChild <= heapSize && arr[rChild] > arr[largestNode]) {
      largestNode = rChild;
    }

    if (largestNode != i) {
      int temp = arr[largestNode];
      arr[largestNode] = arr[i];
      arr[i] = temp;
      adjustHeap(arr, largestNode, heapSize);
    }
  }

  /**
   * 生成大顶堆
   */
  private static void buildMaxHeap(int[] arr) {
    for (int i = arr.length / 2 - 1; i >= 0; i--) {
      adjustHeap(arr, i, arr.length - 1);
    }
  }

  /**
   * 堆排序(选择类排序)---大顶堆
   */
  private static void heapSort(int[] arr) {
    buildMaxHeap(arr);
    for (int j = arr.length - 1; j > 0; j--) {
      int temp = arr[j];
      arr[j] = arr[0];
      arr[0] = temp;

      adjustHeap(arr, 0, j - 1);
    }
  }

  /**
   * 简单选择排序
   */
  private static void selectionSort(int[] arr) {
    int min;
    for(int i =0;i<arr.length;i++){
      min = i;
      for(int j=i+1;j<arr.length;j++){
        if(arr[min] >arr[j]){
          min = j;
        }
      }
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] =temp;
    }
  }

}
