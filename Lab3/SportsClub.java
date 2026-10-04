      package Lab3;

         public class SportsClub extends Club{
            public SportsClub(String c, int m){
                super (c,m);
            }
         public int getNumMember(){
            return this.numMember;
            }
                @Override 
                public int determineBudget(){
                     return (numMember*1000)+(numMember-minNumMember)*100;
            }
                @Override 
                public void changName(String newName){
                     
                }
       }
