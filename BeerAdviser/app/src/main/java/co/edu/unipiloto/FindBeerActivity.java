package co.edu.unipiloto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;


public class FindBeerActivity extends AppCompatActivity {
    private BeerExpert expert= new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {  //metodo se llama cuando se crea el objeto de actividad
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //le dice a Android que esa actividad utiliza ... como diseño

    }
    //metodo: llama cuando el usuario hace click en el boton
    //view: Es un parametro, hace referencia al GUI que activa el boton
     public void onClickFindBeer (View view){

        //Metodo que hace referencia a un componente, Este método toma el ID del componente GUI como parámetro y devuelve un objeto Ver.
         // Luego, convierte el valor de retorno al tipo correcto de componente GUI (por ejemplo, un TextView o un Botón).
         TextView brands = (TextView) findViewById(R.id.brands);

         //cuando se llama a esta línea de código, se crea un objeto TextView llamadas marcas.

         brands.setText("Gottle of geer");

         //puede obtener una referencia a una rueda giratoria de forma similar a como se obtiene una referencia a una vista de texto.
         //Recuperar el valor o elemento selccionado
         Spinner color = (Spinner) findViewById(R.id.color);
         String beerType = String.valueOf(color.getSelectedItem());

         //Esto le proporciona un objeto Spinner a cuyos métodos ahora puede acceder.
         //• Como ejemplo, aquí se explica cómo recuperar el elemento actualmente seleccionado en el
         //spinner y convertirlo en una cadena

         String.valueOf(color.getSelectedItem());


         List<String> brandsList = expert.getBrands(beerType);
         StringBuilder brandsFormated = new StringBuilder();
         for (String brand: brandsList){
             brandsFormated.append(brand).append('\n');
         }
         brands.setText(brandsFormated);
     }
}