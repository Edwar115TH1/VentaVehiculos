public class ObjAtributos {

    int tipoVehiculo, precio, idV;
    String color;
    int estado;

    public ObjAtributos() {

    }

    public ObjAtributos(int tipoVehiculo, int precio, int idV, String color, int estado) {
        this.tipoVehiculo = tipoVehiculo;
        this.precio = precio;
        this.idV = idV;
        this.color = color;
        this.estado = estado;
    }

    public int getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(int tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getIdV() {
        return idV;
    }

    public void setIdV(int idV) {
        this.idV = idV;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}