package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class NonEmptySetTest extends AnyFunSuite {
  test("insert the value 1,2 in set") {
    val NonemptySet = new EmptySet[Number].incl(Number(1)).incl(Number(2))
    assert(NonemptySet.contains(Number(2)))
  }
  test("insert the values 1,4 in set") {
    val NonemptySet = new EmptySet[Number].incl(Number(1)).incl(Number(4))
    assert(NonemptySet.contains(Number(4)))
  }
  test("give true or false") {
    val Set = new EmptySet[Number].incl(Number(10)).incl(Number(12)).incl((Number(9)))
    assert(Set.contains(Number(10)))
  }
}