
from peewee import MySQLDatabase, Model, TextField, IntegerField, AutoField, ForeignKeyField
from tkinter import messagebox as mb
NOMBRE_BASE_DE_DATOS = "webspider"
USUARIO = "root"
PALABRA_SECRETA = ""
conexion = MySQLDatabase(NOMBRE_BASE_DE_DATOS,
                         user=USUARIO, password=PALABRA_SECRETA)
title = "Conexion a BD"

def __init__(self):
    print("Creación de instancia")

class ModeloBase(Model):
    class Meta:
        database = conexion

class Usuario(ModeloBase):
    id = AutoField()
    tipo = IntegerField()
    userr = TextField()
    password = TextField()

class Especies(ModeloBase):
    id = AutoField()
    nombreC = TextField()
    descripcion = TextField()
    tratamientos = TextField()
    zonas = TextField()

class NombresComunes(ModeloBase):
    id = AutoField()
    nombre = TextField()
    especie_id = ForeignKeyField(Especies)

class Imagen(ModeloBase):
    id = AutoField()
    ruta = TextField()
    especie = ForeignKeyField(Especies)

#Creando CRUDS
def agregar_especie(nombreC, desc, trat):
    Palabra.create(nombrec=nombreC, descripcion=desc, tratamientos= trat)
    print("Creación correcta")

def agregar_usuario(user, passw, tipo):
    Usuario.create(userr = user, password = passw, tipo = tipo)
    print("Creación correcta")

def consultar_usuario(usuario, passw):
    try:
        user = Usuario.get(Usuario.userr == usuario)
        pw = Usuario.get(Usuario.userr == usuario).password
        if(passw == pw):
            #Contraseña correcta
            tipo = Usuario.get(Usuario.userr == usuario).tipo
            #print("Usuario " + str(user) + "PassW " + pw + "Tipo " + str(tipo))
            if (tipo == 1):
                return 1
            elif (tipo == 2):
                return 2
        else:
            print("Contraseña incorrecta")
            #print("Usuario " + str(user) + "PassW" + pw)
            return 0
    except:
        mb.showerror(title, "Usuario no encontrado")
        pass

def consultar_usuario_info(usuario):
    try:
        user = Usuario.get(Usuario.userr == usuario)
        return user
    except:
        mb.showerror(title, "Usuario no encontrado")
        return None
        pass

def editar_usuario(us, tp, id):
    Usuario.update({Usuario.userr: us}).where(Usuario.id == id).execute()
    Usuario.update({Usuario.tipo: tp}).where(Usuario.id == id).execute()
    print("Usuario actualizado con éxito")

def eliminar_usuario(us):
    Usuario.delete().where(Usuario.userr == us).execute()
    print("Usuario " + us + " eliminado")

def consultar_info_arana(nombr):
    #print("Ejecutando consulta de araña " + nombr)
    query = (NombresComunes.select().where(NombresComunes.nombre == nombr) )
    nam = query[0]
    return Especies.get_by_id(nam.especie_id)

def consultar_nombres_araña(id_especie):
    print("Obteniendo todos los nombres del id " + str(id_especie))
    query = (NombresComunes.select().where(NombresComunes.especie_id == id_especie) )
    namess = []
    for name in query:
        #print(name.nombre)
        namess.append(name.nombre)
    return namess
