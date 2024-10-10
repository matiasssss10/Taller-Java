public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        Producto p1 = new Producto("Laptop", 10, 1500.99);
        Producto p2 = new Producto("Mouse", 50, 19.99);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);

        System.out.println("Inventario completo:");
        inventario.mostrarInventario();

        System.out.println("\nBuscando 'Mouse':");
        Producto buscado = inventario.buscarProducto("Mouse");
        if (buscado != null) {
            System.out.println(buscado);
        }

        System.out.println("\nModificando cantidad de 'Laptop':");
        inventario.modificarCantidad("Laptop", 15);
        inventario.mostrarInventario();
    }
}
