from django.db import models
from django.contrib.auth.models import AbstractBaseUser,PermissionsMixin,BaseUserManager
from models import Dueño

class Propiedad(PermissionsMixin):
    id = models.BigAutoField(primary_key=True)
    idDueño = models.ForeignKey(Dueño, related_name='id', on_delete=models.CASCADE)
    Direccion = models.CharField('Username', max_length = 100, unique=True)
    Codigo = models.CharField('Username', max_length = 20, unique=True)
    Descripcion = models.CharField('Username', max_length = 3000, unique=True)
    Precio = models.FloatField('precio', max_length = 15, unique=True)