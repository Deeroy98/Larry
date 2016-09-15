package larryandbrad;

public class LarryAndBrad 
{
    public static void main(String[] args) 
    {
        Circle domCircle = new Circle();
        domCircle.rotate();
        domCircle.playSound();
        domCircle.explode();
        
        Triangle leonTriangle = new Triangle();
        leonTriangle.playSound();
        leonTriangle.rotate();
        leonTriangle.explode();
        
        Square connorSquare = new Square();
        connorSquare.playSound();
        connorSquare.rotate();
        connorSquare.explode();
    }  
}
