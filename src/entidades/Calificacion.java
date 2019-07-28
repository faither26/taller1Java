package entidades;

public enum Calificacion {
    C1("Excelente, tu rendimiento ha sido el mejor. : "),
    C2("Excelente, tu rendimiento ha sido el mejor. : "),
    C3("Te sugerimos comprometerte más con tu estudio. : "),
    C4("Malas noticias, no cumpliste con el mínimo para avanzar. : "),
    C5("Nuevamente vuelve a iniciar tus estudios y dedícate. : ");


    private String mensaje;
    Calificacion(String s)
    {
        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }
}
