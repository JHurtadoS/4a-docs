from rest_framework import serializers
from MicroLoginApp.models.Propiedad import Propiedad

class SerializerPropiedad(serializers.ModelSerializer):
    class Meta:
        model = Propiedad
        fields = ['id', 'idDueño', 'Direccion', 'Codigo', 'Descripcion', 'Precio']