public class Cuboid {
    public static void main(String[] args) {

        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double cuboidSideA = 10.2;
        double cuboidSideB = 15.882;
        double cuboidSideC = 20.881;

        double surfaceArea = 2 * (cuboidSideA * cuboidSideB + cuboidSideB * cuboidSideC + cuboidSideA * cuboidSideC);

        double volume = cuboidSideA * cuboidSideB * cuboidSideC;

        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);

    }

}
