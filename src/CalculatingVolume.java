+import java.text.DecimalFormat;
+import java.util.Scanner;
+
+/**
+ * Created by sai on 11/22/16.
+ */
+public class CalculatingVolume {
+
+    static double pi = Math.PI;
+
+    static DecimalFormat df = new DecimalFormat("#.####");
+
+    public static void main (String [] args) {
+        Scanner sc = new Scanner(System.in);
+        int numberOfTestCases = sc.nextInt();
+        for (int i=0; i < numberOfTestCases; i++) {
+            int input = sc.nextInt();
+            switch (input) {
+                case 1:
+                    calculateVolumeOfCube();
+                    break;
+                case 2:
+                    calculateVolumeOfCuboid();
+                    break;
+                case 3:
+                    calcualteVolumeOfHemisphere();
+                    break;
+                case 4:
+                    calculateVolumeOfCylinder();
+                    break;
+                default:
+                    System.out.println("invalid range");
+                    break;
+            }
+        }
+    }
+
+    private static boolean numberFormatExceptionCheck(double value) {
+        if(value <=0){
+            System.out.println("java.lang.NumberFormatException: All the values must be positive");
+            return true;
+        }
+        return false;
+    }
+
+    private static void calculateVolumeOfCube() {
+        Scanner sc = new Scanner(System.in);
+        double side = sc.nextDouble();
+        if(!numberFormatExceptionCheck(side)) {
+            double output = side * side * side;
+            System.out.println(df.format(output));
+        }
+    }
+
+    private static void calculateVolumeOfCuboid() {
+        Scanner sc = new Scanner(System.in);
+        double length = sc.nextDouble();
+        double breadth = sc.nextDouble();
+        double height = sc.nextDouble();
+        if(!numberFormatExceptionCheck(length) && !numberFormatExceptionCheck(breadth)
+                && !numberFormatExceptionCheck(height)) {
+            double output = length*breadth*height;
+            System.out.println(df.format(output));
+        }
+    }
+
+    private static void calcualteVolumeOfHemisphere() {
+        Scanner sc = new Scanner(System.in);
+        double radius = sc.nextDouble();
+        if(!numberFormatExceptionCheck(radius)) {
+            double output = 2.0/3.0*(pi)*radius*radius*radius;
+            System.out.println(df.format(output));
+        }
+    }
+
+    private static void calculateVolumeOfCylinder() {
+        Scanner sc = new Scanner(System.in);
+        double radius = sc.nextDouble();
+        double height = sc.nextDouble();
+        if(!numberFormatExceptionCheck(radius) && !numberFormatExceptionCheck(height)) {
+            double output = (pi)*radius*radius*height;
+            System.out.println(df.format(output));
+        }
+    }
+
+    //things learnt
+    // 2/3*pi =0, but 2.0/3.0*pi is non zero
+
+    // how to round decimal to four places4
+
+}
