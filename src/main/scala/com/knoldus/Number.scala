package com.knoldus

case class Number(value: Double) extends Ordered[Number]{
  def compare(that: Number): Int = {
    if(this.value < that.value)
      -1
    else if(this.value > that.value)
      1
    else
      0
  }
}