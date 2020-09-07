# scala-traverse-jmh-experiements

Results:
```
[info] Benchmark                                     Mode  Cnt      Score     Error  Units
[info] MoneyTransferTest.viewAndFilterAndMap        thrpt    5   9221,770 ± 145,535  ops/s
[info] MoneyTransferTest.filterAndMap               thrpt    5   9803,567 ± 110,308  ops/s
[info] MoneyTransferTest.collectAndFilter           thrpt    5  11855,451 ±  74,268  ops/s
[info] MoneyTransferTest.withFilterAndMap           thrpt    5  15242,666 ±  89,912  ops/s
[info] MoneyTransferTest.collectAndPatternMatching  thrpt    5  17319,703 ±  98,698  ops/s
```