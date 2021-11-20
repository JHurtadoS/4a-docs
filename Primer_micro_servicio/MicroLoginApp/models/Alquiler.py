from django.db import models
from django.contrib.auth.models import AbstractBaseUser,PermissionsMixin,BaseUserManager
from MicroLoginApp.models import Cliente
from MicroLoginApp.models import Propiedad

class Alquiler(PermissionsMixin):
    id = models.BigAutoField(primary_key=True)
    idcliente= models.ForeignKey(Cliente, related_name='id', on_delete=models.CASCADE)
    Propiedad = models.ForeignKey(Propiedad, related_name='id', on_delete=models.CASCADE)
    FechadeLlegada = models.DateTimeField()
    Estado = models.CharField('Estado', max_length = 20, unique=True)
    FechadeSalida = models.DateTimeField()
    DineroAbonado = models.FloatField('Dinero Abonado', max_length = 15, unique=True)