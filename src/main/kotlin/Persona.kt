package M03_UF4_A4_persones

/* Definició de la classe Persona */
class Persona ( var nom: String, var cognoms: String) {
    //Estructura, coneguda com a propietats o atributs

    var edat: Int = 0
    var alcada: Int = 0
    var pes: Float = 0f


    constructor(): this("Anònim" ,"Anònimez") {
        this.nom = "Anònim"
        this.cognoms = "Anònimez"
    }
    constructor(nom:String , cognom:String, edad:Int): this(nom, cognom) {
        this.edat = edad
    }
    constructor(nom:String , cognom:String, edad:Int, altura:Double, peso:Int): this(nom, cognom) {
        this.edat = edad
        this.alcada = (altura*100).toInt()
        this.pes = peso.toFloat()
    }
    //Comportament, també conegut com mètodes
    fun caminar() {
        println(quiSocJo() + "Estic caminant")
    }

    fun parlar() {
        println(quiSocJo() + "Estic parlant")
    }

    fun neixer() {
        println(quiSocJo() + "Tot just ara he nascut!!!")
    }

    fun morir() {
        println(quiSocJo() + "Ens veiem a l'infern!")
    }

    private fun quiSocJo() : String {
        return nom + " " + cognoms + ":: "
    }

    fun presentacio() {
        val message = StringBuilder()
        message.append("Hola, sóc ${quiSocJo()}. ")
        if (edat > 0) {
            message.append("Tinc $edat anys. ")
        }
        if (alcada > 0) {
            message.append("La meva alçada és de $alcada cm. ")
        }
        if (pes > 0) {
            message.append("El meu pes és de $pes kg.")
        }
        println(message.toString())
    }
}