        package Lab4.Q2;

            public class GradStudent extends PSUStudent{
                  private boolean passThesis;

            public GradStudent(int age, double gpa) {
                  super(age, gpa);
            if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
             if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0.");
        }
            this.passThesis = false;
    }

            @Override
                public void setPassThesis(boolean passThesis) {
                this.passThesis = passThesis;
    }

            @Override
                public double revealGrade() {
                 if (this.passThesis) {
                     return this.gpa;
        } 
            else {
            return 0.0d;
        }
    }
}
