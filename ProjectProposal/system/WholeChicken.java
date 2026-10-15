package ProjectProposal.system;

public class WholeChicken extends ChickenProduct {

        private int numberOfBirds;

        public WholeChicken(String batchId, String destinationCountry,
                        double weightKg, double pricePerKg, int numberOfBirds) {
                super(batchId, destinationCountry, weightKg, pricePerKg);
                this.numberOfBirds = numberOfBirds;
        }

        public int getNumberOfBirds() {
                return numberOfBirds;
        }

        public void setNumberOfBirds(int numberOfBirds) {
                this.numberOfBirds = numberOfBirds;
        }

        @Override
        public String getDescription() {
                return String.format(
                                "[Whole Chicken] Batch %s | Country: %s | Birds: %d | Weight: %.2f kg | Price/kg: %.2f | Total: %.2f",
                                getBatchId(), getDestinationCountry(), numberOfBirds,
                                getWeightKg(), getPricePerKg(), calculateTotalPrice());
        }
}
