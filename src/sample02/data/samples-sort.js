use samples
for (x = 1; x < 21; x++) {
  for (y = 1; y < 21; y++) {
    obj = { coord: {x : x, y : y}, rank : Math.floor(Math.random() * 100) }
    db.coordinates.insert(obj);
  }
}

