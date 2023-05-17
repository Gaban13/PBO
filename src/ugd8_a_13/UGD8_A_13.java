
package ugd8_a_13;


import exception.ExceptionNama;
import exception.ExceptionBonus;
import exception.ExceptionId;
import exception.ExceptionNomorTelepon;
import exception.ExceptionGajiPokok;
import exception.ExceptionAlamat;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UGD8_A_13 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
    public static void main(String[] args) {
       String idCS,namaCS, nomorTelpCS;
       float gajiPokokCS,bonusCS;
       String idAdmin,namaAdmin,nomorTelpAdmin;
       float gajiPokokAdmin,bonusAdmin;
       String namaManager,idManager,nomorTelpManager,alamatManager;
       float bonusManager,gajiPokokManager;
       
       
       
       try{
           System.out.println("Masukkan Nama CS    : ");namaCS= br.readLine();
           System.out.println("Mauskkan Nomot Tep CS : ");nomorTelpCS = br.readLine();
           System.out.println("Masukkan Gaji Pokok CS : ");gajiPokokCS = Float.parseFloat(br.readLine());
           System.out.println("Masukkan Id CS : ");idCS = br.readLine();
           System.out.println("Masukkan Bonus Bulanan");bonusCS = Float.parseFloat(br.readLine());
           CustomerService cs = new CustomerService(namaCS,nomorTelpCS,gajiPokokCS,idCS,bonusCS);
           cs.showData();

           
       }catch(ExceptionNama e1){
           e1.showMessage();
       }catch(ExceptionBonus e){
           e.showMessage2();
       }catch(ExceptionGajiPokok e){
           e.showMessage();
       }catch(ExceptionId e){
           e.showMessage2();
       }catch(ExceptionNomorTelepon e){
           e.showMessage();
       }catch(Exception e){
           
       }
       try{
           
           System.out.println("Masukkan Nama Admin : ");namaAdmin=br.readLine();
           System.out.println("Masukkan Nomor Telp Admin : ");nomorTelpAdmin=br.readLine();
           System.out.println("Masukkan Gaji Pokok Admin : ");gajiPokokAdmin=Float.parseFloat(br.readLine());
           System.out.println("Masukkan Id Admin : ");idAdmin=br.readLine();
           System.out.println("Mauskkan Bonus Bulanan : ");bonusAdmin=Float.parseFloat(br.readLine());
           Admin A = new Admin(namaAdmin, nomorTelpAdmin,gajiPokokAdmin, idAdmin,bonusAdmin);        
            A.showData();

       }catch(ExceptionNama e1){
           e1.showMessage();
       }catch(ExceptionBonus e){
           e.showMessage2();
       }catch(ExceptionGajiPokok e){
           e.showMessage();
       }catch(ExceptionId e){
           e.showMessage2();
       }catch(ExceptionNomorTelepon e){
           e.showMessage();
       
       }catch(Exception e){
           
       }
       
       try{
           System.out.println("Masukkan Nama Manager : ");namaManager=br.readLine();
           System.out.println("Masukkan Nomor Telp Manager : ");nomorTelpManager=br.readLine();
           System.out.println("Masukkan gaji Manager : ");gajiPokokManager=Float.parseFloat(br.readLine());
           System.out.println("Masukkan ID Manager : ");idManager = br.readLine();
           System.out.println("Masukkan bonus Bulanan : ");bonusManager=Float.parseFloat(br.readLine());
           System.out.println("Masukkan Alamat Manager : ");alamatManager=br.readLine();
           Manager M = new Manager(idManager, bonusManager, alamatManager,namaManager,nomorTelpManager,gajiPokokManager);
           M.showData();
           
       }catch(ExceptionNama e){
           e.showMessage();
       }catch(ExceptionBonus e){
           e.showMessage2();
       }catch(ExceptionGajiPokok e){
           e.showMessage();
       }catch(ExceptionId e){
           e.showMessage2();
       }catch(ExceptionNomorTelepon e){
           e.showMessage();
       }catch(ExceptionAlamat e){
           e.showMessage();
       }catch(Exception e){
           
       }
       
       
    }
    
        
        
        
    
    
}
