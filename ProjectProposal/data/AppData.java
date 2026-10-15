package ProjectProposal.data;

import java.util.ArrayList;
import ProjectProposal.system.Exportable;

public class AppData {

    private static final ArrayList<Exportable> products = new ArrayList<>();

    private AppData() {
    }

    public static ArrayList<Exportable> getProducts() {
        return products;
    }
}
