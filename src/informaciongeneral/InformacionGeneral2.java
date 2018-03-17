package informaciongeneral;
/**
 *
 * @author Erick
 */
public class InformacionGeneral2 {
     String nombres ;
    String apellidos ;
    int edad;
    String carnet;

    public InformacionGeneral2(String nombres,String apellidos,int edad, String carnet){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.carnet = carnet;
    }
    public void imprimir(){
        System.out.println("Nombre completo: "+nombres+apellidos+"\nEdad: "+edad+"\nCarnet:"+carnet);
    }
}
