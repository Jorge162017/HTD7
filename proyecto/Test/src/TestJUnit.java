/**
 * Pruebas Unitarias
 */

import com.sun.tools.javac.Main;

import static org.junit.jupiter.api.Assertions.*;

class TestJUnit {
    Buscar arbolIngles = new Buscar<String,Data>(new Comparador<String,Data>(), new KeyData<String,Data>());
    Buscar arbolEsp = new Buscar<String,Data>(new Comparador<String,Data>(), new KeyData<String,Data>());
    Buscar arbolFrances = new Buscar<String,Data>(new Comparador<String,Data>(), new KeyData<String,Data>());
    @org.junit.jupiter.api.Test
    void testFind() {
        arbolIngles.Insert("house", new Data("house","house","casa","loger"));
        arbolEsp.Insert("casa", new Data("casa","house","casa","loger"));
        arbolFrances.Insert("loger", new Data("loger","house","casa","loger"));
        Data datos1 = (Data)arbolIngles.Find("house", arbolIngles._raiz);
        Data datos2 = (Data)arbolEsp.Find("casa", arbolEsp._raiz);
        Data datos3 = (Data)arbolFrances.Find("loger", arbolFrances._raiz);
        assertEquals(datos1.getFrench(),"loger");
        assertEquals(datos2.getEnglish(),"house");
        assertEquals(datos3.getSpanish(),"casa");
    }
    public void testInOrder() {
        arbolIngles.Insert("house", new Data("house","house","casa","loger"));
        arbolIngles.Insert("dog", new Data("dog","dog","perro","chien"));
        arbolIngles.Insert("homework", new Data("homework","homework","tarea","devoirs"));
        arbolIngles.InOrder(new Visitar<String, Data>(), arbolIngles._raiz);
    }
}