package com.github.trackiss.chapter01

import Chukyu._

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ChukyuSpec extends AnyFlatSpec with Matchers:
  "toggle メソッド" should "Switch クラスの状態を切り替えられる" in {
    val offSwitch = Switch(false)
    val onSwitch = Switch(true)

    toggle(offSwitch) shouldBe onSwitch
    toggle(onSwitch) shouldBe offSwitch
  }
