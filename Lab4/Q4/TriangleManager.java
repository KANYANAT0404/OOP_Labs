        package Lab4.Q4;

        import java.util.ArrayList;
        import java.util.LinkedList;
        import java.util.List;
        

            public class TriangleManager {
            private List<Triangle> triangles;

    
            public TriangleManager(boolean useArrayList) {
        if (useArrayList) {
            this.triangles = new ArrayList<>();
        } else {
            this.triangles = new LinkedList<>();
        }
    }

    
    public void addTriangle(Triangle t) {
        if (t == null) {
            throw new IllegalArgumentException("Triangle cannot be null");
        }
        this.triangles.add(t);
    }

    
    public Triangle findTriangleWithLargestPerimeter() {
        if (this.triangles == null || this.triangles.isEmpty()) {
            return null;
        }

        Triangle largestTriangle = this.triangles.get(0);

        for (Triangle t : this.triangles) {
            if (t.getPerimeter() > largestTriangle.getPerimeter()) {
                largestTriangle = t;
            }
        }

        return largestTriangle;
    }
}

