from rest_framework import serializers
from MicroLoginApp.models.Alquiler import Alquiler

class SerializerAlquiler(serializers.ModelSerializer):
    class Meta:
        model = Alquiler
        fields = ['id', 'idcliente', 'Propiedad', 'FechadeLlegada', 'Estado', 'FechadeSalida', 'DineroAbonado']