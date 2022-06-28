
package DatosEjercicio;


public class Libro {
    
    public int ISBN;
    public String Título;
    public String Autor;
    public int NumDePag;

    public Libro(int ISBN, String Título, String Autor, int NumDePag) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.NumDePag = NumDePag;
    }

    public Libro() {
    }
    
    
    
    
}

/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/