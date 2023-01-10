package com.proyecto.razasperros

import android.os.Parcel
import android.os.Parcelable


data class Raza(val image: Int, val nombre: String,val tamanyo: String, val peso: String, val color: String, val tipoPelo: String, val colorOjos: String, val descripcionLarga: String) : Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!

    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(nombre)
        parcel.writeString(tamanyo)
        parcel.writeString(peso)
        parcel.writeString(color)
        parcel.writeString(tipoPelo)
        parcel.writeString(colorOjos)
        parcel.writeString(descripcionLarga)

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Raza> {
        override fun createFromParcel(parcel: Parcel): Raza {
            return Raza(parcel)
        }

        override fun newArray(size: Int): Array<Raza?> {
            return arrayOfNulls(size)
        }
    }

}
