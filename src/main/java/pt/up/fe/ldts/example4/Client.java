package pt.up.fe.ldts.example4;

import java.util.Objects;

public class Client extends Person {

    public Client(String name, String phone) {super(name, phone);}
    @Override
    public boolean equals(Object o) {return this == o;}
    @Override
    public int hashCode() {return Objects.hash(getName(), getPhone());}
}
