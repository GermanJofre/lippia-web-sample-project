package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomePageService;


public class HomePageSteps extends PageSteps {
    @And("Vuelve al Menu Inicio")
    public void MenuInicio() {
        HomePageService
    }
    @And("Observa 3 Sliders")
    public void Sliders() {
        HomePageService
    }
    @And("Se dirige a uno de los Arrivals")
    public void Arrivals() {
        HomePageService
    }
    @And("Observa el libro elegido")
    public void LibroElegido() {
        HomePageService
    }
    @And("Agrega el libro a su cesta")
    public void AgregarEnCesta() {
        HomePageService
    }
    @And("El cliente ve agreado el libro con su precio")
    public void VerificacionDeLibro() {
        HomePageService
    }
    @When("Se dirige a la cesta con el libro agregado")
    public void clickCesta() {
        HomePageService
    }
    @And("El cliente ve los detalles de compra")
    public void Cesta() {
        HomePageService
    }
    @And("Procede a pasar a la pagina de pago")
    public void ProcesoPago() {
        HomePageService
    }
    @And("Ahora puede encontrar los valores total y subtotal")
    public void Valores() {
        HomePageService
    }
    @And("El total siempre < subtotal por los impuestos")
    public void Impuestos() {
        HomePageService
    }
    @And("Procede a realizar el pago que le llevara a la pasarela de pago")
    public void Pasarela() {
        HomePageService
    }
    @Then("El cliente observa el formulario para agregar sus datos y puede seleccionar por cualquier tipo de pago como transferencia bancaria directa, cheque, efectivo o paypal")
    public void ValidacionFormulario() {
        HomePageService
    }
    @And("Tiene la opcion de agregar cupones en la página de la pasarela de pago, tambien puede encontrar la facturacion, el pedido y detalles adicionales")
    public void AgregarCupones() {
        HomePageService
    }
    @Then("^El cliente rellena sus datos del formulario '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)' '(.*)'$")
    public void DatosFormulario(String Nombre, String Apellido, String Empresa, String Email, String Telefono, String Pais, String Direccion, String Dpto, String Ciudad, String Provincia, String CP, String Nota) {
        HomePageService
    }
    @And("Se confirma la compra")
    public void Compra() {
        HomePageService
    }
}
