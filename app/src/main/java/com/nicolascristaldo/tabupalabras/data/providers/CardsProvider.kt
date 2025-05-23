package com.nicolascristaldo.tabupalabras.data.providers

import com.nicolascristaldo.tabupalabras.domain.model.TabuCard

class CardsProvider {
    private val cards = listOf(
        // general
        TabuCard(
            word = "Lámpara",
            categories = "General",
            forbiddenWords = listOf("Luz", "Bombilla", "Encender", "Mesa", "Iluminar")
        ),
        TabuCard(
            word = "Puente",
            categories = "General",
            forbiddenWords = listOf("Río", "Cruz", "Estructura", "Conectar", "Caminar")
        ),
        TabuCard(
            word = "Espejo",
            categories = "General",
            forbiddenWords = listOf("Reflejo", "Cristal", "Imagen", "Baño", "Ver")
        ),
        TabuCard(
            word = "Teléfono",
            categories = "General",
            forbiddenWords = listOf("Llamar", "Móvil", "Comunicación", "Número", "Hablar")
        ),
        TabuCard(
            word = "Silla",
            categories = "General",
            forbiddenWords = listOf("Sentar", "Mueble", "Respaldo", "Mesa", "Asiento")
        ),
        TabuCard(
            word = "Escalera",
            categories = "General",
            forbiddenWords = listOf("Subir", "Bajar", "Peldaños", "Altura", "Edificio")
        ),
        TabuCard(
            word = "Teclado",
            categories = "General",
            forbiddenWords = listOf("Escribir", "Ordenador", "Letras", "Botones", "Computadora")
        ),
        TabuCard(
            word = "Ventana",
            categories = "General",
            forbiddenWords = listOf("Cristal", "Abrir", "Cerrar", "Vista", "Cortina")
        ),
        TabuCard(
            word = "Puerta",
            categories = "General",
            forbiddenWords = listOf("Entrada", "Salir", "Abrir", "Cerrar", "Llave")
        ),
        TabuCard(
            word = "Reloj",
            categories = "General",
            forbiddenWords = listOf("Hora", "Minutos", "Tiempo", "Manecillas", "Pared")
        ),
        TabuCard(
            word = "Bolígrafo",
            categories = "General",
            forbiddenWords = listOf("Escribir", "Tinta", "Papel", "Pluma", "Mano")
        ),
        TabuCard(
            word = "Papel",
            categories = "General",
            forbiddenWords = listOf("Escribir", "Blanco", "Hoja", "Imprimir", "Libro")
        ),
        TabuCard(
            word = "Cama",
            categories = "General",
            forbiddenWords = listOf("Dormir", "Colchón", "Sábanas", "Descansar", "Almohada")
        ),
        TabuCard(
            word = "Mesa",
            categories = "General",
            forbiddenWords = listOf("Comer", "Mueble", "Silla", "Superficie", "Trabajar")
        ),
        TabuCard(
            word = "Cuchillo",
            categories = "General",
            forbiddenWords = listOf("Cortar", "Cocina", "Afilado", "Comida", "Cubiertos")
        ),
        TabuCard(
            word = "Coche",
            categories = "General",
            forbiddenWords = listOf("Vehículo", "Conducir", "Ruedas", "Motor", "Transporte")
        ),
        TabuCard(
            word = "Libro",
            categories = "General",
            forbiddenWords = listOf("Leer", "Páginas", "Cubierta", "Biblioteca", "Novela")
        ),
        TabuCard(
            word = "Ordenador",
            categories = "General",
            forbiddenWords = listOf("Computadora", "Pantalla", "Teclado", "Internet", "Trabajo")
        ),
        TabuCard(
            word = "Gafas",
            categories = "General",
            forbiddenWords = listOf("Vista", "Lentes", "Ojos", "Montura", "Ver")
        ),
        TabuCard(
            word = "Sombrero",
            categories = "General",
            forbiddenWords = listOf("Cabeza", "Accesorio", "Sol", "Gorra", "Moda")
        ),
        TabuCard(
            word = "Zapatos",
            categories = "General",
            forbiddenWords = listOf("Pies", "Calzado", "Caminar", "Cordones", "Talla")
        ),
        TabuCard(
            word = "Maleta",
            categories = "General",
            forbiddenWords = listOf("Viaje", "Equipaje", "Ruedas", "Guardar", "Ropa")
        ),
        TabuCard(
            word = "Llave",
            categories = "General",
            forbiddenWords = listOf("Puerta", "Abrir", "Cerrar", "Cerradura", "Metal")
        ),
        TabuCard(
            word = "Paraguas",
            categories = "General",
            forbiddenWords = listOf("Lluvia", "Mojar", "Abrir", "Cerrar", "Agua")
        ),
        TabuCard(
            word = "Cámara",
            categories = "General",
            forbiddenWords = listOf("Fotos", "Imagen", "Lente", "Fotografía", "Capturar")
        ),
        TabuCard(
            word = "Televisión",
            categories = "General",
            forbiddenWords = listOf("Pantalla", "Canales", "Control", "Ver", "Programas")
        ),
        TabuCard(
            word = "Radio",
            categories = "General",
            forbiddenWords = listOf("Música", "Noticias", "Sonido", "Frecuencia", "Oír")
        ),
        TabuCard(
            word = "Refrigerador",
            categories = "General",
            forbiddenWords = listOf("Frío", "Comida", "Cocina", "Electrodoméstico", "Conservar")
        ),
        TabuCard(
            word = "Microondas",
            categories = "General",
            forbiddenWords = listOf("Calentar", "Cocina", "Rápido", "Comida", "Electrodoméstico")
        ),
        TabuCard(
            word = "Lavadora",
            categories = "General",
            forbiddenWords = listOf("Ropa", "Lavar", "Electrodoméstico", "Agua", "Detergente")
        ),
        TabuCard(
            word = "Plancha",
            categories = "General",
            forbiddenWords = listOf("Ropa", "Arrugas", "Calor", "Electrodoméstico", "Alisar")
        ),
        TabuCard(
            word = "Escritorio",
            categories = "General",
            forbiddenWords = listOf("Mesa", "Trabajo", "Oficina", "Mueble", "Estudiar")
        ),
        TabuCard(
            word = "Mochila",
            categories = "General",
            forbiddenWords = listOf("Espalda", "Cargar", "Libros", "Viaje", "Bolsillos")
        ),
        TabuCard(
            word = "Bicicleta",
            categories = "General",
            forbiddenWords = listOf("Pedalear", "Ruedas", "Transporte", "Ciclismo", "Casco")
        ),
        TabuCard(
            word = "Martillo",
            categories = "General",
            forbiddenWords = listOf("Clavar", "Herramienta", "Golpear", "Clavos", "Madera")
        ),
        TabuCard(
            word = "Destornillador",
            categories = "General",
            forbiddenWords = listOf("Tornillos", "Herramienta", "Girar", "Atornillar", "Desatornillar")
        ),
        TabuCard(
            word = "Cepillo",
            categories = "General",
            forbiddenWords = listOf("Pelo", "Peinar", "Cerdas", "Cabello", "Desenredar")
        ),
        TabuCard(
            word = "Pintura",
            categories = "General",
            forbiddenWords = listOf("Color", "Lienzo", "Arte", "Pincel", "Cuadro")
        ),
        TabuCard(
            word = "Telescopio",
            categories = "General",
            forbiddenWords = listOf("Estrellas", "Astronomía", "Lente", "Cielo", "Observar")
        ),
        TabuCard(
            word = "Microscopio",
            categories = "General",
            forbiddenWords = listOf("Células", "Lente", "Ciencia", "Pequeño", "Ver")
        ),
        TabuCard(
            word = "Calendario",
            categories = "General",
            forbiddenWords = listOf("Fecha", "Mes", "Día", "Año", "Organizar")
        ),
        TabuCard(
            word = "Mapa",
            categories = "General",
            forbiddenWords = listOf("Geografía", "Ubicación", "Países", "Ciudades", "Navegar")
        ),
        TabuCard(
            word = "Astronauta",
            categories = "General",
            forbiddenWords = listOf("Espacio", "Cohete", "Traje", "Luna", "Estrella")
        ),
        TabuCard(
            word = "Satélite",
            categories = "General",
            forbiddenWords = listOf("Órbita", "Tierra", "Espacio", "Señal", "Artificial")
        ),
        TabuCard(
            word = "Planeta",
            categories = "General",
            forbiddenWords = listOf("Tierra", "Marte", "Órbita", "Sol", "Esfera")
        ),
        TabuCard(
            word = "Cometa",
            categories = "General",
            forbiddenWords = listOf("Cielo", "Cola", "Espacio", "Roca", "Brillo")
        ),
        TabuCard(
            word = "Agujero Negro",
            categories = "General",
            forbiddenWords = listOf("Espacio", "Gravedad", "Oscuro", "Estrella", "Vacío")
        ),
        TabuCard(
            word = "Cohete",
            categories = "General",
            forbiddenWords = listOf("Lanzar", "Espacio", "Combustible", "Viaje", "Nave")
        ),
        TabuCard(
            word = "Estación Espacial",
            categories = "General",
            forbiddenWords = listOf("Órbita", "Astronautas", "Tierra", "Laboratorio", "Módulos")
        ),
        TabuCard(
            word = "Meteorito",
            categories = "General",
            forbiddenWords = listOf("Espacio", "Caer", "Roca", "Cráter", "Cielo")
        ),
        TabuCard(
            word = "Galaxia",
            categories = "General",
            forbiddenWords = listOf("Estrellas", "Universo", "Espiral", "Vía Láctea", "Inmenso")
        ),
        TabuCard(
            word = "Ovni",
            categories = "General",
            forbiddenWords = listOf("Extraterrestre", "Espacio", "Platillo", "Misterio", "Avistamiento"
            )
        ),
        TabuCard(
            word = "Robot",
            categories = "General",
            forbiddenWords = listOf("Máquina", "Automático", "Programar", "Metal", "Futuro")
        ),
        TabuCard(
            word = "Dron",
            categories = "General",
            forbiddenWords = listOf("Volar", "Control", "Cámara", "Aire", "Remoto")
        ),
        TabuCard(
            word = "Realidad Virtual",
            categories = "General",
            forbiddenWords = listOf("Gafas", "Simulación", "Juego", "Digital", "Inmersión")
        ),
        TabuCard(
            word = "Criptomoneda",
            categories = "General",
            forbiddenWords = listOf("Dinero", "Digital", "Transacción", "Internet", "Valor")
        ),
        TabuCard(
            word = "Internet",
            categories = "General",
            forbiddenWords = listOf("Red", "Conexión", "Web", "Navegar", "Global")
        ),
        TabuCard(
            word = "Smartphone",
            categories = "General",
            forbiddenWords = listOf("Móvil", "Pantalla", "Aplicaciones", "Llamar", "Táctil")
        ),
        TabuCard(
            word = "Batería",
            categories = "General",
            forbiddenWords = listOf("Energía", "Cargar", "Pila", "Electricidad", "Dispositivo")
        ),
        TabuCard(
            word = "Auriculares",
            categories = "General",
            forbiddenWords = listOf("Escuchar", "Música", "Oídos", "Cable", "Sonido")
        ),
        TabuCard(
            word = "Torre",
            categories = "General",
            forbiddenWords = listOf("Alta", "Estructura", "Edificio", "Ciudad", "Piso")
        ),
        TabuCard(
            word = "Túnel",
            categories = "General",
            forbiddenWords = listOf("Subterráneo", "Camino", "Cueva", "Oscuro", "Pasar")
        ),
        TabuCard(
            word = "Faro",
            categories = "General",
            forbiddenWords = listOf("Luz", "Mar", "Guía", "Costa", "Noche")
        ),
        TabuCard(
            word = "Represa",
            categories = "General",
            forbiddenWords = listOf("Agua", "Energía", "Río", "Presa", "Electricidad")
        ),
        TabuCard(
            word = "Grúa",
            categories = "General",
            forbiddenWords = listOf("Levantar", "Construcción", "Carga", "Alta", "Máquina")
        ),
        TabuCard(
            word = "Ascensor",
            categories = "General",
            forbiddenWords = listOf("Subir", "Bajar", "Edificio", "Botones", "Cabina")
        ),
        TabuCard(
            word = "Cúpula",
            categories = "General",
            forbiddenWords = listOf("Techo", "Edificio", "Curvo", "Iglesia", "Arquitectura")
        ),
        TabuCard(
            word = "Antena",
            categories = "General",
            forbiddenWords = listOf("Señal", "Televisión", "Radio", "Alta", "Metal")
        ),
        TabuCard(
            word = "Chimenea",
            categories = "General",
            forbiddenWords = listOf("Humo", "Fuego", "Casa", "Techo", "Calor")
        ),
        TabuCard(
            word = "Timón",
            categories = "General",
            forbiddenWords = listOf("Barco", "Girar", "Navegar", "Control", "Madera")
        ),
        TabuCard(
            word = "Brújula",
            categories = "General",
            forbiddenWords = listOf("Norte", "Dirección", "Navegar", "Aguja", "Viaje")
        ),
        TabuCard(
            word = "Radar",
            categories = "General",
            forbiddenWords = listOf("Detectar", "Señal", "Avión", "Barco", "Pantalla")
        ),
        TabuCard(
            word = "Cañón",
            categories = "General",
            forbiddenWords = listOf("Disparar", "Guerra", "Metal", "Bala", "Fuerte")
        ),
        TabuCard(
            word = "Ancla",
            categories = "General",
            forbiddenWords = listOf("Barco", "Fondo", "Mar", "Peso", "Parar")
        ),
        TabuCard(
            word = "Soga",
            categories = "General",
            forbiddenWords = listOf("Cuerda", "Atar", "Nudo", "Fuerte", "Trenzar")
        ),
        TabuCard(
            word = "Candado",
            categories = "General",
            forbiddenWords = listOf("Cerrar", "Llave", "Seguridad", "Metal", "Bloquear")
        ),
        TabuCard(
            word = "Balanza",
            categories = "General",
            forbiddenWords = listOf("Pesar", "Peso", "Equilibrio", "Medir", "Justicia")
        ),
        TabuCard(
            word = "Termómetro",
            categories = "General",
            forbiddenWords = listOf("Temperatura", "Calor", "Frío", "Medir", "Grados")
        ),
        TabuCard(
            word = "Altavoz",
            categories = "General",
            forbiddenWords = listOf("Sonido", "Música", "Volumen", "Hablar", "Dispositivo")
        ),
        TabuCard(
            word = "Micrófono",
            categories = "General",
            forbiddenWords = listOf("Voz", "Grabar", "Sonido", "Cantar", "Amplificar")
        ),
        TabuCard(
            word = "Proyector",
            categories = "General",
            forbiddenWords = listOf("Pantalla", "Luz", "Imagen", "Presentación", "Cine")
        ),
        TabuCard(
            word = "Cargador",
            categories = "General",
            forbiddenWords = listOf("Batería", "Cable", "Electricidad", "Dispositivo", "Energía")
        ),
        TabuCard(
            word = "Enchufe",
            categories = "General",
            forbiddenWords = listOf("Electricidad", "Cable", "Pared", "Conectar", "Corriente")
        ),
        TabuCard(
            word = "Interruptor",
            categories = "General",
            forbiddenWords = listOf("Luz", "Encender", "Apagar", "Pared", "Botón")
        ),
        TabuCard(
            word = "Foco",
            categories = "General",
            forbiddenWords = listOf("Luz", "Bombilla", "Encender", "Techo", "Iluminar")
        ),
        TabuCard(
            word = "Pizarra",
            categories = "General",
            forbiddenWords = listOf("Escribir", "Tiza", "Aula", "Borrar", "Clase")
        ),
        TabuCard(
            word = "Regla",
            categories = "General",
            forbiddenWords = listOf("Medir", "Línea", "Escuela", "Recto", "Centímetros")
        ),
        TabuCard(
            word = "Compás",
            categories = "General",
            forbiddenWords = listOf("Círculo", "Dibujar", "Escuela", "Aguja", "Geometría")
        ),
        TabuCard(
            word = "Brasil",
            categories = "General",
            forbiddenWords = listOf("Fútbol", "Amazonas", "Río", "Carnaval", "Samba")
        ),
        TabuCard(
            word = "Argentina",
            categories = "General",
            forbiddenWords = listOf("Tango", "Pampa", "Buenos Aires", "Asado", "Messi")
        ),
        TabuCard(
            word = "Colombia",
            categories = "General",
            forbiddenWords = listOf("Café", "Cumbia", "Bogotá", "Cartagena", "Esmeraldas")
        ),
        TabuCard(
            word = "Perú",
            categories = "General",
            forbiddenWords = listOf("Incas", "Machu Picchu", "Lima", "Andes", "Ceviche")
        ),
        TabuCard(
            word = "Ecuador",
            categories = "General",
            forbiddenWords = listOf("Galápagos", "Quito", "Equador", "Volcán", "Selva")
        ),
        TabuCard(
            word = "México",
            categories = "General",
            forbiddenWords = listOf("Tacos", "Aztecas", "Chihuahua", "Sombrero", "Mariachi")
        ),
        TabuCard(
            word = "Estados Unidos",
            categories = "General",
            forbiddenWords = listOf("Libertad", "Washington", "Hollywood", "Dólar", "Hamburguesa")
        ),
        TabuCard(
            word = "Canadá",
            categories = "General",
            forbiddenWords = listOf("Arce", "Frío", "Toronto", "Hockey", "Montañas")
        ),
        TabuCard(
            word = "Chile",
            categories = "General",
            forbiddenWords = listOf("Andes", "Santiago", "Desierto", "Vino", "Alargado")
        ),
        TabuCard(
            word = "España",
            categories = "General",
            forbiddenWords = listOf("Flamenco", "Madrid", "Toros", "Paella", "Barcelona")
        ),
        TabuCard(
            word = "Francia",
            categories = "General",
            forbiddenWords = listOf("París", "Torre Eiffel", "Vino", "Baguette", "Romance")
        ),
        TabuCard(
            word = "Italia",
            categories = "General",
            forbiddenWords = listOf("Pizza", "Roma", "Pasta", "Coliseo", "Venecia")
        ),
        TabuCard(
            word = "Alemania",
            categories = "General",
            forbiddenWords = listOf("Cerveza", "Berlín", "Autos", "Muro", "Oktoberfest")
        ),
        TabuCard(
            word = "Reino Unido",
            categories = "General",
            forbiddenWords = listOf("Londres", "Reina", "Té", "Big Ben", "Inglaterra")
        ),
        TabuCard(
            word = "Rusia",
            categories = "General",
            forbiddenWords = listOf("Moscú", "Frío", "Vodka", "Kremlin", "Zar")
        ),
        TabuCard(
            word = "India",
            categories = "General",
            forbiddenWords = listOf("Taj Mahal", "Curry", "Delhi", "Bollywood", "Yoga")
        ),
        TabuCard(
            word = "Egipto",
            categories = "General",
            forbiddenWords = listOf("Pirámides", "Faraón", "Nilo", "Esfinge", "Desierto")
        ),
        TabuCard(
            word = "Sudáfrica",
            categories = "General",
            forbiddenWords = listOf("Safari", "Mandela", "Cabo", "Diamantes", "Animales")
        ),
        TabuCard(
            word = "China",
            categories = "General",
            forbiddenWords = listOf("Muralla", "Pekín", "Dragón", "Arroz", "Panda")
        ),
        TabuCard(
            word = "Japón",
            categories = "General",
            forbiddenWords = listOf("Sushi", "Tokio", "Samurái", "Anime", "Cerezo")
        ),
        TabuCard(
            word = "Australia",
            categories = "General",
            forbiddenWords = listOf("Canguro", "Sydney", "Ópera", "Koala", "Coral")
        ),
        TabuCard(
            word = "Torre Eiffel",
            categories = "General",
            forbiddenWords = listOf("París", "Francia", "Hierro", "Alta", "Turistas")
        ),
        TabuCard(
            word = "Estatua de la Libertad",
            categories = "General",
            forbiddenWords = listOf("Nueva York", "Estados Unidos", "Regalo", "Libertad", "Isla")
        ),
        TabuCard(
            word = "Coliseo",
            categories = "General",
            forbiddenWords = listOf("Roma", "Italia", "Gladiadores", "Ruinas", "Antiguo")
        ),
        TabuCard(
            word = "Gran Muralla china",
            categories = "General",
            forbiddenWords = listOf("China", "Larga", "Piedra", "Defensa", "Montaña")
        ),
        TabuCard(
            word = "Taj Mahal",
            categories = "General",
            forbiddenWords = listOf("India", "Amor", "Blanco", "Mármol", "Tumba")
        ),
        TabuCard(
            word = "Pirámides de Giza",
            categories = "General",
            forbiddenWords = listOf("Egipto", "Faraones", "Desierto", "Tres", "Antiguas")
        ),
        TabuCard(
            word = "Big Ben",
            categories = "General",
            forbiddenWords = listOf("Londres", "Reino Unido", "Reloj", "Torre", "Campana")
        ),
        TabuCard(
            word = "Monte Fuji",
            categories = "General",
            forbiddenWords = listOf("Japón", "Volcán", "Nieve", "Sagrado", "Montaña")
        ),
        TabuCard(
            word = "Moais",
            categories = "General",
            forbiddenWords = listOf("Chile", "Cabezas", "Isla", "Pascua", "Piedra")
        ),
        TabuCard(
            word = "Machu Picchu",
            categories = "General",
            forbiddenWords = listOf("Perú", "Incas", "Montaña", "Ruinas", "Turismo")
        ),
        TabuCard(
            word = "Cataratas del Niágara",
            categories = "General",
            forbiddenWords = listOf("Agua", "Canadá", "Estados Unidos", "Cascada", "Turistas")
        ),
        TabuCard(
            word = "Monte Everest",
            categories = "General",
            forbiddenWords = listOf("Nepal", "Montaña", "Alto", "Escalar", "Nieve")
        ),
        TabuCard(
            word = "Gran Cañón",
            categories = "General",
            forbiddenWords = listOf("Estados Unidos", "Arizona", "Roca", "Río", "Profundo")
        ),
        TabuCard(
            word = "Sofá",
            categories = "General",
            forbiddenWords = listOf("Sentarse", "Cojines", "Salón", "Cómodo", "Mueble")
        ),
        TabuCard(
            word = "Vela",
            categories = "General",
            forbiddenWords = listOf("Luz", "Fuego", "Cera", "Apagar", "Romántico")
        ),
        TabuCard(
            word = "Cortina",
            categories = "General",
            forbiddenWords = listOf("Ventana", "Tela", "Cerrar", "Luz", "Decoración")
        ),
        TabuCard(
            word = "Armario",
            categories = "General",
            forbiddenWords = listOf("Ropa", "Guardar", "Puertas", "Mueble", "Habitación")
        ),
        TabuCard(
            word = "Cuchara",
            categories = "General",
            forbiddenWords = listOf("Comer", "Sopa", "Cocina", "Cubiertos", "Metal")
        ),
        TabuCard(
            word = "Tenedor",
            categories = "General",
            forbiddenWords = listOf("Comer", "Pinchar", "Cocina", "Cubiertos", "Metal")
        ),
        TabuCard(
            word = "Sartén",
            categories = "General",
            forbiddenWords = listOf("Cocinar", "Fuego", "Cocina", "Comida", "Mango")
        ),
        TabuCard(
            word = "Esponja",
            categories = "General",
            forbiddenWords = listOf("Lavar", "Platos", "Agua", "Jabón", "Cocina")
        ),
        TabuCard(
            word = "Toalla",
            categories = "General",
            forbiddenWords = listOf("Secar", "Baño", "Tela", "Manos", "Ducha")
        ),
        TabuCard(
            word = "Cepillo de dientes",
            categories = "General",
            forbiddenWords = listOf("Dientes", "Limpiar", "Pasta", "Baño", "Higiene")
        ),
        TabuCard(
            word = "Jabón",
            categories = "General",
            forbiddenWords = listOf("Limpiar", "Espuma", "Manos", "Baño", "Olor")
        ),
        TabuCard(
            word = "Cartera",
            categories = "General",
            forbiddenWords = listOf("Dinero", "Bolsillo", "Cuero", "Cerrar", "Llevar")
        ),
        TabuCard(
            word = "Cinturón",
            categories = "General",
            forbiddenWords = listOf("Pantalones", "Cintura", "Hebilla", "Cuero", "Moda")
        ),
        TabuCard(
            word = "Bufanda",
            categories = "General",
            forbiddenWords = listOf("Cuello", "Frío", "Tela", "Invierno", "Abrigo")
        ),
        TabuCard(
            word = "Guantes",
            categories = "General",
            forbiddenWords = listOf("Manos", "Frío", "Invierno", "Tela", "Proteger")
        ),
        TabuCard(
            word = "Lápiz",
            categories = "General",
            forbiddenWords = listOf("Escribir", "Papel", "Borrar", "Escuela", "Madera")
        ),
        TabuCard(
            word = "Cuaderno",
            categories = "General",
            forbiddenWords = listOf("Escribir", "Hojas", "Escuela", "Notas", "Papel")
        ),
        TabuCard(
            word = "Borrador",
            categories = "General",
            forbiddenWords = listOf("Lápiz", "Borrar", "Escuela", "Error", "Goma")
        ),
        TabuCard(
            word = "Tijeras",
            categories = "General",
            forbiddenWords = listOf("Cortar", "Papel", "Hojas", "Mango", "Afiladas")
        ),
        TabuCard(
            word = "Globo",
            categories = "General",
            forbiddenWords = listOf("Volar", "Fiesta", "Helio", "Redondo", "Color")
        ),
        //animales
        TabuCard(
            word = "Elefante",
            categories = "General, Animales",
            forbiddenWords = listOf("trompa", "orejas", "gris", "africa", "grande")
        ),
        TabuCard(
            word = "Perro",
            categories = "General, Animales",
            forbiddenWords = listOf("ladrar", "mascota", "cola", "amigo", "hueso")
        ),
        TabuCard(
            word = "Gato",
            categories = "General, Animales",
            forbiddenWords = listOf("maullar", "felino", "ratón", "bigotes", "arañar")
        ),
        TabuCard(
            word = "Tiburón",
            categories = "General, Animales",
            forbiddenWords = listOf("dientes", "mar", "aleta", "morder", "sangre")
        ),
        TabuCard(
            word = "Canguro",
            categories = "Animales",
            forbiddenWords = listOf("bolsillo", "saltar", "Australia", "patas", "cría")
        ),
        TabuCard(
            word = "Jirafa",
            categories = "General, Animales",
            forbiddenWords = listOf("cuello", "alto", "hojas", "sabana", "lengua")
        ),
        TabuCard(
            word = "Murciélago",
            categories = "Animales",
            forbiddenWords = listOf("alas", "noche", "cueva", "vampiro", "colgado")
        ),
        TabuCard(
            word = "Panda",
            categories = "Animales",
            forbiddenWords = listOf("bambú", "China", "blanco", "negro", "oso")
        ),
        TabuCard(
            word = "Delfín",
            categories = "Animales",
            forbiddenWords = listOf("inteligente", "agua", "saltar", "oceano", "sonido")
        ),
        TabuCard(
            word = "Águila",
            categories = "Animales",
            forbiddenWords = listOf("volar", "garras", "caza", "montaña", "nido")
        ),
        TabuCard(
            word = "Pingüino",
            categories = "Animales",
            forbiddenWords = listOf("hielo", "caminar", "blanco", "antártida", "pico")
        ),
        TabuCard(
            word = "Cebra",
            categories = "Animales",
            forbiddenWords = listOf("rayas", "sabana", "blanco", "negro", "caballo")
        ),
        TabuCard(
            word = "Camello",
            categories = "Animales",
            forbiddenWords = listOf("joroba", "desierto", "agua", "arena", "árido")
        ),
        TabuCard(
            word = "Pulpo",
            categories = "Animales",
            forbiddenWords = listOf("tentáculos", "mar", "tinta", "ocho", "succión")
        ),
        TabuCard(
            word = "Lobo",
            categories = "Animales",
            forbiddenWords = listOf("manada", "aullar", "bosque", "cazar", "colmillos")
        ),
        TabuCard(
            word = "Cocodrilo",
            categories = "Animales",
            forbiddenWords = listOf("dientes", "pantano", "reptil", "agua", "cola")
        ),
        TabuCard(
            word = "Caballo",
            categories = "Animales",
            forbiddenWords = listOf("montar", "crin", "carrera", "silla", "relinchar")
        ),
        TabuCard(
            word = "Tortuga",
            categories = "Animales",
            forbiddenWords = listOf("caparazón", "lenta", "mar", "terrestre", "vieja")
        ),
        TabuCard(
            word = "Rinoceronte",
            categories = "Animales",
            forbiddenWords = listOf("cuerno", "gris", "piel", "sabana", "africa")
        ),
        TabuCard(
            word = "Pavo real",
            categories = "Animales",
            forbiddenWords = listOf("plumas", "colorido", "cola", "abanico", "mostrar")
        ),
        TabuCard(
            word = "Ornitorrinco",
            categories = "Animales",
            forbiddenWords = listOf("pico", "mamífero", "raro", "australia", "acuático")
        ),
        TabuCard(
            word = "Zorro",
            categories = "Animales",
            forbiddenWords = listOf("robar", "naranja", "caza", "bosque", "orejas")
        ),
        TabuCard(
            word = "Erizo",
            categories = "Animales",
            forbiddenWords = listOf("espinas", "bola", "pequeño", "púas", "defensa")
        ),
        TabuCard(
            word = "Abeja",
            categories = "Animales",
            forbiddenWords = listOf("miel", "colmena", "volar", "flor", "picadura")
        ),
        TabuCard(
            word = "Cabra",
            categories = "Animales",
            forbiddenWords = listOf("cuernos", "granja", "montaña", "barba", "saltar")
        ),
        TabuCard(
            word = "Hipopotamo",
            categories = "Animales",
            forbiddenWords = listOf("agua", "gordo", "colmillos", "peligroso", "africa")
        ),
        TabuCard(
            word = "Ballena",
            categories = "General, Animales",
            forbiddenWords = listOf("gigante", "oceano", "respirar", "chorro", "marino")
        ),
        TabuCard(
            word = "Mapache",
            categories = "Animales",
            forbiddenWords = listOf("máscara", "basura", "pequeño", "manos", "noche")
        ),
        TabuCard(
            word = "Avestruz",
            categories = "Animales",
            forbiddenWords = listOf("correr", "alto", "huevo", "pico", "africa")
        ),
        TabuCard(
            word = "Mono",
            categories = "General, Animales",
            forbiddenWords = listOf("cola", "árbol", "banana", "trepar", "selva")
        ),
        TabuCard(
            word = "Cangrejo",
            categories = "Animales",
            forbiddenWords = listOf("pinzas", "mar", "caminar", "arena", "rojo")
        ),
        TabuCard(
            word = "Liebre",
            categories = "Animales",
            forbiddenWords = listOf("rápido", "zanahoria", "saltos", "orejas", "conejo")
        ),
        TabuCard(
            word = "Koala",
            categories = "Animales",
            forbiddenWords = listOf("eucalipto", "árbol", "dormir", "Australia", "peludo")
        ),
        TabuCard(
            word = "Gaviota",
            categories = "Animales",
            forbiddenWords = listOf("mar", "playa", "volar", "blanca", "pescado")
        ),
        TabuCard(
            word = "Flamenco",
            categories = "Animales",
            forbiddenWords = listOf("rosado", "pata", "lago", "equilibrio", "pico")
        ),
        TabuCard(
            word = "Foca",
            categories = "Animales",
            forbiddenWords = listOf("nadar", "mar", "grasa", "frío", "cantar")
        ),
        TabuCard(
            word = "Tucán",
            categories = "Animales",
            forbiddenWords = listOf("pico", "colorido", "selva", "ave", "volar")
        ),
        TabuCard(
            word = "Medusa",
            categories = "Animales",
            forbiddenWords = listOf("agua", "tentáculos", "transparente", "picar", "mar")
        ),
        TabuCard(
            word = "Hormiga",
            categories = "Animales",
            forbiddenWords = listOf("pequeña", "insecto", "picar", "fuerte", "colonia")
        ),
        TabuCard(
            word = "Pato",
            categories = "Animales",
            forbiddenWords = listOf("pico", "agua", "baño", "nadar", "ave")
        ),
        TabuCard(
            word = "Tigre",
            categories = "Animales",
            forbiddenWords = listOf("Rayas", "Jungla", "Felino", "Cazar", "Rugir")
        ),
        TabuCard(
            word = "León",
            categories = "General, Animales",
            forbiddenWords = listOf("Melena", "Sabana", "Rey", "Rugir", "Manada")
        ),
        TabuCard(
            word = "Oso",
            categories = "General, Animales",
            forbiddenWords = listOf("Bosque", "Miel", "Grande", "Peludo", "Cueva")
        ),
        TabuCard(
            word = "Gorila",
            categories = "Animales",
            forbiddenWords = listOf("Selva", "Mono", "Fuerte", "África", "Grupo")
        ),
        TabuCard(
            word = "Serpiente",
            categories = "Animales",
            forbiddenWords = listOf("Escamas", "Reptil", "Deslizar", "Veneno", "Lengua")
        ),
        TabuCard(
            word = "Rana",
            categories = "Animales",
            forbiddenWords = listOf("Saltar", "Agua", "Verde", "Croar", "Charco")
        ),
        TabuCard(
            word = "Búho",
            categories = "Animales",
            forbiddenWords = listOf("Noche", "Volar", "Ojos", "Plumas", "Cazar")
        ),
        TabuCard(
            word = "Halcón",
            categories = "Animales",
            forbiddenWords = listOf("Volar", "Cazar", "Pico", "Rápido", "Alas")
        ),
        TabuCard(
            word = "Ardilla",
            categories = "Animales",
            forbiddenWords = listOf("Árbol", "Cola", "Nueces", "Saltar", "Bosque")
        ),
        TabuCard(
            word = "Castor",
            categories = "Animales",
            forbiddenWords = listOf("Dientes", "Represa", "Río", "Madera", "Cola")
        ),
        TabuCard(
            word = "Ciervo",
            categories = "Animales",
            forbiddenWords = listOf("Cuernos", "Bosque", "Saltar", "Hierba", "Caza")
        ),
        TabuCard(
            word = "Lince",
            categories = "Animales",
            forbiddenWords = listOf("Felino", "Montaña", "Cazar", "Pelaje", "Ojos")
        ),
        TabuCard(
            word = "Puma",
            categories = "Animales",
            forbiddenWords = listOf("Montaña", "Felino", "Cazar", "Saltar", "Fuerte")
        ),
        TabuCard(
            word = "Buitre",
            categories = "Animales",
            forbiddenWords = listOf("Carroña", "Volar", "Pico", "Alas", "Cielo")
        ),
        TabuCard(
            word = "Loro",
            categories = "Animales",
            forbiddenWords = listOf("Hablar", "Plumas", "Colores", "Selva", "Pico")
        ),
        TabuCard(
            word = "Iguana",
            categories = "Animales",
            forbiddenWords = listOf("Reptil", "Verde", "Cola", "Sol", "Roca")
        ),
        TabuCard(
            word = "Pez Payaso",
            categories = "Animales",
            forbiddenWords = listOf("Nemo", "Anémona", "Naranja", "Rayas", "Nadar")
        ),
        TabuCard(
            word = "Chimpancé",
            categories = "Animales",
            forbiddenWords = listOf("Mono", "Selva", "Inteligente", "Grupo", "Árbol")
        ),
        TabuCard(
            word = "Suricata",
            categories = "Animales",
            forbiddenWords = listOf("Desierto", "Grupo", "Pararse", "Cazar", "Túnel")
        ),
        TabuCard(
            word = "Nutria",
            categories = "Animales",
            forbiddenWords = listOf("Río", "Nadar", "Jugar", "Pelaje", "Pescado")
        ),
        TabuCard(
            word = "Armadillo",
            categories = "Animales",
            forbiddenWords = listOf("caparazón", "bola", "desierto", "escamas", "noche")
        ),
        TabuCard(
            word = "Alce",
            categories = "Animales",
            forbiddenWords = listOf("cuernos", "bosque", "grande", "nieve", "canadá")
        ),
        TabuCard(
            word = "Antílope",
            categories = "Animales",
            forbiddenWords = listOf("correr", "sabana", "cuernos", "rápido", "hierba")
        ),
        TabuCard(
            word = "Oso Polar",
            categories = "Animales",
            forbiddenWords = listOf("hielo", "blanco", "frío", "mar", "cazar")
        ),
        TabuCard(
            word = "Guepardo",
            categories = "Animales",
            forbiddenWords = listOf("rápido", "manchas", "cazar", "sabana", "felino")
        ),
        TabuCard(
            word = "Hiena",
            categories = "Animales",
            forbiddenWords = listOf("risa", "manada", "sabana", "carroña", "colmillos")
        ),
        TabuCard(
            word = "Morsa",
            categories = "Animales",
            forbiddenWords = listOf("colmillos", "mar", "hielo", "nadar", "grasa")
        ),
        TabuCard(
            word = "Cisne",
            categories = "Animales",
            forbiddenWords = listOf("blanco", "lago", "cuello", "nadar", "plumas")
        ),
        TabuCard(
            word = "Grulla",
            categories = "Animales",
            forbiddenWords = listOf("volar", "patas", "larga", "migrar", "pico")
        ),
        TabuCard(
            word = "Ciempiés",
            categories = "Animales",
            forbiddenWords = listOf("patas", "insecto", "largo", "gatear", "veneno")
        ),
        TabuCard(
            word = "Escorpión",
            categories = "Animales",
            forbiddenWords = listOf("pinza", "cola", "veneno", "desierto", "picar")
        ),
        TabuCard(
            word = "Manatí",
            categories = "Animales",
            forbiddenWords = listOf("agua", "lento", "mar", "hierba", "gordo")
        ),
        TabuCard(
            word = "Jaguar",
            categories = "Animales",
            forbiddenWords = listOf("manchas", "selva", "felino", "cazar", "rápido")
        ),
        TabuCard(
            word = "Perezoso",
            categories = "Animales",
            forbiddenWords = listOf("lento", "árbol", "selva", "dormir", "garras")
        ),
        TabuCard(
            word = "Pelícano",
            categories = "Animales",
            forbiddenWords = listOf("pico", "bolsa", "mar", "pescado", "volar")
        ),
        TabuCard(
            word = "Orca",
            categories = "Animales",
            forbiddenWords = listOf("Delfin", "mar", "frío", "blanco y negro", "ballena")
        ),
        TabuCard(
            word = "Tapir",
            categories = "Animales",
            forbiddenWords = listOf("trompa", "selva", "agua", "nariz", "gris")
        ),
        // Comidas
        TabuCard(
            word = "Pizza",
            categories = "General, Comidas",
            forbiddenWords = listOf("queso", "masa", "horno", "tomate", "italia")
        ),
        TabuCard(
            word = "Hamburguesa",
            categories = "General, Comidas",
            forbiddenWords = listOf("pan", "carne", "lechuga", "salsa", "queso")
        ),
        TabuCard(
            word = "Sushi",
            categories = "Comidas",
            forbiddenWords = listOf("arroz", "pescado", "japon", "soya", "rollo")
        ),
        TabuCard(
            word = "Taco",
            categories = "Comidas",
            forbiddenWords = listOf("tortilla", "mexico", "carne", "salsa", "aguacate")
        ),
        TabuCard(
            word = "Espaguetti",
            categories = "Comidas",
            forbiddenWords = listOf("pasta", "salsa", "italia", "fideos", "tomate")
        ),
        TabuCard(
            word = "Paella",
            categories = "Comidas",
            forbiddenWords = listOf("arroz", "mariscos", "españa", "azafrán", "sartén")
        ),
        TabuCard(
            word = "Arepa",
            categories = "Comidas",
            forbiddenWords = listOf("maíz", "Venezuela", "Colombia", "queso", "rellena")
        ),
        TabuCard(
            word = "Panqueques",
            categories = "Comidas",
            forbiddenWords = listOf("harina", "miel", "desayuno", "dulce", "huevo")
        ),
        TabuCard(
            word = "Lasagna",
            categories = "Comidas",
            forbiddenWords = listOf("pasta", "horno", "queso", "tomate", "capas")
        ),
        TabuCard(
            word = "Ceviche",
            categories = "Comidas",
            forbiddenWords = listOf("pescado", "limón", "mariscos", "perú", "crudo")
        ),
        TabuCard(
            word = "Chocolate",
            categories = "Comidas",
            forbiddenWords = listOf("cacao", "dulce", "marrón", "azúcar", "tableta")
        ),
        TabuCard(
            word = "Helado",
            categories = "General, Comidas",
            forbiddenWords = listOf("frío", "dulce", "cono", "lácteo", "verano")
        ),
        TabuCard(
            word = "Flan",
            categories = "Comidas",
            forbiddenWords = listOf("huevo", "dulce", "caramelo", "leche", "postre")
        ),
        TabuCard(
            word = "Galleta",
            categories = "General, Comidas",
            forbiddenWords = listOf("dulce", "harina", "chocolate", "redonda", "horno")
        ),
        TabuCard(
            word = "Manzana",
            categories = "General, Comidas",
            forbiddenWords = listOf("roja", "fruta", "árbol", "verde", "dulce")
        ),
        TabuCard(
            word = "Banana",
            categories = "General, Comidas",
            forbiddenWords = listOf("amarillo", "fruta", "pelar", "monos", "dulce")
        ),
        TabuCard(
            word = "Sandía",
            categories = "Comidas",
            forbiddenWords = listOf("roja", "fruta", "semillas", "verano", "dulce")
        ),
        TabuCard(
            word = "Naranja",
            categories = "General, Comidas",
            forbiddenWords = listOf("cítrico", "jugo", "vitamina", "fruta", "redonda")
        ),
        TabuCard(
            word = "Piña",
            categories = "Comidas",
            forbiddenWords = listOf("amarillo", "dulce", "jugo", "tropical", "fruta")
        ),
        TabuCard(
            word = "Uvas",
            categories = "Comidas",
            forbiddenWords = listOf("racimo", "vino", "moradas", "pasa", "pequeñas")
        ),
        TabuCard(
            word = "Café",
            categories = "General, Comidas",
            forbiddenWords = listOf("negro", "caliente", "granos", "despertar", "taza")
        ),
        TabuCard(
            word = "Té",
            categories = "General, Comidas",
            forbiddenWords = listOf("infusión", "hierbas", "agua", "verde", "caliente")
        ),
        TabuCard(
            word = "Jugo",
            categories = "Comidas",
            forbiddenWords = listOf("fruta", "exprimir", "líquido", "vaso", "dulce")
        ),
        TabuCard(
            word = "Limonada",
            categories = "Comidas",
            forbiddenWords = listOf("ácido", "azúcar", "agua", "limón", "refresco")
        ),
        TabuCard(
            word = "Leche",
            categories = "Comidas",
            forbiddenWords = listOf("vaca", "blanco", "calcio", "líquido", "beber")
        ),
        TabuCard(
            word = "Queso",
            categories = "Comidas",
            forbiddenWords = listOf("leche", "derretir", "amarillo", "ratón", "lácteo")
        ),
        TabuCard(
            word = "Mantequilla",
            categories = "Comidas",
            forbiddenWords = listOf("pan", "amarillo", "untar", "leche", "grasa")
        ),
        TabuCard(
            word = "Yogur",
            categories = "Comidas",
            forbiddenWords = listOf("leche", "fermentado", "frutas", "batido", "cremoso")
        ),
        TabuCard(
            word = "Caramelo",
            categories = "Comidas",
            forbiddenWords = listOf("dulce", "azúcar", "chicle", "gomita", "colorido")
        ),
        TabuCard(
            word = "Pastel",
            categories = "Comidas",
            forbiddenWords = listOf("cumpleaños", "dulce", "horno", "chocolate", "relleno")
        ),
        TabuCard(
            word = "Donas",
            categories = "Comidas",
            forbiddenWords = listOf("azúcar", "redondo", "frito", "dulce", "relleno")
        ),
        TabuCard(
            word = "Guisantes",
            categories = "Comidas",
            forbiddenWords = listOf("verde", "pequeño", "vaina", "vegetal", "granos")
        ),
        TabuCard(
            word = "Brócoli",
            categories = "Comidas",
            forbiddenWords = listOf("verde", "verdura", "arbolito", "sano", "fibra")
        ),
        TabuCard(
            word = "Zanahoria",
            categories = "Comidas",
            forbiddenWords = listOf("naranja", "conejo", "crujiente", "dulce", "raíz")
        ),
        TabuCard(
            word = "Papa",
            categories = "Comidas",
            forbiddenWords = listOf("tierra", "frita", "puré", "tubérculo", "croqueta")
        ),
        TabuCard(
            word = "Espinaca",
            categories = "Comidas",
            forbiddenWords = listOf("verde", "hoja", "sano", "Popeye", "ensalada")
        ),
        TabuCard(
            word = "Cebolla",
            categories = "Comidas",
            forbiddenWords = listOf("lágrimas", "cortar", "blanca", "morada", "fuerte")
        ),
        TabuCard(
            word = "Ajo",
            categories = "Comidas",
            forbiddenWords = listOf("sabor", "olor", "pequeño", "cocina", "diente")
        ),
        TabuCard(
            word = "Pimiento",
            categories = "Comidas",
            forbiddenWords = listOf("rojo", "verde", "amarillo", "picante", "ensalada")
        ),
        TabuCard(
            word = "Champiñón",
            categories = "Comidas",
            forbiddenWords = listOf("hongo", "blanco", "pizza", "sopa", "pequeño")
        ),
        TabuCard(
            word = "Pepino",
            categories = "Comidas",
            forbiddenWords = listOf("verde", "ensalada", "crujiente", "redondo", "agua")
        ),
        TabuCard(
            word = "Tomate",
            categories = "General, Comidas",
            forbiddenWords = listOf("rojo", "ensalada", "salsa", "redondo", "vegetal")
        ),
        TabuCard(
            word = "Nuez",
            categories = "Comidas",
            forbiddenWords = listOf("duro", "pequeño", "frutos secos", "aceite", "cáscara")
        ),
        TabuCard(
            word = "Almendra",
            categories = "Comidas",
            forbiddenWords = listOf("leche", "nuez", "fruto seco", "cáscara", "marrón")
        ),
        TabuCard(
            word = "Ensalada",
            categories = "Comidas",
            forbiddenWords = listOf("Verduras", "Lechuga", "Tomate", "Fresca", "Aderezo")
        ),
        TabuCard(
            word = "Sopa",
            categories = "Comidas",
            forbiddenWords = listOf("Caldo", "Cuchara", "Caliente", "Verduras", "Líquido")
        ),
        TabuCard(
            word = "Curry",
            categories = "Comidas",
            forbiddenWords = listOf("Especias", "Arroz", "India", "Pollo", "Picante")
        ),
        TabuCard(
            word = "Puré",
            categories = "Comidas",
            forbiddenWords = listOf("Papa", "Aplastar", "Cremoso", "Comida", "Suave")
        ),
        TabuCard(
            word = "Albóndigas",
            categories = "Comidas",
            forbiddenWords = listOf("Carne", "Bola", "Salsa", "Pasta", "Comer")
        ),
        TabuCard(
            word = "Frijoles",
            categories = "Comidas",
            forbiddenWords = listOf("Granos", "Cocinar", "Sopa", "Plato", "Marrón")
        ),
        TabuCard(
            word = "Arroz",
            categories = "General, Comidas",
            forbiddenWords = listOf("Grano", "Cocinar", "Blanco", "Plato", "Acompañar")
        ),
        TabuCard(
            word = "Tarta",
            categories = "Comidas",
            forbiddenWords = listOf("Dulce", "Horno", "Fruta", "Postre", "Masa")
        ),
        TabuCard(
            word = "Gelatina",
            categories = "Comidas",
            forbiddenWords = listOf("Postre", "Colores", "Temblar", "Fruta", "Fresca")
        ),
        TabuCard(
            word = "Mermelada",
            categories = "Comidas",
            forbiddenWords = listOf("Fruta", "Dulce", "Pan", "Untar", "Azúcar")
        ),
        TabuCard(
            word = "Fresa",
            categories = "Comidas",
            forbiddenWords = listOf("Fruta", "Roja", "Dulce", "Semillas", "Verano")
        ),
        TabuCard(
            word = "Mango",
            categories = "Comidas",
            forbiddenWords = listOf("Fruta", "Amarillo", "Tropical", "Jugo", "Dulce")
        ),
        TabuCard(
            word = "Kiwi",
            categories = "Comidas",
            forbiddenWords = listOf("Fruta", "Verde", "Peludo", "Ácido", "Semillas")
        ),
        TabuCard(
            word = "Calabaza",
            categories = "Comidas",
            forbiddenWords = listOf("Verdura", "Naranja", "Sopa", "Grande", "Otoño")
        ),
        TabuCard(
            word = "Coliflor",
            categories = "Comidas",
            forbiddenWords = listOf("Verdura", "Blanca", "Cocinar", "Sana", "Flor")
        ),
        TabuCard(
            word = "Salsa",
            categories = "Comidas",
            forbiddenWords = listOf("Condimento", "Tomate", "Picante", "Comida", "Untar")
        ),
        TabuCard(
            word = "Miel",
            categories = "Comidas",
            forbiddenWords = listOf("Dulce", "Abeja", "Pegajoso", "Pan", "Natural")
        ),
        TabuCard(
            word = "Agua",
            categories = "Comidas",
            forbiddenWords = listOf("Bebida", "Transparente", "Vaso", "Hidratar", "Líquido")
        ),
        TabuCard(
            word = "Sándwich",
            categories = "Comidas",
            forbiddenWords = listOf("Pan", "Relleno", "Carne", "Queso", "Rápido")
        ),
        TabuCard(
            word = "Pan",
            categories = "Comidas",
            forbiddenWords = listOf("Harina", "Horno", "Corteza", "Masa", "Comer")
        ),
        // series y peliculas
        TabuCard(
            word = "Titanic",
            categories = "Películas y series",
            forbiddenWords = listOf("barco", "iceberg", "hundir", "Jack", "Rose")
        ),
        TabuCard(
            word = "Harry Potter",
            categories = "Películas y series",
            forbiddenWords = listOf("mago", "varita", "Hogwarts", "hechizo", "escuela")
        ),
        TabuCard(
            word = "Breaking Bad",
            categories = "Películas y series",
            forbiddenWords = listOf("química", "droga", "Heisenberg", "Walter", "cristal")
        ),
        TabuCard(
            word = "Stranger Things",
            categories = "Películas y series",
            forbiddenWords = listOf("niños", "monstruo", "Upside Down", "Eleven", "poderes")
        ),
        TabuCard(
            word = "El Padrino",
            categories = "Películas y series",
            forbiddenWords = listOf("mafia", "familia", "corleone", "italia", "crimen")
        ),
        TabuCard(
            word = "Naruto",
            categories = "Películas y series",
            forbiddenWords = listOf("ninja", "chakra", "Zorro", "jutsu", "anime")
        ),
        TabuCard(
            word = "Avengers",
            categories = "Películas y series",
            forbiddenWords = listOf("héroes", "Marvel", "Thanos", "equipo", "infinity")
        ),
        TabuCard(
            word = "Friends",
            categories = "Películas y series",
            forbiddenWords = listOf("cafetería", "Rachel", "Ross", "comedia", "Nueva York")
        ),
        TabuCard(
            word = "Spider-Man",
            categories = "Películas y series",
            forbiddenWords = listOf("telaraña", "Peter", "trepar", "superhéroe", "araña")
        ),
        TabuCard(
            word = "Jurassic Park",
            categories = "Películas y series",
            forbiddenWords = listOf("dinosaurio", "isla", "parque", "científico", "clonar")
        ),
        TabuCard(
            word = "One Piece",
            categories = "Películas y series",
            forbiddenWords = listOf("pirata", "Luffy", "barco", "tesoro", "anime")
        ),
        TabuCard(
            word = "El Señor de los Anillos",
            categories = "Películas y series",
            forbiddenWords = listOf("anillo", "hobbit", "Frodo", "Gandalf", "orcos")
        ),
        TabuCard(
            word = "Batman",
            categories = "Películas y series",
            forbiddenWords = listOf("murciélago", "Bruce", "ciudad", "Gotham", "capa")
        ),
        TabuCard(
            word = "Iron Man",
            categories = "Películas y series",
            forbiddenWords = listOf("traje", "Tony", "robot", "Marvel", "rico")
        ),
        TabuCard(
            word = "Terminator",
            categories = "Películas y series",
            forbiddenWords = listOf("robot", "futuro", "máquina", "Arnold", "volveré")
        ),
        TabuCard(
            word = "Shrek",
            categories = "Películas y series",
            forbiddenWords = listOf("verde", "burro", "pantano", "princesa", "cuento")
        ),
        TabuCard(
            word = "La Casa de Papel",
            categories = "Películas y series",
            forbiddenWords = listOf("robo", "máscara", "profesor", "banco", "Tokio")
        ),
        TabuCard(
            word = "Game of Thrones",
            categories = "Películas y series",
            forbiddenWords = listOf("trono", "reino", "dragón", "familias", "hielo")
        ),
        TabuCard(
            word = "Toy Story",
            categories = "Películas y series",
            forbiddenWords = listOf("juguetes", "Woody", "Buzz", "niño", "Andy")
        ),
        TabuCard(
            word = "Frozen",
            categories = "Películas y series",
            forbiddenWords = listOf("nieve", "Elsa", "hermana", "cantar", "reina")
        ),
        TabuCard(
            word = "Minions",
            categories = "Películas y series",
            forbiddenWords = listOf("amarillo", "Gru", "banana", "villano", "ojos")
        ),
        TabuCard(
            word = "Peaky Blinders",
            categories = "Películas y series",
            forbiddenWords = listOf("gangsters", "Inglaterra", "Tommy", "traje", "cuchillas")
        ),
        TabuCard(
            word = "El Rey León",
            categories = "Películas y series",
            forbiddenWords = listOf("jungla", "Simba", "padre", "animal", "león")
        ),
        TabuCard(
            word = "The Office",
            categories = "Películas y series",
            forbiddenWords = listOf("trabajo", "oficina", "Michael", "humor", "papeles")
        ),
        TabuCard(
            word = "Pokémon",
            categories = "Películas y series",
            forbiddenWords = listOf("Ash", "Pikachu", "monstruos", "batalla", "anime")
        ),
        TabuCard(
            word = "Dragon Ball",
            categories = "Películas y series",
            forbiddenWords = listOf("Goku", "esferas", "luchar", "sayajin", "anime")
        ),
        TabuCard(
            word = "Loki",
            categories = "Películas y series",
            forbiddenWords = listOf("hermano", "Thor", "Dios", "Marvel", "engaño")
        ),
        TabuCard(
            word = "Gladiador",
            categories = "Películas y series",
            forbiddenWords = listOf("Roma", "arena", "espada", "emperador", "Maximus")
        ),
        TabuCard(
            word = "The Walking Dead",
            categories = "Películas y series",
            forbiddenWords = listOf("zombi", "apocalipsis", "Rick", "supervivencia", "muertos")
        ),
        TabuCard(
            word = "Wednesday",
            categories = "Películas y series",
            forbiddenWords = listOf("Addams", "escuela", "bailar", "negro", "hija")
        ),
        TabuCard(
            word = "The Crown",
            categories = "Películas y series",
            forbiddenWords = listOf("reina", "Inglaterra", "Elizabeth", "familia", "corona")
        ),
        TabuCard(
            word = "Matrix",
            categories = "Películas y series",
            forbiddenWords = listOf("Neo", "realidad", "virtual", "pastilla", "traje")
        ),
        TabuCard(
            word = "Avatar",
            categories = "Películas y series",
            forbiddenWords = listOf("azul", "planeta", "Pandora", "alien", "selva")
        ),
        TabuCard(
            word = "Rocky",
            categories = "Películas y series",
            forbiddenWords = listOf("boxeo", "italiano", "Balboa", "Philadelphia", "ring")
        ),
        TabuCard(
            word = "Black Panther",
            categories = "Películas y series",
            forbiddenWords = listOf("Wakanda", "rey", "africano", "traje", "Marvel")
        ),
        TabuCard(
            word = "Coco",
            categories = "Películas y series",
            forbiddenWords = listOf("música", "México", "muerte", "familia", "niño")
        ),
        TabuCard(
            word = "Yoda",
            categories = "Películas y series",
            forbiddenWords = listOf("sabio", "Star Wars", "espada", "maestro", "verde")
        ),
        TabuCard(
            word = "Buzz Lightyear",
            categories = "Películas y series",
            forbiddenWords = listOf("Toy", "astronauta", "infinito", "Woody", "juguete")
        ),
        TabuCard(
            word = "Gandalf",
            categories = "Películas y series",
            forbiddenWords = listOf("mago", "gris", "varita", "anillo", "sabio")
        ),
        TabuCard(
            word = "Hannibal",
            categories = "Películas y series",
            forbiddenWords = listOf("caníbal", "doctor", "asesino", "inteligente", "silencio")
        ),
        TabuCard(
            word = "Deadpool",
            categories = "Películas y series",
            forbiddenWords = listOf("sarcasmo", "rojo", "mutante", "regenerar", "Marvel")
        ),
        TabuCard(
            word = "Thor",
            categories = "Películas y series",
            forbiddenWords = listOf("martillo", "trueno", "dios", "hermano", "Asgard")
        ),
        TabuCard(
            word = "Sherlock Holmes",
            categories = "Películas y series",
            forbiddenWords = listOf("detective", "misterio", "lupa", "Inglaterra", "Watson")
        ),
        TabuCard(
            word = "Pikachu",
            categories = "Películas y series",
            forbiddenWords = listOf("Pokémon", "amarillo", "eléctrico", "Ash", "rayo")
        ),
        TabuCard(
            word = "Forrest Gump",
            categories = "Películas y series",
            forbiddenWords = listOf("correr", "vida", "chocolates", "Jenny", "historia")
        ),
        TabuCard(
            word = "Elsa",
            categories = "Películas y series",
            forbiddenWords = listOf("hermana", "nieve", "Frozen", "cantar", "reina")
        ),
        TabuCard(
            word = "Indiana Jones",
            categories = "Películas y series",
            forbiddenWords = listOf("aventura", "arqueólogo", "sombrero", "látigo", "templo")
        ),
        TabuCard(
            word = "Goku",
            categories = "Películas y series",
            forbiddenWords = listOf("luchar", "saiyajin", "Dragon Ball", "Kamehameha", "esfera")
        ),
        TabuCard(
            word = "Mr. Bean",
            categories = "Películas y series",
            forbiddenWords = listOf("silencio", "inglés", "raro", "gracioso", "cara")
        ),
        TabuCard(
            word = "Star Wars",
            categories = "Películas y series",
            forbiddenWords = listOf("Fuerza", "Espacio", "Sable", "Luke", "Darth Vader")
        ),
        TabuCard(
            word = "Los Simpsons",
            categories = "Películas y series",
            forbiddenWords = listOf("Homero", "Bart", "Amarillo", "Familia", "Springfield")
        ),
        TabuCard(
            word = "Buscando a Nemo",
            categories = "Películas y series",
            forbiddenWords = listOf("Pez", "Océano", "Película", "Dory", "Aventura")
        ),
        TabuCard(
            word = "Piratas del Caribe",
            categories = "Películas y series",
            forbiddenWords = listOf("Jack Sparrow", "Pirata", "Barco", "Tesoro", "Mar")
        ),
        TabuCard(
            word = "El juego del calamar",
            categories = "Películas y series",
            forbiddenWords = listOf("Juego", "Corea", "Supervivencia", "Dinero", "Máscara")
        ),
        TabuCard(
            word = "Tom y Jerry",
            categories = "Películas y series",
            forbiddenWords = listOf("Gato", "Ratón", "Persecución", "Dibujos", "Gracioso")
        ),
        TabuCard(
            word = "Leonardo DiCaprio",
            categories = "Películas y series",
            forbiddenWords = listOf("Actor", "Titanic", "Inception", "Hollywood", "Oscar")
        ),
        TabuCard(
            word = "Dumbledore",
            categories = "Películas y series",
            forbiddenWords = listOf("Harry Potter", "Mago", "Hogwarts", "Barba", "Director")
        ),
        TabuCard(
            word = "Homero Simpson",
            categories = "Películas y series",
            forbiddenWords = listOf("Simpsons", "Dona", "Familia", "Torpe", "Springfield")
        ),
        TabuCard(
            word = "Captain America",
            categories = "Películas y series",
            forbiddenWords = listOf("Escudo", "Avengers", "Marvel", "Héroe", "Steve")
        ),
        TabuCard(
            word = "Moana",
            categories = "Películas y series",
            forbiddenWords = listOf("Océano", "Disney", "Aventura", "Isla", "Canto")
        ),
        TabuCard(
            word = "Volver al Futuro",
            categories = "Películas y series",
            forbiddenWords = listOf("Máquina", "Tiempo", "DeLorean", "Marty", "Doc")
        ),
        TabuCard(
            word = "E.T.",
            categories = "Películas y series",
            forbiddenWords = listOf("Extraterrestre", "Bicicleta", "Amigo", "Cielo", "Niño")
        ),
        TabuCard(
            word = "Cazafantasmas",
            categories = "Películas y series",
            forbiddenWords = listOf("Fantasmas", "Proton", "Equipo", "Nueva York", "Mochila")
        ),
        TabuCard(
            word = "Duro de Matar",
            categories = "Películas y series",
            forbiddenWords = listOf("Navidad", "Bruce", "Edificio", "Terrorista", "Acción")
        ),
        TabuCard(
            word = "El Club de los Cinco",
            categories = "Películas y series",
            forbiddenWords = listOf("Adolescentes", "Escuela", "Castigo", "Amigos", "Desayuno")
        ),
        TabuCard(
            word = "Mi Pobre Angelito",
            categories = "Películas y series",
            forbiddenWords = listOf("Navidad", "Tío", "Casa", "Trampas", "Kevin")
        ),
        TabuCard(
            word = "Hulk",
            categories = "Películas y series",
            forbiddenWords = listOf("Verde", "Fuerte", "Marvel", "Ira", "Monstruo")
        ),
        TabuCard(
            word = "Pulp Fiction",
            categories = "Películas y series",
            forbiddenWords = listOf("Tarantino", "Baile", "Crimen", "Vincent", "Jules")
        ),
        TabuCard(
            word = "El Silencio de los Inocentes",
            categories = "Películas y series",
            forbiddenWords = listOf("Hannibal", "Clarice", "Asesino", "FBI", "Caníbal")
        ),
        TabuCard(
            word = "Forrest Gump",
            categories = "Películas y series",
            forbiddenWords = listOf("Correr", "Chocolates", "Jenny", "Banco", "Vida")
        ),
        TabuCard(
            word = "El Resplandor",
            categories = "Películas y series",
            forbiddenWords = listOf("Hotel", "Jack", "Hacha", "Miedo", "Nieve")
        ),
        // argentina
        TabuCard(
            word = "Buenos Aires",
            categories = "Argentina",
            forbiddenWords = listOf("Capital", "Obelisco", "CABA", "Ciudad", "Congreso")
        ),
        TabuCard(
            word = "Obelisco",
            categories = "Argentina",
            forbiddenWords = listOf("Buenos Aires", "Monumento", "Centro", "Avenida", "Símbolo")
        ),
        TabuCard(
            word = "Mate",
            categories = "Argentina",
            forbiddenWords = listOf("Yerba", "Bombilla", "Termo", "Tomar", "Infusión")
        ),
        TabuCard(
            word = "Asado",
            categories = "Argentina",
            forbiddenWords = listOf("Carne", "Parrilla", "Chorizo", "Domingo", "Fuego")
        ),
        TabuCard(
            word = "Empanada",
            categories = "Argentina",
            forbiddenWords = listOf("Comida", "Carne", "Masa", "Horno", "Tucumana")
        ),
        TabuCard(
            word = "Fernet",
            categories = "Argentina",
            forbiddenWords = listOf("Coca", "Bebida", "Amargo", "Alcohol", "Trago")
        ),
        TabuCard(
            word = "Tango",
            categories = "Argentina",
            forbiddenWords = listOf("Baile", "Música", "Gardel", "Porteño", "Milonga")
        ),
        TabuCard(
            word = "Carlos Gardel",
            categories = "Argentina",
            forbiddenWords = listOf("Tango", "Cantante", "Zorzal", "Música", "Vieja")
        ),
        TabuCard(
            word = "Maradona",
            categories = "Argentina",
            forbiddenWords = listOf("Fútbol", "Diego", "Napoli", "Pelota", "Dios")
        ),
        TabuCard(
            word = "Messi",
            categories = "Argentina",
            forbiddenWords = listOf("Fútbol", "GOAT", "Barcelona", "PSG", "Rosario")
        ),
        TabuCard(
            word = "River Plate",
            categories = "Argentina",
            forbiddenWords = listOf("Fútbol", "Millonario", "Gallina", "Monumental", "Boca")
        ),
        TabuCard(
            word = "Boca Juniors",
            categories = "Argentina",
            forbiddenWords = listOf("Fútbol", "Xeneize", "Bombonera", "12", "River")
        ),
        TabuCard(
            word = "Alfajor",
            categories = "Argentina",
            forbiddenWords = listOf("Dulce", "Chocolate", "Relleno", "Dulce de leche", "Golocina")
        ),
        TabuCard(
            word = "Dulce de leche",
            categories = "Argentina",
            forbiddenWords = listOf("Alfajor", "Postre", "Leche", "Azúcar", "Típico")
        ),
        TabuCard(
            word = "Patagonia",
            categories = "Argentina",
            forbiddenWords = listOf("Sur", "Frío", "Lagos", "Montañas", "Turismo")
        ),
        TabuCard(
            word = "Iguazú",
            categories = "Argentina",
            forbiddenWords = listOf("Cataratas", "Misiones", "Agua", "Selva", "Naturaleza")
        ),
        TabuCard(
            word = "Perito Moreno",
            categories = "Argentina",
            forbiddenWords = listOf("Glaciar", "Hielo", "Santa Cruz", "Frío", "Turismo")
        ),
        TabuCard(
            word = "Casa Rosada",
            categories = "Argentina",
            forbiddenWords = listOf("Gobierno", "Presidente", "Edificio", "Política", "Oficial")
        ),
        TabuCard(
            word = "Congreso",
            categories = "Argentina",
            forbiddenWords = listOf("Senado", "Diputados", "Leyes", "Política", "Edificio")
        ),
        TabuCard(
            word = "San Martín",
            categories = "Argentina",
            forbiddenWords = listOf("Libertador", "General", "Ejército", "Granaderos", "Andes")
        ),
        TabuCard(
            word = "Belgrano",
            categories = "Argentina",
            forbiddenWords = listOf("Bandera", "Prócer", "Celeste", "Blanca", "Historia")
        ),
        TabuCard(
            word = "Evita",
            categories = "Argentina",
            forbiddenWords = listOf("Perón", "Mujer", "Rubia", "Política", "Eva")
        ),
        TabuCard(
            word = "Perón",
            categories = "Argentina",
            forbiddenWords = listOf("Evita", "Justicialismo", "Presidente", "Partido", "Gobierno")
        ),
        TabuCard(
            word = "Choripán",
            categories = "Argentina",
            forbiddenWords = listOf("Pan", "Chorizo", "Comida", "Asado", "Calle")
        ),
        TabuCard(
            word = "Cumbia",
            categories = "Argentina",
            forbiddenWords = listOf("Bailar", "Música", "Tropical", "Ritmo", "Popular")
        ),
        TabuCard(
            word = "Rock Nacional",
            categories = "Argentina",
            forbiddenWords = listOf("Charly", "Spinetta", "Banda", "Música", "Cerati")
        ),
        TabuCard(
            word = "Charly García",
            categories = "Argentina",
            forbiddenWords = listOf("Bigote", "Teclado", "Rock", "Música", "Sui")
        ),
        TabuCard(
            word = "Spinetta",
            categories = "Argentina",
            forbiddenWords = listOf("Rock", "Música", "Almendra", "Invisible", "Flaco")
        ),
        TabuCard(
            word = "Quino",
            categories = "Argentina",
            forbiddenWords = listOf("Mafalda", "Historieta", "Humor", "Dibujo", "Creador")
        ),
        TabuCard(
            word = "Mafalda",
            categories = "Argentina",
            forbiddenWords = listOf("Niña", "Cómica", "Política", "Quino", "Tira")
        ),
        TabuCard(
            word = "Tucumán",
            categories = "Argentina",
            forbiddenWords = listOf("Independencia", "Provincia", "Noroeste", "Acta", "Casa")
        ),
        TabuCard(
            word = "Bariloche",
            categories = "Argentina",
            forbiddenWords = listOf("Egresados", "Cerro", "Lagos", "Nieve", "Turismo")
        ),
        TabuCard(
            word = "Mar del Plata",
            categories = "Argentina",
            forbiddenWords = listOf("Playa", "Costa", "Atlántico", "Turismo", "Verano")
        ),
        TabuCard(
            word = "Subte",
            categories = "Argentina",
            forbiddenWords = listOf("Tren", "Ciudad", "Transporte", "Estación", "Túnel")
        ),
        TabuCard(
            word = "Milonga",
            categories = "Argentina",
            forbiddenWords = listOf("Tango", "Baile", "Música", "Salón", "Noche")
        ),
        TabuCard(
            word = "El Chaltén",
            categories = "Argentina",
            forbiddenWords = listOf("Montaña", "Senderismo", "Patagonia", "Fitz Roy", "Escalada")
        ),
        TabuCard(
            word = "Locro",
            categories = "Argentina",
            forbiddenWords = listOf("Comida", "Patriótica", "Maíz", "Chorizo", "Tradicional")
        ),
        TabuCard(
            word = "Cerati",
            categories = "Argentina",
            forbiddenWords = listOf("Soda Stereo", "Rock", "Música", "Cantante", "Argentina")
        ),
        TabuCard(
            word = "Aconcagua",
            categories = "Argentina",
            forbiddenWords = listOf("Montaña", "Alta", "Cordillera", "Andes", "Escalar")
        ),
        TabuCard(
            word = "Birome",
            categories = "Argentina",
            forbiddenWords = listOf("Lápiz", "Escribir", "Lapicera", "Invento", "Biro")
        ),
        TabuCard(
            word = "Javier Milei",
            categories = "Argentina",
            forbiddenWords = listOf("Presidente", "León", "Motosierra", "Liberal", "Peluca")
        ),
        TabuCard(
            word = "Che Guevara",
            categories = "Argentina",
            forbiddenWords = listOf("Revolución", "Cuba", "Guerrillero", "Médico", "Imagen")
        ),
        TabuCard(
            word = "Pampa",
            categories = "Argentina",
            forbiddenWords = listOf("Llanura", "Gaucho", "Campo", "Hierba", "Ganado")
        ),
        TabuCard(
            word = "Gaucho",
            categories = "Argentina",
            forbiddenWords = listOf("Caballo", "Pampa", "Sombrero", "Cuchillo", "Tradición")
        ),
        TabuCard(
            word = "Malvinas",
            categories = "Argentina",
            forbiddenWords = listOf("Islas", "Inglaterra", "Guerra", "Atlántico", "Disputa")
        ),
        TabuCard(
            word = "Soda Stereo",
            categories = "Argentina",
            forbiddenWords = listOf("Rock", "Cerati", "Banda", "Latino", "Música")
        ),
        TabuCard(
            word = "Fito Páez",
            categories = "Argentina",
            forbiddenWords = listOf("Rock", "Cantante", "Rosario", "Piano", "Música")
        ),
        TabuCard(
            word = "Córdoba",
            categories = "Argentina",
            forbiddenWords = listOf("Provincia", "Sierras", "Ciudad", "Turismo", "Uritorco")
        ),
        TabuCard(
            word = "Mendoza",
            categories = "Argentina",
            forbiddenWords = listOf("Vino", "Montaña", "Provincia", "Andes", "Turismo")
        ),
        TabuCard(
            word = "Polo",
            categories = "Argentina",
            forbiddenWords = listOf("Caballo", "Deporte", "Cancha", "Jugadores", "Tradición")
        ),
        TabuCard(
            word = "Fangio",
            categories = "Argentina",
            forbiddenWords = listOf("Carreras", "Autos", "Campeón", "Fórmula 1", "Piloto")
        ),
        TabuCard(
            word = "Malbec",
            categories = "Argentina",
            forbiddenWords = listOf("Vino", "Tinto", "Mendoza", "Uva", "Bebida")
        ),
        TabuCard(
            word = "Ushuaia",
            categories = "Argentina",
            forbiddenWords = listOf("Sur", "Tierra del Fuego", "Frío", "Ciudad", "Fin del mundo")
        ),
        TabuCard(
            word = "Rosario",
            categories = "Argentina",
            forbiddenWords = listOf("Ciudad", "Río", "Paraná", "Monumento", "Provincia")
        ),
        TabuCard(
            word = "Andes",
            categories = "Argentina",
            forbiddenWords = listOf("Montañas", "Cordillera", "Aconcagua", "Nieve", "Oeste")
        ),
        TabuCard(
            word = "Chimichurri",
            categories = "Argentina",
            forbiddenWords = listOf("Salsa", "Asado", "Carne", "Perejil", "Condimento")
        ),
        TabuCard(
            word = "Folclore",
            categories = "Argentina",
            forbiddenWords = listOf("Música", "Danza", "Zamba", "Guitarra", "Tradición")
        ),
        TabuCard(
            word = "Zamba",
            categories = "Argentina",
            forbiddenWords = listOf("Baile", "Folclore", "Pañuelo", "Música", "Tradicional")
        ),
        TabuCard(
            word = "La Plata",
            categories = "Argentina",
            forbiddenWords = listOf("Ciudad", "Provincia", "Capital", "Catedral", "Buenos Aires")
        ),
        TabuCard(
            word = "Salta",
            categories = "Argentina",
            forbiddenWords = listOf("Provincia", "Norte", "Cerros", "Turismo", "Tren")
        ),
        TabuCard(
            word = "Pionono",
            categories = "Argentina",
            forbiddenWords = listOf("Postre", "Dulce", "Rollo", "Crema", "Merienda")
        ),
        TabuCard(
            word = "Quebrada de humahuaca",
            categories = "Argentina",
            forbiddenWords = listOf("Jujuy", "Cerros", "Colores", "Norte", "Paisaje")
        ),
        TabuCard(
            word = "San Telmo",
            categories = "Argentina",
            forbiddenWords = listOf("Barrio", "Buenos Aires", "Antiguo", "Feria", "Tango")
        ),
        TabuCard(
            word = "Favaloro",
            categories = "Argentina",
            forbiddenWords = listOf("Médico", "Corazón", "Cirugía", "By-pass", "Científico")
        ),
        TabuCard(
            word = "Flan",
            categories = "Argentina",
            forbiddenWords = listOf("Postre", "Huevo", "Caramelo", "Crema", "Dulce")
        ),
        TabuCard(
            word = "Paraná",
            categories = "Argentina",
            forbiddenWords = listOf("Río", "Rosario", "Agua", "Corriente", "Pesca")
        ),
        TabuCard(
            word = "Borges",
            categories = "Argentina",
            forbiddenWords = listOf("Escritor", "Literatura", "Cuentos", "Biblioteca", "Ficciones")
        ),
        TabuCard(
            word = "Arcor",
            categories = "Argentina",
            forbiddenWords = listOf("Chocolates", "Golosinas", "Alfajor", "Bon o Bon", "Dulce")
        ),
        TabuCard(
            word = "Quilmes",
            categories = "Argentina",
            forbiddenWords = listOf("Cerveza", "Rubia", "Botella", "Encuentro", "Fiesta")
        ),
        TabuCard(
            word = "YPF",
            categories = "Argentina",
            forbiddenWords = listOf("Petróleo", "Nafta", "Estación", "Gas", "Combustible")
        ),
        TabuCard(
            word = "Havanna",
            categories = "Argentina",
            forbiddenWords = listOf("Alfajor", "Café", "Dulce", "Chocolate", "Mar del Plata")
        ),
        TabuCard(
            word = "La Serenísima",
            categories = "Argentina",
            forbiddenWords = listOf("Leche", "Yogur", "Queso", "Lácteos", "Crema")
        ),
        TabuCard(
            word = "Taragüí",
            categories = "Argentina",
            forbiddenWords = listOf("Yerba", "Mate", "Infusión", "Misiones", "Amarga")
        ),
        TabuCard(
            word = "Mercado Libre",
            categories = "Argentina",
            forbiddenWords = listOf("Compras", "Online", "E-commerce", "Plataforma", "Ventas")
        ),
        TabuCard(
            word = "Coto",
            categories = "Argentina",
            forbiddenWords = listOf("Supermercado", "Carne", "Sucursal", "Buenos Aires", "Compras")
        ),
        TabuCard(
            word = "Guaymallén",
            categories = "Argentina",
            forbiddenWords = listOf("Alfajor", "Dulce", "Kiosco", "Barato", "Chocolate")
        ),
        TabuCard(
            word = "Manaos",
            categories = "Argentina",
            forbiddenWords = listOf("Gaseosa", "Cola", "Barata", "Supermercado", "Soda")
        ),
        // deportes
        TabuCard(
            word = "Fútbol",
            categories = "Deportes",
            forbiddenWords = listOf("balón", "gol", "equipo", "portería", "patear")
        ),
        TabuCard(
            word = "Lionel Messi",
            categories = "Deportes",
            forbiddenWords = listOf("Argentina", "Barcelona", "GOAT", "PSG", "delantero")
        ),
        TabuCard(
            word = "Cristiano Ronaldo",
            categories = "Deportes",
            forbiddenWords = listOf("Portugal", "Real Madrid", "Manchester", "goleador", "Suuuu")
        ),
        TabuCard(
            word = "Tenis",
            categories = "Deportes",
            forbiddenWords = listOf("raqueta", "polvo de ladrillo", "bola", "red", "saque")
        ),
        TabuCard(
            word = "Basketball",
            categories = "Deportes",
            forbiddenWords = listOf("canasta", "NBA", "balón", "rebote", "pase")
        ),
        TabuCard(
            word = "Michael Jordan",
            categories = "Deportes",
            forbiddenWords = listOf("NBA", "Chicago", "23", "básquet", "leyenda")
        ),
        TabuCard(
            word = "LeBron James",
            categories = "Deportes",
            forbiddenWords = listOf("Lakers", "NBA", "King", "Cleveland", "anillo")
        ),
        TabuCard(
            word = "Maratón",
            categories = "Deportes",
            forbiddenWords = listOf("correr", "kilómetros", "resistencia", "atleta", "carrera")
        ),
        TabuCard(
            word = "Tour de Francia",
            categories = "Deportes",
            forbiddenWords = listOf("bicicleta", "ciclismo", "montaña", "etapa", "camiseta")
        ),
        TabuCard(
            word = "Golf",
            categories = "Deportes",
            forbiddenWords = listOf("hoyo", "palo", "bola", "green", "swing")
        ),
        TabuCard(
            word = "Neymar",
            categories = "Deportes",
            forbiddenWords = listOf("Brasil", "PSG", "Barcelona", "delantero", "habilidoso")
        ),
        TabuCard(
            word = "Fórmula 1",
            categories = "Deportes",
            forbiddenWords = listOf("autos", "velocidad", "circuito", "Hamilton", "Ferrari")
        ),
        TabuCard(
            word = "Lewis Hamilton",
            categories = "Deportes",
            forbiddenWords = listOf("Mercedes", "campeón", "F1", "británico", "piloto")
        ),
        TabuCard(
            word = "Rugby",
            categories = "Deportes",
            forbiddenWords = listOf("ovalado", "choque", "ensayo", "scrum", "placaje")
        ),
        TabuCard(
            word = "Karate",
            categories = "Deportes",
            forbiddenWords = listOf("patada", "arte", "dojo", "cinturón", "combate")
        ),
        TabuCard(
            word = "Judo",
            categories = "Deportes",
            forbiddenWords = listOf("llave", "kimono", "combate", "agarre", "derribo")
        ),
        TabuCard(
            word = "Real Madrid",
            categories = "Deportes",
            forbiddenWords = listOf("España", "blanco", "Bernabéu", "Champions", "equipo")
        ),
        TabuCard(
            word = "FC Barcelona",
            categories = "Deportes",
            forbiddenWords = listOf("Camp Nou", "España", "Messi", "culé", "equipo")
        ),
        TabuCard(
            word = "Boca Juniors",
            categories = "Deportes",
            forbiddenWords = listOf("Argentina", "Bombonera", "River", "xeneize", "12")
        ),
        TabuCard(
            word = "River Plate",
            categories = "Deportes",
            forbiddenWords = listOf("Millonario", "Monumental", "gallina", "Boca", "banda")
        ),
        TabuCard(
            word = "Champions League",
            categories = "Deportes",
            forbiddenWords = listOf("Europa", "clubes", "trofeo", "final", "torneo")
        ),
        TabuCard(
            word = "Mundial",
            categories = "Deportes",
            forbiddenWords = listOf("FIFA", "selecciones", "cada 4 años", "países", "copa")
        ),
        TabuCard(
            word = "Serena Williams",
            categories = "Deportes",
            forbiddenWords = listOf("tenis", "hermana", "EEUU", "Grand Slam", "raqueta")
        ),
        TabuCard(
            word = "Usain Bolt",
            categories = "Deportes",
            forbiddenWords = listOf("velocidad", "correr", "Jamaica", "récord", "100 metros")
        ),
        TabuCard(
            word = "Natación",
            categories = "Deportes",
            forbiddenWords = listOf("agua", "piscina", "brazo", "estilo", "nadar")
        ),
        TabuCard(
            word = "Michael Phelps",
            categories = "Deportes",
            forbiddenWords = listOf("medallas", "nadador", "olímpico", "EEUU", "agua")
        ),
        TabuCard(
            word = "Voleibol",
            categories = "Deportes",
            forbiddenWords = listOf("red", "bloqueo", "pase", "remate", "cancha")
        ),
        TabuCard(
            word = "Boxeo",
            categories = "Deportes",
            forbiddenWords = listOf("puños", "ring", "guantes", "round", "knockout")
        ),
        TabuCard(
            word = "Wimbledon",
            categories = "Deportes",
            forbiddenWords = listOf("césped", "tenis", "Inglaterra", "torneo", "raqueta")
        ),
        TabuCard(
            word = "Olimpiadas",
            categories = "Deportes",
            forbiddenWords = listOf("deportes", "mundial", "anillos", "medallas", "evento")
        ),
        TabuCard(
            word = "Esquí",
            categories = "Deportes",
            forbiddenWords = listOf("nieve", "montaña", "tabla", "pistas", "deslizar")
        ),
        TabuCard(
            word = "Snowboard",
            categories = "Deportes",
            forbiddenWords = listOf("tabla", "nieve", "invierno", "saltos", "deporte")
        ),
        TabuCard(
            word = "Skate",
            categories = "Deportes",
            forbiddenWords = listOf("patineta", "ruedas", "trucos", "rampa", "urbano")
        ),
        TabuCard(
            word = "Copa Libertadores",
            categories = "Deportes",
            forbiddenWords = listOf("Sudamérica", "Conmebol", "Equipos", "torneo", "fútbol")
        ),
        TabuCard(
            word = "Premier League",
            categories = "Deportes",
            forbiddenWords = listOf("Inglaterra", "Liga", "fútbol", "trofeo", "clubes")
        ),
        TabuCard(
            word = "La Liga",
            categories = "Deportes",
            forbiddenWords = listOf("España", "Real Madrid", "Barcelona", "equipo", "torneo")
        ),
        TabuCard(
            word = "Serie A",
            categories = "Deportes",
            forbiddenWords = listOf("Italia", "Juventus", "Milan", "fútbol", "torneo")
        ),
        TabuCard(
            word = "Bundesliga",
            categories = "Deportes",
            forbiddenWords = listOf("Alemania", "Bayern", "Dortmund", "equipo", "torneo")
        ),
        TabuCard(
            word = "NBA",
            categories = "Deportes",
            forbiddenWords = listOf("Estados Unidos", "canasta", "balón", "jugadores", "basket")
        ),
        TabuCard(
            word = "Gimnasia",
            categories = "Deportes",
            forbiddenWords = listOf("acrobacia", "salto", "equilibrio", "aparatos", "ejercicio")
        ),
        TabuCard(
            word = "Lucha libre",
            categories = "Deportes",
            forbiddenWords = listOf("máscara", "ring", "golpe", "show", "pelea")
        ),
        TabuCard(
            word = "Cricket",
            categories = "Deportes",
            forbiddenWords = listOf("bate", "Inglaterra", "India", "pelota", "equipo")
        ),
        TabuCard(
            word = "Beisbol",
            categories = "Deportes",
            forbiddenWords = listOf("bate", "home", "pitcher", "pelota", "MLB")
        ),
        TabuCard(
            word = "Atletismo",
            categories = "Deportes",
            forbiddenWords = listOf("Correr", "Saltar", "Lanzar", "Pista", "Competencia")
        ),
        TabuCard(
            word = "Ciclismo",
            categories = "Deportes",
            forbiddenWords = listOf("Bicicleta", "Carrera", "Ruedas", "Montaña", "Velocidad")
        ),
        TabuCard(
            word = "Esgrima",
            categories = "Deportes",
            forbiddenWords = listOf("Espada", "Máscara", "Combate", "Puntos", "Toque")
        ),
        TabuCard(
            word = "Hockey",
            categories = "Deportes",
            forbiddenWords = listOf("Palo", "Cancha", "Pelota", "Equipo", "Gol")
        ),
        TabuCard(
            word = "Patinaje",
            categories = "Deportes",
            forbiddenWords = listOf("Hielo", "Ruedas", "Deslizar", "Pista", "Velocidad")
        ),
        TabuCard(
            word = "Surf",
            categories = "Deportes",
            forbiddenWords = listOf("Tabla", "Olas", "Mar", "Equilibrio", "Playa")
        ),
        TabuCard(
            word = "Lucha",
            categories = "Deportes",
            forbiddenWords = listOf("Agarre", "Piso", "Fuerza", "Derribar", "Combate")
        ),
        TabuCard(
            word = "Remo",
            categories = "Deportes",
            forbiddenWords = listOf("Bote", "Agua", "Remar", "Equipo", "Río")
        ),
        TabuCard(
            word = "Simone Biles",
            categories = "Deportes",
            forbiddenWords = listOf("Gimnasia", "EEUU", "Medallas", "Salto", "Mujer")
        ),
        TabuCard(
            word = "Rafael Nadal",
            categories = "Deportes",
            forbiddenWords = listOf("Tenis", "España", "Arcilla", "Grand Slam", "Raqueta")
        ),
        TabuCard(
            word = "Kobe Bryant",
            categories = "Deportes",
            forbiddenWords = listOf("Baloncesto", "Lakers", "NBA", "Leyenda", "Anotar")
        ),
        TabuCard(
            word = "Roger Federer",
            categories = "Deportes",
            forbiddenWords = listOf("Tenis", "Suiza", "Grand Slam", "Elegante", "Raqueta")
        ),
        TabuCard(
            word = "Pelé",
            categories = "Deportes",
            forbiddenWords = listOf("Fútbol", "Brasil", "Rey", "Goleador", "Mundial")
        ),
        TabuCard(
            word = "Manchester United",
            categories = "Deportes",
            forbiddenWords = listOf("Inglaterra", "Fútbol", "Rojo", "Old Trafford", "Equipo")
        ),
        TabuCard(
            word = "Juventus",
            categories = "Deportes",
            forbiddenWords = listOf("Italia", "Fútbol", "Blanco", "Negro", "Turín")
        ),
        TabuCard(
            word = "Bayern Munich",
            categories = "Deportes",
            forbiddenWords = listOf("Alemania", "Fútbol", "Rojo", "Campeón", "Equipo")
        ),
        TabuCard(
            word = "Super Bowl",
            categories = "Deportes",
            forbiddenWords = listOf("Fútbol Americano", "Final", "EEUU", "Trofeo", "Partido")
        ),
        TabuCard(
            word = "Copa América",
            categories = "Deportes",
            forbiddenWords = listOf("Fútbol", "Sudamérica", "Selecciones", "Trofeo", "Torneo")
        ),
        // historia
        TabuCard(
            word = "Napoleón",
            categories = "Historia",
            forbiddenWords = listOf("Francia", "emperador", "batalla", "Pequeño", "Europa")
        ),
        TabuCard(
            word = "Segunda Guerra Mundial",
            categories = "Historia",
            forbiddenWords = listOf("guerra", "alemania", "aliados", "conflicto", "mundial")
        ),
        TabuCard(
            word = "Revolución Francesa",
            categories = "Historia",
            forbiddenWords = listOf("guillotina", "1789", "monarquía", "libertad", "Francia")
        ),
        TabuCard(
            word = "Imperio Romano",
            categories = "Historia",
            forbiddenWords = listOf("César", "Roma", "gladiador", "legión", "senado")
        ),
        TabuCard(
            word = "Albert Einstein",
            categories = "Historia",
            forbiddenWords = listOf("relatividad", "científico", "genio", "física", "alemán")
        ),
        TabuCard(
            word = "Imperio Inca",
            categories = "Historia",
            forbiddenWords = listOf("Perú", "andes", "Machu Picchu", "Cusco", "sapa inca")
        ),
        TabuCard(
            word = "Imperio Azteca",
            categories = "Historia",
            forbiddenWords = listOf("México", "Tenochtitlán", "sacrificios", "Moctezuma", "quetzalcoatl")
        ),
        TabuCard(
            word = "Imperio Maya",
            categories = "Historia",
            forbiddenWords = listOf("Calendario", "pirámide", "Guatemala", "escritura", "civilización")
        ),
        TabuCard(
            word = "Imperio Otomano",
            categories = "Historia",
            forbiddenWords = listOf("Turquía", "sultán", "Constantinopla", "islámico", "expansión")
        ),
        TabuCard(
            word = "Caída del Muro de Berlín",
            categories = "Historia",
            forbiddenWords = listOf("Alemania", "división", "comunismo", "libertad", "1989")
        ),
        TabuCard(
            word = "Revolución Industrial",
            categories = "Historia",
            forbiddenWords = listOf("máquinas", "fábricas", "trabajo", "cambio", "siglo XIX")
        ),
        TabuCard(
            word = "Nelson Mandela",
            categories = "Historia",
            forbiddenWords = listOf("Sudáfrica", "apartheid", "preso", "presidente", "libertad")
        ),
        TabuCard(
            word = "Peste negra",
            categories = "Historia",
            forbiddenWords = listOf("Europa", "medieval", "muerte", "enfermedad", "epidemia")
        ),
        TabuCard(
            word = "Simón Bolívar",
            categories = "Historia",
            forbiddenWords = listOf("libertador", "América", "independencia", "Venezuela", "Colombia")
        ),
        TabuCard(
            word = "Imperio Egipcio",
            categories = "Historia",
            forbiddenWords = listOf("pirámide", "faraón", "Nilo", "momia", "esfinge")
        ),
        TabuCard(
            word = "Leonardo da Vinci",
            categories = "Historia",
            forbiddenWords = listOf("Renacimiento", "pintor", "inventor", "científico", "Mona Lisa")
        ),
        TabuCard(
            word = "Imperio Mongol",
            categories = "Historia",
            forbiddenWords = listOf("Genghis Khan", "Asia", "expansión", "ejército", "conquista")
        ),
        TabuCard(
            word = "Batalla de Waterloo",
            categories = "Historia",
            forbiddenWords = listOf("Napoleón", "derrota", "1815", "Francia", "Bélgica")
        ),
        TabuCard(
            word = "Descubrimiento de América",
            categories = "Historia",
            forbiddenWords = listOf("Colón", "indígenas", "españoles", "barcos", "continente")
        ),
        TabuCard(
            word = "Guerras Napoleónicas",
            categories = "Historia",
            forbiddenWords = listOf("Europa", "Francia", "batalla", "Napoleón", "coalición")
        ),
        TabuCard(
            word = "Guerra Civil Española",
            categories = "Historia",
            forbiddenWords = listOf("Franco", "república", "España", "nacionalistas", "1936")
        ),
        TabuCard(
            word = "Imperio Bizantino",
            categories = "Historia",
            forbiddenWords = listOf("Constantinopla", "Oriente", "romano", "emperador", "cristiandad"
            )
        ),
        TabuCard(
            word = "Abraham Lincoln",
            categories = "Historia",
            forbiddenWords = listOf("presidente", "Estados Unidos", "esclavitud", "guerra", "asesinato"
            )
        ),
        TabuCard(
            word = "Alejandro Magno",
            categories = "Historia",
            forbiddenWords = listOf("conquistador", "Macedonia", "Grecia", "Asia", "imperio")
        ),
        TabuCard(
            word = "La Inquisición",
            categories = "Historia",
            forbiddenWords = listOf("Iglesia", "castigo", "herejía", "religión", "medieval")
        ),
        TabuCard(
            word = "John F. Kennedy",
            categories = "Historia",
            forbiddenWords = listOf("presidente", "asesinato", "EEUU", "Dallas", "Cuba")
        ),
        TabuCard(
            word = "Ataque a las Torres Gemelas",
            categories = "Historia",
            forbiddenWords = listOf("2001", "terrorismo", "aviones", "EEUU", "Nueva York")
        ),
        TabuCard(
            word = "Imperio Chino",
            categories = "Historia",
            forbiddenWords = listOf("dinastía", "muralla", "emperador", "Asia", "antiguo")
        ),
        TabuCard(
            word = "Imperio Persa",
            categories = "Historia",
            forbiddenWords = listOf("oriente", "rey", "Dario", "imperio", "antigüedad")
        ),
        TabuCard(
            word = "Genghis Khan",
            categories = "Historia",
            forbiddenWords = listOf("Mongol", "conquista", "Asia", "caballo", "guerrero")
        ),
        TabuCard(
            word = "Tutankamón",
            categories = "Historia",
            forbiddenWords = listOf("faraón", "momia", "Egipto", "tumba", "máscara")
        ),
        TabuCard(
            word = "Cleopatra",
            categories = "Historia",
            forbiddenWords = listOf("Egipto", "reina", "Roma", "Marco Antonio", "poder")
        ),
        TabuCard(
            word = "Zeus",
            categories = "Historia",
            forbiddenWords = listOf("dios", "trueno", "mitología", "griego", "olimpio")
        ),
        TabuCard(
            word = "Ramsés II",
            categories = "Historia",
            forbiddenWords = listOf("Egipto", "faraón", "monumentos", "batalla", "dinastía")
        ),
        TabuCard(
            word = "Julio César",
            categories = "Historia",
            forbiddenWords = listOf("Roma", "emperador", "senado", "asesinato", "dictador")
        ),
        TabuCard(
            word = "Winston Churchill",
            categories = "Historia",
            forbiddenWords = listOf("Inglaterra", "guerra", "primer ministro", "discurso", "líder")
        ),
        TabuCard(
            word = "Benjamin Franklin",
            categories = "Historia",
            forbiddenWords = listOf(
                "EEUU",
                "electricidad",
                "padres fundadores",
                "inventor",
                "billete"
            )
        ),
        TabuCard(
            word = "Juana de Arco",
            categories = "Historia",
            forbiddenWords = listOf("Francia", "santa", "batalla", "juicio", "heroína")
        ),
        TabuCard(
            word = "Sócrates",
            categories = "Historia",
            forbiddenWords = listOf("filósofo", "Grecia", "pensamiento", "maestro", "antigüedad")
        ),
        TabuCard(
            word = "Hernán Cortés",
            categories = "Historia",
            forbiddenWords = listOf("México", "conquista", "aztecas", "España", "oro")
        ),
        TabuCard(
            word = "Francisco Pizarro",
            categories = "Historia",
            forbiddenWords = listOf("Perú", "inca", "conquistador", "oro", "español")
        ),
        TabuCard(
            word = "Esparta",
            categories = "Historia",
            forbiddenWords = listOf("Grecia", "guerreros", "300", "batalla", "Termópilas")
        ),
        TabuCard(
            word = "Dios Ra",
            categories = "Historia",
            forbiddenWords = listOf("Egipto", "sol", "dios", "religión", "faraón")
        ),
        TabuCard(
            word = "Jerusalén",
            categories = "Historia",
            forbiddenWords = listOf("ciudad", "Israel", "religión", "santa", "templo")
        ),
        TabuCard(
            word = "Troya",
            categories = "Historia",
            forbiddenWords = listOf("caballo", "Grecia", "guerra", "Homero", "ciudad")
        ),
        TabuCard(
            word = "Machu Picchu",
            categories = "Historia",
            forbiddenWords = listOf("Perú", "Inca", "montaña", "ruinas", "turismo")
        ),
        TabuCard(
            word = "Renacimiento",
            categories = "Historia",
            forbiddenWords = listOf("Arte", "Europa", "Cultura", "Pintura", "Ciencia")
        ),
        TabuCard(
            word = "Primera Guerra Mundial",
            categories = "Historia",
            forbiddenWords = listOf("Trincheras", "Aliados", "Conflicto", "Europa", "Armas")
        ),
        TabuCard(
            word = "Revolución Rusa",
            categories = "Historia",
            forbiddenWords = listOf("Lenin", "Zar", "Comunismo", "Rusia", "Rebelión")
        ),
        TabuCard(
            word = "Guerra Fría",
            categories = "Historia",
            forbiddenWords = listOf("EEUU", "URSS", "Tensiones", "Espías", "Armas")
        ),
        TabuCard(
            word = "Antigua Grecia",
            categories = "Historia",
            forbiddenWords = listOf("Atenas", "Esparta", "Filosofía", "Dioses", "Cultura")
        ),
        TabuCard(
            word = "Imperio Británico",
            categories = "Historia",
            forbiddenWords = listOf("Colonias", "Reina", "Expansión", "Inglaterra", "Poder")
        ),
        TabuCard(
            word = "Marco Polo",
            categories = "Historia",
            forbiddenWords = listOf("Viajero", "China", "Explorar", "Ruta", "Venecia")
        ),
        // musica
        TabuCard(
            word = "Michael Jackson",
            categories = "Música",
            forbiddenWords = listOf("Rey", "Pop", "Moonwalk", "Thriller", "Baile")
        ),
        TabuCard(
            word = "The Beatles",
            categories = "Música",
            forbiddenWords = listOf("Liverpool", "John", "Paul", "Banda", "Inglaterra")
        ),
        TabuCard(
            word = "Guitarra",
            categories = "Música",
            forbiddenWords = listOf("Cuerdas", "Manos", "Eléctrica", "Acústica", "Instrumento")
        ),
        TabuCard(
            word = "Piano",
            categories = "Música",
            forbiddenWords = listOf("Teclas", "Manos", "Clásico", "Blanco", "Negro")
        ),
        TabuCard(
            word = "Rock",
            categories = "Música",
            forbiddenWords = listOf("Guitarra", "Banda", "Batería", "Ritmo", "Concierto")
        ),
        TabuCard(
            word = "Pop",
            categories = "Música",
            forbiddenWords = listOf("Comercial", "Famoso", "Moderno", "Radio", "Baile")
        ),
        TabuCard(
            word = "Rap",
            categories = "Música",
            forbiddenWords = listOf("Hablar", "Rima", "Calle", "Letra", "Beat")
        ),
        TabuCard(
            word = "Jazz",
            categories = "Música",
            forbiddenWords = listOf("Improvisación", "Saxo", "Estados Unidos", "Swing", "Blues")
        ),
        TabuCard(
            word = "Reggaetón",
            categories = "Música",
            forbiddenWords = listOf("Baile", "Latino", "Puerto Rico", "Beat", "Perreo")
        ),
        TabuCard(
            word = "Batería",
            categories = "Música",
            forbiddenWords = listOf("Percusión", "Golpear", "Ritmo", "Platillos", "Tambores")
        ),
        TabuCard(
            word = "Beyoncé",
            categories = "Música",
            forbiddenWords = listOf("Queen", "R&B", "Single", "Destiny", "Crazy")
        ),
        TabuCard(
            word = "Bad Bunny",
            categories = "Música",
            forbiddenWords = listOf("Puerto Rico", "Reggaetón", "Trap", "Conejo", "Latino")
        ),
        TabuCard(
            word = "Taylor Swift",
            categories = "Música",
            forbiddenWords = listOf("Pop", "Álbum", "Amor", "Swifties", "Rubia")
        ),
        TabuCard(
            word = "Shakira",
            categories = "Música",
            forbiddenWords = listOf("Colombia", "Hips", "Latina", "Waka", "Caderas")
        ),
        TabuCard(
            word = "Elvis Presley",
            categories = "Música",
            forbiddenWords = listOf("Rey", "Rock", "Pelo", "Baile", "USA")
        ),
        TabuCard(
            word = "Madonna",
            categories = "Música",
            forbiddenWords = listOf("Reina", "Pop", "Like", "Vogue", "80s")
        ),
        TabuCard(
            word = "Luis Miguel",
            categories = "Música",
            forbiddenWords = listOf("Sol", "México", "Romance", "Cantar", "Balada")
        ),
        TabuCard(
            word = "Queen",
            categories = "Música",
            forbiddenWords = listOf("Freddie", "Bohemian Rhapsody", "Inglaterra", "Banda", "Rock")
        ),
        TabuCard(
            word = "Rihanna",
            categories = "Música",
            forbiddenWords = listOf("Umbrella", "Diamonds", "Barbados", "Pop", "Fenty")
        ),
        TabuCard(
            word = "Linkin Park",
            categories = "Música",
            forbiddenWords = listOf("Chester", "Numb", "Rock", "Crossover", "Banda")
        ),
        TabuCard(
            word = "Eminem",
            categories = "Música",
            forbiddenWords = listOf("Rap", "Slim", "Marshall", "Rima", "Detroit")
        ),
        TabuCard(
            word = "Billie Eilish",
            categories = "Música",
            forbiddenWords = listOf("Oscura", "Bad", "Teen", "Pop", "Verde")
        ),
        TabuCard(
            word = "Ariana Grande",
            categories = "Música",
            forbiddenWords = listOf("Pequeña", "Pop", "Voz", "Dangerous", "USA")
        ),
        TabuCard(
            word = "Violín",
            categories = "Música",
            forbiddenWords = listOf("Cuerda", "Arco", "Clásico", "Instrumento", "Manos")
        ),
        TabuCard(
            word = "Trompeta",
            categories = "Música",
            forbiddenWords = listOf("Soplar", "Jazz", "Metal", "Notas", "Instrumento")
        ),
        TabuCard(
            word = "Saxofón",
            categories = "Música",
            forbiddenWords = listOf("Jazz", "Soplar", "Dorado", "Notas", "Instrumento")
        ),
        TabuCard(
            word = "Reggae",
            categories = "Música",
            forbiddenWords = listOf("Jamaica", "Bob", "Relajado", "Ritmo", "Rasta")
        ),
        TabuCard(
            word = "Bob Marley",
            categories = "Música",
            forbiddenWords = listOf("Jamaica", "Reggae", "Paz", "Rasta", "Música")
        ),
        TabuCard(
            word = "Metallica",
            categories = "Música",
            forbiddenWords = listOf("Metal", "Banda", "Rock", "Negro", "James")
        ),
        TabuCard(
            word = "Coldplay",
            categories = "Música",
            forbiddenWords = listOf("Yellow", "Chris", "Inglaterra", "Banda", "Color")
        ),
        TabuCard(
            word = "Adele",
            categories = "Música",
            forbiddenWords = listOf("Hello", "Voz", "Balada", "UK", "Álbum")
        ),
        TabuCard(
            word = "Daddy Yankee",
            categories = "Música",
            forbiddenWords = listOf("Gasolina", "Reggaetón", "Puerto Rico", "Legend", "Big Boss")
        ),
        TabuCard(
            word = "Salsa",
            categories = "Música",
            forbiddenWords = listOf("Bailar", "Latino", "Ritmo", "Pareja", "Cuba")
        ),
        TabuCard(
            word = "Cumbia",
            categories = "Música",
            forbiddenWords = listOf("Colombia", "Bailar", "Latino", "Grupo", "Instrumento")
        ),
        TabuCard(
            word = "Selena",
            categories = "Música",
            forbiddenWords = listOf("Quintanilla", "Tex-Mex", "Amor", "Latina", "Cantante")
        ),
        TabuCard(
            word = "David Bowie",
            categories = "Música",
            forbiddenWords = listOf("Ziggy", "Rebel", "Rock", "Estrella", "Ícono")
        ),
        TabuCard(
            word = "Bruno Mars",
            categories = "Música",
            forbiddenWords = listOf("24K", "Uptown", "Funk", "Pop", "Baile")
        ),
        TabuCard(
            word = "The Rolling Stones",
            categories = "Música",
            forbiddenWords = listOf("Mick", "Banda", "Satisfaction", "UK", "Rock")
        ),
        TabuCard(
            word = "Red Hot Chili Peppers",
            categories = "Música",
            forbiddenWords = listOf("Californication", "Banda", "Flea", "Funk", "Rock")
        ),
        TabuCard(
            word = "Katy Perry",
            categories = "Música",
            forbiddenWords = listOf("Roar", "Pop", "California", "Girl", "Firework")
        ),
        TabuCard(
            word = "Nirvana",
            categories = "Música",
            forbiddenWords = listOf("Kurt", "Grunge", "Teen", "Spirit", "Seattle")
        ),
        TabuCard(
            word = "ABBA",
            categories = "Música",
            forbiddenWords = listOf("Suecia", "Dancing", "Queen", "Pop", "Disco")
        ),
        TabuCard(
            word = "Drake",
            categories = "Música",
            forbiddenWords = listOf("Canada", "HipHop", "Views", "Rap", "Hotline")
        ),
        TabuCard(
            word = "Lady Gaga",
            categories = "Música",
            forbiddenWords = listOf("Poker", "Pop", "Monster", "Fashion", "Born")
        ),
        TabuCard(
            word = "Jennifer Lopez",
            categories = "Música",
            forbiddenWords = listOf("Latina", "Jenny", "Bronx", "Dance", "Actriz")
        ),
        TabuCard(
            word = "Backstreet Boys",
            categories = "Música",
            forbiddenWords = listOf("Boyband", "Pop", "90s", "Everybody", "Group")
        ),
        TabuCard(
            word = "U2",
            categories = "Música",
            forbiddenWords = listOf("Bono", "Ireland", "With", "Without", "Rock")
        ),
        TabuCard(
            word = "AC/DC",
            categories = "Música",
            forbiddenWords = listOf("Thunderstruck", "Rock", "Australia", "Guitarra", "Banda")
        ),
        TabuCard(
            word = "Ópera",
            categories = "Música",
            forbiddenWords = listOf("Cantar", "Teatro", "Clásica", "Vestuario", "Orquesta")
        ),
        TabuCard(
            word = "Flamenco",
            categories = "Música",
            forbiddenWords = listOf("España", "Guitarra", "Baile", "Cante", "Ritmo")
        ),
        TabuCard(
            word = "Blues",
            categories = "Música",
            forbiddenWords = listOf("Guitarra", "Triste", "EEUU", "Ritmo", "Armónica")
        ),
        TabuCard(
            word = "Flauta",
            categories = "Música",
            forbiddenWords = listOf("Soplar", "Madera", "Notas", "Orquesta", "Instrumento")
        ),
        TabuCard(
            word = "Arpa",
            categories = "Música",
            forbiddenWords = listOf("Cuerdas", "Grande", "Clásica", "Tocar", "Ángel")
        ),
        //profesiones
        TabuCard(
            word = "Médico",
            categories = "Profesiones",
            forbiddenWords = listOf("Doctor", "Hospital", "Paciente", "Estetoscopio", "Medicina")
        ),
        TabuCard(
            word = "Enfermero",
            categories = "Profesiones",
            forbiddenWords = listOf("Hospital", "Paciente", "Jeringa", "Cuidar", "Médico")
        ),
        TabuCard(
            word = "Profesor",
            categories = "Profesiones",
            forbiddenWords = listOf("Escuela", "Estudiante", "Pizarra", "Enseñar", "Libro")
        ),
        TabuCard(
            word = "Ingeniero",
            categories = "Profesiones",
            forbiddenWords = listOf("Construcción", "Planos", "Máquina", "Diseño", "Técnico")
        ),
        TabuCard(
            word = "Abogado",
            categories = "Profesiones",
            forbiddenWords = listOf("Ley", "Tribunal", "Cliente", "Contrato", "Juez")
        ),
        TabuCard(
            word = "Policía",
            categories = "Profesiones",
            forbiddenWords = listOf("Uniforme", "Arma", "Crimen", "Patrulla", "Ley")
        ),
        TabuCard(
            word = "Bombero",
            categories = "Profesiones",
            forbiddenWords = listOf("Fuego", "Manguera", "Camión", "Rescate", "Casco")
        ),
        TabuCard(
            word = "Cocinero",
            categories = "Profesiones",
            forbiddenWords = listOf("Cocina", "Comida", "Sartén", "Receta", "Chef")
        ),
        TabuCard(
            word = "Carpintero",
            categories = "Profesiones",
            forbiddenWords = listOf("Madera", "Martillo", "Sierra", "Mueble", "Clavos")
        ),
        TabuCard(
            word = "Electricista",
            categories = "Profesiones",
            forbiddenWords = listOf("Cable", "Luz", "Herramientas", "Corriente", "Interruptor")
        ),
        TabuCard(
            word = "Mecánico",
            categories = "Profesiones",
            forbiddenWords = listOf("Coche", "Herramientas", "Motor", "Reparar", "Taller")
        ),
        TabuCard(
            word = "Fontanero",
            categories = "Profesiones",
            forbiddenWords = listOf("Tubería", "Agua", "Llave", "Fuga", "Reparar")
        ),
        TabuCard(
            word = "Arquitecto",
            categories = "Profesiones",
            forbiddenWords = listOf("Planos", "Edificio", "Diseño", "Construcción", "Casa")
        ),
        TabuCard(
            word = "Pintor",
            categories = "Profesiones",
            forbiddenWords = listOf("Pincel", "Pintura", "Pared", "Color", "Lienzo")
        ),
        TabuCard(
            word = "Periodista",
            categories = "Profesiones",
            forbiddenWords = listOf("Noticias", "Periódico", "Entrevista", "Cámara", "Reportaje")
        ),
        TabuCard(
            word = "Fotógrafo",
            categories = "Profesiones",
            forbiddenWords = listOf("Cámara", "Foto", "Lente", "Capturar", "Imagen")
        ),
        TabuCard(
            word = "Actor",
            categories = "Profesiones",
            forbiddenWords = listOf("Película", "Escenario", "Guión", "Personaje", "Teatro")
        ),
        TabuCard(
            word = "Músico",
            categories = "Profesiones",
            forbiddenWords = listOf("Instrumento", "Melodía", "Concierto", "Notas", "Banda")
        ),
        TabuCard(
            word = "Cantante",
            categories = "Profesiones",
            forbiddenWords = listOf("Voz", "Canción", "Micrófono", "Escenario", "Música")
        ),
        TabuCard(
            word = "Bailarín",
            categories = "Profesiones",
            forbiddenWords = listOf("Baile", "Escenario", "Ritmo", "Movimiento", "Danza")
        ),
        TabuCard(
            word = "Escritor",
            categories = "Profesiones",
            forbiddenWords = listOf("Libro", "Historia", "Papel", "Lápiz", "Novela")
        ),
        TabuCard(
            word = "Veterinario",
            categories = "Profesiones",
            forbiddenWords = listOf("Animal", "Mascota", "Clínica", "Cuidar", "Perro")
        ),
        TabuCard(
            word = "Dentista",
            categories = "Profesiones",
            forbiddenWords = listOf("Dientes", "Clínica", "Caries", "Cepillo", "Boca")
        ),
        TabuCard(
            word = "Farmacéutico",
            categories = "Profesiones",
            forbiddenWords = listOf("Farmacia", "Medicina", "Receta", "Pastillas", "Cliente")
        ),
        TabuCard(
            word = "Psicólogo",
            categories = "Profesiones",
            forbiddenWords = listOf("Mente", "Paciente", "Terapia", "Emociones", "Consulta")
        ),
        TabuCard(
            word = "Contador",
            categories = "Profesiones",
            forbiddenWords = listOf("Números", "Dinero", "Cálculos", "Impuestos", "Oficina")
        ),
        TabuCard(
            word = "Diseñador",
            categories = "Profesiones",
            forbiddenWords = listOf("Creatividad", "Dibujo", "Moda", "Gráfico", "Estilo")
        ),
        TabuCard(
            word = "Programador",
            categories = "Profesiones",
            forbiddenWords = listOf("Computadora", "Código", "Software", "Tecnología", "Pantalla")
        ),
        TabuCard(
            word = "Chofer",
            categories = "Profesiones",
            forbiddenWords = listOf("Coche", "Volante", "Carretera", "Transporte", "Pasajero")
        ),
        TabuCard(
            word = "Piloto",
            categories = "Profesiones",
            forbiddenWords = listOf("Avión", "Cielo", "Volar", "Cabina", "Pasajero")
        ),
        TabuCard(
            word = "Marinero",
            categories = "Profesiones",
            forbiddenWords = listOf("Barco", "Mar", "Navegar", "Timón", "Olas")
        ),
        TabuCard(
            word = "Jardinero",
            categories = "Profesiones",
            forbiddenWords = listOf("Plantas", "Tijeras", "Jardín", "Flores", "Tierra")
        ),
        TabuCard(
            word = "Albañil",
            categories = "Profesiones",
            forbiddenWords = listOf("Ladrillo", "Cemento", "Construcción", "Pared", "Herramientas")
        ),
        TabuCard(
            word = "Militar",
            categories = "Profesiones",
            forbiddenWords = listOf("Armas", "guerra", "Uniforme", "Pelear", "Camuflaje")
        ),
        TabuCard(
            word = "Peluquero",
            categories = "Profesiones",
            forbiddenWords = listOf("Tijeras", "Pelo", "Corte", "Peine", "Salón")
        ),
        TabuCard(
            word = "Bibliotecario",
            categories = "Profesiones",
            forbiddenWords = listOf("Libros", "Biblioteca", "Silencio", "Estantería", "Préstamo")
        ),
        TabuCard(
            word = "Recepcionista",
            categories = "Profesiones",
            forbiddenWords = listOf("Teléfono", "Hotel", "Cliente", "Mostrador", "Bienvenida")
        ),
        TabuCard(
            word = "Cajero",
            categories = "Profesiones",
            forbiddenWords = listOf("Dinero", "Tienda", "Caja", "Cliente", "Pago")
        ),
        TabuCard(
            word = "Vendedor",
            categories = "Profesiones",
            forbiddenWords = listOf("Tienda", "Cliente", "Producto", "Venta", "Dinero")
        ),
        TabuCard(
            word = "Entrenador",
            categories = "Profesiones",
            forbiddenWords = listOf("Deporte", "Equipo", "Ejercicio", "Gimnasio", "Jugador")
        ),
        TabuCard(
            word = "Astronauta",
            categories = "Profesiones",
            forbiddenWords = listOf("Espacio", "Cohete", "Estrellas", "Traje", "Planeta")
        ),
        TabuCard(
            word = "Científico",
            categories = "Profesiones",
            forbiddenWords = listOf("Laboratorio", "Experimento", "Ciencia", "Investigación", "Bata")
        ),
        TabuCard(
            word = "Arqueólogo",
            categories = "Profesiones",
            forbiddenWords = listOf("Ruinas", "Excavar", "Historia", "Fósil", "Pico")
        ),
        TabuCard(
            word = "Geólogo",
            categories = "Profesiones",
            forbiddenWords = listOf("Rocas", "Tierra", "Minerales", "Estudio", "Cueva")
        ),
        TabuCard(
            word = "Botánico",
            categories = "Profesiones",
            forbiddenWords = listOf("Plantas", "Flores", "Naturaleza", "Estudio", "Bosque")
        ),
        TabuCard(
            word = "Economista",
            categories = "Profesiones",
            forbiddenWords = listOf("Dinero", "Mercado", "Finanzas", "Estudio", "Bolsa")
        ),
        TabuCard(
            word = "Traductor",
            categories = "Profesiones",
            forbiddenWords = listOf("Idioma", "Palabras", "Texto", "Interpretar", "Lenguaje")
        ),
        TabuCard(
            word = "Juez",
            categories = "Profesiones",
            forbiddenWords = listOf("Tribunal", "Ley", "Martillo", "Sentencia", "Abogado")
        ),
        TabuCard(
            word = "Locutor",
            categories = "Profesiones",
            forbiddenWords = listOf("Micrófono", "Radio", "Voz", "Programa", "Hablar")
        ),
        TabuCard(
            word = "Panadero",
            categories = "Profesiones",
            forbiddenWords = listOf("Pan", "Horno", "Harina", "Amasar", "Panadería")
        ),
        //acciones
        TabuCard(
            word = "Caminar",
            categories = "General, Acciones",
            forbiddenWords = listOf("Pies", "Moverse", "Paso", "Calle", "Andar")
        ),
        TabuCard(
            word = "Correr",
            categories = "General, Acciones",
            forbiddenWords = listOf("Rápido", "Piernas", "Ejercicio", "Carrera", "Velocidad")
        ),
        TabuCard(
            word = "Saltar",
            categories = "General",
            forbiddenWords = listOf("Brincar", "Aire", "Alto", "Pies", "Rebotar")
        ),
        TabuCard(
            word = "Nadar",
            categories = "General, Acciones",
            forbiddenWords = listOf("Agua", "Piscina", "Brazos", "Flotar", "Mojado")
        ),
        TabuCard(
            word = "Comer",
            categories = "General, Acciones",
            forbiddenWords = listOf("Boca", "Comida", "Masticar", "Plato", "Hambre")
        ),
        TabuCard(
            word = "Beber",
            categories = "General, Acciones",
            forbiddenWords = listOf("Líquido", "Vaso", "Tragar", "Sed", "Agua")
        ),
        TabuCard(
            word = "Dormir",
            categories = "General, Acciones",
            forbiddenWords = listOf("Cama", "Ojos", "Descansar", "Noche", "Sueño")
        ),
        TabuCard(
            word = "Leer",
            categories = "General, Acciones",
            forbiddenWords = listOf("Libro", "Ojos", "Palabras", "Página", "Historia")
        ),
        TabuCard(
            word = "Escribir",
            categories = "General, Acciones",
            forbiddenWords = listOf("Lápiz", "Papel", "Letras", "Mano", "Texto")
        ),
        TabuCard(
            word = "Hablar",
            categories = "General, Acciones",
            forbiddenWords = listOf("Boca", "Voz", "Palabras", "Conversar", "Sonido")
        ),
        TabuCard(
            word = "Escuchar",
            categories = "General, Acciones",
            forbiddenWords = listOf("Oídos", "Sonido", "Música", "Atención", "Ruido")
        ),
        TabuCard(
            word = "Mirar",
            categories = "General",
            forbiddenWords = listOf("Ojos", "Ver", "Vista", "Pantalla", "Atención")
        ),
        TabuCard(
            word = "Bailar",
            categories = "General, Acciones",
            forbiddenWords = listOf("Música", "Pies", "Ritmo", "Moverse", "Baile")
        ),
        TabuCard(
            word = "Cantar",
            categories = "General, Acciones",
            forbiddenWords = listOf("Voz", "Música", "Letra", "Melodía", "Garganta")
        ),
        TabuCard(
            word = "Cocinar",
            categories = "General, Acciones",
            forbiddenWords = listOf("Comida", "Cocina", "Sartén", "Ingredientes", "Fuego")
        ),
        TabuCard(
            word = "Lavar",
            categories = "General, Acciones",
            forbiddenWords = listOf("Agua", "Jabón", "Ropa", "Manos", "Limpio")
        ),
        TabuCard(
            word = "Conducir",
            categories = "General, Acciones",
            forbiddenWords = listOf("Coche", "Volante", "Carretera", "Ruedas", "Viaje")
        ),
        TabuCard(
            word = "Pintar",
            categories = "General, Acciones",
            forbiddenWords = listOf("Pincel", "Color", "Lienzo", "Arte", "Pared")
        ),
        TabuCard(
            word = "Jugar",
            categories = "General, Acciones",
            forbiddenWords = listOf("Diversión", "Pelota", "Amigos", "Juego", "Ganar")
        ),
        TabuCard(
            word = "Esperar",
            categories = "General, Acciones",
            forbiddenWords = listOf("Tiempo", "Parado", "Cola", "Llegar", "Paciencia")
        ),
        TabuCard(
            word = "Sonreír",
            categories = "Acciones",
            forbiddenWords = listOf("Boca", "Dientes", "Feliz", "Rostro", "Alegría")
        ),
        TabuCard(
            word = "Llorar",
            categories = "Acciones",
            forbiddenWords = listOf("Lágrimas", "Ojos", "Triste", "Dolor", "Emoción")
        ),
        TabuCard(
            word = "Abrazar",
            categories = "Acciones",
            forbiddenWords = listOf("Brazos", "Cuerpo", "Afecto", "Amigo", "Cariño")
        ),
        TabuCard(
            word = "Aplaudir",
            categories = "Acciones",
            forbiddenWords = listOf("Manos", "Sonido", "Palmas", "Bravo", "Celebrar")
        ),
        TabuCard(
            word = "Señalar",
            categories = "Acciones",
            forbiddenWords = listOf("Dedo", "Mano", "Indicar", "Apuntar", "Dirección")
        ),
        TabuCard(
            word = "Gritar",
            categories = "Acciones",
            forbiddenWords = listOf("Voz", "Fuerte", "Boca", "Ruido", "Chillar")
        ),
        TabuCard(
            word = "Susurrar",
            categories = "Acciones",
            forbiddenWords = listOf("Boca", "Voz", "Bajo", "Secreto", "Oído")
        ),
        TabuCard(
            word = "Estirar",
            categories = "Acciones",
            forbiddenWords = listOf("Cuerpo", "Músculos", "Brazos", "Piernas", "Ejercicio")
        ),
        TabuCard(
            word = "Toser",
            categories = "Acciones",
            forbiddenWords = listOf("Boca", "Sonido", "Enfermo", "Garganta", "Resfriado")
        ),
        TabuCard(
            word = "Estornudar",
            categories = "Acciones",
            forbiddenWords = listOf("Nariz", "Sonido", "Enfermo", "Pañuelo", "Resfriado")
        ),
        TabuCard(
            word = "Soplar",
            categories = "Acciones",
            forbiddenWords = listOf("Boca", "Aire", "Viento", "Vela", "Silbar")
        ),
        TabuCard(
            word = "Silbar",
            categories = "Acciones",
            forbiddenWords = listOf("Boca", "Sonido", "Melodía", "Labios", "Aire")
        ),
        TabuCard(
            word = "Morder",
            categories = "Acciones",
            forbiddenWords = listOf("Dientes", "Boca", "Comida", "Masticar", "Dolor")
        ),
        TabuCard(
            word = "Chupar",
            categories = "Acciones",
            forbiddenWords = listOf("Boca", "Líquido", "Caramelo", "Pajita", "Labios")
        ),
        TabuCard(
            word = "Patear",
            categories = "Acciones",
            forbiddenWords = listOf("Pie", "Pelota", "Fuerza", "Golpear", "Pierna")
        ),
        TabuCard(
            word = "Lanzar",
            categories = "Acciones",
            forbiddenWords = listOf("Mano", "Pelota", "Tirar", "Fuerza", "Objeto")
        ),
        TabuCard(
            word = "Atrapar",
            categories = "Acciones",
            forbiddenWords = listOf("Manos", "Pelota", "Recibir", "Juego", "Agarrar")
        ),
        TabuCard(
            word = "Escalar",
            categories = "Acciones",
            forbiddenWords = listOf("Montaña", "Manos", "Pies", "Subir", "Roca")
        ),
        TabuCard(
            word = "Rodar",
            categories = "Acciones",
            forbiddenWords = listOf("Cuerpo", "Suelo", "Girar", "Pelota", "Colina")
        ),
        TabuCard(
            word = "Arrastrar",
            categories = "Acciones",
            forbiddenWords = listOf("Mano", "Objeto", "Piso", "Jalar", "Pesado")
        ),
        TabuCard(
            word = "Empujar",
            categories = "Acciones",
            forbiddenWords = listOf("Manos", "Fuerza", "Objeto", "Mover", "Pared")
        ),
        TabuCard(
            word = "Jalar",
            categories = "Acciones",
            forbiddenWords = listOf("Manos", "Fuerza", "Objeto", "Tirar", "Cuerda")
        ),
        TabuCard(
            word = "Cepillar",
            categories = "Acciones",
            forbiddenWords = listOf("Cepillo", "Dientes", "Pelo", "Limpio", "Mano")
        ),
        TabuCard(
            word = "Coser",
            categories = "Acciones",
            forbiddenWords = listOf("Aguja", "Hilo", "Tela", "Mano", "Ropa")
        ),
        TabuCard(
            word = "Cortar",
            categories = "Acciones",
            forbiddenWords = listOf("Cuchillo", "Tijeras", "Papel", "Cocina", "Dividir")
        ),
        TabuCard(
            word = "Barrer",
            categories = "Acciones",
            forbiddenWords = listOf("Escoba", "Suelo", "Polvo", "Limpio", "Casa")
        ),
        TabuCard(
            word = "Planchar",
            categories = "Acciones",
            forbiddenWords = listOf("Plancha", "Ropa", "Calor", "Liso", "Tabla")
        ),
        TabuCard(
            word = "Tejer",
            categories = "Acciones",
            forbiddenWords = listOf("Lana", "Agujas", "Hilo", "Bufanda", "Manos")
        ),
        TabuCard(
            word = "Peinar",
            categories = "Acciones",
            forbiddenWords = listOf("Cepillo", "Pelo", "Cabeza", "Liso", "Mano")
        ),
        TabuCard(
            word = "Fregar",
            categories = "Acciones",
            forbiddenWords = listOf("Esponja", "Platos", "Agua", "Jabón", "Limpio")
        ),
        TabuCard(
            word = "Maquillar",
            categories = "Acciones",
            forbiddenWords = listOf("Rostro", "Pintura", "Cepillo", "Labios", "Ojos")
        ),
        TabuCard(
            word = "Encender",
            categories = "Acciones",
            forbiddenWords = listOf("Fuego", "Luz", "Interruptor", "Vela", "Botón")
        ),
        TabuCard(
            word = "Apagar",
            categories = "Acciones",
            forbiddenWords = listOf("Luz", "Interruptor", "Fuego", "Botón", "Oscuro")
        ),
        TabuCard(
            word = "Vestir",
            categories = "Acciones",
            forbiddenWords = listOf("Ropa", "Cuerpo", "Poner", "Camisa", "Pantalón")
        ),
        TabuCard(
            word = "Afeitar",
            categories = "Acciones",
            forbiddenWords = listOf("Navaja", "Barba", "Espuma", "Rostro", "Cuchilla")
        ),
        TabuCard(
            word = "Balancear",
            categories = "Acciones",
            forbiddenWords = listOf("Cuerpo", "Columpio", "Mover", "Equilibrio", "Silla")
        ),
        TabuCard(
            word = "Girar",
            categories = "Acciones",
            forbiddenWords = listOf("Cuerpo", "Vuelta", "Rodar", "Trompo", "Danza")
        ),
        TabuCard(
            word = "Agacharse",
            categories = "Acciones",
            forbiddenWords = listOf("Cuerpo", "Suelo", "Bajar", "Rodillas", "Inclinarse")
        ),
        TabuCard(
            word = "Levantar",
            categories = "Acciones",
            forbiddenWords = listOf("Manos", "Objeto", "Fuerza", "Alzar", "Peso")
        ),
        TabuCard(
            word = "Sonar",
            categories = "Acciones",
            forbiddenWords = listOf("Nariz", "Dormir", "Ruido", "Fuerte", "Noche")
        ),
        TabuCard(
            word = "Reír",
            categories = "Acciones",
            forbiddenWords = listOf("Boca", "Feliz", "Carcajada", "Chiste", "Sonido")
        ),
        TabuCard(
            word = "Sostener",
            categories = "Acciones",
            forbiddenWords = listOf("Manos", "Objeto", "Agarrar", "Sujetar", "Fuerza")
        ),
        TabuCard(
            word = "Cavar",
            categories = "Acciones",
            forbiddenWords = listOf("Pala", "Tierra", "Hoyo", "Profundo", "Suelo")
        ),
        TabuCard(
            word = "Brillar",
            categories = "Acciones",
            forbiddenWords = listOf("Luz", "Sol", "Estrella", "Resplandor", "Claro")
        ),
        TabuCard(
            word = "Doblar",
            categories = "Acciones",
            forbiddenWords = listOf("Papel", "Ropa", "Curvar", "Mano", "Pliegue")
        ),
        TabuCard(
            word = "Amarrar",
            categories = "Acciones",
            forbiddenWords = listOf("Cuerda", "Nudo", "Atar", "Fuerte", "Barco")
        ),
        TabuCard(
            word = "Remar",
            categories = "Acciones",
            forbiddenWords = listOf("Bote", "Agua", "Remo", "Brazos", "Río")
        ),
        TabuCard(
            word = "Meditar",
            categories = "Acciones",
            forbiddenWords = listOf("Silencio", "Calma", "Pensar", "Sentado", "Relajarse")
        ),
        TabuCard(
            word = "Saltar a la cuerda",
            categories = "Acciones",
            forbiddenWords = listOf("Cuerda", "Ejercicio", "Brincar", "Pies", "Ritmo")
        ),
    )

    fun getCardsByCategory(category: String): List<TabuCard> {
        return cards.filter { it.categories.contains(category) }.shuffled()
    }
}