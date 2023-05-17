/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author hagai
 */
public class ExceptionBonus extends Exception{
    public void showMessage1(){
        System.out.println("[!] Bonus Lembur Admin Harus diantara 500000 dan 1200000 [!]");
    }
    
    public void showMessage2(){
        System.out.println("[!] Komisi Customer Service Harus diantara 300000 dan 1000000 [!]");
    }
}
