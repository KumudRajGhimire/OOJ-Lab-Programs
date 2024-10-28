import java.util.Scanner;



class Account {

    String name;
    int accno;
    int balance;

    public Account(String name, int accno, int balance) {
        this.name = name;
        this.accno = accno;
        this.balance = balance;
    }

    void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Amount can't be negative");
        }
    }

    void display() {
        System.out.println("Current balance: " + balance);
    }
}

class Current extends Account {
    private int min = 4000;
    private int service = 1000; 

    public Current(String name, int accno, int balance) {
        super(name, accno, balance);
    }

    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn amount: " + amount);
            System.out.println("Remaining Balance: " + balance);
            check(); 
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void check() {
        if (balance < min) {
            balance -= service;
            System.out.println("Service charge deducted: " + service);
            System.out.println("New balance after service charge: " + balance);
        }
    }
}

class Saving extends Account{
    double rate = 5;
    
    public Saving(String name, int accno, int balance) {
        super(name, accno, balance);
    }
    
    void calcInterest(int time){
        double i = (balance*time*rate)/100;
        balance+=i;
        System.out.println("Interest amount = "+i);
    }
    
    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn amount: " + amount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    
}

class Main {
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("What kind of account do you want?\n1.Current\n2.Saving\n");
        ch = sc.nextInt();
        
        if (ch == 1) {
            // Current account logic
            String name;
            int accno, amount;
            System.out.println("Enter your name: ");
            name = sc.next();
            System.out.println("Enter your account no: ");
            accno = sc.nextInt();
            System.out.println("Enter current balance: ");
            amount = sc.nextInt();
            
            Current a1 = new Current(name, accno, amount);
            int c1;
            while (true) {
                System.out.println("Menu\n1.deposit\n2.withdraw\n3.display\n4.exit");
                c1 = sc.nextInt();
                switch (c1) {
                    case 1:
                        System.out.println("Enter amount to deposit: ");
                        int amt = sc.nextInt();
                        a1.deposit(amt);
                        break;

                    case 2:
                        System.out.println("Enter amount to withdraw: ");
                        int wth = sc.nextInt();
                        a1.withdraw(wth);
                        break;

                    case 3:
                        a1.display();
                        break;

                    case 4:
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice");
                }
            }
        } else if (ch == 2) {
            // Saving account logic
            String name;
            int accno, amount;
            System.out.println("Enter your name: ");
            name = sc.next();
            System.out.println("Enter your account no: ");
            accno = sc.nextInt();
            System.out.println("Enter initial balance: ");
            amount = sc.nextInt();
            
            Saving a2 = new Saving(name, accno, amount);
            int c2;
            while (true) {
                System.out.println("Menu\n1.deposit\n2.withdraw\n3.display\n4.calculate interest\n5.exit");
                c2 = sc.nextInt();
                switch (c2) {
                    case 1:
                        System.out.println("Enter amount to deposit: ");
                        int amt = sc.nextInt();
                        a2.deposit(amt);
                        break;

                    case 2:
                        System.out.println("Enter amount to withdraw: ");
                        int wth = sc.nextInt();
                        a2.withdraw(wth);
                        break;

                    case 3:
                        a2.display();
                        break;

                    case 4:
                        System.out.println("Enter time in years to calculate interest: ");
                        int time = sc.nextInt();
                        a2.calcInterest(time);
                        System.out.println("Interest calculated and added to balance.");
                        break;

                    case 5:
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice");
                }
            }
        } else {
            System.out.println("Invalid account type selected.");
        }
    }
}



