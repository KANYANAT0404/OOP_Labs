        package Lab4.Q4;

            public class TriangleManagerTest {
                public static void main(String[] args) {
                    TriangleManager manager = new TriangleManager(true);
                    Triangle t1 = new EquilateralTriangle(4.0);      
                    Triangle t2 = new RightTriangle(3.0, 4.0, 5.0);  
                    Triangle t3 = new EquilateralTriangle(6.0);      
                    manager.addTriangle(t1);
                    manager.addTriangle(t2);
                    manager.addTriangle(t3);

                    System.out.println("--- TriangleManager Test ---");
                    Triangle largest = manager.findTriangleWithLargestPerimeter();
                    if (largest != null) {
                        System.out.println("Largest Perimeter: " + largest.getPerimeter());
                    }

                    System.out.println("\n--- Exception Test ---");
                    try {
                        manager.addTriangle(null); 
                    } catch (IllegalArgumentException e) {
                        System.out.println("Caught Expected Error: " + e.getMessage());
                    }

            }
    }
