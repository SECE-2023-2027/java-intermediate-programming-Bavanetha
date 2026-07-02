class AreaCalculator{

    public static double calculateArea(double radius){
        return 3.14*radius*radius;
    }

    public static double calculateArea(double length, double breadth){
        return length*breadth;
    }

    public static double calculateArea(int side){
        return side*side;
    }
}