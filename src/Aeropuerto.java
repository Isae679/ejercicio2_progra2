public class Aeropuerto {
    //atributos
   private String nombre;
   private String codigoAeropuerto;
   private Ciudad ciudad;

    public Aeropuerto(String nombre, String codigoAeropuerto, Ciudad ciudad) {
        this.nombre = nombre;
        this.codigoAeropuerto = codigoAeropuerto;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoAeropuerto() {
        return codigoAeropuerto;
    }

    public void setCodigoAeropuerto(String codigoAeropuerto) {
        this.codigoAeropuerto = codigoAeropuerto;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }



}
