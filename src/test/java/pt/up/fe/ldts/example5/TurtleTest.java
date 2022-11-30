package pt.up.fe.ldts.example5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TurtleTest {
    @Test
    public void testRotateLeft() {
        Turtle turtle = new Turtle(5, 5, 'N');
        turtle.execute('L');
        Assertions.assertEquals('W', turtle.getDirection());
        turtle.execute('L');
        Assertions.assertEquals('S', turtle.getDirection());
        turtle.execute('L');
        Assertions.assertEquals('E', turtle.getDirection());
        turtle.execute('L');
        Assertions.assertEquals('N', turtle.getDirection());
        Assertions.assertEquals(5, turtle.getRow());
        Assertions.assertEquals(5, turtle.getColumn());
    }

    @Test
    public void testRotateRight() {
        Turtle turtle = new Turtle(5, 5, 'N');
        turtle.execute('R');
        Assertions.assertEquals('E', turtle.getDirection());
        turtle.execute('R');
        Assertions.assertEquals('S', turtle.getDirection());
        turtle.execute('R');
        Assertions.assertEquals('W', turtle.getDirection());
        turtle.execute('R');
        Assertions.assertEquals('N', turtle.getDirection());
        Assertions.assertEquals(5, turtle.getRow());
        Assertions.assertEquals(5, turtle.getColumn());
    }

    @Test
    public void testForward() {
        Turtle turtleN = new Turtle(5, 5, 'N');
        turtleN.execute('F');
        Assertions.assertEquals(4, turtleN.getRow());
        Assertions.assertEquals(5, turtleN.getColumn());

        Turtle turtleW = new Turtle(5, 5, 'W');
        turtleW.execute('F');
        Assertions.assertEquals(5, turtleW.getRow());
        Assertions.assertEquals(4, turtleW.getColumn());

        Turtle turtleS = new Turtle(5, 5, 'S');
        turtleS.execute('F');
        Assertions.assertEquals(6, turtleS.getRow());
        Assertions.assertEquals(5, turtleS.getColumn());

        Turtle turtleE = new Turtle(5, 5, 'E');
        turtleE.execute('F');
        Assertions.assertEquals(5, turtleE.getRow());
        Assertions.assertEquals(6, turtleE.getColumn());
    }

}