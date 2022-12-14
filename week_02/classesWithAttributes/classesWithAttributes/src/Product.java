public class Product {

    public Product(int id,String name ,String description, double price, int stockAmount, String renk){
        System.out.println("Yapıcı blok çalıştı");
        this.id = id;
        this.name = name;
        this.renk = renk;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
    }

    //buna overloading deniyor

    public Product(){
    }

    //Product classının bir tane parametresiz bir tane de 6 parametreli constructoru var demek isteyen istediğini kullanır

    //attribute | field
    private int id;
     String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    //getter
    public int getId(){
        return id;
    }

    //setter
    public void setId(int id){
        this.id = id;
        //this içinde bulunduğum class demek

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }


}
