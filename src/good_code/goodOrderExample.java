package good_code;
import java.util.*;
public class goodOrderExample {


    public class BadOrderExample {

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

    }
}
