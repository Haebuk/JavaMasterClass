public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Maserati");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");
        System.out.println("make = " + car.getMake());
        car.describeCar();

        BankAccount bobsAccount = new BankAccount("12345", 1000.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");
        System.out.println(bobsAccount.getAccountNumber());

        Customer customer = new Customer();
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getName());
        System.out.println(customer.getEmailAddress());

        Customer secondCustomer = new Customer("Tim", 10000, "tim@tim.com");
        System.out.println(secondCustomer.getEmailAddress());
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
    }


}
