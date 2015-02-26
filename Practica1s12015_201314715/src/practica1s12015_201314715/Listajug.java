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
// la lista a crear es una lista que en sus sub nodos dan origen a otras listas
public class Listajug {
 private Nodojugap cabecera;
 private Nodojugap ultimoj;

    public Nodojugap getUltimoj() {
        return ultimoj;
    }

    public Nodojugap getCabecera() {
        return cabecera;
    }
 private int tamaño;
 
 
 public Listajug(){
  tamaño = 0;
  cabecera = null;
  ultimoj = null;
 }
 
 
 public int getTamaño(){
  return tamaño;
 }
 //obtener el ultimo nodo
 private Nodojugap getUltimoNodo(){
  Nodojugap nodoUltimo = null;
  if(cabecera != null){
   nodoUltimo = cabecera;
   while(nodoUltimo != null){
    nodoUltimo = nodoUltimo.getSig();
   }
  }
  return nodoUltimo;
 } 
 
 
 
 //metodo para recorrer
 
 
 
 //recorrido alterno para obtener a un jugador
 public Nodojugap GetNodojugador(String titulo){
     Nodojugap aux1 = cabecera;
     while(aux1!=null){
         if(aux1.getTitulo().equals(titulo)){
             return aux1;
         }else{
             aux1=aux1.getSig();
         }
     }
     return null;
 }
 public void addJugador(Nodojugap nuevojugador){
     
  if(cabecera ==null){
      cabecera = nuevojugador;
      ultimoj = cabecera;
  }else{
      ultimoj.setSig(nuevojugador);
      ultimoj = nuevojugador;
  }
 }
 public void addExtras(Nodojdat nuevoextra){
Nodojdat    aux1 = cabecera.getCabdato();
Nodojdat aux2 = ultimoj.getUltimod();
     if(aux1==null){
        cabecera.setCabdato(nuevoextra);
         ultimoj.setUltimod(cabecera.getCabdato());
         
        
     }else{
         
         ultimoj.getUltimod().setSigd(nuevoextra);
         ultimoj.setUltimod(nuevoextra);
     }
 }
 /*
 public boolean addExtras(String etiqueta, Object contenido){
     Nodojugap horizontal = GetNodojugador(etiqueta);
     if(horizontal !=null){
         horizontal.Insertardato(new Nodojdat( etiqueta, contenido));
         return true;
     }else{
         return false;
 }
      
 }
 */
 
 
 //recorrer la lista principal
 public void Recorrerjugador(){
     Nodojugap clonjugador = cabecera;
     while(clonjugador!=null){
         System.out.println("tipo de jugador: "+ clonjugador.getTitulo());
         clonjugador = clonjugador.getSig();
     }
 }
 //recorrer la lista secundaria y la principal
 public void Recorrealljugador(){
 
     //copia auxiliar del subnodo
     Nodojugap clonjugador2 = cabecera;
     String nota="";
     //recorrer la lista principal
     while(clonjugador2 !=null){
         //luego verificamos que el contenudo de dicho nodo sea
         //villano o heroe
         if(clonjugador2.getTitulo().equals("heroes")){
             //segundo ciclo para recorrer los subnodos
            clonjugador2.recorrerd();
            System.out.println("cont heroe");
             }else if(clonjugador2.getTitulo().equals("villanos")){
             clonjugador2.recorrerd();
             System.out.println("cont villano");
         }else{
                 System.out.println("no se encontro nada");
             }
         
         clonjugador2 = clonjugador2.getSig();
     }
 }
 
 
 
 
 
 /*
 
 public Object getCabdato(int pos){
  Nodojugap nodoUltimo = null;
  int contador = 0;
  Object cabdato = null;
  
  if(cabecera != null){
   nodoUltimo = cabecera;
   do{
    nodoUltimo = nodoUltimo.getSig();
    if(contador == pos){
     cabdato = nodoUltimo.getSig();
     
     break;
    }else{
     contador++;
    }   
   }while(nodoUltimo.getSig() != null);
  }
  return cabdato;
 }
 */
 /*
  public String getTitulo(int pos){
  Nodojugap nodoUltimo = null;
  int contador = 0;
  String titulo= "";
  
  if(cabecera != null){
   nodoUltimo = cabecera;
   do{
    nodoUltimo = nodoUltimo.getSig();
    if(contador == pos){
     titulo = nodoUltimo.getSig();
     
     break;
    }else{
     contador++;
    }   
   }while(nodoUltimo.getSig() != null);
  }
  return titulo;
 }
  */
}

