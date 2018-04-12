package com.android.fruities;

public class Fruit {
    private int name;
    private int letterColor;
    private int image;
    private int info;

    private Fruit(int name, int letterColor, int image, int info) {
        this.name = name;
        this.letterColor = letterColor;
        this.image = image;
        this.info = info;
    }

   private static Fruit[] fruits={
            new Fruit(R.string.apple,R.color.red,R.drawable.apple,R.string.apple_info),
           new Fruit(R.string.banana,R.color.amber,R.drawable.banana,R.string.banana_info),
           new Fruit(R.string.kiwi,R.color.green,R.drawable.kiwi,R.string.kiwi_info),
           new Fruit(R.string.mango,R.color.amber,R.drawable.mango,R.string.mango_info),
           new Fruit(R.string.orange,R.color.orange,R.drawable.orange,R.string.orange_info),
           new Fruit(R.string.pomegranate,R.color.red,R.drawable.pomegranate,R.string.pomegranate_info),
           new Fruit(R.string.strawberry,R.color.red,R.drawable.strawberry,R.string.strawberry_info),
   };

    public static Fruit getFruit(int index){
        return fruits[index];
    }

    public int getName() {
        return name;
    }

    public int getLetterColor() {
        return letterColor;
    }

    public int getImage() {
        return image;
    }

    public int getInfo() {
        return info;
    }

    public static Fruit[] getFruits() {
        return fruits;
    }
}
