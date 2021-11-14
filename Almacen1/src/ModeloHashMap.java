import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class ModeloHashMap extends ModeloAbs{
	HashMap<Integer, Producto> lista;
    public ModeloHashMap() {
    	lista=new HashMap<Integer, Producto>();
    }
    
     public boolean insertarProducto ( Producto p) {
    	 boolean insertado=false;
    	 
    	 return insertado;
     }
    
     boolean borrarProducto ( int codigo ) {
    	 return false;
     }
    
     public Producto buscarProducto ( int codigo) {
    	 return null;
     }
    
     void listarProductosTodos () {
    	 
     }
    
     void listarProductosStockMin() {
    	 
     }
    
    
     boolean modificarProducto (Producto nuevo) {
    	 return false;
     }
}
