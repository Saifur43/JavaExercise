
public class Person {
    String name,address;
    int acn;
    double balance;
    
    public Person(){}
    public Person(String name, String address, int acn,  double balance){
        this.acn = acn;
        this.name = name;
        this.address = address;
        this.balance = balance;
    } 
    public int getAccountNo(){
        return acn;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public double getBalance(){
        return balance;
    }
    
}
