import java.util.ArrayList;
import java.util.Random;

public class User{
    protected String nome;
    protected String email;
    protected int soldi;

    Random random = new Random();

    public User() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSoldi() {
        return soldi;
    }

    public void setSoldi(int soldi) {
        this.soldi = soldi;
    }
    
}