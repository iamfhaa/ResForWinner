
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
            if(Person.personInResNow[numOftable-1]!=null){
                if(numOfDish>0){
                    if(listMenu<=maxMenu){
                        numOfDish--;
                        System.out.println("โต๊ะที่ " + numOftable + "  ได้สั่งเมนูที่ " + listMenu);
                    }else System.out.println("รายการนี้ไม่อยู่ในเมนู");
                }else System.out.println("อาหารไม่พอ");
            }else System.out.println("โต๊ะนี้ไม่มีคนนั่ง");          
        }else System.out.println("โต๊ะนี้ไม่มีในร้าน");
               
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

    @Override
    public String toString() {
        return "จำนวนอาหารที่ขายได้ในแต่ละวัน=" + numOfDish + '}';
    }
    
    
}
