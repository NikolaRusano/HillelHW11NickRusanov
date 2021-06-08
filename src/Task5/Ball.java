package Task5;

public enum Ball {
    Wilson(7.0,"basketball",823.0,"rubber"),
    Reflex(5.0,"football",339.0,"polyvinyl Chloride"),
    ExtremeMotion(5.0,"volleyball",229.0,"polyvinyl Chloride"),
    Nike(7.0,"basketball",1197.0,"Synthetic Leather"),
    Select(5.0,"American football",480.0,"rubber");

    double size, price;
    String sportKind, material;

    Ball(double size, String sportKind,double price, String material) {
        this.size = size;
        this.price = price;
        this.sportKind = sportKind;
        this.material = material;
    }

    public double getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getSportKind() {
        return sportKind;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString(){
        return "Ball{" +
                " Size: " + size +
                " Sport kind: " + sportKind +
                " price" + price +
                " Material: " + material + '\'' + '}';
    }


}
