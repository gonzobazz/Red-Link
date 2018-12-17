
package red.link;


public class Cuenta extends Transaccion {
    
    private String clave = "hola hola";
    private String usuario = "Gonza";
    private Integer saldo= 20000;
     
    public Cuenta(){
        
    }


    public void validacionContraseña(String contraseñaingresada, String usuarioingresado){
        if (usuario = usuarioingresado || clave=contraseñaingresada ){
            System.out.println("Bienvenido " + usuario);
            System.out.println("Que operacion desea realizar");
            System.out.println("+++++++++++++ Simulacion de Cajero +++++++++++");
            System.out.println("1.-Transferencia");
            System.out.println("2.-Retiro");
            System.out.println("3.-Consulta");
        }if else {
                System.out.println("Contraseña o usuario incorrecto");
                }
    }
     
}
