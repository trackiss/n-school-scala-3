package com.github.trackiss.chapter01

object Chukyu:
  case class Switch(isOn: Boolean)
  def toggle(switch: Switch): Switch = Switch(!switch.isOn)
