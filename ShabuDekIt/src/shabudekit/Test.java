package shabudekit;

public class Test {
    public OpenRes B;
    public static void main(String[] args) {
//         Person A = new Person(3, 5);
//         Food S = new Food(10);
//         OpenRes B = new OpenRes();
//         
//         
//         
//            S.addFood(1, "ผัดกระเพรา");
//            S.addFood(1, "c");
//            S.GetAllMenu();
            
            
            
//         A.CheckPersonInformation("nut", 36, 1);
//         A.CheckPersonInformation("winer", 36, 1);
//         A.CheckPersonInformation("jack", 36, 2);
//         A.CheckPersonInformation("Lucky", 38, 3);
//         A.GetAllList();
//         A.getAllPersonNow();

            OpenRes r = new OpenRes("test",10,37,50, 10);  
      //       ชื่อร้าน , จำนวนคนที่อยู่ในร้านได้ , เลขที่บอกว่าวัตถุดิบทั้งหมดจะขายได้กี่คนต่อวัน , อุณหภูมิที่เข้าร้านได้ต้องไม่เกิน, จำนวนรายการอาหารที่มีได้
            System.out.println(r);

      // เพิ่มคนเข้าร้าน
      
           r.P.AddPersonInformation("eiei", 1, 1); // ชื่อ ,​ โต๊ะ , อุณหภูมิ
      // แสดงคนในร้านทั้งหมดตอนนี้
      
           r.P.getAllPersonNow();
           
      // แสดงคนที่เคยเข้าร้าน 
      
           r.P.GetAllList();
           
       // แอดเมนูอาหาร
           r.F.addFood(1, "ผัดกระเพราวินเนอร์");
    }
   
    
    
}
