        package Lab4.Q2;

            public class UndergradStudent extends PSUStudent{
                private int currentYear;

                public UndergradStudent(int age, double gpa){
                    super(age, gpa);
                    if (age<0) {
                        throw new IllegalArgumentException("Age cannot be negative");
                    }
                    if (gpa<0.0 || gpa > 4.0) {
                        throw new IllegalArgumentException("GPA must be between 0.0 and 4.0");
                    }
                    this.currentYear = 1;
                }
                @Override 
                public void setCurrentYear(int currentYear){
                    this.currentYear = currentYear;
                }
                @Override 
                public double revealGrade(){
                    if (this.currentYear >=4) {
                        return this.gpa;
                    }
                    else{
                        return 0.0;
                    }
                }
}
