package com.ganchurin

import scala.collection.immutable
import scala.util.Random

import org.openjdk.jmh.annotations.{Param, Scope, Setup, State}

@State(Scope.Benchmark)
class MoneyTransferState {

  private val random = new Random()

  @Param(Array("100", "1000", "10000"))
  private var size: Int = _

  var transfers: immutable.Seq[MoneyTransfer] = _

  @Setup
  def setUp(): Unit = {
    transfers = (1 to size).map { i =>
      if (i % 2 == 0) {
        Income(random.nextDouble())
      } else {
        Outcome(random.nextDouble())
      }
    }
  }
}
