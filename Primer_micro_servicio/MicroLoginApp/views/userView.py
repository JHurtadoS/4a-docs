from rest_framework import status, views
from rest_framework.response import Response
from rest_framework_simplejwt.serializers import TokenObtainPairSerializer

from MicroLoginApp.serializers.serializerUser import SerializerUser

class UserCreateView(views.APIView):
    def post(self, request, *args, **kwargs):
        serializer = SerializerUser(data=request.data)
        serializer.is_valid(raise_exception=-True)
        serializer.save()

        tokenData = {
            "id":request.data["id"],
            "Username":request.data["username"],
            "password":request.data["password"]
        }
        tokenSerializer = TokenObtainPairSerializer(data=tokenData)
        tokenSerializer.is_valid(raise_exception=True)

        return Response(tokenSerializer.validate_data, status=status.HTTP_201_CREATED)