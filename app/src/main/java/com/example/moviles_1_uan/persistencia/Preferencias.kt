package com.example.moviles_1_uan.persistencia

import android.R
import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class Preferencias(private val contexto: Context) {
    companion object {
        val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "configuracciones")

        val AGE = intPreferencesKey("age")
        val NAME = stringPreferencesKey("name")
        val HASPET = booleanPreferencesKey("hasPet")

    }

    val age: Flow<Int> = contexto.dataStore.data.map { preferences ->
        preferences[AGE] ?: 0
    }

    val name: Flow<String> = contexto.dataStore.data.map{ preferences ->
        preferences[NAME] ?: "Sin ningun nombre"
    }

    val hasPet: Flow<Boolean> = contexto.dataStore.data.map{ preferences ->
        preferences[HASPET] ?: true
    }

    suspend fun guardarDatosPersonal(edad:Int, nombre: String, mascota : Boolean) {
        contexto.dataStore.edit { settings ->
            settings[AGE] = edad
            settings[NAME] = nombre
            settings[HASPET] = mascota
        }
    }

    suspend fun borrarConfiguracciones(){
        contexto.dataStore.edit {
            it.remove(AGE)
            it.remove(NAME)
            it.remove(HASPET)

            it.clear()
        }
    }


}