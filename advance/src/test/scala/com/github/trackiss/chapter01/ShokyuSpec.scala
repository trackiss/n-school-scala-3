package com.github.trackiss.chapter01

import Shokyu._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ShokyuSpec extends AnyFlatSpec with Matchers:
  "fact メソッド" should "階乗を計算できる" in {
    fact(0, 1) shouldBe 1
    fact(1, 1) shouldBe 1
    fact(2, 1) shouldBe 2
    fact(3, 1) shouldBe 6
  }
