

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class FontanaAppTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FontanaAppTest
{
    Ave[] aves;
    Anotacao[] notas;
    /**
     * Default constructor for test class FontanaAppTest
     */
    public FontanaAppTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        aves = new Ave[10];

        aves[0]= new Ave();
        aves[0].caracteristicas("8","1","1","João-grande","Maguari Stork","Ciconia maguari","Ciconiidae","85cm");
        aves[1]= new Ave();
        aves[1].caracteristicas("8","1","2","Cabeça-seca","Wood Stork","Mycteria americana","Ciconiidae","65cm");
        aves[2]= new Ave();
        aves[2].caracteristicas("8","2","1","Cisne-de-pescoço-preto","Black-necked-swan","Cygnus melancoryphus","Anatidae","80cm");
        aves[3]= new Ave();
        aves[3].caracteristicas("8","2","2","Capororoca","Coscoroba Swan","Cosocoroba coscoroba","Anatidae","65cm");
        aves[4]= new Ave();
        aves[4].caracteristicas("8","3","1","Garça-branca-grande","Great Egret","Ardea alba","Ardeidae","65cm");
        aves[5] = new Ave();
        aves[5].caracteristicas("9","1","2","Àguia-pescadora","Osprey","Pandion haliaetus","Pandionidae","57cm");
        aves[6] = new Ave();
        aves[6].caracteristicas("9","2","1","Gavião-de-rabo-branco","White-tailed Hawk","Geranoaetus albicaudatus","Accipitridae","48-58cm");
        aves[7] = new Ave();
        aves[7].caracteristicas("9","3","2","Gaivota-de-cabeça-cinza","Grey-headed Gull","Chroicocephalus cirrocephalus","Laridae","38cm");
        aves[8] = new Ave();
        aves[8].caracteristicas("10","1","2","Pernilongo-de-costas-brancas","White-necked-Stilt","Himantopus melanurus","Recurvirostridae","35cm");
        aves[9] = new Ave();
        aves[9].caracteristicas("10","2","1","Trinta-réis-anão","Yellow-Billed Tern","Sternula superciliaris","Sternidae","22cm");
        
        notas = new Anotacao[10];
        notas[0] = new Anotacao();
        notas[0].anotarData("01/01/2022");
        notas[0].anotarAve("Passaro 1");
        notas[1] = new Anotacao();
        notas[1].anotarData("02/01/2022");
        notas[1].anotarAve("Passaro 2");
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testShowcatalogo()
    {
        FontanaApp.showcatalogo(aves);
        System.out.println("############################");
        
    }

    @Test
    public void testMeses()
    {
        FontanaApp.meses(notas, "janeiro", aves);
        System.out.println("############################");
    }

    @Test
    public void testCatalogo()
    {
        FontanaApp.catalogo(aves, 0);
        FontanaApp.catalogo(aves, 1);
        FontanaApp.catalogo(aves, 2);
        FontanaApp.catalogo(aves, 3);
        FontanaApp.catalogo(aves, 4);
        FontanaApp.catalogo(aves, 5);
        FontanaApp.catalogo(aves, 6);
        FontanaApp.catalogo(aves, 7);
        FontanaApp.catalogo(aves, 8);
        FontanaApp.catalogo(aves, 9);
        System.out.println("############################");
    }

    @Test
    public void testShow()
    {
        FontanaApp.show(0, 0, aves);
        FontanaApp.show(0, 1, aves);
        FontanaApp.show(0, 2, aves);
        FontanaApp.show(0, 3, aves);
        FontanaApp.show(0, 4, aves);
        FontanaApp.show(0, 5, aves);
        FontanaApp.show(0, 6, aves);
        FontanaApp.show(0, 7, aves);
        System.out.println("---------------------");
        FontanaApp.show(1, 0, aves);
        FontanaApp.show(1, 1, aves);
        FontanaApp.show(1, 2, aves);
        FontanaApp.show(1, 3, aves);
        FontanaApp.show(1, 4, aves);
        FontanaApp.show(1, 5, aves);
        FontanaApp.show(1, 6, aves);
        FontanaApp.show(1, 7, aves);
        System.out.println("---------------------");
        FontanaApp.show(2, 0, aves);
        FontanaApp.show(2, 1, aves);
        FontanaApp.show(2, 2, aves);
        FontanaApp.show(2, 3, aves);
        FontanaApp.show(2, 4, aves);
        FontanaApp.show(2, 5, aves);
        FontanaApp.show(2, 6, aves);
        FontanaApp.show(2, 7, aves);
        System.out.println("---------------------");
        FontanaApp.show(3, 0, aves);
        FontanaApp.show(3, 1, aves);
        FontanaApp.show(3, 2, aves);
        FontanaApp.show(3, 3, aves);
        FontanaApp.show(3, 4, aves);
        FontanaApp.show(3, 5, aves);
        FontanaApp.show(3, 6, aves);
        FontanaApp.show(3, 7, aves);
        System.out.println("---------------------");
        FontanaApp.show(4, 0, aves);
        FontanaApp.show(4, 1, aves);
        FontanaApp.show(4, 2, aves);
        FontanaApp.show(4, 3, aves);
        FontanaApp.show(4, 4, aves);
        FontanaApp.show(4, 5, aves);
        FontanaApp.show(4, 6, aves);
        FontanaApp.show(4, 7, aves);
        System.out.println("---------------------");
        FontanaApp.show(5, 0, aves);
        FontanaApp.show(5, 1, aves);
        FontanaApp.show(5, 2, aves);
        FontanaApp.show(5, 3, aves);
        FontanaApp.show(5, 4, aves);
        FontanaApp.show(5, 5, aves);
        FontanaApp.show(5, 6, aves);
        FontanaApp.show(5, 7, aves);
        System.out.println("---------------------");
        FontanaApp.show(6, 0, aves);
        FontanaApp.show(6, 1, aves);
        FontanaApp.show(6, 2, aves);
        FontanaApp.show(6, 3, aves);
        FontanaApp.show(6, 4, aves);
        FontanaApp.show(6, 5, aves);
        FontanaApp.show(6, 6, aves);
        FontanaApp.show(6, 7, aves);
        System.out.println("---------------------");
        FontanaApp.show(7, 0, aves);
        FontanaApp.show(7, 1, aves);
        FontanaApp.show(7, 2, aves);
        FontanaApp.show(7, 3, aves);
        FontanaApp.show(7, 4, aves);
        FontanaApp.show(7, 5, aves);
        FontanaApp.show(7, 6, aves);
        FontanaApp.show(7, 7, aves);
        System.out.println("############################");
    }

    @Test
    public void testComparacao()
    {       
        FontanaApp.comparacao(3, aves);
        System.out.println("############################");
        FontanaApp.comparacao(4, aves);
        System.out.println("############################");
        FontanaApp.comparacao(5, aves);
        System.out.println("############################");
    }
}





