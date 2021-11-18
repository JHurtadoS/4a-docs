from rest_framework import serializers
from MicroLoginApp.models.Cliente import Cliente

class SerializerCliente(serializers.ModelSerializer):
    class Meta:
        model = Cliente
        fields = ['id', 'Nombre', 'Apellido', 'Cedula', 'Telefono', 'DineroActual']