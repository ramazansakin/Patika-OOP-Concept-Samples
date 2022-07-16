package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsSampleUsage {

    static class Product {
        private int id;
        private String name;
        private float price;

        public Product(int id, String name, float price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }

        // "id getter-setter ?"
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public float getPrice() {
            return price;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    public static void main(String[] args) {

        // Filtering Collection without using Stream
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenovo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

        List<Float> productPriceList = new ArrayList<Float>();
        for (Product product : productsList) {

            // filtering data of list
            if (product.price < 30000) {
                productPriceList.add(product.price);    // adding price to a productPriceList
            }
        }
//        System.out.println(productPriceList);   // displaying data


        // Filtering Collection by using Stream
        productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1, "HP Laptop", 25000f));
        productsList.add(new Product(2, "Dell Laptop", 30000f));
        productsList.add(new Product(3, "Lenevo Laptop", 28000f));
        productsList.add(new Product(4, "Sony Laptop", 28000f));
        productsList.add(new Product(5, "Apple Laptop", 90000f));

        List<Float> productPriceList2 = productsList.stream()
                .filter(p -> p.price > 29000)// filtering data
                .map(p -> p.price)
                .collect(Collectors.toList()); // collecting as list
        // System.out.println(productPriceList2);


        // Stream Iterating Example
        Stream.iterate(1, element -> element + 1)
                .filter(element -> element % 5 == 0)
                .limit(5)
                .parallel()
                .forEach(System.out::println);


        // Filtering and Iterating Collection
        // This is more compact approach for filtering data
        productsList.stream()
                .filter(product -> product.price == 30000)
                .map(p -> p.name)
                .forEach(System.out::println);


        // reduce() Method in Collection
        // This is more compact approach for filtering data
        Float totalPrice = productsList.stream()
                .map(product -> product.price)
                .reduce(0.0f, (sum, price) -> sum + price);   // accumulating price
        System.out.println(totalPrice);

        // More precise code
        float totalPrice2 = productsList.stream()
                .map(product -> product.price)
                .reduce(0.0f, Float::sum);   // accumulating price, by referring method of Float class
        System.out.println(totalPrice2);


        // Sum by using Collectors Methods
        // Using Collectors's method to sum the prices.
        double totalPrice3 = productsList.stream()
                .collect(Collectors.summingDouble(product -> product.price));
        System.out.println(totalPrice3);


        // Find Max and Min Product Price
        // max() method to get max Product price
        Product productA = productsList.stream().max((product1, product2) -> product1.price > product2.price ? 1 : -1).get();
        System.out.println(productA.price);
        // min() method to get min Product price
        Product productB = productsList.stream().min((product1, product2) -> product1.price > product2.price ? 1 : -1).get();
        System.out.println(productB.price);


        // count() Method in Collection
        // count number of products based on the filter
        long count = productsList.stream()
                .filter(product -> product.price < 30000)
                .count();
        System.out.println(count);


        // Convert List into Set
        // Converting product List into Set
        Set<Float> productPriceSet =
                productsList.stream()
                        .filter(product -> product.price < 30000)   // filter product on the base of price
                        .map(product -> product.price)
                        .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)
        System.out.println(productPriceSet);


        // Convert List into Map
        // Converting Product List into a Map
        Map<Integer, String> productPriceMap =
                productsList.stream()
                        .collect(Collectors.toMap(p -> p.id, p -> p.name));

        System.out.println(productPriceMap);


        // Method Reference in stream
        productPriceList =
                productsList.stream()
                        .filter(p -> p.price > 30000) // filtering data
                        .map(Product::getPrice)         // fetching price by referring getPrice method
                        .collect(Collectors.toList());  // collecting as list
        System.out.println(productPriceList);

    }
}