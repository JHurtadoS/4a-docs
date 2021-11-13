from django.db import models
from django.contrib.auth.models import AbstractBaseUser,PermissionsMixin,BaseUserManager


class Cliente(PermissionsMixin):
    id = models.BigAutoField(primary_key=True)
    Nombre = models.CharField('nombre', max_length = 15, unique=True)
    Apellido = models.CharField('apellido', max_length = 15, unique=True)
    Cedula = models.IntegerField('cedula', max_length = 20, unique=True)
    DineroActual = models.FloatField('dineroActual', max_length = 1000, unique=True)
