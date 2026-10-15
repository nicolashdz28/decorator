public enum ServicioStreaming {
    DISNEY("Disney"),
    PARAMOUNT("Paramount"),
    WARNER("Warner");

    private final String nombre;

    ServicioStreaming(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }//TODO: Implementar el constructor y el método getNombre() para devolver el nombre del servicio de streaming.
}