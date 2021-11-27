from django.contrib import admin
from .models.User import User
#from .models.Alquiler import Alquiler

from .models.Propiedad import Propiedad
""""
from .models.Dueño import Dueño
from .models.Cliente import Cliente

"""
# Register your models here.

admin.site.register(User)
admin.site.register(Propiedad)
#admin.site.register(Dueño)
#admin.site.register(Cliente)
#admin.site.register(Alquiler)
