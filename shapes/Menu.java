 import java.util.*;

public class Menu {
    public int Menu(int i)
        throws IllegalArgumentException, ArithmeticException {

            int xval;
            int yval;
            double h;
            double r;

            Shape shapes[] = new Shape[100];

            Scanner input = new Scanner(System.in);

            System.out.print("Please input the ting you want: ");
            System.out.println("2.Point 3.Circle 4.Cylinder 5.Print everyting");
        
            int choice = input.nextInt();

            switch(choice) {
                case 2: 
                    System.out.println("input xval");
                    xval = input.nextInt();

                    System.out.println("input yval");
                    yval = input.nextInt();

                    Point point = new Point(xval, yval);
                    shapes[i] = point;
                    System.out.println(shapes[i].getName());
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

                        System.out.println(shapes[k].getName());
                        
                   break;
                    }

                case 0: 
                    System.out.println("exiting system");
                    return 0;
                            
            }
            return 1;
    }

    public static void main(String[] args) {

      int flag = 1;
      int i = 0;

          while (flag == 1) {

            Menu menu = new Menu();

            try {
              flag = menu.Menu(i);
              i++;
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
