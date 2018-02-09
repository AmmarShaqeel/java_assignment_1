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

                int choice = 0;
                System.out.print("input arguments for the shape you want:");
                System.out.println("2.Point 3.Circle 4.Cylinder");
        
                System.out.print("i = ");
                System.out.println(i);

                String argString = input.nextLine();
                String[] argArray = argString.trim().split(" ");
                choice  = argArray.length;

                if (choice < 1){
                    System.out.println("not enough inputs!");
                    continue;
                } else if (choice > 4) {
                    System.out.println("too many arguments!");
                    continue;
                }
                
                switch(choice) {

                    case 2: 
                        xval = Integer.parseInt(argArray[0]);

                        yval = Integer.parseInt(argArray[1]);

                        Point point = new Point(xval, yval);
                        shapes[i] = point;
                        System.out.println(shapes[i].getName());
                        i++;
                        break;

                    case 3: 
                        xval = Integer.parseInt(argArray[0]);

                        yval = Integer.parseInt(argArray[1]);

                        r = Double.parseDouble(argArray[2]);

                        Circle circle = new Circle(xval, yval, r);
                        shapes[i] = circle;
                        i++;
                        break;

                    case 4: 
                        xval = Integer.parseInt(argArray[0]);

                        yval = Integer.parseInt(argArray[1]);

                        r = Double.parseDouble(argArray[2]);

                        h = Double.parseDouble(argArray[3]);

                        Cylinder cylinder = new Cylinder(xval, yval, r, h);
                        shapes[i] = cylinder;
                        i++;
                        break;
 
                    default:    
                        System.out.println("invalid input, try again");
                        break;
            }

               System.out.print("do you want to: ");
               System.out.print("1. print another number, 2. print everything");              
               System.out.println(" 0. exit");
               choice = input.nextInt();             

               switch(choice)
               {
                   case 0:
                       System.out.println("exiting");
                       System.exit(0);

                   case 1:
                       break;
                       
                   case 2:
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
               }




            }
                catch (ArithmeticException e) {
                System.err.printf("Exception: %s \n", e);
                System.err.printf("Numbers should be positive integers different than zero   \n");
                }

                catch (NumberFormatException e) {
                System.err.printf("Exception: %s \n", e);
                System.err.printf("integers please \n");
                }

                catch (InputMismatchException e) {
                System.err.printf("Exception: %s \n", e);
                System.err.printf("Inputs should be integers \n");
                }

        }
 

    }

}
