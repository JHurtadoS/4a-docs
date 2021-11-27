from rest_framework import generics

from MicroLoginApp.models.User import User
from MicroLoginApp.serializers.serializerUser import SerializerUser

class UserDetailView(generics.RetrieveAPIView):
    queryset = User.objects.all()
    serializer_class = SerializerUser