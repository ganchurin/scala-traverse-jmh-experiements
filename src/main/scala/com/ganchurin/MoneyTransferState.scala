package com.ganchurin

import scala.collection.immutable
import scala.util.Random

import org.openjdk.jmh.annotations.{Scope, State}

@State(Scope.Benchmark)
class MoneyTransferState {

  private val random = new Random()

  val transfers: immutable.Seq[MoneyTransfer] = (1 to 10000).map { i =>
    if (i % 2 == 0) {
      Income(random.nextDouble())
    } else {
      Outcome(random.nextDouble())
    }
  }
}
