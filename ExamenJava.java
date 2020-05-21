import java.util.Scanner;

class ExamenJava{


    static Scanner teclado=new Scanner(System.in);


    public static void calcularCostoHamburguesaDMP(){
        int cantidadHam; double costoFinal=0; String pagoTarjeta;
        //Datos Entrada y Proceso
        for(int tipoHam=1; tipoHam<=3; tipoHam++){
            if(tipoHam==1){
                  System.out.println("Ingrese la cantidad de Hamburguesas de Tipo Simple:"); 
                  cantidadHam=teclado.nextInt();
                  costoFinal=costoFinal+cantidadHam*20;
            }else if(tipoHam==2){
                  System.out.println("Ingrese la cantidad de Hamburguesas de Tipo Doble:");
                  cantidadHam=teclado.nextInt();
                  costoFinal=costoFinal+cantidadHam*25;
            }else{
                  System.out.println("Ingrese la cantidad de Hamburguesas de Tipo Triple:"); 
                  cantidadHam=teclado.nextInt();
                  costoFinal=costoFinal+cantidadHam*28;                
            }
        }
        //Datos Salida, Proceso, Entrada
        System.out.println("El costo de las Hamburguesas hasta el momento es:"+costoFinal);  
        System.out.println("Desea Pagar con Tarjeta?");
        pagoTarjeta=teclado.next();
        if(pagoTarjeta.equals("SI")){
            costoFinal=costoFinal+costoFinal*0.05; 
        }
        System.out.println("El costo total de la Hamburguesa es:"+costoFinal);
    }

  public static void main(String[] arg){
      System.out.println("Hola Mundo");
        calcularCostoHamburguesaDMP();   
  }

}