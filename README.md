# scala-traverse-jmh-experiements

Results:
```
[info] Benchmark                                    (size)   Mode  Cnt        Score       Error  Units
[info] MoneyTransferTest.viewAndFilterAndMap           100  thrpt    5   900209,832 ±  8010,901  ops/s
[info] MoneyTransferTest.viewAndFilterAndMap          1000  thrpt    5   104679,943 ±   413,360  ops/s
[info] MoneyTransferTest.viewAndFilterAndMap         10000  thrpt    5     9660,666 ±   144,909  ops/s
[info] MoneyTransferTest.filterAndMap                  100  thrpt    5  1108342,167 ± 14409,674  ops/s
[info] MoneyTransferTest.filterAndMap                 1000  thrpt    5   101720,512 ±  1234,516  ops/s
[info] MoneyTransferTest.filterAndMap                10000  thrpt    5     9937,380 ±   151,123  ops/s
[info] MoneyTransferTest.collectAndFilter              100  thrpt    5  1111993,758 ± 12500,508  ops/s
[info] MoneyTransferTest.collectAndFilter             1000  thrpt    5   120155,381 ±   727,848  ops/s
[info] MoneyTransferTest.collectAndFilter            10000  thrpt    5    13337,677 ±   187,182  ops/s
[info] MoneyTransferTest.withFilterAndMap              100  thrpt    5  1538467,050 ±  9916,285  ops/s
[info] MoneyTransferTest.withFilterAndMap             1000  thrpt    5   160937,292 ±  2816,620  ops/s
[info] MoneyTransferTest.withFilterAndMap            10000  thrpt    5    16033,151 ±   151,206  ops/s
[info] MoneyTransferTest.collectAndPatternMatching     100  thrpt    5  1584890,019 ± 13583,419  ops/s
[info] MoneyTransferTest.collectAndPatternMatching    1000  thrpt    5   179900,729 ±  3242,693  ops/s
[info] MoneyTransferTest.collectAndPatternMatching   10000  thrpt    5    17456,753 ±   154,751  ops/s
```