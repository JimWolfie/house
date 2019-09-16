/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun1;
    private Circle sun2;
    private boolean drawn;
    private Person person1; 

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun1 = new Circle();
        sun2 = new Circle();
        person1 = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.makeVisible();
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.changeColor("blue");
            
            window.makeVisible();
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun1.changeColor("blue");
            sun1.moveHorizontal(100);
            sun1.moveVertical(-40);
            sun1.changeSize(80);
            sun1.makeVisible();
            
            sun2.changeColor("yellow");
            sun2.moveHorizontal(0);
            sun2.moveVertical(0);
            sun2.changeSize(81);
            sun2.makeVisible();
            
            person1.moveHorizontal(300);
            
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun1.changeColor("black");
        sun2.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun1.changeColor("yellow");
        sun2.changeColor("blue");
    }
    
    public void sunset()
    {
        sun2.makeInvisible();
        sun1.slowMoveVertical(300);
        person1.makeVisible();
        person1.slowMoveHorizontal(-300);
        person1.makeInvisible();
    } 
}
