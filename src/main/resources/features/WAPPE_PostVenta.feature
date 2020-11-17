Feature: WAPPE POST VENTA

  @Wappe_PostVenta1 @Regresion
  Scenario Outline: Login WAPPE-Agente con Usuario Interno

    Given     Ingreso a la url de wappe agente "<caso_prueba>"
    When      Ingreso el numero de DNI "<caso_prueba>"
    And       Ingreso La contraseña "<caso_prueba>"
    Then      se da clic en el boton INGRESAR
    And       se valida el ingreso correcto

    Examples:
      | caso_prueba |
      |           1 |

  @Wappe_PostVenta2 @Regresion
  Scenario Outline: Crear una empresa no existente

    Given    Se realiza el login a la web Wappe "<caso_prueba>" con el usaurio "<caso_prueba>" y la clave "<caso_prueba>"
    When     se selecciona Crear Empresa, se ingresa RUC "<caso_prueba>" y se da click en validar
    And      se ingresa los datos obligatorios de la empresa : Razon social "<caso_prueba>", sector "<caso_prueba>", sub sector "<caso_prueba>", nombre avenida "<caso_prueba>", numero "<caso_prueba>",
    And      se ingresa el departamento "<caso_prueba>", la provincia "<caso_prueba>" y el  distrito "<caso_prueba>"
    And      se asigna el tipo de cliente "<caso_prueba>" , se selecciona el subtipo "<caso_prueba>" y grupo de atención "<caso_prueba>"
    And      Se da click en el botón Crear
    Then     se confirma la creación del cliente "<caso_prueba>"

    Examples:
      | caso_prueba |
      |           1 |

  @Wappe_PostVenta3 @Regresion @PruebaDevOps
  Scenario Outline: PostVenta-Gestion Productos CLIENTE

    Given     Se ingresa a la url de Wappe cliente "<caso_prueba>"
    When      Se ingresan las credenciales y clic en ingresar "<caso_prueba>"
    Then      Se valida el ingreso correcto a Wappe
    And       Se selecciona empresa telefonica
    Then      Se selecciona menu Mis Productos
    Then      Se selecciona dispositivos
    And       Se realiza busqueda de movil "<caso_prueba>"
    And       Se limpia filtro
    And       Se filtra por estado
    And       Se da clic en el boton limpiar
    And       Se selecciona paginado a cincuenta "<caso_prueba>"
    And       Se valida avance de paginado
    And       Se ingresa numero de paginado "<caso_prueba>"
    Examples:
    #caso_prueba = 1 : desarrollo
    #caso_prueba = 2 : certificacion
      | caso_prueba |
      |           2 |


  @Wappe_PostVenta4 @Regresion @PruebaDevOps
  Scenario Outline: PostVenta-Gestion Productos AGENTE

    Given     Se ingresa a la url de Wappe agente "<caso_prueba>"
    When      Se ingresan las credenciales de agente y clic en ingresar "<caso_prueba>"
    Then      Se valida el ingreso correcto a Wappe de agente
    And       Se selecciona opcion todas las empresas y se ingresa empresa "<caso_prueba>"
    Then      Se selecciona la empresa buscada
    Then      Se selecciona opcion productos
    Then      Se selecciona tab dispositivos
    And       Se realiza busqueda de producto"<caso_prueba>"
    And       Se limpia filtro de busqueda de producto
    And       Se filtra por estado en agente
    And       Se da clic en el boton limpiar estado
    And       Se selecciona paginado a cincuenta en agente "<caso_prueba>"
    And       Se valida avance de paginado boton
    And       Se ingresa numero de paginado en agente "<caso_prueba>"
    Examples:
    #caso_prueba = 1 : desarrollo
    #caso_prueba = 2 : certificacion
      | caso_prueba |
      |           2 |