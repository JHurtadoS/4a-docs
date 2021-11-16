from rest_framework import serializers
from MicroLoginApp.models.User import User

class SerializerUser(serializers.ModelSerializer):
    class Meta:
        model = User
        fields = ['id', 'username', 'password']
