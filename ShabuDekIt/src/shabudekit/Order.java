
package shabudekit;

public class Order {
    int maxTable; //จำนวนโต๊ะสูงสุด
    int numOfDish; //จำนวนอาหาร
    int maxMenu;
    
    public Order(int numberPerson, int numOfDish, int maxMenu){
        this.maxTable = numberPerson;
        this.numOfDish = numOfDish;
        this.maxMenu = maxMenu;
    }
    public void AddOrder(int numOftable, int listMenu){
        if(numOftable<=maxTable){
            if(Person.personInResNow[numOftable]!=null){
                if(numOfDish>0){
                    if(listMenu<=maxMenu){
                        numOfDish--;
                        System.out.println("โต๊ะที่ " + numOftable + "  ได้สั่งเมนูที่ " + listMenu);
                    }System.out.println("รายการนี้ไม่อยู่ในเมนู");
                }System.out.println("อาหารไม่พอ");
            }System.out.println("โต๊ะนี้ไม่มีคนนั่ง");          
        }System.out.println("โต๊ะนี้ไม่มีในร้าน");
               
//            if(numOfDish>0 && listMenu<=maxMenu && numOftable<=maxTable && Person.personInResNow[numOftable]!=null){
//                numOfDish--;
//                System.out.println("โต๊ะที่ " + numOftable + "  ได้สั่งเมนูที่ " + listMenu);
//            } 
//            System.out.println("อาหารไม่พอ");
            
            
            //โต๊ะไม่มีคนนั่ง รายการนี้ไม่อยู่ในเมนู โต๊ะนี้ไม่มีในร้าน
            
    }

    public int getNumOfDish() {
        return numOfDish;
    }

    public int getMaxMenu() {
        return maxMenu;
    }
    
    
}