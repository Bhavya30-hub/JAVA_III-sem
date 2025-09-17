class Triangle 
{
    int a, b, c;

    Triangle() 
    {
        a = 5;
        b = 6;
        c = 7;
    }

    void display() 
    {
        int perimeter = a + b + c;
        double s = perimeter / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    public static void main(String[] args) 
    {
        System.out.println("Bhavya Sangwan , 24csu039 ");
        
        Triangle t = new Triangle();
        t.display();
    }
}
