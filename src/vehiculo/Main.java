
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoArizaAsenjoSheila2223 miVehiculoArizaAsenjoSheila2223;
        int stockActual;
        
        miVehiculoArizaAsenjoSheila2223 = new VehiculoArizaAsenjoSheila2223("Seat",18000,100);
        operativaVehiculosArizaAsenjoSheila2223(miVehiculoArizaAsenjoSheila2223, 50); 
    }

    private static void operativaVehiculosArizaAsenjoSheila2223(VehiculoArizaAsenjoSheila2223 miVehiculoArizaAsenjoSheila2223, int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoArizaAsenjoSheila2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoArizaAsenjoSheila2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoArizaAsenjoSheila2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
