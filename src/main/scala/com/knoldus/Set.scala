package com.knoldus

abstract class Set[A <: Ordered[A]] {
  def incl(x: A): Set[A]

  def contains(x: A): Boolean
}