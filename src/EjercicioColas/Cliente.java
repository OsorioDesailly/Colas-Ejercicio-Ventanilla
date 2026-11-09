package EjercicioColas;
public class Cliente {
    private String id;
    private String nombre;
    public Cliente(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;}
	public String getIdTicket() {
        return id;}
    public void setIdTicket(String idTicket) {
        this.id = idTicket;}
    public String getNombre() {
        return nombre;}
    public void setNombre(String nombre) {
        this.nombre = nombre;}
    public String toString() {
        return "ID: " + id + " | Cliente: " + nombre;
    }
}
