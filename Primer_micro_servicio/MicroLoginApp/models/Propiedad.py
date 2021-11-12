from django.db import models
from django.contrib.auth.models import AbstractBaseUser,PermissionsMixin,BaseUserManager

class Cliente(PermissionsMixin):
    id = models.BigAutoField(primary_key=True)
    Direccion = models.CharField('Username', max_length = 100, unique=True)
    Codigo = models.CharField('Username', max_length = 20, unique=True)
    Descripcion = models.CharField('Username', max_length = 3000, unique=True)
    Precio = models.FloatField('precio', max_length = 15, unique=True)