package Lab2;

        public class Mother extends Parent{
            private Father husband;
            public Mother(){
                super(0);
        }

        public void setHusband(Father husband){
            this.husband = husband;
        }
        @Override 
        public String getFirstName(){
            return "Ms." + super.getFirstName();
        }
        }

