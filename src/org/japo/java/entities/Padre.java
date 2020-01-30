/*
 * Copyright 2020 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.entities;

import java.io.Serializable;
import java.util.Objects;
import org.japo.java.interfaces.IPadre;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public class Padre implements IPadre, Serializable {

    private static final long serialVersionUID = 1L;

    public static final String DEF_NOMBRE = "Querido Papuchi";

    public static final int LON_MIN_NOMBRE = 3;

    private String nombre;

    public Padre() {
        nombre = DEF_NOMBRE;
    }

    public Padre(String nombre) {
        if (validarNombre(nombre)) {
            this.nombre = nombre;
        } else {
            this.nombre = DEF_NOMBRE;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (validarNombre(nombre)) {
            this.nombre = nombre;
        }
    }

    @Override
    public final boolean equals(Object o) {
        boolean testOK;
        if (o == null) {
            testOK = false;
        } else if (!(o instanceof Padre)) {
            testOK = false;
        } else {
            testOK = nombre.equals(((Padre) o).getNombre());
        }
        return testOK;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    
    @Override
    public void saludar() {
        System.out.printf("%s%n", "¡Hola!");
        System.out.printf("me llamo %s%n", nombre);
        System.out.printf("Soy de la clase %s%n", this.getClass().getSimpleName());
        System.out.printf("%s%n", "Saludos");
    }

    private boolean validarNombre(String nombre) {

        return nombre.length() >= LON_MIN_NOMBRE;
    }
    
}
