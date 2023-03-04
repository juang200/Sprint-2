package Userinterfaces.HU0006;

import net.serenitybdd.screenplay.targets.Target;

import javax.swing.plaf.PanelUI;

public class BotonesJugador {

    // Botones para el Login

    public static final Target INPUT_USUARIO = Target.the("Input para ingresar el Usuario").locatedBy("//input[contains(@id,'mui-1')]");

    public static final Target INPUT_CONTRASENA = Target.the("Input para ingresar la contraseña").locatedBy("//input[contains(@id,'mui-2')]");

    public static final Target BUTTON_INGRESAR = Target.the("Boton Ingresar").locatedBy("//p[contains(.,'Ingresar')]");

    // Botones Detalle General jugador

    public static final Target ICONO_JUGADOR = Target.the("Icono jugador menu principal").locatedBy("//p[@class='sidebar-text'][contains(.,'Jugador')]");

    public static final Target DETTALLE_COMPLETO = Target.the("Ir a detalle general jugador").locatedBy("(//span[contains(.,'Detalle completo')])[2]");

    public static final Target FILTRO_NOMBRE = Target.the("Filtro para ingresar el nombre del jugador").locatedBy("//input[contains(@id,'Nombre')]");

    public static final Target BUTTON_FILTRAR = Target.the("Boton Filtrar").locatedBy("//label[contains(.,'FILTRAR')]");

    public static final Target VERIF_FILTRADO_J = Target.the("Verificacion filtrado jugador").locatedBy("//span[contains(.,'1005090639')]");

    // Limpiar Filtros

    public static final Target BUTTON_LIMPIAR = Target.the("Boton Limpiar").locatedBy("//label[contains(.,'LIMPIAR')]");

    public static final Target VERIF_FILTROS_LIMPIOS_J = Target.the("Verificacion Filtros LImpios").locatedBy("(//div[contains(.,'ver su información')])[13]");


    // Ver Mas Filtros

    public static final Target MAS_FILTROS_BUTTON = Target.the("").locatedBy("//span[contains(.,'Más filtros')]");

    public static final Target VERIF_MAS_FILTROS = Target.the("").locatedBy("(//input[contains(@id,'Número de documento')])[2]");

    // Ver mas opciones

    public static final Target MAS_OPCIONES_BUTTON = Target.the("").locatedBy("//i[contains(@class,'fa-solid fa-plus')]");

    public static final Target VERIF_MAS_OPCIONES = Target.the("").locatedBy("//p[contains(.,'Recargas')]");


    // Buscar Jugador que no existe

    public static final Target FILTRO_CORREO = Target.the("").locatedBy("//input[@id='Correo electrónico']");

    public static final Target JUGADOR_NO_EXISTE = Target.the("").locatedBy("(//div[contains(.,'Error')])[14]");








}
