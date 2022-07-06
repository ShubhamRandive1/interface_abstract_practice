abstract class Shape {

    abstract void draw();
}


class Rectangle extends Shape{
    void draw(){
        System.out.println("Drtawing Rectangle");
    }
}


class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}


class TestAbstraction{
    public static void main(String[] args) {

        Shape s = new Circle();
        Shape ss = new Rectangle();


        s.draw();
        ss.draw();
    }
}