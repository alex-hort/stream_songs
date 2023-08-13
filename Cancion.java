public class Cancion {
    private int clave;
    private String nombreCancion;
    private String nombreCantante;
    private  String genero;
    private String album;
    private double precio;

    public Cancion(int clave, String nombreCancion, String nombreCantante, String genero, String album, double precio) {
        this.clave = clave;
        this.nombreCancion = nombreCancion;
        this.nombreCantante = nombreCantante;
        this.genero = genero;
        this.album = album;
        this.precio = precio;
    }

    public int getClave() {
        return clave;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public String getNombreCantante() {
        return nombreCantante;
    }

    public String getGenero() {
        return genero;
    }

    public String getAlbum() {
        return album;
    }

    public double getPrecio() {
        return precio;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public void setNombreCantante(String nombreCantante) {
        this.nombreCantante = nombreCantante;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String formatoArchivo(){
        return clave+ "|"+ nombreCancion+ "|"+nombreCantante+"|"+genero+"|"+album+"|"+precio;
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "clave=" + clave +
                ", nombreCancion='" + nombreCancion + '\'' +
                ", nombreCantante='" + nombreCantante + '\'' +
                ", genero='" + genero + '\'' +
                ", album='" + album + '\'' +
                ", precio=" + precio +
                '}';
    }
}

    

