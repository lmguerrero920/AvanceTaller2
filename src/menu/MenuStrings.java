package menu;

public enum MenuStrings {

   HALLAR_IMC("Hallar Indice de Masa Corporal") ,
   HALLAR_SIGNO_ZODIACAL("Signo Zodiacal"),
   HALLAR_SALARIO("Signo Zodiacal"),
   HALLAR_VECTOR("Signo Zodiacal"),
    MENSAJE_OPCION("Por favor seleccione una opcion"),
    MENSAJE_ELEGIR("Elegir")

    ;
    MenuStrings(String s) {
        this.mensaje = s;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }



    private String mensaje;
}
