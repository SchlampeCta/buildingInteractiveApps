package co.edu.unipiloto;

import java.util.ArrayList;
import java.util.List;


public class BeerExpert {

    List<String> getBrands (String color){
          List  brands = new ArrayList<>();
          if(color.equals("Informativas")) {
                brands.add("Primeros auxilios");
                brands.add("Oficinas de informacion");
                brands.add("Caseta telefonica");
                brands.add("Estacion de servicio");
                brands.add("Oficina de correos");
                brands.add("Taller mecanico");
                brands.add("Baños");
                brands.add("Restaurantes");
                brands.add("Hospedaje");
                brands.add("Fin de autopoista");
          } else if (color.equals("Restrictivas")) {
              brands.add("Alto");
              brands.add("Seda el paso");
              brands.add("Inspeccion");
              brands.add("Velocidad maxima");
              brands.add("Vuelta continua");
              brands.add("Circulacion");
              brands.add("No rebasar");
              brands.add("Conservar la derecha");
              brands.add("Doble circulacion");
              brands.add("Altura restringida");
              brands.add("Parada prohibida");
              brands.add("No parar");
          } else if (color.equals("Preventivas")) {
              brands.add("Curva");
              brands.add("Curva cerrada");
              brands.add("Camino sinuoso");
              brands.add("Contracurva");
              brands.add("Cruce");
              brands.add("Bifurcacion");
              brands.add("Entronque");
              brands.add("Glorieta");
              brands.add("Incorporacion de transito");
              brands.add("Doble circulacion");
          } else if (color.equals("Transitorias")) {
              brands.add("Cruce ferroviario");
              brands.add("Paneles de prevencion (Aprox)");
              brands.add("Paneles de prevencion (ob.rig");
              brands.add("Paneles de prevencion (curva)");
              brands.add("Cruz de san andres");
              brands.add("Curva cerrada");
              brands.add("Cruce de peatones");
              brands.add("Atencion");
          }
        {
            return brands;
         }

    }
}

