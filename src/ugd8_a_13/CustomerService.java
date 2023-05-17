/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd8_a_13;

import exception.ExceptionGajiPokok;
import exception.ExceptionNama;
import exception.ExceptionNomorTelepon;
import exception.ExceptionId;
import exception.ExceptionBonus;


public class CustomerService extends Pegawai{
    private String idCS;
    private float komisi;
    
    public CustomerService(String namaPegawai, String noTelpPegawai, float gajiPokok,String idCS, float komisi) throws 
            ExceptionNama, 
            ExceptionNomorTelepon, 
            ExceptionGajiPokok,
            ExceptionId,
            ExceptionBonus{
        super(namaPegawai, noTelpPegawai, gajiPokok);
        
        if(idCS.contains("CS-")){
            throw new ExceptionId();
        }else if(komisi < 300000 || komisi > 1000000){
            throw new ExceptionBonus();
        }else{
            this.idCS = idCS;
            this.komisi=komisi;
        }
        
        
    }

  
    
    public void showData(){
        System.out.println("nama CS : "+namaPegawai);
        System.out.println("No Telp CS : "+noTelpPegawai);
        System.out.println("id CS : "+idCS);
        System.out.println("Gaji Pokok : "+gajiPokok);
        System.out.println("Komisi: "+komisi);
        System.out.println("Total Gaji : "+totalGaji());
 
    }
    public float totalGaji(){
        float total=gajiPokok + komisi;
        return total;
    }
    
}
