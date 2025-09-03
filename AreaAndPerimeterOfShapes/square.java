public class square{
    private double length;
    public square(double length){
        this.length=length;
    }
    public double getArea(){
        return (length*length);
    }
    public double getPerimeter(){
        return (length*4);
    }
}
