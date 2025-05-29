/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author ainho
 */
public class Cliente {
    private String id;
    private String nombre;
    private ArrayList<TreeMap<String,Object>> historial;

    public Cliente(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.historial = new ArrayList<>();
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<TreeMap<String, Object>> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<TreeMap<String, Object>> historial) {
        this.historial = historial;
    }
    
    public boolean registrarProgresoMaquina(String idMaquina, double peso, int repeticiones, String fecha) {
        if (idMaquina == null || idMaquina.trim().isEmpty()) {
            return false;
        }
        
        if (peso <= 0 || repeticiones <= 0) {
             return false;
        }
        
        TreeMap<String, Object> datos = new TreeMap<>();
        datos.put("idMaquina", idMaquina);
        datos.put("peso", peso);
        datos.put("repeticiones", repeticiones);
        datos.put("fecha", fecha);
        
        this.historial.add(datos);
        
        return true;
    }
    
    
}
