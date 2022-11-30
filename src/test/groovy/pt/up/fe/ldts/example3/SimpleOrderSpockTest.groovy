package pt.up.fe.ldts.example3

import spock.lang.Specification

class SimpleOrderSpockTest extends Specification {

    def 'Fixed Discount'() {
        given:
            def order = new SimpleOrder(100)
        when:
            order.setDiscount(new FixedDiscount(10))
        then:
            order.getTotal() == 90
    }

    def 'Percentage Discount'() {
        given:
            def order = new SimpleOrder(100)
        when:
            order.setDiscount(new PercentageDiscount(0.2))
        then:
            order.getTotal() == 80
    }

    def 'No Discount'() {
        given:
            def order = new SimpleOrder(100)
        expect:
            order.getTotal() == 100
    }
}
