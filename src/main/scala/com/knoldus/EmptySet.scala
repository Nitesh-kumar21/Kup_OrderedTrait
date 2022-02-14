package com.knoldus

class EmptySet[A <: Ordered[A]] extends Set[A] {
  override def incl(elem: A): Set[A] = new NonEmptySet(elem, new EmptySet[A], new EmptySet[A])

  override def contains(elem: A): Boolean = false
}
