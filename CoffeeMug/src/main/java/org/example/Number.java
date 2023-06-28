package org.example;

public class Number {
    private int value;

    public Number(int val){
        this.value = val;
    }

    public Number(){
        this.value = 0;
    }

    public void setValue(int val){
        this.value = val;
    }

    public int getValue(){
        return this.value;
    }

    private boolean modwiththree(){
        return this.value % 3 == 0;
    }

    private boolean modwithfive(){
        return this.value % 5 == 0;
    }

    private boolean isprim(){
        int db = 0;

        for (int i = 1; i <= this.value / 2; i++){
            if (this.value % i == 0){
                db++;
            }
            if (db > 1) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        String result = this.value + " ";

        if (isprim() ){
            result = result + "NotCoffeeMug";
        }
        else if (modwiththree() && !modwithfive()) {
            result = result + "Coffee";
        }
        else if (!modwiththree() && modwithfive()){
            result = result + " Mug";
        }
        else if (modwithfive() && modwithfive()) {
            result = result + "CoffeeMug";
        }
        return result;
    }
}
