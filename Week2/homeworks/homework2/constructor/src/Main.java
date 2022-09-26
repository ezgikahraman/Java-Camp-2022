public class Main {
    public static void main(String[] args) {

        Product product = new Product("Laptop",1,"Laptop Description",5000,2,"Black");
        System.out.println("id : " + product.getId());
        System.out.println("Name : " + product.getName());
        System.out.println("Color : " + product.getColor());
        System.out.println("Description : " + product.getDescription());
        System.out.println("Price : " + product.getPrice());
        System.out.println("Stock Amount : " + product.getStockAmount());
        System.out.println("Code : " + product.getCode());

    }
}