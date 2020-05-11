package com.panibrat.euler.p1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class MultiplesOf3And5Test {

  @Test
  public void sum() {
    assertThat(MultiplesOf3And5.solution(10)).isEqualTo(23);
    assertThat(MultiplesOf3And5.solution(1000)).isEqualTo(233168);
  }
}