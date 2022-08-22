# UD26_SpringMySQL_EX2

## T26 - DEPLOY HEROKU (SIN BASIC AUTHENTICATION)

```
Commits on Aug 20, 2022

    retoque app properties 

e651be8ade4203925ded78f82a838a8cbec91bd4
```

## T27 - BASIC SECURITY (version actual rama main)
- TOKEN SECURITY - rama TOKEN-SECURITY (ultima version)

#### POST LOGIN
```
ud27-spring-token-ex2.herokuapp.com/login 
```
opciones login:
{
    "name":"root", 
    "password":"root"
}

{
    "name":"jone", 
    "password":"1234"
}
    
mysql://b78e58be24ca34:780dd853@eu-cdbr-west-03.cleardb.net/heroku_7807aaf757129a8

## API Cientificos

#### GET
```
ud27-spring-token-ex2.herokuapp.com/api/cientificos/
ud27-spring-token-ex2.herokuapp.com/api/cientificos/{dni}
```
#### POST
```
ud27-spring-token-ex2.herokuapp.com/api/cientificos/
```
#### PUT
```
ud27-spring-token-ex2.herokuapp.com/api/cientificos/{dni}
```
#### DELETE
```
ud27-spring-token-ex2.herokuapp.com/api/cientificos/{dni}
```

## API Proyectos

#### GET
```
ud27-spring-token-ex2.herokuapp.com/api/proyectos/
ud27-spring-token-ex2.herokuapp.com/api/proyectos/{id}
```
#### POST
```
ud27-spring-token-ex2.herokuapp.com/api/proyectos/
```
#### PUT
```
ud27-spring-token-ex2.herokuapp.com/api/proyectos/{id}
```
#### DELETE
```
ud27-spring-token-ex2.herokuapp.com/api/proyectos/{id}
```

## API Asignado a

#### GET
```
ud27-spring-token-ex2.herokuapp.com/api/proyectos/asignadoA
ud27-spring-token-ex2.herokuapp.com/api/proyectos/asignadoA/{id}
```
#### POST
```
ud27-spring-token-ex2.herokuapp.com/api/proyectos/asignadoA
```
#### PUT
```
ud27-spring-token-ex2.herokuapp.com/api/proyectos/asignadoA/{id}
```
#### DELETE
```
ud27-spring-token-ex2.herokuapp.com/api/proyectos/asignadoA/{id}
```
