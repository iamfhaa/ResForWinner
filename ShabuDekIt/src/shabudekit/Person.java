
package shabudekit;

import java.util.Arrays;

public class Person {
  String[] personInResNow; //คนที่อยู่ตอนนี้
  String[] listAllName; //รายชื่อทั้งหมด
  String namePerson; //ชื่อคน
  int personCanJoin; //คนที่สามารถเข้ามาได้
  int tablePerson; //โต๊ะที่คนนั่ง
  int numberOfWhoJoin=0; //จำนวนคนเข้า
  int maxPerson; //จำนวนคนสูงสุด
  int MaxCanSellPerDay; //จำนวนที่สามารถขายได้ต่อวัน
  double MaxTem ; //อุณหภูมิสูงสุด
  double tem; //อุณหภูมิ
  
        
   public Person(int personCanJoin, int numOfFoodCanSell,double MaxTem) {  
        personInResNow = new String[personCanJoin];
        listAllName = new String[numOfFoodCanSell];
        this.maxPerson=personCanJoin;
        this.MaxTem=MaxTem;
        this.MaxCanSellPerDay=numOfFoodCanSell;
    }
   public void AddPersonInformation(String name,double TemAdd,int tableAdd){ //คัดคนเข้าร้าน
    namePerson=name;
    tem=TemAdd;
    tablePerson=tableAdd-1;
     if(TemAdd<=MaxTem){
          
      if(personInResNow[tableAdd-1]!=null){
              System.out.println(name+" ไม่สามารถเข้าร้านได้เนื่องจากโต๊ะที่ "+tableAdd+" เต็ม");
         }else{
          AddPerson();
          System.out.println(namePerson+" ได้เข้านั่งที่โต๊ะ "+(tablePerson+1));
          
      }
          
     }else   System.out.println(namePerson+" ไม่สามารถเข้าร้านได้เนื่องจากอุณหภูมิเกิน");  
  }
   
  public void AddPerson(){ //เพิ่มคนเข้าร้าน
//      System.out.println(namePerson+" ได้เข้านั่งที่โต๊ะ "+(tablePerson+1));
      personInResNow[tablePerson]=namePerson;
      listAllName[numberOfWhoJoin]=namePerson;
      numberOfWhoJoin+=1;
  }
  public void GetAllList(){ //รายชือ่คนทั้งหมดที่เข้าร้าน
      System.out.print("รายชื่อคนทั้งหมดที่เข้าร้าน = ");
      if(numberOfWhoJoin>=0){
          for (int i = 0; i < numberOfWhoJoin; i++) {
            System.out.print("คนที่ " + (i + 1) + " " + listAllName[i]+ ",");
             }   
        }else{
            System.out.print(" ยังไม่มีประวัติการเข้า ");
            }
     }  
   public void getAllPersonNow(){ //รายชื่อคนในร้านทั้งหมด ตอนนี้!!!
           for (int i = 0; i < maxPerson; i++) {
            if(personInResNow[i]==null){
                  personInResNow[i]="โต๊ะว่าง";     
            }
             }
           System.out.println("\nคนในร้านทั้งหมดตอนนี้" + Arrays.toString(personInResNow));
   }

    @Override
    public String toString() {
        return  " จำนวนคนที่เข้าร้านได้ =" + maxPerson + " จำนวนอาหารที่สามารถขายได้ในแต่ละวัน="+MaxCanSellPerDay+", อุณหภูมิของคนที่เข้าร้านต้องไม่เกิน =" + MaxTem ;
    }
    
    public void LeavePerson(int numTable){ //เอาคนออก
        this.tablePerson = numTable-1;
        personInResNow[tablePerson]=null;
        numberOfWhoJoin-=1; 
        System.out.println("\nโต๊ะที่ "+numTable+" ออกแล้ว");
        
       
    }
    
    

}
