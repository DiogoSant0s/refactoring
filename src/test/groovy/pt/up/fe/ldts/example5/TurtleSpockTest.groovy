package pt.up.fe.ldts.example5

import spock.lang.Specification

class TurtleSpockTest extends Specification {

    def 'Rotate Left'() {
        given:
            def turtle = new Turtle(5, 5, 'N' as char);
        when:
            turtle.execute('L' as char);
        then:
            turtle.getDirection() == 'W' as char
        and:
            turtle.execute('L' as char);
        then:
            turtle.getDirection() == 'S' as char
        and:
            turtle.execute('L' as char);
        then:
            turtle.getDirection() == 'E' as char
        and:
            turtle.execute('L' as char);
        then:
            turtle.getDirection() == 'N' as char
        and:
            turtle.getRow() == 5
            turtle.getColumn() == 5
    }

    def 'Rotate Right'() {
        given:
            def turtle = new Turtle(5, 5, 'N' as char);
        when:
            turtle.execute('R' as char);
        then:
            turtle.getDirection() == 'E' as char
        and:
            turtle.execute('R' as char);
        then:
            turtle.getDirection() == 'S' as char
        and:
            turtle.execute('R' as char);
        then:
            turtle.getDirection() == 'W' as char
        and:
            turtle.execute('R' as char);
        then:
            turtle.getDirection() == 'N' as char
        and:
            turtle.getRow() == 5
            turtle.getColumn() == 5
    }

    def 'Forward'() {
        given:
            def turtleN = new Turtle(5, 5, 'N' as char)
            def turtleW = new Turtle(5, 5, 'W' as char);
            def turtleS = new Turtle(5, 5, 'S' as char);
            def turtleE = new Turtle(5, 5, 'E' as char);
        when:
            turtleN.execute('F' as char)
            turtleW.execute('F' as char);
            turtleS.execute('F' as char);
            turtleE.execute('F' as char);
        then:
            turtleN.getRow() == 4
            turtleN.getColumn() == 5
        and:
            turtleW.getRow() == 5
            turtleW.getColumn() == 4
        and:
            turtleS.getRow() == 6
            turtleS.getColumn() == 5
        and:
            turtleE.getRow() == 5
            turtleE.getColumn() == 6
    }
}
