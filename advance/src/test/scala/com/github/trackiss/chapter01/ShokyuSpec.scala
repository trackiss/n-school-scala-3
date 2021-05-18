package com.github.trackiss.chapter01

import org.scalatest.Assertions
import org.scalatest.flatspec.AnyFlatSpec

class ShokyuSpec extends AnyFlatSpec with Assertions {
  it should "階乗を計算できる" in {
    assert(Shokyu.fact(5, 1) === 120)
  }
}
