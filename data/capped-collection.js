use samples
db.createCollection("limited", { capped : true, size : 4096 } )
for (i = 0; i <= 10000; i++) {
  db.limited.insert({ _id : i, d: new Date() });
}
