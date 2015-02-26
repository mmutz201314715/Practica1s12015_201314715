/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s12015_201314715;

/**
 *
 * @author mariopc
 */
public class Sublista {/*
 private Nodojugap cabecera;
 private int tamaño;
 
 public Sublista(){
  tamaño = 0;
  cabecera = new Nodojugap();
 }
 
 public int getTamaño(){
  return tamaño;
 }
 
 public boolean addDato(Object dato, String campo){
  Nodojugap nodoUltimo = getUltimoNodo();
  if(dato != null && nodoUltimo != null){
   nodoUltimo.setNodo(new Nodojugap(dato, campo));
   tamaño ++;
   return true;
  }else{
   return false;
  }
 }
 
 private Nodojugap getUltimoNodo(){
  Nodojugap nodoUltimo = null;
  if(cabecera != null){
   nodoUltimo = cabecera;
   while(nodoUltimo.getNodo() != null){
    nodoUltimo = nodoUltimo.getNodo();
   }
  }
  return nodoUltimo;
 } 
 
 public Object getDato(int pos){
  Nodojugap nodoUltimo = null;
  int contador = 0;
  Object dato = null;
  if(cabecera != null){
   nodoUltimo = cabecera;
   do{
    nodoUltimo = nodoUltimo.getNodo();
    if(contador == pos){
     dato = nodoUltimo.getDato();
     break;
    }else{
     contador++;
    }   
   }while(nodoUltimo.getNodo() != null);
  }
  return dato;
 }
 
 public String getCampo(int pos){
  Nodojugap nodoUltimo = null;
  int contador = 0;
  String campo= "";
  
  if(cabecera != null){
   nodoUltimo = cabecera;
   do{
    nodoUltimo = nodoUltimo.getNodo();
    if(contador == pos){
     campo = nodoUltimo.getCampo();
     
     break;
    }else{
     contador++;
    }   
   }while(nodoUltimo.getNodo() != null);
  }
  return campo;
 }*/
}


