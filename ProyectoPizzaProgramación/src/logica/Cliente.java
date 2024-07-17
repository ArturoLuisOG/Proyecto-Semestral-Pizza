//Clase Cliente


package logica;

public class Cliente {
    private String nombre;
    private String direccion;
    private String cedula;
    private String metodoPago;
    private String telefono;
    private String tipoDePizza;
    private String ingredientesDePizza;

    public Cliente(String nombre, String direccion, String cedula, String telefono, String metodoPago, String tipoDePizza, String ingredientesDePizza) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cedula = cedula;
        this.telefono = telefono;
        this.metodoPago = metodoPago;
        this.tipoDePizza = tipoDePizza;
        this.ingredientesDePizza = ingredientesDePizza;
    }

   

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getMetodoPago() {
        return metodoPago;
    }


	public String getTipodepizza() {
		return tipoDePizza;
	}
	
	public String getIngredientesdepizza() {
		return ingredientesDePizza;
	}
}