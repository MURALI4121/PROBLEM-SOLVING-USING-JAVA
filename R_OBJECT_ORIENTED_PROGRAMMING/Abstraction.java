package R_OBJECT_ORIENTED_PROGRAMMING;

//In java, abstraction is achieved through
//1. Abstract Classes : These cannot be instantiated and can contain abstract methods(methods without implementation)
//                       and concrete methods(methods with full implementation)

//2. Interfaces : These are similar to abstract classes but can only contain abstract methods(before java 8).
//                  From Java 8 onwards, interfaces can also have default and static methods.


// Example : Online payment system

// Consider an online payment system where users can make payments using different payment methods like
// Credit Card, Debit Card, and PayPal.We can create an abstract class Payment
// and derive specific payment method classes from it.

//1. Abstract Class "Payment"
abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void processPayment();
}

//3. Concrete Class "CreditCard Payment"

class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment() {
        //Processing payment with credit card
        System.out.println("Processing credit card payment of $" + amount + " for Card Number " + cardNumber);
    }
}

// 4.Concrete class "Debit Card Payment"
class DebitCardPayment extends Payment {
    String cardNumber;

    DebitCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment() {
        //Processing Payment with Debit Card
        System.out.println("Processing Debit Card payment of $" + amount + "for Card Number " + cardNumber);
    }
}

//5. Concrete class " UPI Payment"

class upiPayment extends Payment {
    String upiID;

    upiPayment(double amount, String upiID) {
        super(amount);
        this.upiID = upiID;
    }

    @Override
    void processPayment() {
        //Processing Payment with upi Payment
        System.out.println("Processing payment of $" + amount + " form upi id" + upiID);
    }
}

// Main class to test the implementation

class PaymentTest {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment(100, "4404-5138-2165");
        payment1.processPayment();

        Payment payment2 = new DebitCardPayment(200, "1234-4567-8901");
        payment2.processPayment();

        Payment payment3 = new upiPayment(150, "murali@ybl");
        payment3.processPayment();
    }
}
