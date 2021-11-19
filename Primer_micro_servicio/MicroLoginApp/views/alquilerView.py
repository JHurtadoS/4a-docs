from rest_framework import status, views
from rest_framework.response import Response
from rest_framework_simplejwt.serializers import TokenObtainPairSerializer

from MicroLoginApp.serializers.serializerCliente import SerializerUser

class ClienteCreateView(views.APIView):
    def post(self, request, *args, **kwargs):
        serializer = SerializerUser(data=request.data)
        serializer.is_valid(raise_exception=-True)
        serializer.save()

        tokenData = {
            "id":request.data["id"],
            "idCliente":request.data["idCliente"],
            "Propiedad":request.data["Propiedad"],
            "FechadeLlegada":request.data["FechadeLlegada"],
            "Estado":request.data["Estado"],
            "FechadeSalida":request.data["FechadeSalida"],
            "DineroAbonado":request.data["DineroAbonado"]
        }
        tokenSerializer = TokenObtainPairSerializer(data=tokenData)
        tokenSerializer.is_valid(raise_exception=True)

        return Response(tokenSerializer.validate_data, status=status.HTTP_201_CREATED)