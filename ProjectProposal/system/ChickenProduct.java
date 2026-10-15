package ProjectProposal.system;

public abstract class ChickenProduct implements Exportable {
    private String batchId;
    private String destinationCountry;
    private double weightKg;
    private double pricePerKg;

    public ChickenProduct(String batchId, String destinationCountry,
            double weightKg, double pricePerKg) {
        this.batchId = batchId;
        this.destinationCountry = destinationCountry;
        this.weightKg = weightKg;
        this.pricePerKg = pricePerKg;
    }

    @Override
    public String getBatchId() {
        return batchId;
    }

    @Override
    public String getDestinationCountry() {
        return destinationCountry;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    @Override
    public final double calculateTotalPrice() {
        return weightKg * pricePerKg;
    }

    @Override
    public abstract String getDescription();
}
