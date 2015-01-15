for (var i=1; i<=10000000; i++) {
  var student = { student_id: i, scores: { mathematics: Math.floor(Math.random()*100), geography: Math.floor(Math.random()*100), english: Math.floor(Math.random()*100) }, "class" : Math.floor(Math.random()*10), previous : [ Math.floor(Math.random()*50) + 50, Math.floor(Math.random()*50) + 50, Math.floor(Math.random()*50) + 50, Math.floor(Math.random()*50) + 50 ] };
  db.students.insert(student);
  if (i % 10000 == 0) {
    print("Inserted: " + i);
  } 
}
