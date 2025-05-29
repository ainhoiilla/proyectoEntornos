/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.mavenproject1.Cliente;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ainho
 */
public class TestCliente {
    
    @Test
    
    public void testRegistrarProgreso(){
        Cliente yo= new Cliente ("id1", "ainhoa");
        String id="idm1";
        double peso=10;
        int repe=4;
        String fecha="28/01/2027";
        
        
        boolean result=yo.registrarProgresoMaquina(id, peso, repe, fecha);
        
        //test para ver si se han registrado con exito
        
        assertTrue(result,"El registro debe de haberse registrado con exito");
        
        //test para ver si los datos son iguales
        assertEquals(yo.getHistorial().getLast().get("peso"),peso);
        assertEquals(yo.getHistorial().getLast().get("idMaquina"),id);
        assertEquals(yo.getHistorial().getLast().get("repeticiones"),repe);
        assertEquals(yo.getHistorial().getLast().get("fecha"),fecha);
        
        
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
