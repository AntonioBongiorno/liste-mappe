import java.util.Objects;

public class Person implements Comparable<Person> {

    private String nome;
    private int eta;

    public Person(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return eta == person.eta &&
                Objects.equals(nome, person.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, eta);
    }

    @Override
    public String toString() {
        return "Person{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.nome.compareTo(o.getNome()) != 0)
            return this.nome.compareTo(o.getNome());
        return this.eta - o.getEta();
    }
}
