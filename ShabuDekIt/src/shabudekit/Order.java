
package shabudekit;

public class Order {
    int maxTable; //the maximum of table 
    int numOfDish; //the number of food 
    int maxMenu;
    
    public Order(int numberPerson, int numOfDish, int maxMenu){
        
        this.maxTable = numberPerson;
        this.numOfDish = numOfDish;
        this.maxMenu = maxMenu;
    }
    public void AddOrder(int numOftable, int listMenu){
        
        if(numOftable<=maxTable){
            
            if(Person.personInResNow[numOftable-1]!=null){
                
                if(numOfDish>0){
                    
                    if(listMenu<=maxMenu){
                        numOfDish--;
                        
                        System.out.println(" Table " + numOftable + "  order the menu number  " + listMenu);
                        
                    }else System.out.println("Food doesn't in this menu");
                    
                }else System.out.println("Food not enough");
                
            }else System.out.println("This table haven't person");   
            
        }else System.out.println("This table haven't in the resturant ");
                   }

    
    
    public int getNumOfDish() {
        return numOfDish;
    }
    

    public int getMaxMenu() {
        return maxMenu;
    }

    @Override
    public String toString() {
        return "The nummber of food can sell per day=" + numOfDish + '}';
    }
    
    
}
