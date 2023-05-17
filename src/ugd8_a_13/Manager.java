/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd8_a_13;

import exception.ExceptionNama;
import exception.ExceptionBonus;
import exception.ExceptionId;
import exception.ExceptionAlamat;
import exception.ExceptionNomorTelepon;
import exception.ExceptionGajiPokok;

public class Manager extends Pegawai {
    private String idManager;
    private float bonusBulanan;
    private String alamatManager;
    
    public Manager(String idManager, float bonusBulanan, String alamatManager, String namaPegawai, String noTelpPegawai, float gajiPokok) throws 
            ExceptionNama,
            ExceptionNomorTelepon, 
            ExceptionGajiPokok,
            ExceptionId,
            ExceptionBonus,
            ExceptionAlamat{
        super(namaPegawai, noTelpPegawai, gajiPokok);
        
        if(idManager.contains("MNGR-")){
            throw new ExceptionId();
        }else if(bonusBulanan < 600000 || bonusBulanan > 1400000){
            throw new ExceptionBonus();
        }else if(alamatManager.contains("jln.")){
            throw new ExceptionAlamat();
        }else{
            this.idManager = idManager;
            this.bonusBulanan = bonusBulanan;
            this.alamatManager = alamatManager;
        }
    }
    
    public void showData(){
        System.out.println("Nama Manager: "+namaPegawai);
        System.out.println("Nomor Telepon Manager: "+noTelpPegawai);
        System.out.println("Gaji Pokok: "+gajiPokok);
        System.out.println("ID Manager: "+idManager);
        System.out.println("bonus bulanan: "+bonusBulanan);
        System.out.println("alamat manager: "+alamatManager);
    }
    
    public float totalGaji(){
        float total;
        total = (gajiPokok + bonusBulanan)-(gajiPokok + bonusBulanan)*(5/100); 
        return total;
    }
    
}
