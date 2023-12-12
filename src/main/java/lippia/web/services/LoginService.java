package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.HomePageConstants;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.NoSuchElementException;


public class HomePageService extends ActionManager {
    public static void menuInicio(){
        click(HomePageConstants.INICIO);
    }


    public static void arrivalsVerificacion() {
        try {
            List<WebElement> lista = getElementsByParent(HomePageConstants.DIV_ARRIVAL_XPATH, HomePageConstants.DIV_IMG_ARRIVAL_XPATH);
            System.out.println("Elementos encontrados: " + lista.size());
            Assert.assertEquals(3, lista.size());
        } catch (NoSuchElementException | TimeoutException e) {
            System.err.println("Error al obtener elementos: " + e.getMessage());
            throw e;
        }
    }

    public  static void arrivalSeleccionado(){
        List<WebElement> listaBtnAdd = getElements("xpath://a[text()='Add to basket']");
        WebElement btnPrimerLibro = listaBtnAdd.get(0);
        click(String.valueOf(btnPrimerLibro));
    }


    public  static void libroElegido(){
        Assert.assertTrue(isVisible(HomePageConstants.LIBRO_ELEGIDO));
    }
    public  static void agregar(){
        click(HomePageConstants.AGREGAR);
    }


    public  static void menuItem(){
        click(HomePageConstants.MENU_ITEM);
    }


    public  static void verificacionValores(){
        Assert.assertTrue(isVisible(HomePageConstants.LIBRO_VERIFICACION));


        String SubTotalPrecio = getText(HomePageConstants.SUBTOTAL);
        String TotalPrecio = getText(HomePageConstants.TOTAL);
        float SubTotal = Integer.parseInt(SubTotalPrecio);
        float Total = Integer.parseInt(TotalPrecio);


        Assert.assertTrue((Total > SubTotal),"Error");
    }


    public  static void pasarela(){
        click(HomePageConstants.PASARELA);
    }


    public  static void validacionFormulario(){
        SoftAssert assertSoft = new SoftAssert();
        assertSoft.assertTrue(isPresent(HomePageConstants.DATOS_FACTURACION), "El formulario Billing Details no se encuentra");
        assertSoft.assertTrue(isPresent(HomePageConstants.INFORMACION_ADICIONAL), "El formulario Additional Information no se encuentra");
        assertSoft.assertTrue(isPresent(HomePageConstants.TABLA_PRECIOS), "El formulario Your order no se encuentra");
        assertSoft.assertTrue(isPresent(HomePageConstants.TABLA_FORMAS_DE_PAGO), "El formulario Metodo de Pago no se encuentra");
        assertSoft.assertEquals(HomePageConstants.SUBTOTAL,"500");
        assertSoft.assertEquals(HomePageConstants.TOTAL,"525");
        assertSoft.assertAll();
    }


    public  static void agregarCupon(){
        click(HomePageConstants.CUPON);
        Assert.assertTrue(isVisible(HomePageConstants.VALIDACION_CUPON1,HomePageConstants.VALIDACION_CUPON2));
    }


    public  static void datos(String Nombre, String Apellido, String Empresa, String Email, String Telefono, String Pais, String Direccion, String Dpto, String Ciudad, String Provincia, String CP, String Nota){
        setInput(HomePageConstants.NOMBRE,Nombre);
        setInput(HomePageConstants.APELLIDO,Apellido);
        setInput(HomePageConstants.EMPRESA,Empresa);
        setInput(HomePageConstants.EMAIL,Email);
        setInput(HomePageConstants.TELEFONO,Telefono);
        setInput(HomePageConstants.PAIS,Pais);
        setInput(HomePageConstants.DIRECCION,Direccion);
        setInput(HomePageConstants.DPTO,Dpto);
        setInput(HomePageConstants.CIUDAD,Ciudad);
        setInput(HomePageConstants.PROVINCIA,Provincia);
        setInput(HomePageConstants.CP,CP);
        setInput(HomePageConstants.NOTA,Nota);
        click(HomePageConstants.CONFIRMAR_COMPRA);
    }


    public  static void compraRealizada(){
        String Mensaje = getText(HomePageConstants.MENSAJE);
        Assert.assertTrue(Mensaje.contains("Thank you. Your order has been received."), "Error");


        Assert.assertTrue(isVisible(HomePageConstants.METODO_PAGO,HomePageConstants.TABLA_DETALLE,HomePageConstants.PRODUCTO));
    }
}

