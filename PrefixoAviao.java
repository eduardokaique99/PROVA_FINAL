public class PrefixoAviao<K, T> { // CLASSE PARA RECEBER UM CAMPO ONDE POSSUI UMA QUANTIDADE ESPECIFICA DE LETRAS E NUMEROS 
    
    private K letras;
    private T numeros;
    
    public PrefixoAviao(K letras, T numeros) {
        this.letras = letras;
        this.numeros = numeros;
    } // CONSTRUTOR DA CLASSE

    public K getLetras() {
        return letras;
    }

    public void setLetras(K letras) {
        this.letras = letras;
    }

    public T getNumeros() {
        return numeros;
    }

    public void setNumeros(T numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return letras + "-" + numeros;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PrefixoAviao)) {
            return false;
        }
        
        PrefixoAviao<K,T> other = (PrefixoAviao<K,T>) obj;
        if (this.letras != other.letras || this.numeros != other.numeros) {
            return false;
        }
        return true;
    }
}