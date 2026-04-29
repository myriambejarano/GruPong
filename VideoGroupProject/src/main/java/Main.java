public class Main {
    public static void main(String[] args) {

        Videoclub vc = new Videoclub();

        Usuario u1 = new Usuario("Juan", 1);
        Usuario u2 = new Usuario("Ana", 2);
        Usuario u3 = new Usuario("Carlos", 3);
        Usuario u4 = new Usuario("Lucia", 4);
        Usuario u5 = new Usuario("Pedro", 5);
        Usuario u6 = new Usuario("Marta", 6);
        Usuario u7 = new Usuario("Luis", 7);
        Usuario u8 = new Usuario("Sofia", 8);
        Usuario u9 = new Usuario("Diego", 9);
        Usuario u10 = new Usuario("Elena", 10);
        Usuario u11 = new Usuario("Javier", 11);
        Usuario u12 = new Usuario("Paula", 12);
        Usuario u13 = new Usuario("Alberto", 13);
        Usuario u14 = new Usuario("Carmen", 14);
        Usuario u15 = new Usuario("Raul", 15);

        Pelicula p1 = new Pelicula("Matrix");
        Pelicula p2 = new Pelicula("Star Wars I");
        Pelicula p3 = new Pelicula("El Señor de los Anillos");
        Pelicula p4 = new Pelicula("Harry Potter");
        Pelicula p5 = new Pelicula("Titanic");

        vc.agregarUsuario(u1);
        vc.agregarUsuario(u2);
        vc.agregarUsuario(u3);
        vc.agregarUsuario(u4);
        vc.agregarUsuario(u5);
        vc.agregarUsuario(u6);
        vc.agregarUsuario(u7);
        vc.agregarUsuario(u8);
        vc.agregarUsuario(u9);
        vc.agregarUsuario(u10);
        vc.agregarUsuario(u11);
        vc.agregarUsuario(u12);
        vc.agregarUsuario(u13);
        vc.agregarUsuario(u14);
        vc.agregarUsuario(u15);

        vc.agregarPelicula(p1);
        vc.agregarPelicula(p2);
        vc.agregarPelicula(p3);
        vc.agregarPelicula(p4);
        vc.agregarPelicula(p5);

        vc.reservarPelicula(u1, p1);
        vc.reservarPelicula(u2, p1);
        vc.reservarPelicula(u3, p1);
        vc.devolverPelicula(u1, p1);

        vc.reservarPelicula(u4, p2);
        vc.reservarPelicula(u5, p2);

        vc.reservarPelicula(u6, p3);
        vc.reservarPelicula(u7, p4);
        vc.reservarPelicula(u8, p5);

        vc.comprobarRetrasos();
    }
}