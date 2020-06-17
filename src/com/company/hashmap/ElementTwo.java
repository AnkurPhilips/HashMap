package com.company.hashmap;

import java.util.Objects;

public class ElementTwo extends ElementOne {

    ElementTwo(int id, String message){
        super(id,message);
    }

    public String getMessage(){
        return super.getMessage();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElementTwo that = (ElementTwo) o;
        return id == that.id &&
                Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, message);
    }
}
