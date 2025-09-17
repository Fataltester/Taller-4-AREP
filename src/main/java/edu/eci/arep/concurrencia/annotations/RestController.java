/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.eci.arep.concurrencia.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
// Meta anotación  
@Retention(RetentionPolicy.RUNTIME) // permite la reflexión
@Target(ElementType.TYPE) // la reflexion esta aplicada unicamente a los métodos, por lo que el framework los inspecciona durante la ejecucion
public @interface RestController {
    
}
