abstract class Clothing {
    private String name;
    private String brand;
    public String color;
    public Double price = 0.0;

    public Clothing(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setPrice(Double price){
        if (price < 0.0) throw new RuntimeException("Unacceptable Price");
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public static void main(String[] args) {
        Shirt shirt1 = new Shirt("Long-sleeve T-shirt", "Ralph Lauren");
        Shirt shirt2 = new Shirt("Short-sleeve T-shirt", "Ralph Lauren");
        Shirt shirt3 = new Shirt("Long-sleeve Polo Shirt", "Hugo Boss");
        Shirt shirt4 = new Shirt("Short-sleeve Polo shirt", "Hugo Boss");

        Pants pants1 = new Pants("Soft chill pants", "Dressman");
        Pants pants2 = new Pants("Casual jeans", "Levy's");

        shirt1.setColor("Grey");
        shirt1.setPrice(20.00);

        shirt2.setColor("Red");
        shirt2.setPrice(15.00);

        shirt3.setColor("Dark Blue");
        shirt3.setPrice(40.00);

        shirt4.setColor("Dark Green");
        shirt4.setPrice(30.00);

        pants1.setColor("White");
        pants1.setPrice(25.00);

        pants2.setColor("Dark Green");
        pants2.setPrice(35.00);

        System.out.println("The " + shirt1.getName() + " is of brand " + shirt1.getBrand() + ", is available in color " + shirt1.color + " and costs " + shirt1.price + " euros");
        System.out.println("The " + shirt2.getName() + " is of brand " + shirt2.getBrand() + ", is available in color " + shirt2.color + " and costs " + shirt2.price + " euros");
        System.out.println("The " + shirt3.getName() + " is of brand " + shirt3.getBrand() + ", is available in color " + shirt3.color + " and costs " + shirt3.price + " euros");
        System.out.println("The " + shirt4.getName() + " is of brand " + shirt4.getBrand() + ", is available in color " + shirt4.color + " and costs " + shirt4.price + " euros");

        System.out.println("The " + pants1.getName() + "are of brand " + pants1.getBrand() + ", are available in color " + pants1.color + " and cost " + pants1.price + " euros");
        System.out.println("The " + pants1.getName() + " are of brand " + pants2.getBrand() + ", are available in color " + pants2.color + " and cost " + pants2.price + " euros");
    }
}


