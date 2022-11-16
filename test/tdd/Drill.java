package tdd;

public class Drill {
    public int multiply(int quantity) {
        int amountPerCopy = 1;
        if (quantity > 0 && quantity <= 4){amountPerCopy = 2000;}
        if (quantity >= 5 && quantity <= 9){amountPerCopy = 1800;}
        if  (quantity >= 10 && quantity <= 29){amountPerCopy = 1600;}
        if (quantity >= 30 && quantity <= 49){amountPerCopy = 1500;}
        if (quantity >= 50 && quantity <= 99){amountPerCopy = 1300;}
        if (quantity >= 100 && quantity <= 199){amountPerCopy = 1200;}
        if (quantity >= 200 && quantity <= 499){amountPerCopy = 1100;}
        if (quantity >= 500){amountPerCopy = 1000;}
            return amountPerCopy * quantity;
        }

    }

