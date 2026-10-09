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
    static class OrderManager {

        public void processOrder(BadOrderExample.Order order) {
            System.out.println("Processing order: " + order.getName() + " now...");
        }

        public void processPayment(BadOrderExample.Order order, BadOrderExample.Payment payment) {
            System.out.println("Processing payment of order: " + order.getName());
            System.out.println("Issuing payment for amount: " + order.getTotalPrice());
            if (payment.getType().equalsIgnoreCase("VISA")) {
                System.out.println("Processing visa card payments...");
            } else if (payment.getType().equalsIgnoreCase("MASTER_CARD")) {
                System.out.println("Processing master card payments...");
            } else if (payment.getType().equalsIgnoreCase("AMERICAN_EXPRESS")) {
                System.out.println("Processing american express card payments...");
            } else {
                throw new UnsupportedOperationException("Un supported payment...");
            }
        }

        void sendEmailNotification(BadOrderExample.Customer customer, String message) {
            System.out.println("Sending email notification to: " + customer.getEmail()
                    + " with message: " + message);
        }
    }


    }

