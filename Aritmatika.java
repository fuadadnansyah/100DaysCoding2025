# Program Operasi Matematika Sederhana
# Nama : Fuad Adnansyah
# NIM  : D0425506

print("=== Program Operasi Matematika Sederhana ===")

# Input dua angka dari pengguna
angka1 = int(input("Masukkan angka pertama: "))
angka2 = int(input("Masukkan angka kedua: "))

# Operasi aritmatika
penjumlahan = angka1 + angka2
pengurangan = angka1 - angka2
perkalian = angka1 * angka2

# Cegah pembagian dengan nol
if angka2 != 0:
    pembagian = angka1 / angka2
else:
    pembagian = "Tidak bisa dibagi dengan nol"

# Menampilkan hasil
print("\nHasil Operasi:")
print("Penjumlahan  :", penjumlahan)
print("Pengurangan  :", pengurangan)
print("Perkalian    :", perkalian)
print("Pembagian    :", pembagian)
