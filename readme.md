### Question to Ask

- how to search for data with nrp
  Dengan cara melakukan looping sebanyak data di list, lalu cek satu persatu objeknya yang memiliki nrp sama dengan nrp yang dicari

- how to delete
  Untuk menghapus dari list cukup melakukan melalui method remove, dan masukkan parameter

- how to prevent error when no data deleted
  Cek apakah data yang akan dihapus ada atau tidak

- how to show error when no data deleted
  Ketika mencari data, jika data yang dicari tidak ada bisa memunculkan alert atau tulisan dengan Label (If-else)

- how to add confirm box to make sure deletion
  Membuat Alert, mengatur tampilan seperti title, lalu menambahkan action yang akan dilakukan

- how to know which data selected from table select
  dengan memanggil method getselectionmodel, lalu getselecteditem

- how to show selected data from table on the txtNrpDelete
  Setelah memanggil method getselecteditem, akan mereturn sebuah objek, yang nantinya bisa dipakai di txtNrpDelete, dengan txtNrpDelete.setText(objek.getNrp)

- how to delete data selected from table select
  Setelah mendapatkan objek, kita bisa langsung memanggil method remove pada list, dengan memasukan parameter objek yang didapatkan dari getselecteditem

- if student has multiple score, and you would like to add delete update score on student what file need to be added
  membuat model score

- if student has multiple score, and you would like to add delete update score on student what file need to be updated
  menambahkan atribut baru di student berupa list bertipe score
