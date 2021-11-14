import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class MiAlmacen
{
    // Defino como estaticas para que puedan usarse 
    // dentro de la clase sin necesidad de pasarlas como 
    // parametros.
    static private ModeloAbs almacen;
    static private Scanner sc;
    
  
    
    public static void main(String[] args){
        almacen=new ModeloArrayList ();
        sc = new Scanner(System.in);
        int opcion=0;
        do{
        mostrarMenu();
                opcion=leerOpcion(1,9);
                switch(opcion){
                    case 1: crear();break;
                    case 2: consultar();break;
                    case 3: borrar();break;
                    case 4: modificarPrecio();break;
                    case 5: comprar();break;
                    case 6: vender();break;
                    case 7: listar();break;
                    case 8: listarPocoStock();break;
                }
                System.out.println("\n---------------------------- ");
                System.out.print("Pulse enter para continuar");
                sc.nextLine();
        }while(opcion!=9);
        sc.close();
        
    }
    
    
    private static void mostrarMenu(){
        System.out.println("\n\n    MENU");
        System.out.println("1. Nuevo producto ");
        System.out.println("2. Consulta producto ");
        System.out.println("3. Borrar producto ");
        System.out.println("4. Modificar precio ");
        System.out.println("5. Compra de productos ");
        System.out.println("6. Venta de productos ");
        System.out.println("7. Listado completo de productos ");
        System.out.println("8. Listado de productos con stock inferior al m�nimo");
        System.out.println("9. Terminar ");
        System.out.print("Elige una opci�n (1-9)");        
    }
    
    // Lee un entero del System.in que este comprendido entre primero y ultimo
    private static int leerOpcion(int primero, int ultimo){
        int valor = leerEntero();
        while ( valor <primero || valor > ultimo){
            valor = leerEntero();
        }
        return valor;
    }
      
    
    // Metodos Auxiliares leerFloat y LeerEntero, 
    // Lee de la System.in con el scanner sc y controlan la excepcion de NumberFormatException
    
    
    static private int leerEntero(){
       boolean error = false;
        int  valor =0;
        String cadena;
        do {
        error = false;  
          try {
             // Intento leer directamente un entero  
             cadena = sc.nextLine();
             valor = Integer.parseInt(cadena);
             
            } catch(NumberFormatException e){
              System.out.println("Error en formato.");
              error = true;
            }
        }
       while ( error);
       return valor; 
    }

    static private float leerFloat(){
        boolean error = false;
        float  valor =0;
        String cadena;
        do {
        error = false;  
          try {
             // Intento leer directamente un entero  
             cadena = sc.nextLine();
             valor = Float.parseFloat(cadena);
             
            } catch(NumberFormatException e){
              System.out.println("Error en formato.");
              error = true;
            }
        }
       while ( error);
       return valor; 
    }
    
    // Muestra los datos de un producto a partir de su codigo
    
    private static void consultar(){        
       System.out.println("<CONSULTA>");
       System.out.print("Introduzca codigo:");
       int codigo = leerEntero();
       Producto p = almacen.buscarProducto(codigo);
       if ( p == null){
           System.out.println("El producto no se encuentra en almacen");
        }
       else {
           System.out.println("PRODUCTO "+p);
        }
       
    }
    
   
    // Borrar un producto a partir de su codigo
    
    private static void borrar(){       
      System.out.println("<ELIMINAR>");
      System.out.print("Introduzca codigo:");
      int codigo = leerEntero(); 
      Producto p=almacen.buscarProducto(codigo);
      if ( p == null){
          System.out.println("El producto no se encuentra en almacen");
       }
      else {
          System.out.println("PRODUCTO "+p);
          almacen.borrarProducto(codigo);
       }
      
      
    }
    
    // Cambia el precio de un producto a partir de su codigo
    private static void modificarPrecio (){
       System.out.println("<MODIFICAR PRECIO>");
       System.out.print("Introduzca codigo:");
       int codigo = leerEntero(); 
       Producto p=almacen.buscarProducto(codigo);
       if ( p == null){
           System.out.println("El producto no se encuentra en almacen");
        }
       else {
           System.out.println("PRODUCTO "+p);
           almacen.modificarProducto(p);
        }
    }
    
    
    
    // Incrementa el stock
    private static void comprar(){     
       System.out.println("<COMPRAR>");
       System.out.println("Introduzca c�digo: ");
       int codigo = leerEntero(); 
       Producto p=almacen.buscarProducto(codigo);
       if ( p == null){
           System.out.println("El producto no se encuentra en almacen");
        }
       else {
           System.out.println("PRODUCTO "+p);
           System.out.println("Cuantos productos desea a�adir");
           int nuevos=sc.nextInt();
           int stockFinal=p.getStock()+nuevos;
           p.setStock(stockFinal);
           System.out.println("Operaci�n realizada");
        }
    }
    
    // Decrementa el stock
    private static void vender(){
        System.out.println("<VENDER>");
        System.out.println("Introduzca c�digo: ");
        int codigo = leerEntero(); 
        Producto p=almacen.buscarProducto(codigo);
        if ( p == null){
            System.out.println("El producto no se encuentra en almacen");
         }
        else {
            System.out.println("PRODUCTO "+p);
            System.out.println("Cuantos productos desea va vender");
            int venta=sc.nextInt();
            if(venta >0 && venta <p.getStock()) {
            	 int stockFinal=p.getStock()-venta;
                 p.setStock(stockFinal);
                 System.out.println("Operaci�n realizada");
            }else {
            	System.out.println("No hay suficiente stok o la cantidad que desa vender no puede ser negativa");
            	
            }
           
         }
       
    }
    
    // Listado de todos los productos
    private static void listar(){        
         System.out.println("<LISTAR>");
         almacen.listarProductosTodos();
    }
    
    // Listado de todos los productos con stock inferior a stock minimo
    private static void listarPocoStock(){
        System.out.println("<LISTAR STOCK BAJO MINIMOS>");
        almacen.listarProductosStockMin();
    }
    
    // Solicita datos al usuario para dar de alta un nuevo producto 
    // El codigo no se puede repetir
    private static void crear(){
       System.out.println("<NUEVO PRODUCTO>");
       int codigo;    
       String nombre; 
       int stock;    
       int stock_min; 
       float precio;
       System.out.println("Introduce c�digo");
       codigo=leerEntero();
       
       System.out.println("Introduce el nombre");
       nombre=sc.nextLine();
     
       System.out.println("Introduce stock");
       stock=leerEntero();
      
       System.out.println("Introduce stock_min");
       stock_min=leerEntero();
     
       System.out.println("Introduce precio");
       precio=leerFloat();
     
      
       almacen.insertarProducto(new Producto(codigo, nombre, stock, stock_min, precio));
     
     
    }


       
  
}
