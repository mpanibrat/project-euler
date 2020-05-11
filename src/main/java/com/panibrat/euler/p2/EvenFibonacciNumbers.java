package com.panibrat.euler.p2;

public class EvenFibonacciNumbers {
  public static long solution(int range) {
    int a = 1;
    int b = 1;
    int c = a + b;
    long sum = 0;
    while (c < range) {
      sum += c;
      a = b + c;
      b = a + c;
      c = a + b;
    }
    return sum;
  }
}
