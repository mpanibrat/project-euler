package com.panibrat.euler.p3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class LargestPrimeFactorTest {

  @Test
  public void check() {
    assertThat(LargestPrimeFactor.solution(13195)).isEqualTo(29);
  }

  @Test
  public void solution() {
    assertThat(LargestPrimeFactor.solution(600851475143L)).isEqualTo(6857);
  }
}
