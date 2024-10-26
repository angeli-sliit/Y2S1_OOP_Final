package Q3;

public class FactorySimulation {
    public static void main(String[] args) {
        Object inventory = new Object();
        SharedInventory sharedInventory = new SharedInventory();

        // Create supplier threads
        Thread supplierIron = new Thread(new SupplierIron(sharedInventory, inventory));
        Thread supplierWood = new Thread(new SupplierWood(sharedInventory, inventory));
        Thread supplierCement = new Thread(new SupplierCement(sharedInventory, inventory));

        // Create production line thread
        Thread productionLine = new Thread(new ProductionLine(sharedInventory, inventory));

        // Start all threads
        supplierIron.start();
        supplierWood.start();
        supplierCement.start();
        productionLine.start();
    }
}

class SharedInventory {
    int iron = 0;
    int wood = 0;
    int cement = 0;
}

class SupplierIron implements Runnable {
    private SharedInventory inventory;
    private Object lock;

    public SupplierIron(SharedInventory inventory, Object lock) {
        this.inventory = inventory;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                inventory.iron++;
                System.out.println("Supplied 1 Iron. Iron Inventory: " + inventory.iron);
                lock.notifyAll(); // Notify waiting threads that supplies have arrived
                try {
                    Thread.sleep(600);
                    lock.wait(); // Wait for the production line to consume the resources
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class SupplierWood implements Runnable {
    private SharedInventory inventory;
    private Object lock;

    public SupplierWood(SharedInventory inventory, Object lock) {
        this.inventory = inventory;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                inventory.wood++;
                System.out.println("Supplied 1 Wood. Wood Inventory: " + inventory.wood);
                lock.notifyAll();
                try {
                    Thread.sleep(600);
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class SupplierCement implements Runnable {
    private SharedInventory inventory;
    private Object lock;

    public SupplierCement(SharedInventory inventory, Object lock) {
        this.inventory = inventory;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                inventory.cement++;
                System.out.println("Supplied 1 Cement. Cement Inventory: " + inventory.cement);
                lock.notifyAll();
                try {
                    Thread.sleep(600);
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class ProductionLine implements Runnable {
    private SharedInventory inventory;
    private Object lock;

    public ProductionLine(SharedInventory inventory, Object lock) {
        this.inventory = inventory;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
            	 try {
                     // Wait until there are enough resources for production
                     while (inventory.iron < 1 || inventory.wood < 2 || inventory.cement < 1) {
                         System.out.println("Waiting for supplies...");
                         lock.wait();
                     }

                     // Produce one product by consuming raw materials
                     inventory.iron--;
                     inventory.wood -= 2;
                     inventory.cement--;
                     System.out.println("Product produced. Iron: " + inventory.iron + ", Wood: " + inventory.wood + ", Cement: " + inventory.cement);

                     // Notify suppliers
                     lock.notifyAll();
                     Thread.sleep(1000); // Production time
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                }
            }
        }
    }
}
