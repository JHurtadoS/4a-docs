from rest_framework import serializers
from MicroLoginApp.models.Dueño import Dueño

class SerializerDueño(serializers.ModelSerializer):
    class Meta:
        model = Dueño
        fields = ['id', 'Nombre', 'Apellido', 'Telefono', 'DineroActual']