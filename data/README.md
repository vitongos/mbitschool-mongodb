Dataset de ejemplo
==================

Instalación
-----------

Descargar el [Dataset](https://mega.co.nz/#!WVgSFYBZ!5C28emvkBqMWTlnEmYFvKxOej671tdKT7INiNsrbNQA) en el directorio personal

### Restaurar la colección
Ejecutar el siguiente script:
```bash
cd
bunzip2 samples-database.tar.bz2
tar -xf samples-database.tar
/opt/mongodb/bin/mongorestore -d samples -c students samples/students.bson
```
