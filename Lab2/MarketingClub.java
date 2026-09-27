package Lab2;

        public class MarketingClub extends Club{
            private int budget;
        
        public MarketingClub(String c, int budget, int m){
                super(c,m);
                this.budget = budget;
            }
        public boolean useBudget (int y){
            if (this.budget - y >= 0){
                this.budget -= y;
                return true;
            }
            return false;
        }
        @Override
        public int determineBudget(){
            if (this.budget>1000){
                return 0;
            }
            else{
                return super.determineBudget();
            }
        }
}
