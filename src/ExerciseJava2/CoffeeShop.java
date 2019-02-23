package ExerciseJava2;

import java.util.ArrayList;
import java.util.List;

//10. Design classes having attributes and method(only skeleton) for a coffee shop. There are three different actors in our scenario and i have listed the different actions they do also below
//* Customer
//  - Pays the cash to the cashier and places his order, get a token number back
//  - Waits for the intimation that order for his token is ready
//  - Upon intimation/notification he collects the coffee and enjoys his drink
//  ( Assumption:  Customer waits till the coffee is done, he wont timeout and cancel the order. Customer always likes the drink served. Exceptions like he not liking his coffee, he getting wrong coffee are not considered to keep the design simple.)
//
//* Cashier
//  - Takes an order and payment from the customer
//  - Upon payment, creates an order and places it into the order queue
//  - Intimates the customer that he has to wait for his token and gives him his token
//  ( Assumption: Token returned to the customer is the order id. Order queue is unlimited. With a simple modification, we can design for a limited queue size)
//
//* Barista
// - Gets the next order from the queue
// - Prepares the coffee
// - Places the coffee in the completed order queue
// - Places a notification that order for token is ready
public class CoffeeShop {
    public static void main(String[] args) {
        List<Order> ordersInitiated=new ArrayList<>();
        List<Order> ordersCompleted=new ArrayList<>();
    }
}
class Order extends CoffeeShop{
    private int orderId;
    private int price;
    private int quantity;
    Order(int orderId,int price,int quantity){
        this.orderId = orderId;
        this.price = price;
        this.quantity = quantity;
    }
}

class Customer{
    public void placeOrder(){

    }
    public void collectOrder(){

    }
}

class Cashier{
    public void takesOrder(){

    }
    public int createOrder(){
        int token = 0;
        return token;
    }
}

class Barista{
    public void getNextOrder(){

    }
    public void prepareCoffee(){

    }
    public void notifyToken(){

    }
}