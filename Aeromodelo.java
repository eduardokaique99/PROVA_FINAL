import java.util.ArrayList;

public abstract class Aeromodelo {
    
    private int id;
    private String marca;
    private String modelo;
    private ArrayList<Aeromodelo> aeromodelos;
    //ATRIBUTOS DA CLASSE

    public Aeromodelo(int id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    } // CONSTRUTOR DA CLASSE

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override // USADO PARA LIMPAR 
    public String toString() {
        return "id=" + id 
            + "\nmarca=" + marca
            + "\nmodelo=" + modelo;
    }

    @Override // USADO PARA LIMPAR 
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Aeromodelo)) {
            return false;
        }
        
        Aeromodelo other = (Aeromodelo) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}