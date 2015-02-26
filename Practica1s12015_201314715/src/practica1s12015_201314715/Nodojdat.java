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
public class Nodojdat {
private    String etiqueta;
private Object contenido;
//apunta al subnodo siguiente
private    Nodojdat sigd;

    public Nodojdat(String etiqueta, Object contenido){
        this.etiqueta = etiqueta;
        this.contenido = contenido;
        sigd = null;
    }
     public String getEtiqueta(){
     return etiqueta;
 }   
 public Object getContenido(){
     return contenido;
 }   
 //establece cual sera el siguiente nodo
     public void setSigd(Nodojdat sigd){
  this.sigd = sigd;
 }
 // obtiene cual es el siguiente patojo
 public Nodojdat getSigd(){
  return sigd;
 } 

}

