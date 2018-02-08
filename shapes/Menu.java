import java.util.*;

public class Menu {
    public static void main(String[] args) {
        
            int xval;
            int yval;
            double h;
            double r;

            Shape shapes[] = new Shape[100];

            int flag = 1;
            int i = 0;

          while (flag == 1) {

            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Please input the ting you want: ");
                System.out.println("2.Point 3.Circle 4.Cylinder 5.Print everyting 0.exit");
        
                System.out.print("i = ");
                System.out.println(i);

                int choice = input.nextInt();
                switch(choice) {
 
                    case 0: 
                        System.out.println("exiting system");
                        System.exit(0);

                    case 2: 
                        System.out.println("input xval");
                        xval = input.nextInt();

                        System.out.println("input yval");
                        yval = input.nextInt();

                        Point point = new Point(xval, yval);
                        shapes[i] = point;
                        System.out.println(shapes[i].getName());
                        i++;
                        break;

                    case 3: 
                        System.out.println("input xval");
                        xval = input.nextInt();

                        System.out.println("input yval");
                        yval = input.nextInt();

                        System.out.println("input radius");
                        r = input.nextDouble();

                        Circle circle = new Circle(xval, yval, r);
                        shapes[i] = circle;
                        i++;
                        break;

                    case 4: 
                        System.out.println("input xval");
                        xval = input.nextInt();

                        System.out.println("input yval");
                        yval = input.nextInt();

                        System.out.println("input radius");
                        r = input.nextDouble();

                        System.out.println("input height");
                        h = input.nextDouble();

                        Cylinder cylinder = new Cylinder(xval, yval, r, h);
                        shapes[i] = cylinder;
                        i++;
                        break;
 
                    case 5: 
                        System.out.println("Printing everything");

                        for(int k=0;k<shapes.length;k++)
                        {
                             if(shapes[k] == null)
                            {
                                System.out.println("at the end");
                                break;
                            }

                            System.out.println();
                            System.out.println(shapes[k].getName());
                            System.out.println(shapes[k].toString());
                            System.out.println(shapes[k].getArea());
                            System.out.println(shapes[k].getVolume());
                            System.out.println();
                            
                        }
                        break;

                    default:    
                        System.out.println("invalid input, try again");
                        break;
               }
            }
                catch (ArithmeticException e) {
                System.err.printf("Exception: %s \n", e);
                System.err.printf("Numbers should be positive integers different than zero   \n");
                }

                catch (InputMismatchException e) {
                System.err.printf("Exception: %s \n", e);
                System.err.printf("Inputs should be integers \n");
                }

        }
 

    }

}
