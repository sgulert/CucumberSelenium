Feature: DataTable Usage
#  Datatable lar parametre olarak gonderilecekleri step in altina yazilirlar.
#  Scenario Outline aksine tek bir kere step tetiklenir ve tum data tek seferde step e verilir.
  Scenario: Datatable

    Given  Aşağıdaki tablo bu methodda parametre olarakmkullanılacaktır.

    |name  | surname| number|
    |karl  |ortis   |1      |
    |guler |tuzuner |10     |
    |tuna  | tuzuner|100    |
