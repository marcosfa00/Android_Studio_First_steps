# PRIMEROS PASOS CON ANDROID STUDIO

Aquí hemos cacharreado con las funciones **override** de **Kotlyn**

De manera que cada vez que hacemos un cambio en el teléfono nos indica el estado del mismo

Pondré el ejemplo de la función de Pausa
    
        override fun onPause() {
            super.onPause()
            Log.d(TAG,"pausa")
        }


Esto se debe hacer siempre dentro de la función **On Start**

Tras hacer todas estas Funciones, sabremos el estado de nuestro telefono a tiempo real
