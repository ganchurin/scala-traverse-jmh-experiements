package com.ganchurin

import org.openjdk.jmh.annotations.{Benchmark, Fork}

class MoneyTransferTest {

  @Benchmark
  @Fork(value = 1, warmups = 3)
  def filterAndMap(state: MoneyTransferState): Unit = {
    state.transfers.filter(_.isExpense).map(_.value)
  }

  @Benchmark
  @Fork(value = 1, warmups = 3)
  def withFilterAndMap(state: MoneyTransferState): Unit = {
    state.transfers.withFilter(_.isExpense).map(_.value)
  }

  @Benchmark
  @Fork(value = 1, warmups = 3)
  def viewAndFilterAndMap(state: MoneyTransferState): Unit = {
    state.transfers.view.filter(_.isExpense).map(_.value).toList
  }

  @Benchmark
  @Fork(value = 1, warmups = 3)
  def collectAndFilter(state: MoneyTransferState): Unit = {
    state.transfers.collect { case transfer if transfer.isExpense => transfer.value }
  }

  @Benchmark
  @Fork(value = 1, warmups = 3)
  def collectAndPatternMatching(state: MoneyTransferState): Unit = {
    state.transfers.collect { case Outcome(value) => value }
  }

}
