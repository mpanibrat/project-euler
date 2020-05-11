package com.panibrat.euler.p1;

public class MultiplesOf3And5 {

  public static int solution(int range) {
    int sum3 = progressionSum(3, range);
    int sum5 = progressionSum(5, range);
    int sumOverlap = progressionSum(3 * 5, range);
    return sum3 + sum5 - sumOverlap;
  }

  private static int progressionSum(int step, int range) {
    int n = (range - 1) / step;
    return step * (n * (n + 1) / 2);
  }
}
