# Conversor_De_Moneda
# Conversor de Monedas en Java

¡Bienvenido al proyecto **Conversor de Monedas**! Este emocionante desafío de programación te permitirá construir tu propio conversor de monedas en Java. Aprenderás a realizar solicitudes a una API de tasas de cambio, manipular datos JSON y mostrar monedas de interés. ¡Prepárate para una experiencia práctica y emocionante en el desarrollo Java!

## Tabla de Contenidos

- [Descripción](#descripción)
- [Características](#características)
- [Tecnologías Utilizadas](#tecnologías-utilizadas)
- [Instrucciones](#instrucciones)
- [Ejemplo de Uso](#ejemplo-de-uso)
- [Contribuciones](#contribuciones)
- [Licencia](#licencia)

## Descripción

En este proyecto, nos sumergiremos en la configuración del entorno de desarrollo Java y utilizaremos una API para obtener tasas de cambio. El sistema permitirá a los usuarios realizar conversiones entre diferentes monedas y ver los resultados de forma clara y sencilla.

## Características

- **Configuración del Ambiente Java**: Instrucciones para configurar el entorno de desarrollo.
- **Consumo de la API**: Conexión a la API de tasas de cambio y manejo de respuestas.
- **Análisis de la Respuesta JSON**: Utilización de la biblioteca Gson para manipular datos JSON.
- **Filtro de Monedas**: Selección de monedas específicas para realizar conversiones.
- **Interfaz de Usuario**: Menú interactivo en la consola para la entrada del usuario y presentación de resultados.
- **Historial de Conversiones** (Funcionalidad adicional): Registro de las últimas conversiones realizadas.

## Tecnologías Utilizadas

- Java JDK 11 o superior
- Biblioteca Gson 2.10.1 o superior
- API Exchange Rate
- Postman (para pruebas)
- IntelliJ IDEA (opcional)

## Instrucciones

1. **Configuración del Ambiente Java**: Asegúrate de tener instalado Java JDK y la biblioteca Gson.
2. **Creación del Proyecto**: Configura un nuevo proyecto en tu IDE y añade la biblioteca Gson.
3. **Consumo de la API**: Regístrate en [ExchangeRate API](https://www.exchangerate-api.com) y obtén tu clave de API.
4. **Análisis de la Respuesta JSON**: Utiliza Gson para analizar los datos JSON obtenidos de la API.
5. **Filtro de Monedas**: Implementa la lógica para filtrar y seleccionar las monedas deseadas.
6. **Exhibición de Resultados**: Presenta los resultados de las conversiones al usuario a través de la consola.

## Ejemplo de Uso

Para realizar una solicitud a la API de tasas de cambio, puedes usar la siguiente URL de ejemplo, reemplazando la clave de API con la tuya:
GET https://v6.exchangerate-api.com/v6/0f3040a76dab2c2edc7a7a36/latest/USD
Esto te devolverá las tasas de cambio más recientes en relación con el dólar estadounidense (USD).

## Contribuciones

Las contribuciones son bienvenidas. Si deseas colaborar, por favor sigue estos pasos:

1. Haz un fork del proyecto.
2. Crea tu feature branch (`git checkout -b feature/AmazingFeature`).
3. Realiza tus cambios y haz un commit (`git commit -m 'Add some AmazingFeature'`).
4. Haz un push a tu branch (`git push origin feature/AmazingFeature`).
5. Abre un Pull Request.

## Licencia

Este proyecto está bajo la Licencia MIT. Para más detalles, consulta el archivo [LICENSE](LICENSE).
