from rest_framework import status, views
from rest_framework.response import Response
from rest_framework_simplejwt.serializers import TokenObtainPairSerializer

from MicroLoginApp.serializers.serializerCliente import SerializerUser

class OwnerCreateView(views.APIView):
    def post(self, request, *args, **kwargs):
        serializer = SerializerUser(data=request.data)
        serializer.is_valid(raise_exception=-True)
        serializer.save()

        tokenData = {
            "id":request.data["id"],
            "Nombre":request.data["Nombre"],
            "Apellido":request.data["Apellido"],
            "Telefono":request.data["Telefono"],
            "DineroActual":request.data["DineroActual"]
        }
        tokenSerializer = TokenObtainPairSerializer(data=tokenData)
        tokenSerializer.is_valid(raise_exception=True)

        return Response(tokenSerializer.validate_data, status=status.HTTP_201_CREATED)