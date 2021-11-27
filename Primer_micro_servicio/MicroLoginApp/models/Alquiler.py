from django.db import models
from django.contrib.auth.models import AbstractBaseUser,PermissionsMixin,BaseUserManager
<<<<<<< HEAD

=======
from MicroLoginApp.models import Cliente
from MicroLoginApp.models import Propiedad
>>>>>>> 3e3edbb036e6fd66f0f79ede8434083469da92b3

class Alquiler(PermissionsMixin):
    id = models.BigAutoField(primary_key=True)
    
    
    FechadeLlegada = models.DateTimeField()
    Estado = models.CharField('Estado', max_length = 20, unique=True)
    FechadeSalida = models.DateTimeField()
    DineroAbonado = models.FloatField('Dinero Abonado', max_length = 15, unique=True)