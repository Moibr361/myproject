import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        double length;
        double width;
        double hight;
        double radius;
        double secondLength;
        int variable = 1;
        boolean found = true;
        String shape;
        Scanner sc = new Scanner(System.in);
        while (found) {
            System.out.println("Enter shape between (rectangle,square,circle and triangle ):");
            shape = sc.next();
            switch (shape.toLowerCase()) {
                case "rectangle":
                    System.out.println("enter length in M:");
                    String input = sc.next();
                    input = input.replace(',', '.');
                    length = Double.parseDouble(input);
                    System.out.println("enter width in M:");
                    String w = sc.next();
                    w = w.replace(',', '.');
                    width = Double.parseDouble(w);
                    rectangle r = new rectangle(length, width);
                    System.out.println("The Area = " + r.getArea()+" M^2");
                    System.out.println("The Perimeter = " + r.getPerimeter()+" M");
                    break;
                case "square":
                    System.out.println("enter length in M:");
                    String l = sc.next();
                    l = l.replace(',', '.');
                    length = Double.parseDouble(l);
                    square s = new square(length);
                    System.out.println("The Area = " + s.getArea()+" M^2");
                    System.out.println("The Perimeter = " + s.getPerimeter()+" M");
                    break;
                case "circle":
                    System.out.println("enter radius in M:");
                    String a = sc.next();
                    a = a.replace(',', '.');
                    radius = Double.parseDouble(a);
                    circle c = new circle(radius);
                    System.out.println("The Area = " + c.getArea()+" M^2");
                    System.out.println("The Perimeter = " + c.getPerimeter()+" M");
                    break;
                case "triangle":
                    System.out.println("enter length in M:");
                    String i = sc.next();
                    i = i.replace(',', '.');
                    length = Double.parseDouble(i);
                    System.out.println("enter hight in M:");
                    String d = sc.next();
                    d = d.replace(',', '.');
                    hight = Double.parseDouble(d);
                    System.out.println("enter secandLength in M:");
                    String f = sc.next();
                    f = f.replace(',', '.');
                    secondLength = Double.parseDouble(f);
                    triangle t = new triangle(length, hight, secondLength);
                    System.out.println("The Area = " + t.getArea()+" M^2");
                    System.out.println("The Perimeter = " + t.getPerimeter()+" M");
                    break;
                default:
                    System.out.println("Invalid Shape !");
            }
            System.out.println(" enter 1 to continue the program OR enter 0 :");

            variable = sc.nextInt();
            while (variable != 0 && variable != 1){
                System.out.println("Enter Valid Option 1 or 0 :");
                variable = sc.nextInt();
            }
            while(variable==0){
                System.out.println("Program End.");
                found = false;
                break;
            }

            while(variable==1){
                System.out.println("Program Continue.");
                found = true;
                break;
            }

        }



        sc.close();
    }

}

