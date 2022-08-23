package mx.itesm.smgv.convertidor

class Convertidor {

    fun convertirKmMi(km: Double): Double {
        val millas = km / 1.6
        return millas
    }

    fun convertirMiKm(mi: Double): Double {
        return mi * 1.6

    }
}