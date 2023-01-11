package week7_exercises;

public class EncapsulatedNFT {
    
    private double balance;
    private String owner;

    public EncapsulatedNFT(double balance, String owner){
        setBalance(balance);
        setOwner(owner);
    }

    public void setBalance(double balance){
        if(balance<0 || balance>10000)
            throw new IllegalArgumentException("Error balance!");
        this.balance = balance;    
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public String toString(){
        return "Owner: " + owner + " Balance: " + balance;
    }

}

class classMain{
    public static void main(String[] args) {
        try {
            EncapsulatedNFT a1 = new EncapsulatedNFT(122565, "Zeynep");
            System.out.println(a1.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
