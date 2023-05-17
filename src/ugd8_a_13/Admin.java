
package ugd8_a_13;

import exception.ExceptionNama;
import exception.ExceptionBonus;
import exception.ExceptionId;
import exception.ExceptionNomorTelepon;
import exception.ExceptionGajiPokok;

public class Admin extends Pegawai{
    private String idAdmin;
    private float bonusLembur;

    public Admin(String namaPegawai, String noTelpPegawai, float gajiPokok,String idAdmin, float bonusLembur) throws 
            ExceptionBonus,
            ExceptionId,
            ExceptionNomorTelepon,
            ExceptionGajiPokok, 
            ExceptionNama{
        super(namaPegawai, noTelpPegawai, gajiPokok);
        
        if(bonusLembur<500000 || bonusLembur>1200000){
            throw new ExceptionBonus();
        }else if(idAdmin.contains("ADM-")){
            throw new ExceptionId();
        }else{
            this.bonusLembur=bonusLembur;
            this.idAdmin = idAdmin;
        }
        
        
    }
 
    
    
    
 public void showData(){
     System.out.println("Id Admin : "+idAdmin);
     System.out.println("Nama Admin : "+namaPegawai);
     System.out.println("no Telp Admin: "+noTelpPegawai);
     System.out.println("Gaji Pokok : "+gajiPokok);
     System.out.println("Bonus Lembur : "+bonusLembur);
     System.out.println("Total gaji : "+totalGaji());
 }
    
    public float totalGaji(){
        float total = gajiPokok+bonusLembur;
        return total;
    }
}
