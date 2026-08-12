class MinMax {
    public static int[] minMax(int[] arr) {
      int max = arr[0];
      int min = arr[0];
        for (int elem : arr) {
          if (elem < min) min = elem;
          if (elem > max) max = elem;
        }
      return new int[] {min, max};
    }
}
