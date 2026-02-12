public enum EnumQone {

    oneBHK(100000),
    twoBHK(150000),
    threeBHK(200000);

    int price;

    EnumQone(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    static void main(String[] args) {

        for(EnumQone e : EnumQone.values()){
            System.out.println(e + " house value " + e.getPrice());
        }

    }
}
