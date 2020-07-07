package pe.edu.upeu.dmp.examen;

public class ExamenResolucion{

public int exponente(int base, int expoN){
  if(expoN==0){return 1;}
  else{return base*exponente(base, expoN-1);
  }
}

}