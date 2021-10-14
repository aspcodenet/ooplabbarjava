package se.systementor;


public class Matratt {
    private String namn;
    private float price;
    private String type;
    private int calories;


    public Matratt(String namn, float price, String type, int calories) {
        super();
        this.namn = namn;
        this.price = price;
        this.type = type;
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public String getType() {
        return type;
    }


    public float getPrice() {
        return price;
    }


    public String getNamn() {
        return namn;
    }


    
}
