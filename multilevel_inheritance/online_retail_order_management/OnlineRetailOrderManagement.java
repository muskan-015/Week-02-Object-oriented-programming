package multilevel_inheritance.online_retail_order_management;

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        DeliveredOrder deliveredOrder = new DeliveredOrder(
                "001","24-01-2025","order1234","25-01-2025"
        );

        // Display the details
        deliveredOrder.displayOrderDetails();
    }
}
