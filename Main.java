import java.util.Scanner;
public class Main {
    static Catalogo catalogoTienda= new Catalogo();
    static Scanner entdada= new Scanner(System.in);
    public static void main(String[] args) {
        catalogoTienda.verCatalogo();
        int opcion,clave,indice = 0;
        String nombreCancion =null;
        do{
            menu();
            opcion=entdada.nextInt();
            entdada.nextLine();
            switch (opcion) {
                case 1: {
                    pedirDatos();
                    catalogoTienda.verCatalogo();
                }
                case 2:
                    catalogoTienda.ordenarClaves();
                    catalogoTienda.verCatalogo();
                    break;
                case 3:
                    System.out.printf("Dame la clave de la cancion a buscar: ");
                    clave = entdada.nextInt();
                    indice = catalogoTienda.buscarCancionPorClaveSecuencial(clave);
                    if (indice != -1) {
                        catalogoTienda.mostrarCancion(indice);
                    } else {
                        System.out.println("No se encontro");
                    }
                    break;
                case 4:
                    System.out.println("Buscar una cancion por clave(B.Binaria)");
                    catalogoTienda.ordenarClaves();
                    System.out.printf("Dame la clave de la cancion a buscar: ");
                    clave = entdada.nextInt();
                    indice = catalogoTienda.buscarCancionPorClaveBinaria(clave);
                    if (indice != -1) {
                        catalogoTienda.mostrarCancion(indice);
                    } else {
                        System.out.println("No se encontro ");
                        break;
                    }
                case 5:
                    System.out.println("Buscar Una cancion por nombre: (B.Secuencial)");
                    System.out.println("Nombre de la cancion A Buscar: ");
                    nombreCancion = entdada.nextLine();
                    indice = catalogoTienda.buscarCancionPorNombre(nombreCancion);
                    if (indice != -1) {
                        catalogoTienda.mostrarCancion(indice);
                    } else {
                        System.out.println("No se encontro ");
                        break;
                    }
                case 6:
                    System.out.println("Dame la clave de la cancion a borrar: ");
                    clave = entdada.nextInt();
                    indice = catalogoTienda.buscarCancionPorClaveSecuencial(clave);
                    if (indice == -1) {
                        System.out.println("La clave no existe repite la operacion");
                    } else {
                        catalogoTienda.borrarCancion(clave);
                        System.out.println("La cancion se ha eliminado");
                        catalogoTienda.verCatalogo();
                        break;
                    }
                case 7:
                    catalogoTienda.cambiarNombreCancion(indice,nombreCancion);//checar esto :(
                    break;
                case 8:
                    System.out.println("Mostrar el total");
                    break;
                case 9:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("No valido");break;
            }
        }while (opcion!=9);
    }
    private static void menu(){
        System.out.println("Operaciones sobre Canciones");
        System.out.println("1.-Añadir una cancion a la lista");
        System.out.println("2.-Mostrar Lista de Canciones");
        System.out.println("3. Buscar una Cancion por clave B.Secuencial");
        System.out.println("4. Buscar una Cancion por clave B .Binaria");
        System.out.println("5. Buscar una Cancion por NOMBRE B .Secuencial");
        System.out.println("6. Borrar una cancion");
        System.out.println("7. Cambiar el nombre de una cancion");
        System.out.println("8. Mostrar el total");
        System.out.println("9.- Salir");
        System.out.print("Opcion: ");
    }
    public static void pedirDatos(){
        int clavex;
        String nombreCancionx,nombreCantantex,generox,albumx;
        double precio;
        System.out.println("Dame la clave de la cancion: ");
        clavex= entdada.nextInt();
        entdada.nextLine();
        System.out.println("Dame el nombre de la cancion: ");
        nombreCancionx=entdada.nextLine();
        System.out.println("Dame el nombre de los artistas: ");
        nombreCantantex=entdada.nextLine();
        System.out.println("Genero: ");
        generox=entdada.nextLine();
        System.out.println("Album: ");
        albumx=entdada.nextLine();
        System.out.println("Precio: ");
        precio= entdada.nextDouble();
        Cancion cancionX= new Cancion(clavex,nombreCancionx,nombreCantantex,generox,albumx,precio);
        catalogoTienda.insertarCancion(cancionX);
    }
    public static void imprimirliena(){
        System.out.println("--------------------------------------------------"+"-----------------------");
    }
}