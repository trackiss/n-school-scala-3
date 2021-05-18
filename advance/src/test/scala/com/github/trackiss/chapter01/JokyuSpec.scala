package com.github.trackiss.chapter01

import Jokyu._

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class JokyuSpec extends AnyFlatSpec with Matchers:
  "twice メソッド" should "同じ関数を2つ合成できる" in {
    twice(_ * 2)(2) shouldBe (2 * 2 * 2)
  }
