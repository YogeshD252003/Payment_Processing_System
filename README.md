Polymorphism:  

Payment Processing System 

1.Create an abstract class Payment with the following: 
o A method processPayment() that is abstract. 
o Fields such as amount (double). 
2. Implement subclasses: 
o CreditCardPayment: Represents payments made via credit card, includes fields like 
cardNumber and cardHolderName. 
o UPIPayment: Represents payments made via UPI, includes fields like upiId. 
3. Each subclass should provide its own implementation of processPayment(), including specific 
details about the payment. 
4. In the Main class, demonstrate polymorphism by calling processPayment() on a list of Payment 
objects that include different types of payments. 
