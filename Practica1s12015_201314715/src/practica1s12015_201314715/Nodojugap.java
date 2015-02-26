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
public class Nodojugap {
    // titulo del nodo principal
private String titulo;
//apunta al siguiente nodo principal osea al de villanos
private Nodojugap sig;
//cabecera de los subnodos datos o el inicio
 private Nodojdat cabdato;
 
 //ultimo dato de la lista de datos
 private Nodojdat ultimod;
 //tamaño de la sublista
 // private  int taman=0;
  
//constructor
 public Nodojugap(String titulo){
  this.titulo= titulo;
  sig = null;
 cabdato = null; 
 ultimod = null;
//this.dato = dato;  
 }

    

    
  
 public String getTitulo() {
        return titulo;
    }
 
 public void setSig(Nodojugap sig){
  this.sig = sig;
 }
 
 public Nodojugap getSig(){
  return sig;
 } 
 //------------------------------------
 public Nodojdat getCabdato() {
        return cabdato;
    }

    public Nodojdat getUltimod() {
        return ultimod;
    }
    
    public void setCabdato(Nodojdat cabdato) {
        this.cabdato = cabdato;
    }

    public void setUltimod(Nodojdat ultimod) {
        this.ultimod = ultimod;
    }
 //comienzan metodos de sublista
 

 

 public void Insertardato(Nodojdat   nuevodato){
     //si al inicio no hay datos
     if(cabdato != null){
         cabdato= nuevodato;
         
         ultimod = cabdato;
        
     }else{
        // si existe aunque sea un nodo
         //el utlimo tiene que recordad al nuevo
         ultimod.setSigd(nuevodato);
         //ahora el ultimo nodo se convierte en el nuevo nodo
         ultimod=nuevodato;
     }
     
 }
 public void recorrerd(){
      //para recorrer la lista se clona al primer dato
     //esto es para no perder el primer puntero de inicio
     //y como este guarda la informacion del siguiente, no hay problema
     Nodojdat clondato = cabdato;
     while(clondato != null){
         //se imprime la informacion
         System.out.println("etiqueta: "+clondato.getEtiqueta()+", contenido: "+clondato.getContenido());
         //se toma al siguiente nodo de dato
         clondato = clondato.getSigd();
     }
     }
 
 
 
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
/* 
 public Nodojugap(){
     titulo="";
  cabdato = null;
  sig = null;
  
 }*///no sirve lo de arriba
 
 
 /*public void setDato(Object dato){
  this.dato = dato;
 }
 
 public Object getDato(){
  return dato;
 }
 public void setCampo(String campo){
  this.campo = campo;
 }
 
 public String getCampo(){
  return campo;
 }
 */
 
