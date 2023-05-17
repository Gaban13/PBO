
package exception;


public class ExceptionAlamat extends Exception {
    public void showMessage(){
        System.out.println("[!] alamat yang anda masukkan harus diawali dengan kata 'jln.' [!]");
        //
    }
}
