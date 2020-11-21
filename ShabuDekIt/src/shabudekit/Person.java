
package shabudekit;

import java.util.Arrays;

public class Person {
  public  static String[] personInResNow; //คนที่อยู่ตอนนี้
 
  private String namePerson; //ชื่อคน
  private int personCanJoin; //คนที่สามารถเข้ามาได้
  private int tablePerson; //โต๊ะที่คนนั่ง
  private int numberOfWhoJoin=0; //จำนวนคนเข้า
  private int maxPerson; //จำนวนคนสูงสุด
  private double MaxTem ; //อุณหภูมิสูงสุด
  private double tem; //อุณหภูมิ
  
        
   public Person(int personCanJoin,double MaxTem) {  
        personInResNow = new String[personCanJoin];
       
        this.maxPerson=personCanJoin;
        this.MaxTem=MaxTem;
       
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
      numberOfWhoJoin+=1;
  }
 
   public void getAllPersonNow(){ //รายชื่อคนในร้านทั้งหมด ตอนนี้!!!
       
        String free = "โต๊ะว่าง";
           for (int i = 0; i < maxPerson; i++) {
            if(personInResNow[i]==null){
                  personInResNow[i]=free;     
            }
             }
           System.out.println("\nคนในร้านทั้งหมดตอนนี้" + Arrays.toString(personInResNow));
           
           for (int i = 0; i < maxPerson; i++) {
            if(personInResNow[i]==free){
                  personInResNow[i]=null;     
            }
             }
           
   }

    @Override
    public String toString() {
        return  " จำนวนคนที่เข้าร้านได้ =" + maxPerson + ", อุณหภูมิของคนที่เข้าร้านต้องไม่เกิน =" + MaxTem ;
    }
    
    public void LeavePerson(int numTable){ //เอาคนออก
        this.tablePerson = numTable-1;
        personInResNow[tablePerson]=null;
        numberOfWhoJoin-=1; 
        System.out.println("\nโต๊ะที่ "+numTable+"ได้เคลียเรียบร้อย"); 
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public double getTem() {
        return tem;
    }
    
    

}
