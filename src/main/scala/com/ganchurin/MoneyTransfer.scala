package com.ganchurin

sealed trait MoneyTransfer {
  def value: Double

  def isExpense: Boolean
}

case class Income(value: Double) extends MoneyTransfer {
  override val isExpense = false
}

case class Outcome(value: Double) extends MoneyTransfer {
  override val isExpense = true
}
