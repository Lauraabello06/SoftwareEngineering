package co.edu.poli.templatemethod.model;

public class Client {
	public static void main(String[] args) {
        // Crear una pizza hawaiana y una pizza pepperoni
        Pizza pizzaHawaiana = new PizzaHawaiana();
        Pizza pizzaPepperoni = new PizzaPepperoni();
        
        // Preparar las pizzas
        System.out.println("Preparando pizza hawaiana...");
        pizzaHawaiana.prepararPizza();
        
        System.out.println();
        
        System.out.println("Preparando pizza de pepperoni...");
        pizzaPepperoni.prepararPizza();
    }
}
//En este ejemplo, la estructura del patr�n de dise�o Template sigue siendo la misma, pero hemos eliminado las instrucciones 
//de impresi�n de las clases "Pizza", "PizzaHawaiana" y "PizzaPepperoni". En su lugar, hemos a�adido las instrucciones de 
//impresi�n en el m�todo main de la clase "EjemploTemplateMethod". Como resultado, la salida del programa es la misma que en el ejemplo anterior:



