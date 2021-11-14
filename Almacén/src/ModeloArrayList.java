
import java.util.ArrayList;
import java.util.Scanner;
public class ModeloArrayList extends ModeloAbs
{
    private ArrayList <Producto> lista;
    
    public ModeloArrayList()
    {
       lista=new ArrayList <Producto>();
    }

    // Implementar los metodos abstractos de ModeloAbs
    public boolean insertarProducto ( Producto p){
    	boolean insertado=false;
      if(lista.contains(p)) {
    	  System.out.println("El código ya está ocupado por otro producto");
      }else {
    	  if(p.stock>0 && p.precio>0) {
    		  lista.add(p);
    		  insertado=true;
    		  System.out.println("Operación realizada");
    		  
    	  }else {
    		  System.out.println("Hay un error en el stock o el precio, no pueden ser negativos");
    	  }
      }
      return insertado;
    }
 
    public boolean borrarProducto ( int codigo ){
      boolean borrado=false;
      for (int i = 0; i < lista.size(); i++) {
		Producto p=lista.get(i);
		if(p.getCodigo()== codigo) {
			borrado=true;
			lista.remove(i);
			break;
		}
	}
      return borrado;
    }
    
    public Producto buscarProducto ( int codigo) {
       Producto encontrado=null;
        for (int i = 0; i < lista.size(); i++) {
  		Producto p=lista.get(i);
  		if(p.getCodigo()== codigo) {
  			
  			encontrado=p;
  			break;
  		}
  	}
        return encontrado;
    }
    
    public void listarProductosTodos (){
        for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
    }
    
    public void listarProductosStockMin(){
    	  for (int i = 0; i < lista.size(); i++) {
  			if(lista.get(i).stock<= lista.get(i).stock_min) {
  				System.out.println(lista.get(i));
  			}
  		}
    }
    
    public boolean modificarProducto (Producto nuevo){
       boolean modificado=false;
       float nuevoPrecio;
       Scanner sc=new Scanner(System.in);
       if(lista.contains(nuevo)) {
    	   System.out.println("Introduzca el precio nuevo");
    	   nuevoPrecio =sc.nextFloat();
    	   if(nuevoPrecio>0) {
    		   nuevo.setPrecio(nuevoPrecio);
    		   modificado=true;
    		   System.out.println("El precio se ha cambiado a " +nuevoPrecio);
    	   }else {
    		   System.out.println("El precio tiene que ser mayor que 0");
    	   }
       }
    	
    	return modificado;
    }
    
    
}    

