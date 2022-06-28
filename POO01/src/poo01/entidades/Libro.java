
package poo01.entidades;

public class Libro {
    
    public int ISBN;
    public String Título;
    public String Autor;
    public int NumDePag;
    
    
     public Libro() {
    }

    public Libro(int ISBN, String Título, String Autor, int NumDePag) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.NumDePag = NumDePag;
    }
  
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTítulo() {
        return Título;
    }

    public void setTítulo(String Título) {
        this.Título = Título;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumDePag() {
        return NumDePag;
    }

    public void setNumDePag(int NumDePag) {
        this.NumDePag = NumDePag;
    }
    
    
    

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", T\u00edtulo=" + Título + ", Autor=" + Autor + ", NumDePag=" + NumDePag + '}';
    }
}

/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/