package de;

class Bank {
    int balance;
    
    void deposit(int amt) {
        this.balance = this.balance + amt;
        System.out.println("Successfully deposited.....amount..." + amt);
    }
    
    void withDraw(int amt) {
        this.balance = this.balance - amt;
        System.out.println("Successfully withdrawn.....amount..." + amt);
    }

    void checkBalance() {
        System.out.println("AVL balance....." + this.balance);
    }
}

class CanaraBank extends Bank {
    public CanaraBank(int balance) {
        this.balance = balance;
    }
    
    void deposit(int amt) {
        if (amt < 50000) {
            this.balance = this.balance + amt;
            System.out.println("From CanaraBank successfully deposited.....amount..." + amt);
        } else {
            System.out.println("From CanaraBank Day Limit exceeds");
        }
    }

    void withDraw(int amt) {
        if (amt < 50000) {
            this.balance = this.balance - amt;
            System.out.println("From CanaraBank successfully withdrawn.....amount..." + amt);
        } else {
            System.out.println("From CanaraBank Day Limit exceeds");
        }
    }

    void checkBalance() {
        System.out.println("From CanaraBank AVL balance....." + this.balance);
    }
}

class KotakBank extends Bank {
    public KotakBank(int balance) {
        this.balance = balance;
    }
    
    void deposit(int amt) {
        if (amt < 200000) {
            this.balance = this.balance + amt;
            System.out.println("From KotakBank successfully deposited.....amount..." + amt);
        } else {
            System.out.println("From KotakBank Day Limit exceeds");
        }
    }

    void withDraw(int amt) {
        if (amt < 200000) {
            this.balance = this.balance - amt;
            System.out.println("From KotakBank successfully withdrawn.....amount..." + amt);
        } else {
            System.out.println("From KotakBank Day Limit exceeds");
        }
    }

    void checkBalance() {
        System.out.println("From KotakBank AVL balance....." + this.balance);
    }
}

class YesBank extends Bank {
    public YesBank(int balance) {
        this.balance = balance;
    }
    
    void deposit(int amt) {
        if (amt < 500000) {
            this.balance = this.balance + amt;
            System.out.println("From YesBank successfully deposited.....amount..." + amt);
        } else {
            System.out.println("From YesBank Day Limit exceeds");
        }
    }

    void withDraw(int amt) {
        if (amt < 500000) {
            this.balance = this.balance - amt;
            System.out.println("From YesBank successfully withdrawn.....amount..." + amt);
        } else {
            System.out.println("From YesBank Day Limit exceeds");
        }
    }

    void checkBalance() {
        System.out.println("From YesBank AVL balance....." + this.balance);
    }
}

class PrabhuBank extends Bank {
    public PrabhuBank(int balance) {
        this.balance = balance;
    }
    
    void deposit(int amt) {
        if (amt < 100000) {
            this.balance = this.balance + amt;
            System.out.println("From PrabhuBank successfully deposited.....amount..." + amt);
        } else {
            System.out.println("From PrabhuBank Day Limit exceeds");
        }
    }

    void withDraw(int amt) {
        if (amt < 100000) {
            this.balance = this.balance - amt;
            System.out.println("From PrabhuBank successfully withdrawn.....amount..." + amt);
        } else {
            System.out.println("From PrabhuBank Day Limit exceeds");
        }
    }

    void checkBalance() {
        System.out.println("From PrabhuBank AVL balance....." + this.balance);
    }
}

class AkashBank extends Bank {
    public AkashBank(int balance) {
        this.balance = balance;
    }
    
    void deposit(int amt) {
        if (amt < 80000) {
            this.balance = this.balance + amt;
            System.out.println("From AkashBank successfully deposited.....amount..." + amt);
        } else {
            System.out.println("From AkashBank Day Limit exceeds");
        }
    }

    void withDraw(int amt) {
        if (amt < 80000) {
            this.balance = this.balance - amt;
            System.out.println("From AkashBank successfully withdrawn.....amount..." + amt);
        } else {
            System.out.println("From AkashBank Day Limit exceeds");
        }
    }

    void checkBalance() {
        System.out.println("From AkashBank AVL balance....." + this.balance);
    }
}

class ShayamBank extends Bank {
    public ShayamBank(int balance) {
        this.balance = balance;
    }
    
    void deposit(int amt) {
        if (amt < 150000) {
            this.balance = this.balance + amt;
            System.out.println("From ShayamBank successfully deposited.....amount..." + amt);
        } else {
            System.out.println("From ShayamBank Day Limit exceeds");
        }
    }

    void withDraw(int amt) {
        if (amt < 150000) {
            this.balance = this.balance - amt;
            System.out.println("From ShayamBank successfully withdrawn.....amount..." + amt);
        } else {
            System.out.println("From ShayamBank Day Limit exceeds");
        }
    }

    void checkBalance() {
        System.out.println("From ShayamBank AVL balance....." + this.balance);
    }
}

public class PolyDemo {
    public static void main(String[] args) {
        Bank bank = null;
        
        bank = new CanaraBank(10000);
        bank.checkBalance();
        bank.withDraw(2300);
        bank.deposit(35700);
        bank.checkBalance();
        
        bank = new KotakBank(75000);
        bank.checkBalance();
        bank.withDraw(2300);
        bank.deposit(35700);
        bank.checkBalance();
        
        bank = new YesBank(85000);
        bank.checkBalance();
        bank.withDraw(2300);
        bank.deposit(35700);
        bank.checkBalance();
        
        bank = new PrabhuBank(50000);
        bank.checkBalance();
        bank.withDraw(20000);
        bank.deposit(40000);
        bank.checkBalance();
        
        bank = new AkashBank(30000);
        bank.checkBalance();
        bank.withDraw(10000);
        bank.deposit(20000);
        bank.checkBalance();
        
        bank = new ShayamBank(40000);
        bank.checkBalance();
        bank.withDraw(15000);
        bank.deposit(25000);
        bank.checkBalance();
    }
}
