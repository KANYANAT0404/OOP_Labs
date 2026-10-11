        package Lab4.Q3;

            public class Q3Test {
                public static void main(String[] args) {
                    
                Triangle eq = new EquilateralTriangle(5.0);
                System.out.println("--- Equilateral Triangle ---");
                System.out.println("Longest Side: " + eq.getLongestSideLength());
                System.out.println("Perimeter: " + eq.getPerimeter());
                System.out.println("Largest Angle: " + eq.getLargestAngle());

                System.out.println();

        
                Triangle right = new RightTriangle(3.0, 4.0, 5.0);
                System.out.println("--- Right Triangle ---");
                System.out.println("Longest Side: " + right.getLongestSideLength());
                System.out.println("Perimeter: " + right.getPerimeter());
                System.out.println("Largest Angle: " + right.getLargestAngle());
                }
    
            }
