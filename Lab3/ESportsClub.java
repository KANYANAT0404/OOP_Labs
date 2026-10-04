      package Lab3;

         public class ESportsClub extends Club{
            public ESportsClub(String c, int m){
                super(c,m);
                this.minNumMember = 1;
            }
                @Override 
                public final void advertise(){
                    System.out.println("No need to advertise");
                }
       }
