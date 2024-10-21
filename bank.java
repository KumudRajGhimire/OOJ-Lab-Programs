class Account {

	String name;
	int accno;
	int balance;

    public Account(String name, int accno, int balance){
        this.name = name;
        this.accno = accno;
        this.balance = balance;
    }
    
    void deposit(int amount){
        if(amount>0){
            balance+=amount;
        }
        else{
            System.out.println("Amount cant be negative");
        }
    }
    
    void display(){
        System.out.println("Current balance: "+balance);
    }

}

class Current extends Account {
    public Current(String name, int accno, int balance){
	    super(name,accno,balance);
        int min = 4000;
        int service = 1000;
	   
	}
	
	void withdraw(int amount){
	    if (amount<=balance){
	        balance-=amount;
	        System.out.println("Withdrawed amount: "+amount);
	        System.out.println("Remaining Balance: "+balance);
	    }
	    
    void check(){
        if (balance<min){
            balance-=service;
            System.out.println("Service charge deducted: "+service);
        }
    }
	  
	    
	}
}

// class Saving extends Account {
// 	public Saving(String name, int accno, int balance){
	
	
// 	}
    
// }

class Main{
    public static void main (String[] args) {
        Current a1 = new Current("Harry",544955,5000,4000,500);
        
        a1.withdraw(500);
    }
}



