package good_code;
import bad_code.BadOrderExample;

import java.util.*;
public class goodOrderExample {


        static class Customer {
            private final String name;
            private final String email;

            Customer(String name, String email) {
                this.name = name;
                this.email = email;
            }

            String getName() {
                return name;
            }

            String getEmail() {
                return email;
            }
        }

        static class Payment {
            private final String type;

            Payment(String type) {
                this.type = type;
            }

            String getType() {
                return type;
            }
        }

        static class Order implements shipment {
            private final String name;
            private final double totalPrice;

            Order(String name, double totalPrice) {
                this.name = name;
                this.totalPrice = totalPrice;
            }

            String getName() {
                return name;
            }

            double getTotalPrice() {
                return totalPrice;
            }
            @Override
             public void ship(){
                System.out.println("Shipping " + name);
            };



        }

        static class DeliveryOrder extends Order implements shipment {
            DeliveryOrder(String name, double price) {
                super(name, price);
            }

            @Override
            public void ship() {
                System.out.println("Delivering " + getName() + " to customer's address");
            }
        }

        static class PickUpOrder extends Order {
            PickUpOrder(String name, double price) {
                super(name, price);
            }


        }
        class visa implements payment_method{
            @Override
            public void pay() {
                System.out.println("Processing visa card payments...");
            }
        }
        class masterCard implements payment_method{
            @Override
            public void pay() {
                System.out.println("Processing master card payments...");
            }
        }
        class americanExpress implements payment_method{
            @Override
            public void pay() {
                System.out.println("Processing american express card payments...");
            }
        }
    static class OrderManager {
       payment_method payment_method;
       OrderManager(payment_method payment_method){
           this.payment_method=payment_method;
       }
        public void processOrder(goodOrderExample.Order order) {
            System.out.println("Processing order: " + order.getName() + " now...");
        }

        public void processPayment(goodOrderExample.Order order, goodOrderExample.Payment payment) {
            System.out.println("Processing payment of order: " + order.getName());
            System.out.println("Issuing payment for amount: " + order.getTotalPrice());
            payment_method.pay();
        }

        void sendEmailNotification(goodOrderExample.Customer customer, String message) {
            System.out.println("Sending email notification to: " + customer.getEmail()
                    + " with message: " + message);
        }
    }
    static class Subscriber implements subscribtion,registration {


        @Override
        public void register(String name) {
            System.out.println(name + " registered");
        }

        @Override
        public void subscribe(String name) {
            System.out.println(name + " subscribed to newsletter");
        }
    }



    }

