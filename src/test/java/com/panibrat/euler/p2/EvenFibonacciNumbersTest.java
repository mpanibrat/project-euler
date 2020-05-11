package com.panibrat.euler.p2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class EvenFibonacciNumbersTest {

  @Test
  public void solution() {
    assertThat(EvenFibonacciNumbers.solution(10)).isEqualTo(10);
    assertThat(EvenFibonacciNumbers.solution(50)).isEqualTo(44);
    assertThat(EvenFibonacciNumbers.solution(4_000_000)).isEqualTo(4613732);
  }
}
