Demos y fuentes del módulo de MongoDB en Bases de Datos NoSQL
=============================================================

Instalación
-----------

A continuación se especifica el proceso de instalación de los diferentes sistemas necesarios para ejecutar las demos.

### Instalar el repositorio clonándolo de Github:
Ejecutar el siguiente script:
```bash
sudo yum -y install git
cd
git clone https://github.com/vitongos/mbitschool-mongodb.git mongodb-src
chmod +x mongodb-src/deploy/*.sh
```

### Instalar MongoDB
Ejecutar el siguente script:
```bash
cd ~/mongodb-src/
deploy/mongodb.sh
```

### Instalar Eclipse
Ejecutar el siguiente script:
```bash
cd ~/mongodb-src/
deploy/eclipse.sh
```

### Instalar Java 8
Descargar [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

Ejecutar el siguiente script:
```bash
cd ~/mongodb-src/
deploy/java8.sh
```


