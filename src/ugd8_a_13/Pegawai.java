/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ugd8_a_13;

import exception.ExceptionNama;
import exception.ExceptionNomorTelepon;
import exception.ExceptionGajiPokok;

public abstract class Pegawai {
    protected String namaPegawai;
    protected String noTelpPegawai;
    protected float gajiPokok;
    
    public Pegawai(String namaPegawai,String noTelpPegawai,float gajiPokok)throws ExceptionNama,ExceptionNomorTelepon,ExceptionGajiPokok{
        if(namaPegawai.length()==0){
            throw new ExceptionNama();
        }else if(noTelpPegawai.length()<11 || noTelpPegawai.length()>13){
            throw new ExceptionNomorTelepon();
        }else if(gajiPokok<200000){
            throw new ExceptionGajiPokok();
        }else{
            this.namaPegawai = namaPegawai;
            this.noTelpPegawai = noTelpPegawai;
            this.gajiPokok = gajiPokok;
        }
        
    }
    
    public void showData(){
        System.out.println("Nama          : "+namaPegawai);
        System.out.println("Nomor Telepon : "+noTelpPegawai);
        System.out.println("Gaji Pokok    : "+gajiPokok);
    }
}
