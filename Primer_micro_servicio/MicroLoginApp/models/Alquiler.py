from django.db import models
from django.contrib.auth.models import AbstractBaseUser,PermissionsMixin,BaseUserManager


class Alquiler(PermissionsMixin):
    id = models.BigAutoField(primary_key=True)
    
    
    FechadeLlegada = models.DateTimeField()
    Estado = models.CharField('Estado', max_length = 20, unique=True)
    FechadeSalida = models.DateTimeField()
    DineroAbonado = models.FloatField('Dinero Abonado', max_length = 15, unique=True)