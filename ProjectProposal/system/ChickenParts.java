        package ProjectProposal.system;
           
        public class ChickenParts extends ChickenProduct {

            private String partType;

            public ChickenParts(String batchId, String destinationCountry,
                                double weightKg, double pricePerKg, String partType) {
                super(batchId, destinationCountry, weightKg, pricePerKg);
                this.partType = partType;
            }

            public String getPartType() {
                return partType;
            }

            public void setPartType(String partType) {
                this.partType = partType;
            }

            @Override
            public String getDescription() {
                return String.format(
                        "[Chicken Parts] Batch %s | Country: %s | Part: %s | Weight: %.2f kg | Price/kg: %.2f | Total: %.2f",
                        getBatchId(), getDestinationCountry(), partType,
                        getWeightKg(), getPricePerKg(), calculateTotalPrice());
            }
        }

