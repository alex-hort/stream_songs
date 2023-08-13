import java.util.ArrayList;
import java.util.Iterator;
public class Catalago {

    public class Catalogo {
        private ArrayList<Cancion>listaCanciones;
        public Catalogo(){
            listaCanciones=new ArrayList<>();
        }
        public void setListaCanciones(ArrayList<Cancion>lista){
            this.listaCanciones=lista;
        }
        public ArrayList<Cancion> getListaCanciones() {return listaCanciones;
        }
        public void insertarCancion(Cancion cancionX){
    
            listaCanciones.add(cancionX);
        }
        public void mostrarCancion(int indice){
            Cancion aux =listaCanciones.get(indice);
            System.out.printf( "Clave","Nombre Cancion", "Artista","Precio");
            System.out.println("----------|-------------------------------"+"--------------------------------"+"--------------");
            System.out.printf("%-8s|%-30s|%-30s|%-6.2f\n",aux.getClave(),aux.getNombreCantante(),aux.getNombreCancion(),aux.getPrecio());
        }
        public int buscarCancionPorClaveSecuencial(int claveBuscar) {
            for (int i = 0; i < listaCanciones.size(); i++) {
                if (listaCanciones.get(i).getClave() == claveBuscar) {
                    return i;
                }
            }
            return -1;
        }
        public void borrarCancion(int clave){
            Iterator<Cancion>cancionIterator=listaCanciones.iterator();
            while (cancionIterator.hasNext()){
                Cancion cancionx= cancionIterator.next();
                if(clave == cancionx.getClave()){
                    cancionIterator.remove();
                }
            }
        }
        public int buscarCancionPorNombre(String  nombreaBuscar){
            for(int i=0; i<listaCanciones.size();i++){
                if(listaCanciones.get(i).getNombreCancion().equals(nombreaBuscar)){
                    return i;
                }
            }
            return -1;
        }
    
        public int buscarCancionPorClaveBinaria(int claveAbuscar){
            int bajo=0;
            int alto=listaCanciones.size()-1;
            int buscando;
            while (bajo<=alto){
                int mitad=(bajo+alto)/2;
                buscando=listaCanciones.get(mitad).getClave();
                if(buscando==claveAbuscar) {
                    return mitad;
                }else if(buscando>claveAbuscar){
                    alto=mitad-1;
                }else if(buscando<claveAbuscar){
                    bajo=mitad+1;
                }
            }
            return -1;
        }
        public void ordenarClaves(){
            Cancion aux;
            int N=listaCanciones.size();
            for(int i=0; i<=N-2;i++){
                for(int j=0; j<=N; j++){
                    if(listaCanciones.get(j).getClave()>listaCanciones.get(j+1).getClave());
                    aux=listaCanciones.get(j);
                    listaCanciones.set(j,listaCanciones.get(j+1));
                    listaCanciones.set(j+1,aux);
                }
            }
        }
        public void verCatalogo(){
            System.out.printf("%-8s|%-30s|%-8s\n", "Clave","Nombre Cancion", "Artista","Precio");
            System.out.println("----------|-------------------------------"+"--------------------------------"+"--------------");
            for(Cancion aux:listaCanciones){
                System.out.printf("%-8d|%-30|$%-6.2\n",
                aux.getClave(),aux.getNombreCantante(),aux.getNombreCantante(),aux.getPrecio());
            }
        }
        public void cambiarNombreCancion(int indice, String nuevNombre) {
            Cancion cancionAux =listaCanciones.get(indice);
            cancionAux.setNombreCancion(nuevNombre);
        }
    }
}
    
