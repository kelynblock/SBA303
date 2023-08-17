// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MyOwnAutoShop {
    public static void main(String[] args) {

       Sedan sedan = new Sedan(120, 21000, "Black", 22);
       Ford ford = new Ford(130, 22000, "Blue", 2022, 2000);
       Ford ford2 = new Ford(140, 23000, "Salmon", 2024, 1500);
       Car car = new Car(145, 15000, "Grey");

        System.out.println(sedan.length);
        System.out.println(sedan.color);
        System.out.println(sedan.getSalePrice());
        System.out.println(sedan.speed);
        sou


        System.out.println(ford.speed);
        System.out.println(ford.regularPrice);
        System.out.println(ford.year);
        System.out.println(ford.manufacturerDiscount);
        System.out.println(ford.color);
        System.out.println();

        System.out.println(ford2.speed);
        System.out.println(ford2.regularPrice);
        System.out.println(ford2.year);
        System.out.println(ford2.manufacturerDiscount);
        System.out.println(ford2.color);
        System.out.println();

        System.out.println(car.speed);
        System.out.println(car.regularPrice);
        System.out.println(car.color);



    }



}