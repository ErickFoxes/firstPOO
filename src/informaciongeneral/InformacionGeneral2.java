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
    String fechaNac;

    public InformacionGeneral2(String nombres,String apellidos,int edad, String carnet,String fechaNac){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.carnet = carnet;
        this.fechaNac = fechaNac;
    }
    public void imprimir(){
        System.out.println("Nombre completo: "+nombres+apellidos+"\nEdad: "+edad+"\nCarnet:"+carnet+"\nFecha de Nacimiento: "+fechaNac);
    }
}
