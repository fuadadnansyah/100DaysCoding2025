# Program operasi matematika sederhana

# Meminta input dari pengguna
angka1 = float(input("Masukkan angka pertama: "))
angka2 = float(input("Masukkan angka kedua: "))

# Operasi aritmatika
penjumlahan = angka1 + angka2
pengurangan = angka1 - angka2
perkalian = angka1 * angka2
pembagian = angka1 / angka2 if angka2 != 0 else "Tidak bisa dibagi dengan nol!"

# Menampilkan hasil
print("\nHasil Operasi:")
print(f"Penjumlahan: {penjumlahan}")
print(f"Pengurangan: {pengurangan}")
print(f"Perkalian: {perkalian}")
print(f"Pembagian: {pembagian}")
