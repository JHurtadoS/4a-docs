from django.db import models
from django.contrib.auth.models import AbstractBaseUser,PermissionsMixin,BaseUserManager
<<<<<<< HEAD


class Propiedad(PermissionsMixin):
    id = models.BigAutoField(primary_key=True)
    
=======
from MicroLoginApp.models import Dueño

class Propiedad(PermissionsMixin):
    id = models.BigAutoField(primary_key=True)
    #idDueño = models.ForeignKey(Dueño, related_name='id', on_delete=models.CASCADE)
>>>>>>> 3e3edbb036e6fd66f0f79ede8434083469da92b3
    Direccion = models.CharField('Username', max_length = 100, unique=True)
    Codigo = models.CharField('Username', max_length = 20, unique=True)
    Descripcion = models.CharField('Username', max_length = 3000, unique=True)
    Precio = models.FloatField('precio', max_length = 15, unique=True)