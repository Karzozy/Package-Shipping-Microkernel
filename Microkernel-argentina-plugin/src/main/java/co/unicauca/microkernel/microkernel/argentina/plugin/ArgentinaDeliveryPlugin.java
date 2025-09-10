package co.unicauca.microkernel.microkernel.argentina.plugin;
import co.unicauca.microkernel.common.entities.Delivery;
import co.unicauca.microkernel.common.entities.Product;
import co.unicauca.microkernel.common.interfaces.IDeliveryPlugin;

public class ArgentinaDeliveryPlugin implements IDeliveryPlugin {
    
    public double calculateCost(Delivery delivery) {

        Product product = delivery.getProduct();
        double weight = product.getWeight();
        double distance = delivery.getDistance(); 

        double baseCost = 10;

        double weightCost;
        if (weight <= 2) {
            weightCost = 5;
        } else if (weight <= 5) {
            weightCost = 8;
        } else {
            weightCost = 12;
        }
        double distanceCost = (distance <= 50) ? 3 : 6;

        return baseCost + weightCost + distanceCost;

    }
}
