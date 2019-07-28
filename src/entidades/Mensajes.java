package entidades;

public enum Mensajes {
    MENSAJE_SEGUIMIENTO("Ingresa la nota del seguimiento"),
    MENSAJE_PARCIAL("Ingresa la nota del parcial"),
    MENSAJE_FINAL("ingresa la nota del examen final");



    private String mensaje;
    Mensajes(String s)
    {
        this.mensaje = s;
    }

    public String getMensaje(){
        return  mensaje;
    }
}
