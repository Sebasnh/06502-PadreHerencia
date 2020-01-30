/*
 * Copyright 2019 Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es.
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
package org.japo.java.app;

import org.japo.java.entities.Hijo;

/**
 *
 * @author Sebastian Najarro Heredia - sebastian.najarro.alum@iescamp.es
 */
public final class App {

    public final void launchApp() {

      Hijo ob1 = new Hijo();
      ob1.saludar();
      System.out.println("Actualizando ...");
      ob1.setNombre("Jose");
      ob1.saludar();
      
      System.out.println("---");

      Hijo ob2 = new Hijo();
      ob2.saludar();
      System.out.println("Actualizando ...");
      ob2.setNombre("Manolo");
      ob2.saludar();
    }

}
