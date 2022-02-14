package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class EmptySetTest extends AnyFunSuite {
  val emptySet: Set[Number] = new EmptySet[Number].incl(Number(1))
  test("In this case we check  value in insert or not in Empty Set  should give true") {
    assert(emptySet.contains(Number(1)))
  }
}