package shabudekit;

public class Test {
    public OpenRes B;
    public static void main(String[] args) {


            OpenRes r = new OpenRes("test",10,37,50, 10);  
      //       ชื่อร้าน , จำนวนคนที่อยู่ในร้านได้ , เลขที่บอกว่าวัตถุดิบทั้งหมดจะขายได้กี่คนต่อวัน , อุณหภูมิที่เข้าร้านได้ต้องไม่เกิน, จำนวนรายการอาหารที่มีได้
            System.out.println(r);
            


      // เพิ่มคนเข้าร้าน
      
           r.P.AddPersonInformation("eiei", 1, 1); // ชื่อ ,​ อุณหภูมิ, โต๊ะ
           r.P.AddPersonInformation("eie", 2, 2);
          // แสดงคนที่เคยเข้าร้าน 
      
           r.P.GetAllList();          
           
           
           r.P.LeavePerson(1);
                       
      // แสดงคนในร้านทั้งหมดตอนนี้
      
           r.P.getAllPersonNow();
           
     
           
       // แอดเมนูอาหาร
           r.F.addFood(1, "ผัดกระเพราวินเนอร์");
    }
   
    
    
}
