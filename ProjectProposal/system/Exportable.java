package ProjectProposal.system;

public interface Exportable {

    String getBatchId();

    String getDestinationCountry();

    double calculateTotalPrice();

    String getDescription();
}
