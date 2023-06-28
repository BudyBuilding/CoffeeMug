package org.example;
import org.example.Number;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
    List<Number> lst = new ArrayList<>();

    public ListOfNumbers(){
        for(int i = 0; i < 100; i++){
            this.lst.add(new Number(i+1));
        }
    }

    @Override
    public String toString() {
        String result ="";

        for(int i = 0; i < 100; i++){
            Number numb = this.lst.get(i);
            result = result + numb.toString() + "\n";
        }
        return result;
    }
}
