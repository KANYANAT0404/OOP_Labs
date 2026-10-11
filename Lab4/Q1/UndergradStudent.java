        package Lab4.Q1;

            public class UndergradStudent extends PSUStudent{
                 private int currentYear;

            public UndergradStudent(int age, double gpa) {
                super(age, gpa);
                this.currentYear = 1;
         }              
            public void setCurrentYear(int currentYear) {
                this.currentYear = currentYear;
         }

                 @Override
            public double revealGrade() {
                if (this.currentYear >= 4) {
                return this.gpa;
        } 
             else {
                return 0.0d;
        }
    }
}
