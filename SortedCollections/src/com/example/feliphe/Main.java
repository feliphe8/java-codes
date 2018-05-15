package com.example.feliphe;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for (String s : stockList.items().keySet()){
            System.out.println(s);
        }

        Basket felipheBasket = new Basket("Feliphe");

        sellItem(felipheBasket, "car", 1);
        System.out.println(felipheBasket);

        sellItem(felipheBasket, "car", 1);
        System.out.println(felipheBasket);

        if (sellItem(felipheBasket, "car", 1) != 1){
            System.out.println("There are no more cars in stock");
        }
        sellItem(felipheBasket, "spanner", 5);
//        System.out.println(felipheBasket);

        sellItem(felipheBasket, "juice", 4);
        sellItem(felipheBasket, "cup", 12);
        sellItem(felipheBasket, "bread", 1);
//        System.out.println(felipheBasket);
//        System.out.println(stockList);

        Basket basket = new Basket("Customer");
        sellItem(basket,"cup", 100);
        sellItem(basket, "juice", 5);
        removeItem(basket, "cup", 1);
        System.out.println(basket);

        removeItem(felipheBasket, "car", 1);
        removeItem(felipheBasket, "cup", 9);
        removeItem(felipheBasket, "car", 1);
        System.out.println("Cars removed " + removeItem(felipheBasket, "car", 1)); //should not remove any

        System.out.println(felipheBasket);
        removeItem(felipheBasket, "bread", 1);
        removeItem(felipheBasket, "cup", 3);
        removeItem(felipheBasket, "juice", 4);
        removeItem(felipheBasket, "cup", 3);
        System.out.println(felipheBasket);

        System.out.println("\nDisplay stock list before and after checkout");
        System.out.println(basket);
        System.out.println(stockList);
        checkout(basket);
        System.out.println(basket);
        System.out.println(stockList);


//        temp = new StockItem("pen", 1.12);
//        stockList.items().put(temp.getName(), temp);
        StockItem car = stockList.items().get("car");
        if (car != null){
            car.adjustStock(2000);
        }
        if (car != null){
            stockList.get("car").adjustStock(-1000);
        }
        System.out.println(stockList);

//        for (Map.Entry<String, Double> price: stockList.priceList().entrySet()){
//            System.out.println(price.getKey() + " costs " + price.getValue());
//        }

        checkout(felipheBasket);
        System.out.println(felipheBasket);
    }

    public static int sellItem(Basket basket, String item, int quantity){
        // retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null){
            System.out.println("We do not sell " + item);
            return 0;
        }

        if (stockList.reserveStock(item, quantity) != 0){
            return basket.addToBasket(stockItem, quantity);
        }

        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity){
        // retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null){
            System.out.println("We do not sell " + item);
            return 0;
        }

        if (basket.removeBasket(stockItem, quantity) == quantity){
            return stockList.unreserveStock(item, quantity);
        }

        return 0;
    }

    public static void checkout(Basket basket){
        for (Map.Entry<StockItem, Integer> item : basket.items().entrySet()){
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
