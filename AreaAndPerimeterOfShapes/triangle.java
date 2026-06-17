public class triangle{
    private double length,hight,secondLength;
    public triangle(double length,double hight,double secondLength){
        this.length=length;
        this.hight =hight ;
        this.secondLength =secondLength;
    }
    public double getArea(){
        return (0.5*hight*length);
    }
    public double getPerimeter(){
        return (hight+length+secondLength);
    }
}
