public enum Tallas {

    //XS, S, M, L, XL, XXL, XXXL

    MINI("S"), MEDIANO("M"), GRANDE("L"), MUYGRANDE("XL");

    private Tallas(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String dameAbreviatura() {
        return abreviatura;
    }

    private String abreviatura;

}

//Aqui lo que estamos haciendo es crear una instancia perteneciente a la clase enum.
//Y que la variable onjeto (Talla) solamente podra almacenar en su interior los valores escritos.