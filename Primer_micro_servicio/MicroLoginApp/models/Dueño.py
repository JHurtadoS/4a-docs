from django.db import models
from django.contrib.auth.models import AbstractBaseUser,PermissionsMixin,BaseUserManager

class Dueño(PermissionsMixin):
    id = models.BigAutoField(primary_key=True)
    Nombre = models.CharField('nombre', max_length = 30, unique=True)
    Apellido = models.CharField('apellido', max_length = 30, unique=True)
    Telefono = models.IntegerField('telefono', max_length = 15, unique=True)
    DineroActual = models.FloatField('dineroactual', max_length = 20, unique=True)
