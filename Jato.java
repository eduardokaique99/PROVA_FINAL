import java.util.ArrayList;

public class Jato extends Aeromodelo {

        private int velocidade;
        private String cor;
        private static ArrayList<Jato> jatos = new ArrayList<>();
        //ATRIBUTOS DA CLASSE
    
        public Jato(int id, String marca, String modelo) {
            super(id, marca, modelo);
            this.velocidade = velocidade;
            this.cor = cor;

            setJato(this);
        } // CONSTRUTOR DA CLASSE

        public int getVelocidade() {
            return velocidade;
        }
    
        public void setVelocidade(int velocidade) {
            this.velocidade = velocidade;
        }

        public String getCor() {
            return cor;
        }
    
        public void setCor(String cor) {
            this.cor = cor;
        }

        public static ArrayList<Jato> getJato() {
            return jatos;
        }
    
        public static void setJato(Jato jato) {
            jatos.add(jato);
        }
    
        @Override // USADO PARA LIMPAR 
        public String toString() {
            return super.toString() 
                + "\nvelocidade=" + velocidade
                + "\ncor=" + cor + "\n";
        }
    
        public static Jato getJatoById(int id) throws Exception {
            for (Jato jato : jatos) {
                if (jato.getId() == id) {
                    return jato;
                }
            }
            throw new Exception("Jato não encontrada");
        } // VERIFICAÇÃO DA EXISTENCIA PELO ID
    
        public static void excluir(int id) throws Exception {
            Jato jato = getJatoById(id);
            jatos.remove(jato);
        }
    }