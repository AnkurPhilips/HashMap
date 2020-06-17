package com.company.hashmap;

public class ElementOne {
    protected final int id;
    protected final String message;

    ElementOne(int id, String message){
        this.id = id;
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

    @Override
    public String toString(){
        return("id :"+this.id+" message: "+this.message);
    }
}
