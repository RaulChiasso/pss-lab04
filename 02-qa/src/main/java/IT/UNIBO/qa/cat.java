package it.unibo.qa;

public class Cat {

    private static int  NINE = 9;
    static public  int numberoflives= NINE;

    private String name, color, breed;
    private int age;

    public Cat(String meow, final String c, final int age, final String korat) {
        this.name = meow;
        this.color = c;
        this.age = age;
        this.breed = korat;
    }

    /*
        This method is useful because it allows the cat to meow 
        and introduce itself to the world in a single line of code.
    */
    public String meow(){
        return "Meow, meow, I am " 
                + this.name + 
                ", hear me purr, In this feline world," +
                 " I'm the star, that's for sure." + 
                "With whiskers long and fur so sleek," + 
                " I'm here to share my story, so take a peek!";
    }
    
    public void setColor(String c) {
        this.color = c;
    }

    public String getColor() {
        return this.color;
    }

    public int hasSameColor(Cat cat){
        if (this.getColor()==cat.getColor()) {
            return  1;
        } else {
            return 0;
        }
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Kiri", "Gray",4, "Korat");
        System.out.println(cat.meow());
    }
}
