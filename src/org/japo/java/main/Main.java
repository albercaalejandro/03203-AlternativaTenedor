/* 
 * Copyright 2019 Alejandro Alberca - alejandro.alberca.alum@iescamp.es.
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
package org.japo.java.main;

import java.util.Scanner;

/**
 *
 * @author Alejandro Alberca - alejandro.alberca.alum@iescamp.es
 */

public class Main {

public static final Scanner SCN = new Scanner(System.in, "ISO-8859-1");

    public static void main(String[] args) {
        final String TENEDOR = "Puas";
        final String CARNE = "Carne";
        final String PESCADO = "Pescado";
        final String SOPA = "Sopa"; 
        
        System.out.println("Alternativa Tenedor");
        System.out.println("===================");
        System.out.print("Tipo de comida .: ");       
        String tenedor = SCN.nextLine();
        System.out.println("---");
        
          switch (tenedor) {
        case CARNE:
            
            System.out.println("3 Puas");
            break;
        case PESCADO:
            System.out.println("4 Puas");
            break;
        default:
            System.out.println("0 Puas");
            break;
          }
    }
}
