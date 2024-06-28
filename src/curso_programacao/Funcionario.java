package curso_programacao;

public class Funcionario {
	private String identificador;
    private String nome;
    private String alergias;
    private String problemasMedicos;
    private String telefone;
    private String email;
    
    public Funcionario(String identificador, String nome, String alergias, String problemasMedicos, String telefone, String email) {
        this.identificador = identificador;
        this.nome = nome;
        this.alergias = alergias;
        this.problemasMedicos = problemasMedicos;
        this.telefone = telefone;
        this.email = email;
    }
        
        public String getIdentificador() {
            return identificador;
        }

        public String getNome() {
            return nome;
        }

        public String getAlergias() {
            return alergias;
        }

        public String getProblemasMedicos() {
            return problemasMedicos;
        }

        public String getTelefone() {
            return telefone;
        }

        public String getEmail() {
            return email;
        }

        @Override
        public String toString() {
            return "Identificador: " + identificador + "\n" +
                   "Nome: " + nome + "\n" +
                   "Alergias: " + alergias + "\n" +
                   "Problemas Médicos: " + problemasMedicos + "\n" +
                   "Telefone: " + telefone + "\n" +
                   "Email: " + email;
       
   
    }
}
