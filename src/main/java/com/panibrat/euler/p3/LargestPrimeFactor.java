package com.panibrat.euler.p3;

public class LargestPrimeFactor {
  public static long solution(long number) {
    long lastFactor = number % 2 == 0 ? 2 : 1;
    while (number % 2 == 0) {
      number /= 2;
    }
    long factor = 3;
    long maxFactor = (long) Math.sqrt(number);
    while (number > 1 && factor < maxFactor) {
      if (number % factor == 0) {
        while (number % factor == 0) {
          number /= factor;
        }
        lastFactor = factor;
        maxFactor = (long) Math.sqrt(number);
      }
      factor += 2;
    }
    return number == 1 ? lastFactor : number;
  }
}
