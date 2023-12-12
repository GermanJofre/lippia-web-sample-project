package lippia.web.constants;


public class HomePageConstants {
    public static final String INICIO = "xpath://*[text()='Home']";
    public static final String DIV_ARRIVAL_XPATH = "xpath://*[@id='themify_builder_content-22']/div[2]/div/div/div";
    public static final String DIV_IMG_ARRIVAL_XPATH = "xpath://div[@class='themify_builder_sub_row clearfix gutter-default   sub_row_1-0-2']//img";
    public static final String ARRIVALS_SELECCIONADO = "xpath://li[contains(@class,'reemplazo')]";
    public static final String LIBRO_ELEGIDO = "xpath://*[contains(@class, 'product_title') and contains(text(), 'Selenium Ruby')]";
    public static final String AGREGAR = "xpath://*[text()='Add to basket']";
    public static final String MENU_ITEM = "xpath://*[@class='wpmenucart-icon-shopping-cart-0']";
    public static final String LIBRO_VERIFICACION = "xpath://a[contains(text(), 'Selenium Ruby')]";
    public static final String SUBTOTAL = "xpath://td[@data-title='Subtotal']/span";
    public static final String TOTAL = "xpath://td[@data-title='Total']/strong/span";
    public static final String PASARELA = "xpath://*[@class='checkout-button']";
    public static final String DATOS_FACTURACION = "xpath//h3[text()='Billing Details']";
    public static final String INFORMACION_ADICIONAL = "xpath//h3[text()='Additional Information']";
    public static final String TABLA_PRECIOS = "xpath//h3[text()='Your order']";
    public static final String TABLA_FORMAS_DE_PAGO = "id:payment";
    public static final String CUPON = "xpath//a[@class='showcoupon']";
    public static final String VALIDACION_CUPON1 = "xpath//input[@name='apply_coupon']";
    public static final String VALIDACION_CUPON2 = "xpath//input[@name='coupon_code']";
    public static final String NOMBRE = "id:billing_first_name";
    public static final String APELLIDO = "id:billing_last_name";
    public static final String EMPRESA = "id:billing_company";
    public static final String EMAIL = "id:billing_email";
    public static final String TELEFONO = "id:billing_phone";
    public static final String PAIS = "xpath//label[text()='Country *']";
    public static final String DIRECCION = "id:billing_address_1";
    public static final String DPTO = "id:billing_address_2";
    public static final String CIUDAD = "id=billing_city";
    public static final String PROVINCIA = "id=s2id_autogen2_search";
    public static final String CP = "id=billing_postcode";
    public static final String NOTA = "id=order_comments";
    public static final String CONFIRMAR_COMPRA = "id=place_order";
    public static final String MENSAJE = "xpath//p[@class='woocommerce-thankyou-order-received']";
    public static final String METODO_PAGO = "xpath//li[@class='method']/strong";
    public static final String TABLA_DETALLE = "xpath//table[@class='shop_table order_details']";
    public static final String PRODUCTO = "xpath//td[@class='product-name']/a";


}

