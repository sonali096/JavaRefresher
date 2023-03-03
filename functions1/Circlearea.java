/*Problem Description

You are given a positive integer A denoting the radius of a circle. You have to calculate the area of the circle.

Arae of a circle having radius R is given by (π * R2).

NOTE: Since, the answer can be a real number, you have to return the ceil value of the area. Ceil value of a real number X is the smallest integer that is greater than or equal to X. Use standard PI value in the particular programming language.



Problem Constraints

1 <= A <= 1000



Input Format

First and only argument is an integer A.



Output Format

Return a single integer denoting the ceil value of area of the circle. */

import java.util.*;
public class Circlearea {
    public static int area(int A){
        double a = Math.PI * (A*A);
        int sol = (int) Math.ceil(a);
        return sol;
    }
    //You are given a positive integer A denoting the radius of a sphere. You have to calculate the volume of the sphere.
    //Volume of a sphere having radius R is given by (4 * π * R3) / 3.
    //NOTE: Since, the answer can be a real number, you have to return the ceil value of the volume. Ceil value of a real number X is the smallest integer that is greater than or equal to X.
    public static int volume(int A){
        double vol = (4 * Math.PI) * ( A * A * A) / 3;
        int v = (int) Math.ceil(vol);
        return v;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int radius = scn.nextInt();
        int ans = volume(radius);
        //System.out.println("Area of Circle with Radius" + radius + " is " + ans);
        System.out.println("volume of the sphere with Radius" + radius + " is " + ans);
    }
}
