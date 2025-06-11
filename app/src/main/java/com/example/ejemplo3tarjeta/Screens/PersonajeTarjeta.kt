package com.example.ejemplo3tarjeta.Screens

data class PersonajeTarjeta(
    val nombre: String,
    val descripcion: String
)

val tarjetas: List<PersonajeTarjeta> = listOf(
    PersonajeTarjeta("goku", "El protagonista de la serie, conocido por su gran poder y personalidad amigable. Originalmente enviado a la Tierra como un infante volador con la misión de conquistarla"),
    PersonajeTarjeta("gohan", "Es el primer hijo de Son Goku y Chi-Chi"),
    PersonajeTarjeta("androide17", "Antes de ser secuestrado, es el hermano mellizo de la Androide Número 18, quien al igual que ella antes de ser Androide era un humano normal hasta que fueron secuestrados por el Dr. Gero, y es por eso que lo odian."),
    PersonajeTarjeta("androide18", "Es la hermana melliza del Androide Número 17 y una androide creada a partir de una base humana por el Dr. Gero con el único fin de destruir a Goku."),
    PersonajeTarjeta("Cell", "Cell conocido como Célula en España, es un bioandroide creado por la computadora del Dr. Gero, quien vino del futuro de la línea 3 con la intención de vengarse de Goku por haber acabado con el Ejército del Listón Rojo"),
    PersonajeTarjeta("gogeta", "Gogeta es la fusión resultante de Son Goku y Vegeta, cuando realizan la Danza de la Fusión correctamente para enfrentarse a Broly"),
    PersonajeTarjeta("gotenks", " Gotenks también conocido inicialmente como Gotrunk en el doblaje al español de España, es el resultado de la Danza de la Fusión llevada a cabo correctamente por Goten y Trunks"),
    PersonajeTarjeta("jiren", "Jiren es un poderoso luchador del Universo 11 y uno de los oponentes más formidables en el torneo."),
    PersonajeTarjeta("daishinkan", "El Gran Sacerdote es el supervisor del torneo y uno de los seres más poderosos. Gran Ministro de los Omni-Reyes , es un ángel que actúa como asesor cercano y figura guía de Zenón y del Futuro Zenón ."),
    PersonajeTarjeta("vegetto", "Vegetto es el personaje más fuerte dentro del manga original y uno de los personajes más poderosos de toda la serie en general."),
    PersonajeTarjeta("vegeta", "Príncipe de los Saiyans, inicialmente un villano, pero luego se une a los Z Fighters. A pesar de que a inicios de Dragon Ball Z, Vegeta cumple un papel antagónico, poco después decide rebelarse ante el Imperio de Freeza, volviéndose un aliado clave para los Guerreros Z.")
)