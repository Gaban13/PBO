/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author hagai
 */
public class ExceptionNomorTelepon extends Exception {
    
        public void showMessage(){
            System.out.println("[!] Nomor Telepon harus antara 11 - 13 digit [!]");
        }
    
}
