public class MyClass {
    public static void main(String args[]) {
        Color[][] mat = new Color[][] {
            {new Color(0, 1, 1), new Color(1, 2, 3), new Color(7, 7, 7), new Color(5, 1, 2), new Color(1, 1, 7)},
            {new Color(2, 1, 2), new Color(1, 7, 7), new Color(2, 0, 2), new Color(3, 3, 2), new Color(5, 5, 0)},
            {new Color(4, 4, 4), new Color(4, 6, 7), new Color(4, 5, 6), new Color(1, 5, 7), new Color(3, 6, 7)},
            {new Color(3, 0, 3), new Color(5, 2, 2), new Color(1, 1, 1), new Color(6, 6, 0), new Color(2, 2, 2)},
            {new Color(1, 2, 1), new Color(0, 4, 4), new Color(3, 1, 6), new Color(3, 3, 3), new Color(2, 4, 6)}
        };
        
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            System.out.println("Row " + (i+1) + ": ");
            
            for (int j = 0; j < mat[i].length; j++) {
                double redComponent = (double) mat[i][j].R / 255;
                double greenComponent = (double) mat[i][j].G / 255;
                double blueComponent = (double) mat[i][j].B / 255;
                
                String redFormat = String.format("%1.4f", redComponent);
                double red = Double.valueOf(redFormat);
                
                String greenFormat = String.format("%1.4f", greenComponent);
                double green = Double.valueOf(greenFormat);
                
                String blueFormat = String.format("%1.4f", blueComponent);
                double blue = Double.valueOf(blueFormat);
                
                double V = Math.max(red, Math.max(green, blue));
                double temp = V - Math.min(red, Math.min(green, blue));
                
                System.out.printf("(%.4f, %.4f, %.4f)\n", red, green, blue);
                System.out.printf("Saturation = %.4f / %.4f = %.4f\n", temp, V, (temp/V));
                System.out.printf("Intensity = max{%.4f, %.4f, %.4f} = %.4f\n\n", red, green, blue, V);
            }
            
            System.out.println();
        }
    }
    
    static class Color {
        int R, G, B;
        
        Color(int R, int G, int B) {
            this.R = R;
            this.G = G;
            this.B = B;
        }
    }
}
