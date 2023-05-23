package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.List;

public class DataTableStepDefinition {
    @Given("Aşağıdaki tablo bu methodda parametre olarakmkullanılacaktır.")
    public void aşağıdakiTabloBuMethoddaParametreOlarakmkullanılacaktır(DataTable table) {
        //    |name  | surname| number|
        //    |karl  |ortis   |1      |
        //    |guler |tuzuner |10     |
        //    |tuna  | tuzuner|100    |

        List<List<String>> data= table.asLists();

        for (List<String> eachrow : data) {
            for (String eachcell: eachrow) {
                System.out.println(eachcell+ " ");

            }
            System.out.println();
        }

        //table.asMaps();

        // List{
        //  Map{name=Karl, surname=Ortis, number=123},
        //  Map{name=Ali, surname=Osman, number=073109},
        //  Map{name=Vedat, surname=CW, number=073150}
        // }


    }
}
