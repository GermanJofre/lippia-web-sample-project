package lippia.web.steps;


import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomePageService;




public class HomePageSteps extends PageSteps {
    @And("Vuelve al Menu Inicio")
    public void MenuInicio() {
        HomePageService.menuInicio();
    }
    @And("Observa 3 Arrivals")
    public void ArrivalsValidacion() {
        HomePageService.arrivalsVerificacion();
    }
    @And("Selecciona uno de los Arrivals")
    public void ArrivalsSeleccionado() {
        HomePageService.arrivalSeleccionado();
    }
    @And("Observa el libro elegido")
    public void LibroElegido() {
        HomePageService.libroElegido();
    }
    @And("Agrega el libro a su cesta")
    public void Agregar() {
        HomePageService.agregar();
    }
    @When("Procede a pasar al Menu del Item")
    public void MenuItem() {
        HomePageService.menuItem();
    }
    @And("Se ve el libro junto a los valores totales, siempre total < subtotal por los impuestos")
    public void VerificacionValores() {
        HomePageService.verificacionValores();
    }
    @And("Procede a realizar el pago que le llevara a la pasarela de pago")
    public void Pasarela() {
        HomePageService.pasarela();
    }
    @Then("El cliente observa el formulario para agregar sus datos y puede seleccionar por cualquier tipo de pago como transferencia bancaria directa, cheque, efectivo o paypal")
    public void ValidacionFormulario() {
        HomePageService.validacionFormulario();
    }
    @And("Tiene la opcion de agregar cupones en la página de la pasarela de pago, tambien puede encontrar la facturacion, el pedido y detalles adicionales")
    public void AgregarCupon() {
        HomePageService.agregarCupon();
    }
    @Then("^El cliente rellena sus datos del formulario '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)'$")
    public void Datos(String Nombre, String Apellido, String Empresa, String Email, String Telefono, String Pais, String Direccion, String Dpto, String Ciudad, String Provincia, String CP, String Nota) {
        HomePageService.datos(Nombre, Apellido, Empresa, Email, Telefono, Pais, Direccion, Dpto, Ciudad, Provincia, CP, Nota);
    }
    @And("Se confirma la compra")
    public void CompraRealizada() {
        HomePageService.compraRealizada();
    }
}

