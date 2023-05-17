/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author hagai
 */
public class ExceptionId extends Exception {
    
        public void showMessage1(){
            System.out.println("[!] Id Admin Harus ada unsur 'ADM-' [!]");
        }

        public void showMessage2(){
            System.out.println("[!] Id Custimer Service Harus ada unsur 'CS-' [!]");
        }
   
}
