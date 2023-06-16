package Geometry;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
        public static void menu (){
            int number;
            Scanner sc = new Scanner (System.in);

            do {
                System.out.println("1. Calculate the Area of a Circle ");
                System.out.println("2. Calculate the Area of a Rectangle");
                System.out.println("3. Calculate the Area of a Triangle");
                System.out.println("4.Quit");
                System.out.println("ENTER YOUR CHOICE (1-4)");
                number = sc.nextInt();
                if (number == 1) {
                    System.out.println("enter length:");
                    double length = sc.nextDouble();
                    if (length > 0) {
                        System.out.println("enter width:");
                        double width = sc.nextDouble();
                        if (width > 0) {
                            System.out.println("The area of rectangle is " + Geometry.areaRectangle(length, width));
                        }
                        else {
                            System.out.println("pls try again");
                        }

                    }
                        else {
                            System.out.println("pls try again");
                        }
                    }

                else if (number == 2) {
                    System.out.println("enter base:");
                    double base=sc.nextDouble();
                    if (base>0){
                    System.out.println("enter height:");
                    double height=sc.nextDouble();
                    if (height>0){
                        System.out.println("The area of triangle is "+Geometry.areaTriangle(base,height));
                    }
                    else {
                        System.out.println("pls try again");
                    }
                    }
                    else {
                        System.out.println("pls try again");
                    }


                }
                else if (number == 3) {
                    System.out.println("enter radius:");
                    double radius = sc.nextDouble();
                    if (radius > 0) {
                        System.out.println("The area of circle is " + Geometry.areaCirlcle(radius));
                    }
                    else {
                        System.out.println("pls try again");
                    }
                }
                else if (number == 4) {
                    System.out.println("bye");
                }
                if(number>4||number<0){
                    System.out.println("try again");
                }

            } while (number<=4);
        }
    }

