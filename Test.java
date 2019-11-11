import org.junit.Test;
import static org.junit.Assert.*;

public class Test{

    @Test
    public void testeStatement() {
        Movie movie1 = new Movie("Teste", 1);
        Movie movie2 = new Movie("Teste 2", 2);
        Movie movie3 = new Movie("Teste 3: O Teste final", 3);

        Customer customer = new Customer("O testador de testes");

        Rental rental1 = new Rental(movie1, 1);
        Rental rental2 = new Rental(movie2, 2);
        Rental rental3 = new Rental(movie3, 1);

        assertEquals("Rental \n"+"\tTeste\t\n"+"\tTeste 2\t\n"+ "\n", c1.statement());
    }

}