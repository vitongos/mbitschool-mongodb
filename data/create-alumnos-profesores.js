db.profesores.insert({_id: 1, nombre: "Pedro", alumnos: [1, 2, 3]})
db.profesores.insert({_id: 2, nombre: "Laura", alumnos: [2, 3, 4]})
db.profesores.insert({_id: 3, nombre: "Antón", alumnos: [1, 4]})

db.alumnos.insert({_id: 1, nombre: "Alexandr", profesores: [1, 3]})
db.alumnos.insert({_id: 2, nombre: "Nicolai", profesores: [1, 2]})
db.alumnos.insert({_id: 3, nombre: "Natasha", profesores: [1, 2]})
db.alumnos.insert({_id: 4, nombre: "Lena", profesores: [2, 3]})


