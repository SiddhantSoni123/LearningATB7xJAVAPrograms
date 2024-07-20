package Ex_20072024;

public class Triangle_Classifier {
        public static void main(String[] args)
        {
            int a = 8, b = 7, c = 9;
            if (a == b && b == c )
                System.out.println("Equilateral Triangle");
            else if (a == b || b == c || c == a )
                System.out.println("Isosceles Triangle");
            else
                System.out.println("Scalene Triangle");
        }
}

